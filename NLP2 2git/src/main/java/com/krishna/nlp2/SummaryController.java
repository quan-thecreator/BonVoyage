package com.krishna.nlp2;

import Jwiki.Jwiki;
import org.springframework.web.bind.annotation.*;

@RestController

public class SummaryController {
@GetMapping("/")
    public Summary hello(@RequestParam(name = "topic", defaultValue = "mars")String topic){
    Jwiki jwiki = new Jwiki(topic);
    String text = jwiki.getExtractText();
    NLPUtils.getTextOverallSentiment(text);
return null;
}

}
