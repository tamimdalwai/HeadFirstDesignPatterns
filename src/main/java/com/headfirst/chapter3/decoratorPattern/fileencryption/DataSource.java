package com.headfirst.chapter3.decoratorPattern.fileencryption;

/**
 * Base interface for data sources.
 */
public interface DataSource {
    void writeData(String data);
    String readData();
}
