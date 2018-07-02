package methodEmbedding.Counting_Sheep.S.LYD29;

import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) {

    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
      // Scanner has functions to read ints, longs, strings, chars, etc.
    
     // The name of the file to open.
        String fileName = "A-small-attempt1.in.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            int T = Integer.parseInt(bufferedReader.readLine());
             for (int i = 1; i <= T; ++i) {
      
      int num = Integer.parseInt(bufferedReader.readLine());
      int output=num;
       int x=1;
      if (num==0)
          {
 System.out.println("Case #" + i + ": INSOMNIA");
  }
      else{
  boolean [] numbers= new boolean [10];
  for (int j=0; j<10; j++)
  {
    numbers[j]=false;
  
  
  }
  boolean win =false;
  
  while (!win)
  {
    int n=x*num;
  while (n>0) {
    numbers[n%10]=true;
    n=n/10;
  }
  output=x*num;
  win =true;
 
for (int j=0; j<10; j++)
  {
    if (!numbers[j])
    {
    win =false;
    }
  
}
    x++;
  }
      System.out.println("Case #" + i + ": " + output);
   
      }
 
  
  
}
 

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
   
  
  
}
  
}
  
