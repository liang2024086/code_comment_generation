package methodEmbedding.Magic_Trick.S.LYD1076;

//Christian Wen
//Problem A - Magic Trick

import java.util.*;
import java.io.*;

public class magicTrick {
  
  public static void main (String args[]) throws IOException {
    
    int tests;
    int choice;
    int answers;
    int finalx = 0;
    
    int [] row1 = new int [4];
    int [] row2 = new int [4];
    
    String s;
    String row [];
    
    BufferedReader bis = new BufferedReader(new FileReader("A-small-attempt0.in."));
    
    Writer writer = new BufferedWriter(new OutputStreamWriter(
    new FileOutputStream("output.txt"), "utf-8"));
    
    s = bis.readLine();
    tests = Integer.parseInt(s);
    
    for (int i = 1; i <= tests ; i++) //test cases
    {
      answers = 0;
      s = bis.readLine();
      choice = Integer.parseInt(s);
      
      for (int x = 1; x <= 4; x++) //looking for correct row
      {
        s = bis.readLine();
        if (x == choice)
        {
          row = s.split(" ");
          
          for (int y = 0; y < 4; y++) //adding values to row1
          {
            row1 [y] = Integer.parseInt(row[y]);
          }
          
        }
      }
      
      s = bis.readLine();
      choice = Integer.parseInt(s);
      
      for (int x = 1; x <= 4; x++) //looking for correct row
      {
        s = bis.readLine();
        if (x == choice)
        {
          row = s.split(" ");
          
          for (int y = 0; y < 4; y++) //adding values to row2
          {
            row2 [y] = Integer.parseInt(row[y]);
          }
          
        }
      }
      
      for (int x = 0; x < 4 ; x++) //looking through first row
      {
        for (int y = 0; y <4 ; y++) //looking through second row
        {
          if (row1 [x] == row2 [y])
          {
            answers++;
            finalx = row1[x];
          }
        }
      }
      
     if (answers == 0)
     {
       writer.write("Case #" + i + ": Volunteer cheated!\n");
     }
     else if (answers == 1)
     {
       writer.write("Case #" + i + ": " + finalx + "\n");
     }
     else if (answers > 1)
     {
       writer.write("Case #" + i + ": Bad magician!\n");
     }
      
    }
    
    writer.close();
  }
  
}
  
  
