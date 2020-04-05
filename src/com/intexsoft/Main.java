package com.intexsoft;

import com.intexsoft.services.ReadFromFileService;
import com.intexsoft.services.TypeDeterminatorService;
import com.intexsoft.services.WriteIntoFileService;


import java.io.IOException;

public class Main {
    private static final TypeDeterminatorService typeDeterminatorService = new TypeDeterminatorService();

    public static void main(String[] args) throws IOException {
        typeDeterminatorService.determineType();
        System.out.println();
    }
}
