package methodEmbedding.Magic_Trick.S.LYD800;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Faizal
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        try{
                Scanner in = new Scanner(new File("F:\\in.in"));
               
                FileWriter fw= new FileWriter("F:\\out.txt");
                BufferedWriter out=new BufferedWriter(fw);
               
		 int i,j,flag,temp = 0;
		int T=in.nextInt();
                if(T<=1 && T>100)
                {
                    System.exit(1);
                }
                int[][] A=new int[4][4];
                int[][] B=new int[4][4];
                for(int t=1;t<=T;t++)
                {
                        int ans1=in.nextInt();
                        if(ans1<1 && ans1>4) { System.exit(1);}
                        for(i=0;i<4;i++)
                        {
                                for(j=0;j<4;j++)
                                {	
                                    A[i][j]=in.nextInt();
                                }
                        }
                        int ans2=in.nextInt();
                        
                        if(ans2<1 && ans2>4){ System.exit(1);}
                        for(i=0;i<4;i++)
                        {
                                for(j=0;j<4;j++)
                                {	
                                    B[i][j]=in.nextInt();
                                }
                        }
                        flag=0;
                        ans1--;
                        ans2--;
                        for(i=0;i<4;i++)
                        {
                            for(j=0;j<4;j++)
                            {
                                if(A[ans1][i]==B[ans2][j])
                                {   flag++;
                                    temp=A[ans1][i];
                                }
                            }
                        }
                        if(flag==0){ 
                            out.write("Case #"+t+": Volunteer cheated!\n");
                            
                        }
                        if(flag==1){ 
                            out.write("Case #"+t+": "+temp+"\n");
                        }
                        if(flag>1){
                            out.write("Case #"+t+": Bad magician!\n");
                        }
                        
                        
                        
                }
                out.close();
                in.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
                /*for(i=0;i<4;i++)
                        {
                                for(j=0;j<4;j++)
                                {	
                                    System.out.print(A[i][j]+" ");
                                }
                                System.out.println();
                        }*/
                
    }
}
