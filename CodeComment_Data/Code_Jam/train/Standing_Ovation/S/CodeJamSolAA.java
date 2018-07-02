package methodEmbedding.Standing_Ovation.S.LYD941;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class CodeJamSolAA {
    
    public static void main(String a[]) throws Exception{
    
    String inputFile = "C:\\CJ\\data\\testA.txt";
    inputFile = "C:\\CJ\\data\\smallAA.in";
//    inputFile = "C:\\CJ\\data\\largeAA.in";
    String outputFile = "C:\\CJ\\outputAA"+System.currentTimeMillis()+".txt";
            
    Scanner re  = new Scanner(new File(inputFile));
    PrintStream out = new PrintStream(outputFile);
    //out = System.out;
    
    int tcc = re.nextInt();
    
    for(int test=1;test<=tcc;test++){
        
        int maxShy = re.nextInt();
        byte[] shyMat = re.next().getBytes();
        int existedPred = shyMat[0] - '0';
        int newlyJoined = 0;
        
       int arryInd =1;
       while(arryInd < shyMat.length){
           int defeciency = arryInd -  (existedPred + newlyJoined);
           if(defeciency > 0)   newlyJoined += defeciency;
           
           existedPred += (shyMat[arryInd] - '0');
           arryInd++;
        }
        
        out.println("Case #"+test+": "+newlyJoined);
    }
    
    out.flush();
    System.out.println("\n" + outputFile);
    out.close();
    
  }
    
}
