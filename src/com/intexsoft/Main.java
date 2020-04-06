package com.intexsoft;

import com.intexsoft.jsonParts.JsonArray;
import com.intexsoft.jsonParts.JsonField;
import com.intexsoft.jsonParts.JsonObject;
import com.intexsoft.services.TypeDeterminatorService;

import java.io.IOException;

public class Main {
    private static final TypeDeterminatorService typeDeterminatorService = new TypeDeterminatorService();
    private static final JsonField jsonFieldMain = typeDeterminatorService.getJsonField();
    private static final JsonArray jsonArrayMain = typeDeterminatorService.getJsonArray();
    private static final JsonObject jsonObjectMain = typeDeterminatorService.getJsonObject();

    public static void main(String[] args) throws IOException {
        typeDeterminatorService.determineType();

        System.out.println(jsonObjectMain.getJsonObjectList());
    }
}
