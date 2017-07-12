/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newprogram.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import newprogram.model.Model;

/**
 *
 * @author Wenkzz
 */
public class InitializeDictionary {
    public void Intialize() throws Exception{
        long startTime = System.currentTimeMillis();
        Model model = new Model();
        BufferedReader posReader = new BufferedReader(new FileReader(new File(
        "dictionaries/Posemo.txt")));
        BufferedReader negReader = new BufferedReader(new FileReader(new File(
        "dictionaries/Negemo.txt")));
        BufferedReader iReader = new BufferedReader(new FileReader(new File(
        "dictionaries/I.txt"))); 
        BufferedReader differReader = new BufferedReader(new FileReader(new File(
        "dictionaries/Differ.txt"))); 
        BufferedReader motionReader = new BufferedReader(new FileReader(new File(
        "dictionaries/Motion.txt"))); 
        BufferedReader pPronReader = new BufferedReader(new FileReader(new File(
        "dictionaries/Ppron.txt"))); 
        BufferedReader pronounReader = new BufferedReader(new FileReader(new File(
        "dictionaries/pronoun.txt"))); 
        BufferedReader sheHeReader = new BufferedReader(new FileReader(new File(
        "dictionaries/SheHe.txt"))); 
        BufferedReader theyReader = new BufferedReader(new FileReader(new File(
        "dictionaries/They.txt"))); 
        BufferedReader verbReader = new BufferedReader(new FileReader(new File(
        "dictionaries/Verb.txt"))); 
        BufferedReader weReader = new BufferedReader(new FileReader(new File(
        "dictionaries/We.txt"))); 
        BufferedReader youReader = new BufferedReader(new FileReader(new File(
        "dictionaries/You.txt")));
        
        String words;
        
        while ((words = negReader.readLine()) != null) {
                       words = words.replaceAll(" ", "");
			model.setNegWords.add(words);
		}
       while ((words = posReader.readLine()) != null) {
                        words = words.replaceAll(" ", "");
			model.setPosWords.add(words);
		}
       while ((words = iReader.readLine()) != null) {
           words = words.replaceAll(" ", "");
			model.setI.add(words);
		}
       while ((words = pPronReader.readLine()) != null) {
          words = words.replaceAll(" ", "");
			model.setPPron.add(words);
		}
       while ((words = youReader.readLine()) != null) {
          words = words.replaceAll(" ", "");
			model.setYou.add(words);
		}
       while ((words = weReader.readLine()) != null) {
         words = words.replaceAll(" ", "");
			model.setWe.add(words);
		}
       while ((words = theyReader.readLine()) != null) {
           words = words.replaceAll(" ", "");
			model.setThey.add(words);
		}
       while ((words = differReader.readLine()) != null) {
           words = words.replaceAll(" ", "");
			model.setDifferWords.add(words);
		}
       while ((words = motionReader.readLine()) != null) {
         words = words.replaceAll(" ", "");
			model.setMotionWords.add(words);
		}
       while ((words = pronounReader.readLine()) != null) {
           words = words.replaceAll(" ", "");
			model.setPronoun.add(words);
		}
       while ((words = sheHeReader.readLine()) != null) {
           
           words = words.replaceAll(" ", "");
           
	model.setSheHe.add(words);
		}
       while ((words = verbReader.readLine()) != null) {
           words = words.replaceAll(" ", "");
			model.setVerb.add(words);
		}
       long endtime = System.currentTimeMillis();
       long totaltime = endtime - startTime;
       System.out.println(totaltime);
    }
    public void CompareDictionary(){
        int nega=0,iWord=0,pos=0,pronoun=0,pPron=0,heShe=0,they=0,verb=0,motion=0,differ=0,we=0,you=0;
        Model model = new Model();
        String[] words = model.getSeperateWords();
        for (int i = 0; i<words.length;i++){
        if(model.getPosWords().contains(words[i])){
               pos++;
           }
        if(model.getSetNegWords().contains(words[i])){
               nega++;
           }
        if(model.getSetI().contains(words[i])){
               iWord++;
           }
        if(model.getSetPronoun().contains(words[i])){
               pronoun++;
           }
        if(model.getSetPPron().contains(words[i])){
               pPron++;
           }
        if(model.getSetSheHe().contains(words[i])){
               heShe++;
           }
        if(model.getSetDifferWords().contains(words[i])){
               differ++;
           }
        if(model.getSetMotionWords().contains(words[i])){
               motion++;
           }
        if(model.getSetWe().contains(words[i])){
               we++;
           }
        if(model.getSetYou().contains(words[i])){
               you++;
           }
        if(model.getSetVerb().contains(words[i])){
               verb++;
           }
        if(model.getSetThey().contains(words[i])){
               they++;
           }
        }
        System.out.println("Negative words: "+nega);
        System.out.println("Positive words: "+pos);
        System.out.println("They words: "+they);
        System.out.println("Verb words: "+verb);
        System.out.println("You words: "+you);
        System.out.println("We words: "+we);
        System.out.println("Motion words: "+motion);
        System.out.println("Differ words: "+differ);
        System.out.println("HeShe words: "+heShe);
        System.out.println("PPron words: "+pPron);
        System.out.println("Pronoun words: "+pronoun);
        System.out.println("I words: "+iWord);
    }
    public void RatePerCategory(){
        
    }
    
}
