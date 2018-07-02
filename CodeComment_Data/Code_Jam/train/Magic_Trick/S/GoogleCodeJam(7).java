package methodEmbedding.Magic_Trick.S.LYD2227;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class GoogleCodeJam {

    public static void main(String[] args) throws IOException {
       Scanner scanner = new Scanner(System.in);
       int casses = scanner.nextInt();
       String[] result = new String[casses];
       int[][] dataSet1 = new int[4][4];
       int[][] dataSet2 = new int[4][4];
       int row1=0,row2=0;
       
       
       for(int cases=0;cases<casses;cases++)
       {
            row1 = (scanner.nextInt()-1);
           for(int i=0;i<4;i++)
           {
               for(int a=0;a<4;a++)
               {
                   dataSet1[i][a] = scanner.nextInt();
               }
           }
           //get data
             row2 = (scanner.nextInt()-1);
           for(int i=0;i<4;i++)
           {
               for(int a=0;a<4;a++)
               {
                   dataSet2[i][a] = scanner.nextInt();
               }
           }
           //checking
           int matches = 0;
           int matchCount=0;

           for(int a=0;a<4;a++)
           {
                for(int i=0;i<4;i++)
                {
                   // System.out.println("1:"+dataSet1[row1][i]+" 2:"+dataSet2[row2][a]);
                    if(dataSet1[row1][i]==dataSet2[row2][a])
                    {
                        
                        matches=dataSet1[row1][i];
                        matchCount++;
                    }
                }
           }
           //telling result
           if(matchCount==0)
           {
               result[cases] = "Case #"+(cases+1)+": Volunteer cheated!";
           }else if(matchCount>1)
           {
               result[cases] = "Case #"+(cases+1)+": Bad magician!";
           }else if(matchCount==1)
           {
               result[cases] = "Case #"+(cases+1)+": "+matches;
           }
           
       }
       //loops end
       File file = new File("src\\googlecodejam\\helo1.txt");
        file.createNewFile();
         FileWriter writer = new FileWriter(file);
       for(int i=0;i<casses;i++)
       {
           System.out.println(result[i]);
           writer.write(result[i]+ "\n");
           
       }
       
        writer.flush();
           writer.close();
       
    }
    
}
