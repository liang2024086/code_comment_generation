package methodEmbedding.Magic_Trick.S.LYD112;

import java.io.*;

public class ReadFile {
   public static void main(String args[]) throws IOException
   {
      FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader("A-small-attempt3.in");
         BufferedReader br  =  new BufferedReader(in);

         
         int dataLength = Integer.parseInt(br.readLine());
         String[] outPut = new String[dataLength];
         
         for (int i = 0;i < dataLength ;i++ ) {
            
             int firstAnswer = Integer.parseInt(br.readLine());
             
             int[] firstAttempt = new int[4];
            for (int j = 0;j < firstAnswer-1 ;j++ ) {
               br.readLine();
            }

             String asdf = br.readLine();
            

             String[] dataString = asdf.split("\\s+");
             for (int  j = 0;j < 4 ;j++ ) {
                firstAttempt[j] =  Integer.parseInt(dataString[j]);
             }
            for ( int j = 0;j < (4-firstAnswer) ; j++) {
                br.readLine();
            }
             //////////////second attempt///////////////////////////////////
             int secondAnswer = Integer.parseInt(br.readLine());
             
             int[] secondAttempt = new int[4];
             for (int j = 0;j < secondAnswer-1 ;j++ ) {
              
               br.readLine();
            }

             asdf = br.readLine();

             dataString = asdf.split("\\s+");
             boolean found = false;
             boolean goodMagician = true;
             boolean goodVolunteer = true;
             int searchKey;
             int answer = -1;
             for (int j = 0;j < 4 ;j++ ) 
             {
                searchKey = Integer.parseInt(dataString[j]);
                for (int k = 0;k < 4 ; k++ ) 
                {
                   if(searchKey == firstAttempt[k])
                   {

                     if(found == false)
                     {
                     found = true;
                     answer = searchKey;
                    
                     }
                     else
                     {

                        goodMagician = false;
                        outPut[i] = "Case #"+(i+1)+": Bad magician!";
                     }

                   }
                }
             }
             if(found == false)
             {


               goodVolunteer = false;
               outPut[i] = "Case #"+(i+1)+": Volunteer cheated!";

             }
             if(outPut[i] == null  && answer != -1)
             {

               outPut[i] = "Case #"+(i+1)+": "+answer;
             }
              for ( int j = 0;j < (4-secondAnswer) ; j++) {
                br.readLine();
            }
            
         }
          out = new FileWriter("out.txt");
         BufferedWriter bw = new BufferedWriter(out);
         for (int i = 0; i < dataLength;i++ ) {

           bw.write(outPut[i]);
           bw.write("\n");
           
          
            }
            bw.close();

      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }

}
