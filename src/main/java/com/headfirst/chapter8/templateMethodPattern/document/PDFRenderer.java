package com.headfirst.chapter8.templateMethodPattern.document;


/**
 * Concrete class for rendering PDF documents.
 */
public class PDFRenderer extends DocumentRenderer {
    @Override
    protected void loadContent() {
        System.out.println("Loading PDF content");
    }

    @Override
    protected void formatDocument() {
        System.out.println("Formatting PDF document");
    }

    @Override
    protected void saveDocument() {
        System.out.println("Saving as PDF");
    }
}

