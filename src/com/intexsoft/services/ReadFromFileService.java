package com.intexsoft.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFileService implements ReadService {
    private static final String READ_PATH = "./src/com/intexsoft/resources/json.txt";

    public String[] readFromFile() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(READ_PATH));
        String line;
        List<String> lines = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line.trim());
        }
        return lines.toArray(new String[lines.size()]);
    }
}
