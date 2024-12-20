package com.headfirst.chapter8.templateMethodPattern.document;

/**
 * Client class to test the document rendering process.
 */
public class DocumentRendererTest {
    public static void main(String[] args) {
        DocumentRenderer pdfRenderer = new PDFRenderer();
        DocumentRenderer wordRenderer = new WordRenderer();

        System.out.println("Rendering PDF document:");
        pdfRenderer.renderDocument();

        System.out.println("\nRendering Word document:");
        wordRenderer.renderDocument();
    }
}