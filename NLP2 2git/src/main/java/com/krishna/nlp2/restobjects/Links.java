package com.krishna.nlp2.restobjects;

public class Links {
    private final String[] links;

    public Links(String... _links){
        this.links =_links;

    }

    public String[] getLinks() {
        return links;
    }
}
