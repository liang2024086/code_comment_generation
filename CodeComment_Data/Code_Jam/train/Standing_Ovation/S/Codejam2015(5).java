package methodEmbedding.Standing_Ovation.S.LYD784;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 *
 * @author MarioAkio
 */
public class Codejam2015 {
    
public static int[] Speople;
public static int Final;
public static String[] split; 
public static int peoplecount =0;
public static ArrayList<Integer> calc = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException, IOException {
    BufferedReader buff = new BufferedReader(new FileReader("A-small-attempt1.in"));
   PrintStream out = new PrintStream(new FileOutputStream("attempt0.out"));
    String line;
    int count=0;
    int slevel = 0;
    int Case = 0;
  
    while((line = buff.readLine()) != null){count = count+1;
   boolean donelist = false;
 
    if(count >= 2){
           
            split = line.split("\\s+");
            Speople = new int[(Integer.parseInt(split[0]))+1];
            slevel = split[1].length();
           
           
            for(int i = 0;i < Integer.parseInt(split[0])+1; i = i +1){
             Speople[i] = Character.getNumericValue(split[1].charAt(i));
            }
            for(int x = 0;x < slevel;x = x+1){
                if(x==0){
                    peoplecount = Speople[x];
             
                }else{   
               if(x <= peoplecount){
                   peoplecount = peoplecount + Speople[x];
                  
               }else{
                  
                   calc.add(x-peoplecount);
                   
               }
                
                }}
            if(!calc.isEmpty()){
                outer: 
            for(int x=0;x < calc.size(); x = x+1){
              int great =0;
              int pcount = 0;
                pcount = calc.get(x);
               for(int y=0;y < slevel;y = y+1){
                  
               if(y <= pcount){
                   pcount = pcount + Speople[y];
                  great = great+1;
               }else{
               break;
               }if(great == slevel){
               Final = calc.get(x);
               great = 0;
               donelist = true;
               break outer;
               }
               }
            }}else{
                Final = 0;
                Case = Case +1;
                out.println("Case #"+Case+": "+Final);    
            }
          if(donelist){
                calc.clear();               
                Case = Case +1;
                out.println("Case #"+Case+": "+Final);
                 Final = 0;

          }
    } }
    // System.setOut(out);
    }//main
   
       
    }
    

