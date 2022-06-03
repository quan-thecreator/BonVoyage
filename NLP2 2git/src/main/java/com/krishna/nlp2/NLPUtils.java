package com.krishna.nlp2;

import edu.stanford.nlp.pipeline.CoreNLPProtos;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.Properties;

public class NLPUtils {

    private static Properties props = new Properties();
    private static StanfordCoreNLP pipeline;
    public static void init() {
        props.setProperty("annotators","tokenize, ssplit, parse, sentiment");
        props.setProperty("coref.algorithm", "neural");
         pipeline = new StanfordCoreNLP(props);
    }
    public static String getTextOverallSentiment(String text){

        return "";
    }

}


