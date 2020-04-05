package com.intexsoft.services;

import com.intexsoft.jsonParts.JsonArray;
import com.intexsoft.jsonParts.JsonField;
import com.intexsoft.jsonParts.JsonObject;
import com.intexsoft.jsonParts.JsonPart;
import lombok.Getter;

import java.io.IOException;
import java.util.ArrayList;

public class TypeDeterminatorService {
    private char[] charsFromJson;
    private char charAfterColon;
    private final ReadFromFileService readFromFileService = new ReadFromFileService();
    @Getter
    private String[] json;
    private String[] currentSplittedString;
    @Getter
    private ArrayList<JsonPart> jsonPartsList = new ArrayList<>();

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
                            break;
                        case '{':
                            JsonObject jsonObject = new JsonObject();
                            break;
                        default:
                            JsonField jsonField = new JsonField(currentSplittedString[0], currentSplittedString[1]);
                            jsonPartsList.add(jsonField);
                            break;
                    }

                    System.out.println(charAfterColon);
                }
            }
        }
    }
}
