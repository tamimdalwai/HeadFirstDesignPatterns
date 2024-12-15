package com.headfirst.chapter3.decoratorPattern.fileencryption;

import java.util.Base64;

/**
 * Decorator for encrypting data before writing it to a file.
 */
public class EncryptionDecorator implements DataSource {
    private final DataSource wrappee;

    public EncryptionDecorator(DataSource wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void writeData(String data) {
        String encryptedData = Base64.getEncoder().encodeToString(data.getBytes());
        wrappee.writeData(encryptedData);
    }

    @Override
    public String readData() {
        String data = wrappee.readData();
        return new String(Base64.getDecoder().decode(data));
    }
}
