package com.headfirst.chapter3.decoratorPattern.fileencryption;

public class FileEncryptionSimulator {
    public static void main(String[] args) {
        DataSource fileDataSource = new FileDataSource("src/main/java/com/headfirst/chapter3/decoratorPattern/fileencryption/data.txt");

        // Correct order: Apply compression first, then encryption
        DataSource compressedDataSource = new CompressionDecorator(fileDataSource);
        DataSource encryptedCompressedDataSource = new EncryptionDecorator(compressedDataSource);

        // Writing data
        encryptedCompressedDataSource.writeData("Sensitive data here");

        // Reading data
        String result = encryptedCompressedDataSource.readData();
        System.out.println("Decrypted and decompressed: " + result);
    }
}
