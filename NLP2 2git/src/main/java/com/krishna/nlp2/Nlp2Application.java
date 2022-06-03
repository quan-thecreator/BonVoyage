package com.krishna.nlp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@SpringBootApplication
public class Nlp2Application {
    public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    public static final String AUTH_TOKEN = "your_auth_token";
    public static void main(String[] args) throws IOException {
        Properties sysProps = new Properties();
        sysProps.load(getResourceAsStream("cred.properties"));
        System.out.println(sysProps.getProperty("youtube.api.key"));
        SpringApplication.run(Nlp2Application.class, args);

    }

    public static InputStream getResourceAsStream(String name){
        return Nlp2Application.class.getClassLoader().getResourceAsStream(name);
    }
    private static void println(Object x){
        System.out.println(x);
    }
}
