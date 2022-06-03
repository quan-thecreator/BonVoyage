package com.krishna.nlp2;

import Jwiki.Jwiki;
import org.springframework.web.bind.annotation.*;

@RestController

public class SummaryController {
@GetMapping("/")
    public Summary hello(@RequestParam(name = "topic", defaultValue = "mars")String topic){
    Jwiki jwiki = new Jwiki(topic);
    String text = jwiki.getExtractText();
   String summaryNlpData = NLPUtils.getTextOverallSentiment(text);

return new Summary("https://en.wikipedia.org/wiki/",text,summaryNlpData);
}

}
