package methodEmbedding.Magic_Trick.S.LYD1505;

/*
 * Author: Soumya Kumar - Purdue University
 * Qualification Round
 * Google Code Jam 2014
 * 
 * */

import java.util.*;
import java.io.*;

public class GoogleCodeJam {
  
  //HELPER VARIABLES
  //public static
  
  //HELPER FUNCTIONS
  //public static
  
  
  
  public static void main(String[] args) {
    
    //COMMAND LINE ARGUMENTS
    String inputFile = null;
    String outputFile = null;
    
    if(args.length!=2) {
      System.out.println("Insufficient Arguments: " + args.length);
      return;
    } else {
      inputFile = args[0];
      outputFile = args[1];
    }
     
    
    //READ FILE
    FileReader input = null;
    BufferedReader reader = null;
    try {
      input = new FileReader(inputFile);
      reader = new BufferedReader(input);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    
    //WRITE FILE
    FileWriter output = null;
    BufferedWriter writer = null;
    try {
      output = new FileWriter(outputFile);
      writer = new BufferedWriter(output);
    } catch (Exception e) {
      throw new RuntimeException(e);
    } 
  
    //READ FILE ?
    try {
      
      int cases = Integer.parseInt(reader.readLine());
      int counter = 0;
      
      while ( counter != cases ) {
        //System.out.println(line);
        //PROGRAMMING PROBLEM
        //No Of inputs
        
        List<Set<Integer>> example1 = new ArrayList<Set<Integer>>();
        List<Set<Integer>> example2 = new ArrayList<Set<Integer>>();
        
        Set<Integer> temp = null;
        String[] elems = null;
        
        //for(int i=0; i<cases; i++) {
        //Each case has 9 lines of inputs
        
        //Example 1
        int row1 = Integer.parseInt(reader.readLine());
        for(int k=0; k<4; k++) {
          temp = new HashSet<Integer>();
          elems = reader.readLine().split(" ");
          for(int z=0; z<elems.length; z++) {
            temp.add(Integer.parseInt(elems[z]));
          }
          example1.add(temp);
        }
          
        //Example2
        int row2 = Integer.parseInt(reader.readLine());
        for(int k=0; k<4; k++) {
          temp = new HashSet<Integer>();
          elems = reader.readLine().split(" ");
          for(int z=0; z<elems.length; z++) {
            temp.add(Integer.parseInt(elems[z]));
            }
          example2.add(temp);
        }
        
        //ANALYSIS
        //System.out.println("Row1: " + row1);
        //System.out.println("Row2: " + row2);
        Set<Integer> compare1 = example1.get(row1-1);
        Set<Integer> compare2 = example2.get(row2-1);
        
        
        //System.out.println(compare1);
        //System.out.println(compare2);
        //System.out.println();
      
        int matching  = 0;
        for(Integer c1: compare1) {
          if(compare2.contains(c1))
            matching++;
        }
        
        //System.out.println("Matching: " + matching);
        if(matching == 1) {
          for(Integer c1: compare1) {
            if(compare2.contains(c1)) {
              System.out.println("Case #" + (counter+1) + ": " + c1);
              //writer.write("Case #" + (counter+1) + ": " + c1 + "\n");
            }
          }
        } else if(matching == 0) {
          System.out.println("Case #" + (counter+1) + ": Volunteer Cheated!");
          //writer.write("Case #" + (counter+1) + ": Volunteer Cheated!" + "\n");
        } else if(matching > 0) {
          System.out.println("Case #" + (counter+1) + ": Bad Magician!");
          //writer.write("Case #" + (counter+1) + ": Volunteer Cheated!" + "\n");
        }
        matching = 0;
        
        counter++;
      
      }
      
    
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    
    //WRITE FILE ?
    //writer.write(s)
    
    //CLOSE FILES
    try {
      input.close();   
      output.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    
    
  }//MAIN
  
}
