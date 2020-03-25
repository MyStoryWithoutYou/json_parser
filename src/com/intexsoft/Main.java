package com.intexsoft;

import com.intexsoft.services.ReadFromFileService;
import com.intexsoft.services.WriteIntoFileService;

import java.io.IOException;

public class Main {
    private static final ReadFromFileService readFromFileService = new ReadFromFileService();
    private static final WriteIntoFileService writeIntoFileService = new WriteIntoFileService();

    public static void main(String[] args) throws IOException {
        readFromFileService.read();
        String[] json = readFromFileService.getLinesFromJson();
        for (String stringFromJson : json) {
            if ((!(stringFromJson.contains("{") || stringFromJson.contains("}") || stringFromJson.contains("]"))) || stringFromJson.contains("[")) {
                stringFromJson = stringFromJson.replace("[", "");
                stringFromJson = stringFromJson.replace(",", "");
                stringFromJson = stringFromJson.replace("\"", "");
                System.out.println(stringFromJson);
                writeIntoFileService.writeIntoFile(stringFromJson);
            }
        }
    }
}
