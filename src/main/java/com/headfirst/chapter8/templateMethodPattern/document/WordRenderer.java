package com.headfirst.chapter8.templateMethodPattern.document;

/**
 * Concrete class for rendering Word documents.
 */
public class WordRenderer extends DocumentRenderer {
    @Override
    protected void loadContent() {
        System.out.println("Loading Word content");
    }

    @Override
    protected void formatDocument() {
        System.out.println("Formatting Word document");
    }

    @Override
    protected void saveDocument() {
        System.out.println("Saving as Word");
    }
}