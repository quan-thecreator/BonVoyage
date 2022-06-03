package com.krishna.nlp2;

import com.krishna.nlp2.restobjects.Links;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/link", method = RequestMethod.GET)
public class LinkController {

    @GetMapping(path = "/", produces = "application/json")
public Links getLinks(@RequestParam(value = "topic", defaultValue = "mars") String topic){
        DuckDuckGoSearch.DuckDuckGoSearchShell returnBody = DuckDuckGoSearch.getSearchResults(topic);



        return null;
    }
}
