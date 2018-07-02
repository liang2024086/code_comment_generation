package methodEmbedding.Speaking_in_Tongues.S.LYD940;

import java.io.*;
class Ex1 
{
 public static void main(String args[])
  {
  try{
  // Open the file that is the first 
  // command line parameter
      
      String sampleIn = " y n f i c w l b k u o m x s e v z p d r j g t h a q";
      String sampleOut = " a b c d e f g h i j k l m n o p q r s t u v w x y z"; 
      
      
      
      
  FileInputStream fstream = new FileInputStream("C:/Users/Madu/Documents/NetBeansProjects/CodeJamR1Ex1/input/A-small-attempt0.in");
  FileOutputStream fout = new FileOutputStream ("C:/Users/Madu/Documents/NetBeansProjects/CodeJamR1Ex1/output/out.txt");
  PrintStream printStream = new PrintStream(fout);
  // Get the object of DataInputStream
  DataInputStream in = new DataInputStream(fstream);
  BufferedReader br = new BufferedReader(new InputStreamReader(in));
  String inputIlne;
  br.readLine();
      //printStream.println ("Output");
  //Read File Line By Line
      int lineNum = 1;
  while ((inputIlne = br.readLine()) != null)   {
  // Print the content on the console
      printStream.print ("Case #"+lineNum+": ");lineNum++;
      
      for(int x=0;x<inputIlne.length();x++){
      
          printStream.print(sampleOut.charAt(sampleIn.indexOf(inputIlne.charAt(x))));          
          
      }
      printStream.println("");
  }
  //Close the input stream
  in.close();
  
  
    }catch (Exception e){//Catch exception if any
  System.err.println("Error: " + e.toString());
  }
  }
}
