package com.intexsoft;

import com.intexsoft.services.ReadFromFileService;
import com.intexsoft.services.WriteIntoFileService;


import java.io.IOException;

public class Main {
    private static final ReadFromFileService readFromFileService = new ReadFromFileService();
    private static final WriteIntoFileService writeIntoFileService = new WriteIntoFileService();

    public static void main(String[] args) throws IOException {
        char[] charsFromJson;
        char charAfterColon;
        readFromFileService.read();
        String[] json = readFromFileService.getLinesFromJson();
        for (String stringFromJson : json) {
            stringFromJson = stringFromJson.replace(",", "");
            charsFromJson = stringFromJson.toCharArray();
            for (int counter = 0; counter < charsFromJson.length; counter++) {
                if (charsFromJson[counter] == ':') {
                    charAfterColon = charsFromJson[counter + 2];
                    System.out.println(charAfterColon);
                }
            }
            System.out.println(stringFromJson);
        }
    }
}
