package methodEmbedding.Magic_Trick.S.LYD1234;

import java.util.*;
import java.io.*;

public class magicTrick{
  final static int ROWS = 4;
  final static int NUMBRS_ENTER = 16;
  static Scanner s = null;
  
  static int testCase = 0;
  static int caseNum = 0;
  static int answerOne=0;
  static int answerTwo=0;
  static ArrayList <Integer> selectedRowOne;
  static ArrayList <Integer> selectedRowTwo;
  static ArrayList <Integer> testRow = new ArrayList <Integer> ();
  static String[] outputs;
  static BufferedReader br = null;
  static PrintWriter pw = null;
  
  public static void main(String[] args){
    
    /*==============================
     * get the number of test case
     * =============================
     */
    try{
      s = new Scanner (new BufferedReader(new FileReader("A-small-attempt2.txt")));
      
      if (s.hasNextInt()){
        testCase = s.nextInt();
      }
    }catch (IOException io){
      System.out.println("IOException Error in testCase");
    }catch (Exception io){
      System.out.println("General Exception Error in testCase");
    }
    
    outputs = new String[testCase];
    
    /*================================
     * the main body of the programme
     * ================================
     */
    for(int i = 0; i < testCase; i++){
      selectedRowOne = new ArrayList <Integer>();
      selectedRowTwo = new ArrayList <Integer>();
      
      try{
        /*
         * getting first row of number
         */
        //get the row the chosen number
        if(s.hasNextInt()){
          answerOne = s.nextInt()-1;
        }
        
        //enter the 4 rows
        int count = 0;
        for(int j = 0; j < (NUMBRS_ENTER/ROWS); j++){
          if(count == answerOne){
            if(s.hasNextInt()){
              selectedRowOne.add(s.nextInt());
              selectedRowOne.add(s.nextInt());
              selectedRowOne.add(s.nextInt());
              selectedRowOne.add(s.nextInt());
            }
          }else{
            if(s.hasNextInt()){
              s.nextInt();
              s.nextInt();
              s.nextInt();
              s.nextInt();
            }
          }
          count++;
        }
        
        /*
         * getting second row of number
         */
        //get the row the chosen number
        if(s.hasNextInt()){
          answerTwo = s.nextInt()-1;
        }
        
        //enter the 4 rows
        count = 0;
        for(int j = 0; j < (NUMBRS_ENTER/ROWS); j++){
          if(count == answerTwo){
            if(s.hasNextInt()){
              selectedRowTwo.add(s.nextInt());
              selectedRowTwo.add(s.nextInt());
              selectedRowTwo.add(s.nextInt());
              selectedRowTwo.add(s.nextInt());
            }
          }else{
            if(s.hasNextInt()){
              s.nextInt();
              s.nextInt();
              s.nextInt();
              s.nextInt();
            }
          }
          count++;
        }
      }catch (Exception io){
        System.out.println("General Exception Error in rows");
      }finally{
        if (pw != null) pw.close();
        try{
          if (br != null) br.close();
        }catch (IOException io){
          System.out.println("IOException Error in rows");
        }
      }
      
      /*
       * guessing volunteer's answer
       */
      int match = 0;
      int chosen = 0;
      for (int firstNum:selectedRowOne){
        for (int secondNum:selectedRowTwo){
          if(firstNum == secondNum){
            match++;
            chosen = firstNum;
          }
        }
      }
      
      //checking
      if (match == 1){
        outputs[caseNum] = "Case #"+ (caseNum+1) +": "+ chosen;
      }else if (match == 0){
        outputs[caseNum] = "Case #"+ (caseNum+1) +": "+"Volunteer Cheated!";
      }else{
        outputs[caseNum] = "Case #"+ (caseNum+1) +": "+"Bad magician!";
      }
      
      caseNum++;
    } //end for loop
    

    try{
      pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
      pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt", true)));
      for(int i = 0; i < outputs.length; i++){
        pw.println(outputs[i]);
      }
    }catch(IOException e){
      System.out.println("IOException");
    }finally{
      if(pw != null) pw.close();
    }

    
    System.out.println("done");
  } //end main
}
