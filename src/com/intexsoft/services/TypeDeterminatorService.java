package com.intexsoft.services;

import com.intexsoft.jsonParts.JsonArray;
import com.intexsoft.jsonParts.JsonField;
import com.intexsoft.jsonParts.JsonObject;
import com.intexsoft.jsonParts.JsonPart;
import lombok.Getter;

import java.io.IOException;

public class TypeDeterminatorService {
    private char[] charsFromJson;
    private char charAfterColon;
    private final ReadFromFileService readFromFileService = new ReadFromFileService();
    @Getter
    private String[] json;
    private String[] currentSplittedString;

    public void determineType() throws IOException {
        readFromFileService.read();
        json = readFromFileService.getLinesFromJson();

        for (String stringFromJson : json) {
            stringFromJson = stringFromJson.replace(",", "");
            charsFromJson = stringFromJson.toCharArray();

            for (int counter = 0; counter < charsFromJson.length; counter++) {

                if (charsFromJson[counter] == ':') {
                    charAfterColon = charsFromJson[counter + 2];
                    currentSplittedString = stringFromJson.split(":");

                    switch (charAfterColon) {
                        case '[':
                            JsonArray jsonArray = new JsonArray();
                            while ((stringFromJson.equals("]"))) {
                                jsonArray.getJsonArrayList().add(new JsonField(currentSplittedString[0], currentSplittedString[1]));
                            }
                            break;
                        case '{':
                            JsonObject jsonObject = new JsonObject();
                            while ((stringFromJson.equals("}"))) {
                                jsonObject.getJsonObjectList().add(new JsonField(currentSplittedString[0], currentSplittedString[1]));
                            }
                            break;
                        default:
                            JsonField jsonField = new JsonField(currentSplittedString[0], currentSplittedString[1]);
                            jsonField.getJsonPartsList().add(jsonField);
                            break;
                    }
                }
            }
        }
    }
}
