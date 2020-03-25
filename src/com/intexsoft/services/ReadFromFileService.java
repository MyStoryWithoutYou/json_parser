package com.intexsoft.services;

import lombok.Getter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFileService implements ReadService {
    private static final String READ_PATH = "./src/com/intexsoft/resources/json.txt";

    @Getter
    private String[] linesFromJson;

    @Override
    public void read() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(READ_PATH));
        String line;
        List<String> lines = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }
        linesFromJson =  lines.toArray(new String[lines.size()]);
    }
}
