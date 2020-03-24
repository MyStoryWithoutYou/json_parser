package com.intexsoft;

import com.intexsoft.services.ReadFromFileService;

import java.io.IOException;

public class Main {
    private static final ReadFromFileService readFromFileService = new ReadFromFileService();

    public static void main(String[] args) throws IOException {
        for (String stringFromJSON: readFromFileService.readFromFile()) {
            if ((!(stringFromJSON.contains("{") || stringFromJSON.contains("}") || stringFromJSON.contains("]"))) || stringFromJSON.contains("[")) {
                stringFromJSON = stringFromJSON.replace("[", "");
                stringFromJSON = stringFromJSON.replace(",", "");
                stringFromJSON = stringFromJSON.replace("\"", "");
                System.out.println(stringFromJSON);
            }
        }
    }
}
