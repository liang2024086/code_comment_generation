package methodEmbedding.Magic_Trick.S.LYD667;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akshay
 */
import java.util.Scanner;
public class magic {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int arr1[][]=new int[4][4];
        int arr2[][]=new int[4][4];
        int comp1[]=new int[4];
        int comp2[]=new int[4];
        int card=0;
        for(int i=0;i<t;i++)
        {
            int r1=sc.nextInt();
            int c1=0;
            for(int j=0;j<4;j++)
            {
               
                for(int k=0;k<4;k++)
                {
                    arr1[j][k]=sc.nextInt();
                    if(j==(r1-1))
                        comp1[k]=arr1[j][k];
                }
            }
            
           /*for(int y=0;y<4;y++)
           System.out.print(comp1[y]+" ");
            */
            int r2=sc.nextInt();
            int c2=0;
            for(int l=0;l<4;l++)
            {
               
                for(int m=0;m<4;m++)
                {
                    arr2[l][m]=sc.nextInt();
                    if(l==(r2-1))
                        comp2[m]=arr2[l][m];
                }
            }
            
            /* for(int y1=0;y1<4;y1++)
           System.out.print(comp2[y1]+" ");
            */
            int s=0;
           
            for(int p=0;p<comp1.length;p++){
            for(int q=0;q<comp2.length;q++){
                if(comp1[p]==comp2[q]){
                    s++;
                    card=comp1[p];
                    
                }
                //s++;
            }
            }
            System.out.print("Case #"+(i+1) +":"+ " ");
            if(s==1)
                System.out.println(card);
            else if(s>1)
                System.out.println("Bad magician!");
            else System.out.println("Volunteer cheated!");
            
        }
    }
    
}
