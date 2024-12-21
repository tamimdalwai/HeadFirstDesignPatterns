package com.headfirst.chapter9.iterator_compositePattern.iterator.filesystem;

import java.io.File;

/**
 * Iterator for traversing files and directories in a file system.
 */
public class FileSystemIterator {
    private final File[] files;
    private int position = 0;

    public FileSystemIterator(File directory) {
        if (!directory.isDirectory()) {
            throw new IllegalArgumentException("Provided file is not a directory.");
        }
        this.files = directory.listFiles();
    }

    public boolean hasNext() {
        return position < files.length;
    }

    public File next() {
        if (!hasNext()) {
            throw new IllegalStateException("No more files.");
        }
        return files[position++];
    }
}
