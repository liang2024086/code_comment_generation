package methodEmbedding.Magic_Trick.S.LYD637;

   import java.io.*;
   import java.util.*;

   public class magic {
      public static void main(String[] args) throws IOException
      {
         BufferedReader inFile;
         PrintWriter out;
         int count = 0;
         try
         {
            inFile = new BufferedReader(new FileReader("A-small-attempt0.in"));
            out = new PrintWriter(new FileWriter("A-small-attempt0.out"));
            int cases = Integer.parseInt(inFile.readLine());
            int n;
            String asdf;
            String[][] asd;
            String[] as;
            String[] a;
            for(int i = 0; i < cases; i++)
            {
               n = Integer.parseInt(inFile.readLine());
               ArrayList<String> arr = new ArrayList<String>(); 

               asd = new String[4][4];
               for(int j = 0; j < 4; j++)
               {
                  asdf = inFile.readLine();
                  asd[j] = asdf.split(" ");
               }
               as = asd[n-1];
               n = Integer.parseInt(inFile.readLine());
               for(int j = 0; j < 4; j++)
               {
                  asdf = inFile.readLine();
                  asd[j] = asdf.split(" ");
               }
               a = asd[n-1];
               for(int j = 0; j < 4; j++)
               {
                  for(int k = 0; k < 4; k++)
                  {
                     if(as[j].equals(a[k]))
                        arr.add(as[j]);
                  }
               }	
               out.print("Case #" + (i+1) + ": ");
               if(arr.size() == 0)
            		out.println("Volunteer cheated!");
            	else if(arr.size() == 1)
            		out.println(arr.get(0));
            	else
            		out.println("Bad magician!");
            }
         
         
            out.close();
         }
            catch(FileNotFoundException e) 
            {
            }
      }
   }
