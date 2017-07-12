/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newprogram.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import newprogram.controller.Controller;

/**
 *
 * @author Wenkzz
 */
public class Model {
    
    public  static ArrayList<String> setPosWords = new ArrayList<String>();
    public  static ArrayList<String> setNegWords = new ArrayList<String>();
    public  static ArrayList<String> setMotionWords = new ArrayList<String>();
    public  static ArrayList<String> setDifferWords = new ArrayList<String>();
    public  static ArrayList<String> setPronoun = new ArrayList<String>();
    public static  ArrayList<String> setI = new ArrayList<String>();
    public static  ArrayList<String> setWe = new ArrayList<String>();
    public static  ArrayList<String> setYou = new ArrayList<String>();
    public static  ArrayList<String> setVerb = new ArrayList<String>();

    public static ArrayList<String> getSetNegWords() {
        return setNegWords;
    }

    public static ArrayList<String> getSetMotionWords() {
        return setMotionWords;
    }

    public static ArrayList<String> getSetDifferWords() {
        return setDifferWords;
    }

    public static ArrayList<String> getSetPronoun() {
        return setPronoun;
    }

    public static ArrayList<String> getSetI() {
        return setI;
    }

    public static ArrayList<String> getSetWe() {
        return setWe;
    }

    public static ArrayList<String> getSetYou() {
        return setYou;
    }

    public static ArrayList<String> getSetVerb() {
        return setVerb;
    }

    public static ArrayList<String> getSetThey() {
        return setThey;
    }

    public static ArrayList<String> getSetPPron() {
        return setPPron;
    }

    public static ArrayList<String> getSetSheHe() {
        return setSheHe;
    }

    public static String getSetWords() {
        return setWords;
    }
    public static  ArrayList<String> setThey = new ArrayList<String>();
    public static  ArrayList<String> setPPron = new ArrayList<String>();
    public static  ArrayList<String> setSheHe = new ArrayList<String>();
    public static  ArrayList<String> setTaggedWords = new ArrayList<String>();
    public  static String[] setSeperateWords;
    public  File setWordFile;
    public static int setNumberOfWords;
    public static String setWords;
    
    public ArrayList getPosWords(){
        return setPosWords;
    }
    public ArrayList getTaggedWords(){
        return setTaggedWords;
    }
    public static String getWords(){
        return setWords;
    }
    public static String[] getSeperateWords(){
        return setSeperateWords;
    }
    public static int getNumberOfWords(){
        return setNumberOfWords;
    }
    
}
