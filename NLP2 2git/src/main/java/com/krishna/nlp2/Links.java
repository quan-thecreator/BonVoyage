package com.krishna.nlp2;

public class Links {
    private final String[] links;
    private final String[] titles;


    public Links(String[] _links, String[] _titles){
        this.links =_links;

        this.titles = _titles;
    }

    public String[] getLinks() {
        return links;
    }


}
