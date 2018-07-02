package methodEmbedding.Standing_Ovation.S.LYD1590;

import java.io.BufferedReader;
import java.io.*;
import java.io.File;
import java.io.PrintWriter;

public class Main{
  public static void main(String[] args){
    try{
      String inputPath="C:\\Users\\Andreth\\Desktop\\CodeJam\\A\\A-small-attempt0.in";
      String outputPath="C:\\Users\\Andreth\\Desktop\\CodeJam\\A\\output.txt";
      String debugPath="C:\\Users\\Andreth\\Desktop\\CodeJam\\A\\debug.txt";

      FileReader inputFile = new FileReader(inputPath);
      BufferedReader bufferReader = new BufferedReader(inputFile);
      PrintWriter writer = new PrintWriter(outputPath, "UTF-8");     
      PrintWriter writer2 = new PrintWriter(debugPath, "UTF-8");   

      String line = bufferReader.readLine(); // First Line
      int problems = Integer.parseInt(line);


      for(int j=1; j<= problems; j++){

        String[] problem = ((String) bufferReader.readLine()).split(" ");
        int rows = Integer.parseInt(problem[0]);
        int APS=0,APN=0,AMC=0;
        String shyPeopleAll = problem[1];

        for (int i=0 ; i<= rows ; i++){
          int shyPeople = Integer.parseInt(String.valueOf(shyPeopleAll.charAt(i)));;
          if(i==0){
            writer2.write("FIRST ITERATION" + "\n");
            APS=shyPeople;
            APN=0; 
            AMC=APS; 
          }else{
            if(AMC < i && shyPeople > 0){
              writer2.write("ADDING FRIEND");
              APN += i  - AMC;
              AMC += (i - AMC) + shyPeople; 
              APS+= i  - AMC; 
            }else{
             if(AMC >= i && shyPeople > 0){
              writer2.write("NOT ADDING FRIEND");
              AMC += shyPeople;
            }
          }
        }
        APS+= shyPeople; 
        if(i==rows){
          writer.write("Case #" + String.valueOf(j) + ": " 
            + String.valueOf(APN) + (j != problems ?"\n":""));
        }
        writer2.write( "\n" +"AMC" + String.valueOf(AMC) + "\n"
          + "APN" + String.valueOf(APN) + "\n"
          + "APS" + String.valueOf(APS) + "\n"
          + "ITERATION" + String.valueOf(i) + "\n" + "\n") ;
      }
      writer2.write("END OF PROBLEM " + String.valueOf(j) + "\n" + "\n");
    }
    bufferReader.close();
    writer.close();
    writer2.close();
  }catch(Exception e){
    System.out.println("Error while reading file line by line:" + e.getMessage());                      
  }
}
}
