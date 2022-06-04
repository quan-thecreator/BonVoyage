package com.krishna.nlp2;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class JWiki2 {
    final String BASE_URL = "https://en.wikipedia.org/api/rest_v1/page/summary/";
    String subject = null;
    String displayTitle = "";

    String extractText = "";

    public JWiki2(String subject) {
        this.subject = subject;
        this.getData();
    }

    private void getData() {
        OkHttpClient client = new OkHttpClient();
        Request request = (new Request.Builder()).url("https://en.wikipedia.org/api/rest_v1/page/summary/" + this.subject).get().build();

        try {
            Response response = client.newCall(request).execute();
            String data = response.body().string();
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject)parser.parse(data);
            this.displayTitle = (String)jsonObject.get("displaytitle");


            this.extractText = (String)jsonObject.get("extract");
        } catch (ParseException | IOException var8) {
            var8.printStackTrace();
        }

    }

    public String getDisplayTitle() {
        return this.displayTitle;
    }



    public String getExtractText() {
        return this.extractText;
    }
}
