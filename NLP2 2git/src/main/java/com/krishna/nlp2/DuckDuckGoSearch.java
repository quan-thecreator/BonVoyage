package com.krishna.nlp2;

import org.jsoup.Jsoup;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DuckDuckGoSearch {
    private final static String DUCKDUCKGO_SEARCH_URL = "https://duckduckgo.com/html/?q=";

    public static void getSearchResults(String query){
        Document doc = null;
        String[] linkProspects = new String[3];
        try {
            doc = Jsoup.connect(DUCKDUCKGO_SEARCH_URL + query).get();
            Elements results = doc.getElementById("links").getElementsByClass("results_links");
            int counter =1;

            for(Element result: results){
                if(counter==4) break;
                Element title = result.getElementsByClass("links_main").first().getElementsByTag("a").first();
                System.out.println("\nURL:" + title.attr("href"));
                System.out.println("Title:" + title.text());
                System.out.println("Snippet:" + result.getElementsByClass("result__snippet").first().text());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
