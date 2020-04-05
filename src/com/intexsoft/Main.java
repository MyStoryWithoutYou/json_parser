package com.intexsoft;

import com.intexsoft.services.TypeDeterminatorService;

import java.io.IOException;

public class Main {
    private static final TypeDeterminatorService typeDeterminatorService = new TypeDeterminatorService();

    public static void main(String[] args) throws IOException {
        typeDeterminatorService.determineType();
        System.out.println(typeDeterminatorService.getJsonPartsList());
    }
}
