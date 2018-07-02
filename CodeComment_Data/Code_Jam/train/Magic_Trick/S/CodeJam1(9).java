package methodEmbedding.Magic_Trick.S.LYD1200;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Erlil
 */
public class CodeJam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int i=0;i<cases;i++)
        {
            int ansCount=0;
            int solution=0;
            int ans1=in.nextInt()-1;
            int[][] arr1=new int[4][4];
            for(int j=0;j<4;j++)
                for(int k=0;k<4;k++)
                    arr1[j][k]=in.nextInt();
            
            int ans2=in.nextInt()-1;
            int[][] arr2=new int[4][4];
            for(int j=0;j<4;j++)
                for(int k=0;k<4;k++)
                    arr2[j][k]=in.nextInt();
            
            for(int j=0;j<4;j++)
                for(int k=0;k<4;k++)
                {
                    
                    if (arr1[ans1][j]==arr2[ans2][k])
                    {
                        ansCount++;
                        solution=arr1[ans1][j];
                        //System.out.println(solution);
                    }
                            
                    
                }
            if (ansCount==1)
                System.out.println ("Case #"+(i+1)+": "+(solution));
            else if (ansCount>1)
                System.out.println ("Case #"+(i+1)+": Bad magician!");
            else if (ansCount==0)
                System.out.println ("Case #"+(i+1)+": Volunteer cheated!");
                    
                
                    
        }
        
    }
}
