package methodEmbedding.Counting_Sheep.S.LYD1432;


import java.io.*;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) throws IOException {
      BufferedReader br = null ;
      BufferedWriter bw= null;
      
      try {
          br = new   BufferedReader(   new FileReader ("in.in"));
      } catch (FileNotFoundException ex) {
        //  Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      try {
          bw= new BufferedWriter(new FileWriter("out.txt"));
      } catch (IOException ex) {
        //  Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
      }
      
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    
    
    
    int t = 0;
      try {
          t = Integer.parseInt(br.readLine() );
      } catch (IOException ex) {
        //  Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      
    //Pancake p = new Pancake();
    
    Num n= new Num();
     
// Scanner has functions to read ints, longs, strings, chars, etc.
    for (int i = 1; i <= t; i++) {
        
        int tmp= Integer.parseInt( br.readLine() );
         
          try {
              bw.write("Case #" + i + ": "+n.setN(tmp));
              bw.newLine();
              
           //   System.out.println("Case #" + i + ": "+l.setLine(br.readLine()) ); 
          } catch (IOException ex) {
            
          }
        
    }
    
    
      try {
          bw.close();
          br.close();
      } catch (IOException ex) {
          
      }
  }
  
      
}
