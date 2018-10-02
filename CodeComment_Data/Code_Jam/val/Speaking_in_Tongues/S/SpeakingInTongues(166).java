package methodEmbedding.Speaking_in_Tongues.S.LYD1164;

   import java.util.*;
   import java.io.*;

   public class SpeakingInTongues
   {
      private static Hashtable code = new Hashtable();
      public static void main(String[] args)
      {
         try {
            BufferedReader in = new BufferedReader(new FileReader("code.txt"));
            String fileContents = "";
            String str;
            while ((str = in.readLine()) != null) {
               String array[] = str.split(" ");
               code.put(array[1].trim().toLowerCase(), array[0].trim().toLowerCase());
            }
            in.close();
         } 
            catch (Exception e) {
               e.printStackTrace();
            }
            
         String result = "";
         try {
            BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
            String fileContents = "";
            String str;
            int length = Integer.parseInt(in.readLine());
            while ((str = in.readLine()) != null) {
               for(int i = 0; i<str.length(); i++)
               {
                  String letter = str.substring(i,i+1);
                  if(letter.equals(" "))
                  {
                     result+=" ";
                  }
                  else
                  {
                     result+=code.get(letter);
                  }
               }
               result+="\n";
            }
            in.close();
         } 
            catch (Exception e) {
               e.printStackTrace();
            }	
            
      		
         try{
         // Create file 
            FileWriter fstream = new FileWriter("output.txt");
            BufferedWriter out = new BufferedWriter(fstream);
            String[] resultArray = result.split("\n");
            for(int i = 0; i<resultArray.length; i++)
            {
               out.write("Case #"+(i+1)+": "+resultArray[i]);
               if(i!=resultArray.length-1)
                  out.newLine();
            }
            out.close();
         }
            catch (Exception e){//Catch exception if any
               System.err.println("Error: " + e.getMessage());
            }
      
        
      }
   }
