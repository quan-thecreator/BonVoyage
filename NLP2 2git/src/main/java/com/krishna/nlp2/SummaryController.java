package com.krishna.nlp2;

import com.krishna.nlp2.restobject.Summary;
import com.krishna.nlp2.utilsClases.JWiki2;
import com.krishna.nlp2.utilsClases.NLPUtils;
import org.springframework.web.bind.annotation.*;

@RestController

public class SummaryController {
@GetMapping("/summary")
    public Summary hello(@RequestParam(name = "topic", defaultValue = "mars")String topic){
    System.out.println("Query param: " + topic);
    JWiki2 jwiki = new JWiki2(topic);

    String text = jwiki.getExtractText();
    System.out.println("JWiki text: " + text);
   String summaryNlpData = NLPUtils.getTextOverallSentiment(text);


return new Summary("https://en.wikipedia.org/wiki/",text,summaryNlpData);
}

}
