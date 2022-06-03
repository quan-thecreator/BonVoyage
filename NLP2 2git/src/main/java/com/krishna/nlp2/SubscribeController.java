package com.krishna.nlp2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


@RestController
@RequestMapping(path = "/subscribe", method = RequestMethod.GET)
public class SubscribeController {
    public static final String ACCOUNT_SID = "AC1a35376752738d3b2a1f83dd4285a884";
    public static final String AUTH_TOKEN = "42f3a72c988d245559be5e65a9cf2642";

    public static void main(String[] args){
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.Phonenumber("+16479900182"),
                new com.twilio.type.Phonenumber("+16479900182"),
                "Test message")
                .create();

        System.out.println(message.getSid());

    }
}
