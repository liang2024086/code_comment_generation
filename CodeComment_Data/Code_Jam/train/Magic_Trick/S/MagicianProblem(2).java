package methodEmbedding.Magic_Trick.S.LYD149;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;


/**
 *
 * @author HP
 */
public class MagicianProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count=0;
        int result=0;
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        int testcase=scanner.nextInt();
        int[][] arrangement=new int[2*testcase][16];
        int[] answer=new int[2*testcase];
       // System.out.println(testcase);
        
        int i=0;
        while(i<testcase){
            answer[2*i]=scanner.nextInt();
            
            for(int j=0;j<16;j++){
                arrangement[2*i][j]=scanner.nextInt();
            }
            
            answer[2*i+1]=scanner.nextInt();
            
            for(int j=0;j<16;j++){
                arrangement[2*i+1][j]=scanner.nextInt();
            }
            
            i++;
        }
        
        
        int k=0;
        while(k<testcase){
            int startA=(answer[2*k]-1)*4;
            int startB=(answer[2*k+1]-1)*4;
            
            for(int a=startA;a<startA+4;a++){
                for(int b=startB;b<startB+4;b++){
                    if(arrangement[2*k][a]==arrangement[2*k+1][b]){
                        count++;
                        result=arrangement[2*k][a];
                    }
                }
            }
            
             if(count==0)
                System.out.println("Case #"+(k+1)+": Volunteer cheated!");
             else if(count==1)
                System.out.println("Case #"+(k+1)+": "+result);
             else
                 System.out.println("Case #"+(k+1)+": Bad magician!");
             
            k++;
            count=0;
        }
        
       
    }
}
