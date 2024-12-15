package com.headfirst.chapter3.decoratorPattern.fileencryption;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Concrete component for reading and writing raw data to a file.
 */
public class FileDataSource implements DataSource {
    private final String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        try {
            Files.write(Paths.get(filename), data.getBytes(), StandardOpenOption.CREATE);
        } catch (Exception e) {
            throw new RuntimeException("Failed to write data", e);
        }
    }

    @Override
    public String readData() {
        try {
            return new String(Files.readAllBytes(Paths.get(filename)));
        } catch (Exception e) {
            throw new RuntimeException("Failed to read data", e);
        }
    }
}