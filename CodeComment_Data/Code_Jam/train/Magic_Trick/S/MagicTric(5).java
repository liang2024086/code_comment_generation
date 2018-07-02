package methodEmbedding.Magic_Trick.S.LYD1492;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ????????
 */
public class MagicTric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        FileReader flr=new FileReader("A-small-attempt0.in");
        Scanner in=new Scanner(flr);
        int testCount=in.nextInt();
         PrintWriter out=new PrintWriter("output.out");
        int [][]card=new int[4][4];
        
        for(int Case = 1; Case<=testCount; Case++){
            int answer=in.nextInt()-1;
        
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                card[i][j]=in.nextInt();
            }
        }
        int [] line={card[answer][0],card[answer][1],card[answer][2],card[answer][3]};
        
        answer=in.nextInt()-1;
        for(int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                card[i][j]=in.nextInt();
            }
        }
       
        int [] line1={card[answer][0],card[answer][1],card[answer][2],card[answer][3]};
        
            
            int ansver=0;
            int sum=0;
            for(int i=0; i<4; i++){
                for (int j=0; j<4; j++){
                    if(line[i]==line1[j]){
                        ansver = line1[j];
                        sum++;
                    }
                }
            }
            
            if(sum>1){
                out.println("Case #"+Case+": Bad magician!");
                
            }else if (ansver==0){
                 out.println("Case #"+Case+": Volunteer cheated!");
            } else {out.println("Case #"+Case+": "+ansver);}
        }
    
        out.flush();
    }
    
}
