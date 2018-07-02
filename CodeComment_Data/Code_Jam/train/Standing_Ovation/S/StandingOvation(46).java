package methodEmbedding.Standing_Ovation.S.LYD1538;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;




public class StandingOvation {

    @SuppressWarnings("null")
    public static void main(String[] args) throws IOException {
        String file = "small.in";
        String line;
        Integer numOfCases;
       
        Integer numberOfFriendsNeeded=0;
        Integer SumOfAud=0;
        Integer nOfAud;
        char[] cArray ;
        Integer count=0;
        Integer Smax;
        Integer Si=0;
        Integer diff=0;
        PrintWriter writer = new PrintWriter("OUtput.out", "UTF-8");
          
        // TODO Auto-generated method stub
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            line = br.readLine();
            numOfCases=Integer.parseInt(line);
             while ((line = br.readLine()) != null) {
                 SumOfAud=0;
                 numberOfFriendsNeeded=0;
                 nOfAud=0;
                 Si=0;
                 cArray = line.toCharArray();
                 Smax=(int)cArray[0]-48+1;
                 for (int i =2 ;i<Smax+2;i++){
                     nOfAud=(int)cArray[i]-48;
                     
                    //'if (nOfAud==0 && i==2)
                  ///  ' { numberOfFriendsNeeded=numberOfFriendsNeeded+1;
                 //    SumOfAud=SumOfAud+numberOfFriendsNeeded;
                 //  '  }
                     if(nOfAud>0){
                         if(SumOfAud<Si)
                         {
                             diff=Si-SumOfAud;
                             numberOfFriendsNeeded=numberOfFriendsNeeded+diff;
                             SumOfAud=SumOfAud+numberOfFriendsNeeded;
                             
                         }
                         
                         
                     }
                     SumOfAud=SumOfAud+nOfAud;
                     Si=Si+1;
                  }
                 count=count+1;
                 writer.println("Case #"+ count+": "+numberOfFriendsNeeded);
                 
                     System.out.println("Case #"+ count+": "+numberOfFriendsNeeded);
                 
        } 
             
           
        }
        writer.close();
    }

}
