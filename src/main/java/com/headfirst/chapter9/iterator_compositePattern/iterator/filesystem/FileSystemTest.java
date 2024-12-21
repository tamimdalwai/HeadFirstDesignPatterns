package com.headfirst.chapter9.iterator_compositePattern.iterator.filesystem;

import java.io.File;

/**
 * Client to test FileSystemIterator.
 */
public class FileSystemTest {
    public static void main(String[] args) {

        File directory = new File("src/main/java/com/headfirst/chapter9/iterator_compositePattern/iterator/filesystem");

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory path.");
            return;
        }

        FileSystemIterator iterator = new FileSystemIterator(directory);

        System.out.println("Files in the directory:");
        while (iterator.hasNext()) {
            File file = iterator.next();
            System.out.println("- " + file.getName());
        }
    }
}
