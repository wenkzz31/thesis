/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newprogram.controller;

import java.util.Arrays;
import newprogram.model.Model;

/**
 *
 * @author Wenkzz
 */
public class Frequency {
    public void Frequency(){
        Model model = new Model();
        int n = model.getNumberOfWords();
        String[] words = model.getSeperateWords();
        Arrays.sort(words);
        String word = words[0];
        String[] records = new String[n];
        int freq = 1;
        int m = 0;
        System.out.println(n);
        for(int i = 1 ; i<n ;i++){
          if(!words[i].equals(word)){
              records[m++] = word+ "\t" + String.valueOf(freq);
              word = words[i];
              freq = 0;
          }
          freq++;
      }
        records[m++] = word+ "\t" + String.valueOf(freq);
        Arrays.sort(records ,0,m);
                for(int i =m-1;i>=0;i--){
                System.out.println(records[i]);
     }
    }
}
