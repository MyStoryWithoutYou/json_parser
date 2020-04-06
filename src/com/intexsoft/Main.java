package com.intexsoft;

import com.intexsoft.jsonParts.JsonArray;
import com.intexsoft.jsonParts.JsonField;
import com.intexsoft.jsonParts.JsonObject;
import com.intexsoft.services.TypeDeterminatorService;

import java.io.IOException;
import java.util.ListIterator;

public class Main {
    private static final JsonField jsonField = new JsonField();
    private static final JsonArray jsonArray = new JsonArray();
    private static final JsonObject jsonObject = new JsonObject();
    private static final TypeDeterminatorService typeDeterminatorService = new TypeDeterminatorService();

    public static void main(String[] args) throws IOException {
        typeDeterminatorService.determineType();
        ListIterator iterator1 = jsonField.getJsonPartsList().listIterator();
        ListIterator iterator2 = jsonArray.getJsonArrayList().listIterator();
        ListIterator iterator3 = jsonObject.getJsonObjectList().listIterator();

        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }
    }
}
