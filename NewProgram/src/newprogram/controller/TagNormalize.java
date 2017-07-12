/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newprogram.controller;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;
import newprogram.model.Model;

/**
 *
 * @author Wenkzz
 */
public class TagNormalize {
    Model model = new Model();
    public void TagNormalize(){
        
         String text = model.getWords();
        
        
            text = text.toLowerCase();
            text = text.replaceAll("[.,/;']", " $0 ").replaceAll("\\s+", " ");
            
            System.out.println(text);
            MaxentTagger tag = new MaxentTagger("traintag/english-left3words-distsim.tagger"); 
            model.setSeperateWords = text.split(" ");
            for(int i = 0;i<model.getSeperateWords().length;i++){
                model.setTaggedWords.add(model.getSeperateWords()[i]);
                String tagged = tag.tagString(model.getTaggedWords().get(i).toString());
                model.setTaggedWords.set(i, tagged);
                System.out.println(tagged.replace("_", ","));
            }
          model.setNumberOfWords = model.getSeperateWords().length;
            model.setTaggedWords.clear();
    }
}
