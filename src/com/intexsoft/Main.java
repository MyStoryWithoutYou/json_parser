package com.intexsoft;

import com.intexsoft.services.ReadFromFileService;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ReadFromFileService readFromFileService = new ReadFromFileService();
        StringBuilder json = new StringBuilder();

        for (String s: readFromFileService.readFromFile()) {
            if (!(s.equals("{") || s.equals("[") || s.equals("}") || s.equals("]"))){
                json.append(s);
            }
        }
        String stringJson = json.toString();
        StringBuilder newJson = new StringBuilder(stringJson.replace("\"", ""));
        System.out.println(newJson);
    }
}
