package methodEmbedding.Speaking_in_Tongues.S.LYD862;

import java.io.*;
class Solve
{

public static void main(String[] args) throws IOException
{
SolveProblem sb = new SolveB();
try{
FileInputStream fstream = new FileInputStream("A-small-attempt14.in");
DataInputStream in = new DataInputStream(fstream);
BufferedReader br = new BufferedReader(new InputStreamReader(in));
String strLine;

 while ((strLine = br.readLine()) != null)   {
 if(strLine.equals("30")){
 int i =Integer.parseInt(strLine);
 sb.setCase(30);
 }else
 {
 sb.input(strLine);
 sb.solveProblem();
 //System.out.println (strLine);
  }
  }
   in.close();
     }catch (Exception e){//Catch exception if any
   System.err.println("Error: " + e.getMessage());
   }

}
}

   
   
 
