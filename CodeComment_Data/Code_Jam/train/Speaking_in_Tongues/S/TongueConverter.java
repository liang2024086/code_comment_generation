package methodEmbedding.Speaking_in_Tongues.S.LYD1002;

import java.util.Scanner;
import java.io.*;

public class TongueConverter{
  
  public static void main(String[] args){
    
    //read filename from user
    Scanner request = new Scanner(System.in);
    System.out.println("Enter file name");
    String fileName = request.nextLine();
    
    char[] goog = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char[] engl = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
    
    try{
    //create a filereader to read through file contents
      
    Scanner inputFile = new Scanner(new File(fileName));
    //create output file
    BufferedWriter outputFile = new BufferedWriter(new FileWriter("output.txt"));
    
    //read file contents
    
    int lineCount = inputFile.nextInt();
    String x= inputFile.nextLine();
    for(int i=0; i<lineCount;i++){
      String line = inputFile.nextLine();
      String result = "";
      for(int j=0;j<line.length();j++){
        int letter = line.charAt(j) - 97;
      
        result += (letter==-65)?" ":engl[letter];
      }
      outputFile.write("Case #" + (i+1) +": " + result);
      outputFile.newLine();
    }
    outputFile.close();
    }
    catch(IOException e){
      System.out.println("Error getting file");
    }
  }//end of main method
  
}//end of class
