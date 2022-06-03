package com.krishna.nlp2.restobjects;

public class Summary {
    private final String sourceURL;
    private final String textBlock;

    public Summary(String _sourceURL, String _textBlock){
        this.sourceURL=_sourceURL;
        this.textBlock=_textBlock;

    }

    public String getSourceURL() {
        return sourceURL;
    }

    public String getTextBlock() {
        return textBlock;
    }
}
