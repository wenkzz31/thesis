/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newprogram.controller;

import com.csvreader.CsvWriter;
import edu.stanford.nlp.io.ExtensionFileFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.commons.io.FilenameUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.hwpf.HWPFDocument;
import java.util.List;
import newprogram.View.View;
import newprogram.model.Model;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;

/**
 *
 * @author Wenkzz
 */
public class Controller {
    public StringBuilder sb = new StringBuilder();
    JFileChooser choose = new JFileChooser();
    Model model = new Model();
    TagNormalize tag = new TagNormalize();
    Frequency freq = new Frequency();
    InitializeDictionary dict = new InitializeDictionary();
    public void OpenFile() throws Exception{
        choose.setAcceptAllFileFilterUsed(false);
        choose.addChoosableFileFilter(new FileNameExtensionFilter("All documents (.txt,.pdf,.doc,.docx)","txt","doc","docx","pdf"));
        choose.addChoosableFileFilter(new FileNameExtensionFilter("Text Files (.txt)","txt"));
         choose.addChoosableFileFilter(new FileNameExtensionFilter("Document Files (.doc,.docx)","doc","docx"));
          choose.addChoosableFileFilter(new FileNameExtensionFilter("PDF Files (.pdf)","pdf"));
        if (choose.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
            java.io.File file = choose.getSelectedFile();
           String extension = FilenameUtils.getExtension(file.toString());
            if(extension.equals("txt")){
                System.out.println("txt");
            Scanner scan = new Scanner(file);
            
            while(scan.hasNext()){
                sb.append(scan.nextLine());
                sb.append(" ");
            }
            
            scan.close();
        }
            else if(extension.equals("doc")){
                System.out.println("document");
                try{
                    FileInputStream fis = new FileInputStream(file.getAbsolutePath());
                    HWPFDocument doc = new HWPFDocument(fis);
                    WordExtractor we = new WordExtractor(doc);
                    String[] paragraphs = we.getParagraphText();
                    System.out.println("Total No. of Paragraphs: "+paragraphs.length);
                    String para="";
                    for( int i = 0; i<paragraphs.length;i++){
                        para += paragraphs[i];
                     
                       
                     
                    }
                 
                    
                    sb.append(para);
                    fis.close();
                    
                    
                }
                    catch(Exception e){
                        }
                
            }
            else if(extension.equals("docx")){
                try{
                FileInputStream fis = new FileInputStream(file.getAbsolutePath());
                XWPFDocument document = new XWPFDocument(fis);
                List<XWPFParagraph> paragraphs = document.getParagraphs();
                    XWPFWordExtractor extract = new XWPFWordExtractor(document);
                System.out.println("Total no of paragraph: "+paragraphs.size());
                String words = extract.getText();
                  
                sb.append(words);
                      
                        fis.close();
                }
                catch(Exception e){
                    
                }
            }
            else if(extension.equals("pdf")){
                System.out.print("pdf");
                try{
                   
                    PDDocument document = PDDocument.load(file);
                    
                    if(!document.isEncrypted()){
                     
                        PDFTextStripper Tstripper = new PDFTextStripper();
                        String text = Tstripper.getText(document);
                    document.close();
                    sb.append(text);
                    }
                    
                }
                catch(Exception e){
                    
                }
            }
            model.setWords = sb.toString();
            
        
        try{
                
                
               tag.TagNormalize();
               freq.Frequency();
               dict.CompareDictionary();
          }catch(Exception e){
                 e.printStackTrace();
            }
        }
        else{
            System.out.println("No file selected");
        }
        
        
    }
    public void TextArea(){
        
        try{
               tag.TagNormalize();
               freq.Frequency();
            }catch(Exception e){
                 e.printStackTrace();
            }
    }
}
