package com.krishna.nlp2;

public class Summary {
    private final String sourceURL;
    private final String textBlock;
    private final String sentiment;

    public Summary(String _sourceURL, String _textBlock, String _sentiment){
        this.sourceURL=_sourceURL;
        this.textBlock=_textBlock;
        this.sentiment = _sentiment;
    }

    public String getSentiment() {
        return sentiment;
    }

    public String getSourceURL() {
        return sourceURL;
    }

    public String getTextBlock() {
        return textBlock;
    }
}
