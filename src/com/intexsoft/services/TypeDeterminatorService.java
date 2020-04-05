package com.intexsoft.services;

import com.intexsoft.jsonParts.JsonArray;
import com.intexsoft.jsonParts.JsonField;
import com.intexsoft.jsonParts.JsonObject;
import lombok.Getter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TypeDeterminatorService {
    private char[] charsFromJson;
    private char charAfterColon;
    private final ReadFromFileService readFromFileService = new ReadFromFileService();
    @Getter
    private String[] json = readFromFileService.getLinesFromJson();
    private String[] currentSplittedString;
    @Getter
    private Map<String, JsonArray> jsonArrayMap = new HashMap<>();
    @Getter
    private Map<String, JsonField> jsonFieldMap = new HashMap<>();
    @Getter
    private Map<String, JsonObject> jsonObjectMap = new HashMap<>();

    public void determineType() throws IOException {
        readFromFileService.read();
        for (String stringFromJson : json) {
            stringFromJson = stringFromJson.replace(",", "");
            charsFromJson = stringFromJson.toCharArray();
            for (int counter = 0; counter < charsFromJson.length; counter++) {
                if (charsFromJson[counter] == ':') {
                    charAfterColon = charsFromJson[counter + 2];
                    currentSplittedString = stringFromJson.split(":");
                    System.out.println(charAfterColon);
                }
                switch (charAfterColon) {
                    case '[':
                        JsonArray jsonArray = new JsonArray();
                        break;
                    case '{':
                        JsonObject jsonObject = new JsonObject();
                        break;
                    default:
                        JsonField jsonField = new JsonField(currentSplittedString[0], currentSplittedString[1]);
                        jsonFieldMap.put(jsonField.getJsonKey(),jsonField);
                        break;
                }
            }
        }
    }
}
