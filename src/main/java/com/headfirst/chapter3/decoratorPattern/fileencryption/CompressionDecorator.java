package com.headfirst.chapter3.decoratorPattern.fileencryption;

import java.util.zip.Deflater;
import java.util.zip.Inflater;


/**
 * Decorator for compressing data before writing it to a file.
 */
public class CompressionDecorator implements DataSource {
    private final DataSource wrappee;

    public CompressionDecorator(DataSource wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void writeData(String data) {
        try {
            byte[] compressed = compress(data.getBytes());
            wrappee.writeData(new String(compressed, "ISO-8859-1")); // Use a safe encoding
        } catch (Exception e) {
            throw new RuntimeException("Compression failed", e);
        }
    }

    @Override
    public String readData() {
        try {
            String data = wrappee.readData();
            byte[] decompressed = decompress(data.getBytes("ISO-8859-1")); // Use the same encoding
            return new String(decompressed);
        } catch (Exception e) {
            throw new RuntimeException("Decompression failed", e);
        }
    }

    private byte[] compress(byte[] data) throws Exception {
        Deflater deflater = new Deflater();
        deflater.setInput(data);
        deflater.finish();
        byte[] buffer = new byte[1024];
        int length = deflater.deflate(buffer);
        deflater.end();
        return java.util.Arrays.copyOf(buffer, length);
    }

    private byte[] decompress(byte[] data) throws Exception {
        Inflater inflater = new Inflater();
        inflater.setInput(data);
        byte[] buffer = new byte[1024];
        int length = inflater.inflate(buffer);
        inflater.end();
        return java.util.Arrays.copyOf(buffer, length);
    }
}