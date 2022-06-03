package com.krishna.nlp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@SpringBootApplication
public class Nlp2Application {
    public static final String ACCOUNT_SID = "AC1a35376752738d3b2a1f83dd4285a884";
    public static final String AUTH_TOKEN = "42f3a72c988d245559be5e65a9cf2642";
    public static void main(String[] args) throws IOException {
        Properties sysProps = new Properties();
        sysProps.load(getResourceAsStream("cred.properties"));
        println(sysProps.getProperty("youtube.api.key"));
        SpringApplication.run(Nlp2Application.class, args);

    }

    public static InputStream getResourceAsStream(String name){
        return Nlp2Application.class.getClassLoader().getResourceAsStream(name);
    }
    private static void println(Object x){
        System.out.println(x);
    }
}
