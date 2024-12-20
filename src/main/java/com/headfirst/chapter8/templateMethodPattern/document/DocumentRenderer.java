package com.headfirst.chapter8.templateMethodPattern.document;

/**
 * Abstract class defining the template method for rendering documents.
 */
public abstract class DocumentRenderer {

    /**
     * Template method to render a document.
     */
    public final void renderDocument() {
        loadContent();
        formatDocument();
        saveDocument();
    }

    protected abstract void loadContent();
    protected abstract void formatDocument();
    protected abstract void saveDocument();
}

