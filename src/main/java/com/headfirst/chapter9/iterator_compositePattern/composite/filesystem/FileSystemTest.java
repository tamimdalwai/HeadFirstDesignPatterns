package com.headfirst.chapter9.iterator_compositePattern.composite.filesystem;

/**
 * Client class to test the Composite Pattern for a file system.
 */
public class FileSystemTest {
    public static void main(String[] args) {
        // Create files
        FileComponent file1 = new FileLeaf("file1.txt");
        FileComponent file2 = new FileLeaf("file2.txt");
        FileComponent file3 = new FileLeaf("file3.txt");

        // Create directories and add files
        DirectoryComposite root = new DirectoryComposite("root");
        DirectoryComposite subDir1 = new DirectoryComposite("subDir1");
        DirectoryComposite subDir2 = new DirectoryComposite("subDir2");

        subDir1.add(file1);
        subDir1.add(file2);

        subDir2.add(file3);

        root.add(subDir1);
        root.add(subDir2);

        // Display the entire file system hierarchy
        root.display("");
    }
}