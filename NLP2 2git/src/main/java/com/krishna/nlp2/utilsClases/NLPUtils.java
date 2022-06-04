package com.krishna.nlp2.utilsClases;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.neural.rnn.RNNCoreAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreNLPProtos;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.util.CoreMap;
import org.ejml.simple.SimpleMatrix;


import java.util.Properties;

public class NLPUtils {

    private static Properties props = new Properties();
    private static StanfordCoreNLP pipeline;
    public static void init() {
        props.setProperty("annotators","tokenize,ssplit,pos,parse,sentiment");
        props.setProperty("coref.algorithm", "neural");
         pipeline = new StanfordCoreNLP(props);
    }
    public static String getTextOverallSentiment(String text){

        Annotation annotation = pipeline.process(text);
        String sentimentType ="passing" ;

        for (CoreMap sentence :
                annotation.get(CoreAnnotations.SentencesAnnotation.class)) {

            if (sentence == null) {
                continue;
            }
            Tree tree = sentence.get(SentimentCoreAnnotations.SentimentAnnotatedTree.class);
            int sentiment = RNNCoreAnnotations.getPredictedClass(tree);

            SimpleMatrix sm = RNNCoreAnnotations.getPredictions(tree);
           double neutrality =  ((double)Math.round(sm.get(2) * 100d));
           if(!(neutrality >=20d)) {
               sentimentType="failing";
               break;
           }
        }
            return sentimentType;
    }

}


