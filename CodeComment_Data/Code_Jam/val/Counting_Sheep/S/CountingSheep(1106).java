package methodEmbedding.Counting_Sheep.S.LYD442;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

 public class CountingSheep {
    public static void main(String[] args) {

        

        File inputFile = new File("/Users/Marco/Desktop/codejam/A-small-attempt0.in");
        File outputFile = new File("/Users/Marco/Desktop/codejam/A-small-attempt0.out");

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            
            int testCases= Integer.parseInt(br.readLine());
            
            for (int i=1;i<=testCases;i++){
                String sheepN= br.readLine();
                
                int intN=Integer.parseInt(sheepN);
                
                boolean done=false;
                
                int zeroCount=0;
                int oneCount=0;
                int twoCount=0;
                int threeCount=0;
                int fourCount=0;
                int fiveCount=0;
                int sixCount=0;
                int sevenCount=0;
                int eightCount=0;
                int nineCount=0;
                
                
                if(sheepN.equals("0")){
                    bw.write("Case #"+i+": "+"INSOMNIA");
                }
                else{
                
                    int k=1;
                while(!done){
                    
                    String N=String.valueOf(k*intN);
                    int lengthN=N.length();          
                
                 for (int j=0;j<lengthN;j++){
                   if( N.substring(j, j+1).equals("1") ){
                       oneCount++;
                   }
                   else if( N.substring(j, j+1).equals("2") ){
                       twoCount++;
                   }     
                   else if( N.substring(j, j+1).equals("3") ){
                       threeCount++;
                   } 
                   else if( N.substring(j, j+1).equals("4") ){
                       fourCount++;
                   }
                   else if( N.substring(j, j+1).equals("5") ){
                       fiveCount++;
                   }
                   else if( N.substring(j, j+1).equals("6") ){
                       sixCount++;
                   }
                   else if( N.substring(j, j+1).equals("7") ){
                       sevenCount++;
                   }
                   else if( N.substring(j, j+1).equals("8") ){
                       eightCount++;
                   }
                   else if( N.substring(j, j+1).equals("9") ){
                       nineCount++;
                   }
                   else if( N.substring(j, j+1).equals("0") ){
                       zeroCount++;
                   }
                   
                }
                k++;
                    
                if(oneCount>0 && twoCount >0 && threeCount >0 && fourCount>0 && fiveCount>0 && sixCount>0 && sevenCount>0 && eightCount >0 && nineCount>0 && zeroCount>0){
                   done=true;
                   bw.write("Case #"+i+": "+N);
                   
                } 
                    
                }
                
                }
                
                
                
                
                
             bw.newLine();
            }
            bw.close();
            br.close();

        } catch (IOException ex) {
            ex.printStackTrace();

        }

       

    }
}
