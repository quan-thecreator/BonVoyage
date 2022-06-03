package com.krishna.nlp2;

import org.springframework.web.bind.annotation.*;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


@RestController
@RequestMapping(path = "/subscribe", method = RequestMethod.GET)
public class SubscribeController {

    @GetMapping(path = "/", produces = "application/json")

    public String subscribe(@RequestParam(value = "toPhone", defaultValue = "+16479900182") String to ){
        Twilio.init(Nlp2Application.ACCOUNT_SID, Nlp2Application.AUTH_TOKEN);
        Message message = Message.creator(
                new PhoneNumber(to),
                new PhoneNumber("+16479900182"),
                "Test message (not supposed to work)")
                .create();

        System.out.println(message.getSid());
        return "";
    }
}
