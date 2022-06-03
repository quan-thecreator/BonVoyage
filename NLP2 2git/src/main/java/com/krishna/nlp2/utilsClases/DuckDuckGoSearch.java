package com.krishna.nlp2.utilsClases;

import org.jsoup.Jsoup;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DuckDuckGoSearch {
    private final static String DUCKDUCKGO_SEARCH_URL = "https://duckduckgo.com/html/?q=";

    public static DuckDuckGoSearchShell getSearchResults(String query){
        Document doc = null;
        String[] linkProspects = new String[3];
        String[] titles = new String[3];
        try {
            doc = Jsoup.connect(DUCKDUCKGO_SEARCH_URL + query).get();
            Elements results = doc.getElementById("links").getElementsByClass("results_links");
            int counter =1;

            for(Element result: results){
                if(counter==4) break;
                Element title = result.getElementsByClass("links_main").first().getElementsByTag("a").first();
                linkProspects[counter-1] =title.attr("href");
                titles[counter-1]=title.text();


            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    DuckDuckGoSearchShell returnBody = new DuckDuckGoSearchShell();
        returnBody.linkProspects=linkProspects;
        returnBody.titles=titles;
        return returnBody;
    }
    static class  DuckDuckGoSearchShell{
       public String[] linkProspects = new String[3];
       public String[] titles = new String[3];
    }
}
