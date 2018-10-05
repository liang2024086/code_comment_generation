package methodEmbedding.Speaking_in_Tongues.S.LYD499;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
/**
 *
 * @author FARHAN
 */
public class Main {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) throws FileNotFoundException, IOException{
        // TODO code application logic here
      FileInputStream fstream = new FileInputStream("D:/test.in");
  // Get the object of DataInputStream
  DataInputStream in = new DataInputStream(fstream);
  BufferedReader br = new BufferedReader(new InputStreamReader(in));
  String strLine;
  //Read File Line By Line
 GLanguage g = new GLanguage();
 g.loadTable();
  while ((strLine = br.readLine()) != null)   {
  // Print the content on the console
       int testCaseCount = Integer.parseInt(strLine);

       for(int i=0;i<testCaseCount;i++){
       strLine = br.readLine();
      strLine = strLine.toLowerCase();
       strLine = g.decondeString(strLine);
           System.out.println("Case #"+(i+1)+": "+strLine);
      }

  }

 // System.out.println (strLine);
  
  //Close the input stream
  in.close();
   



    }

}
