package com.krishna.nlp2;

import com.krishna.nlp2.restobject.Links;
import com.krishna.nlp2.utilsClases.GoogleResults;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLEncoder;
import com.google.gson.Gson;

@RestController

public class LinkController {

    @GetMapping(path = "/link", produces = "application/json")
public Links getLinks(@RequestParam(value = "topic", defaultValue = "mars") String topic) throws IOException {
        String google = "http://ajax.googleapis.com/ajax/services/search/web?v=1.0&q=";

        String charset = "UTF-8";

        URL url = new URL(google + URLEncoder.encode(topic, charset));
        Reader reader = new InputStreamReader(url.openStream(), charset);
        GoogleResults results = new Gson().fromJson(reader, GoogleResults.class);
        // GoogleResults results;
        // Show title and URL of 1st result.
        String[] urls = new String[3];
        String[] titles = new String[3];

        for(int i=0; i<3; i++) {
            urls[i] = (results.getResponseData().getResults().get(i).getTitle());
            titles[i]  =  (results.getResponseData().getResults().get(i).getUrl());
        }


        return new Links(urls, titles);

    }
}
