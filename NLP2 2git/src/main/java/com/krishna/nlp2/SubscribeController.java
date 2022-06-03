package com.krishna.nlp2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


@RestController
@RequestMapping(path = "/subscribe", method = RequestMethod.GET)
public class SubscribeController {

    @GetMapping(path = "/", produces = "application/json")
    public String subscribe(){
        Twilio.init(Nlp2Application.ACCOUNT_SID, Nlp2Application.AUTH_TOKEN);
        Message message = Message.creator(
                new PhoneNumber("+16479900182"),
                new PhoneNumber("+16479900182"),
                "Test message (not supposed to work)")
                .create();

        System.out.println(message.getSid());
        return "";
    }
}
