package com.intexsoft;

import com.intexsoft.jsonParts.JsonArray;
import com.intexsoft.jsonParts.JsonField;
import com.intexsoft.jsonParts.JsonObject;
import com.intexsoft.services.TypeDeterminatorService;

import java.io.IOException;
import java.util.ListIterator;

public class Main {
    private static final TypeDeterminatorService typeDeterminatorService = new TypeDeterminatorService();
    private static final JsonField jsonFieldMain = typeDeterminatorService.getJsonField();
    private static final JsonArray jsonArrayMain = typeDeterminatorService.getJsonArray();
    private static final JsonObject jsonObjectMain = typeDeterminatorService.getJsonObject();

    public static void main(String[] args) throws IOException {
        typeDeterminatorService.determineType();
        ListIterator iterator1 = jsonFieldMain.getJsonPartsList().listIterator();
        ListIterator iterator2 = jsonArrayMain.getJsonArrayList().listIterator();
        ListIterator iterator3 = jsonObjectMain.getJsonObjectList().listIterator();

        jsonFieldMain.getJsonPartsList().forEach(System.out::println);
        jsonArrayMain.getJsonArrayList().forEach(System.out::println);
        jsonObjectMain.getJsonObjectList().forEach(System.out::println);
    }
}
