package com.intexsoft.services;

import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFileService {
    private static final String WRITE_PATH = "./src/com/intexsoft/resources/result.txt";

    public void writeIntoFile(String json) throws IOException {
        try (FileWriter fileWriter = new FileWriter(WRITE_PATH, true)) {
            fileWriter.write(json + "\n");
        }
    }
}
