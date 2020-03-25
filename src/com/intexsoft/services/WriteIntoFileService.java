package com.intexsoft.services;

import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFileService implements WriteService{
    private static final String WRITE_PATH = "./src/com/intexsoft/resources/result.txt";

    @Override
    public void write(String json) throws IOException {
        try (FileWriter fileWriter = new FileWriter(WRITE_PATH, true)) {
            fileWriter.write(json + "\n");
        }
    }
}
