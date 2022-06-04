package com.krishna.nlp2;

import com.krishna.nlp2.restobject.Links;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLEncoder;



@RestController

public class LinkController {
    private final static String DUCKDUCKGO_SEARCH_URL = "https://duckduckgo.com/html/?q=";


    public static final String GOOGLE_SEARCH_URL = "https://www.google.com/search";
    @GetMapping(path = "/link", produces = "application/json")
public Links getLinks(@RequestParam(value = "topic", defaultValue = "mars") String topic) throws IOException {
        String[] prospectiveLinks = new String[3];
        String[] prospectiveTitles = new String[3];
        Document doc = null;
        int iterator=0;
        try {
            doc = Jsoup.connect(DUCKDUCKGO_SEARCH_URL + topic).get();
            Elements results = doc.getElementById("links").getElementsByClass("results_links");

            for(Element result: results){
                if (iterator==3) break;
                Element title = result.getElementsByClass("links_main").first().getElementsByTag("a").first();
                String linkHref = title.attr("href");
                String linkText = title.text();

                prospectiveLinks[iterator] =linkHref;
                prospectiveTitles[iterator]=linkText;
                iterator++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Links(prospectiveLinks, prospectiveTitles);

    }
}
