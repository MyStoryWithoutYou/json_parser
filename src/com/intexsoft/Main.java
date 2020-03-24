package com.intexsoft;

import com.intexsoft.services.ReadFromFileService;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ReadFromFileService readFromFileService = new ReadFromFileService();

        for (String s: readFromFileService.readFromFile()) {
            if (!(s.contains("{") || s.contains("}") || s.contains("]"))) {
                if (s.contains("[")) {
                    s = s.replace("[", "");
                }
                s = s.replace(",", "");
                s = s.replace("\"", "");
                System.out.println(s);
            }
        }
    }
}
