package com.krishna.nlp2.restobjects;

public class Links {
    private final String[] links;
    private final String[] sentiment;

    public Links(String[] _links, String[] _sentiment){
        this.links =_links;
        this.sentiment = _sentiment;
    }

    public String[] getLinks() {
        return links;
    }

    public String[] getSentiment() {
        return sentiment;
    }
}
