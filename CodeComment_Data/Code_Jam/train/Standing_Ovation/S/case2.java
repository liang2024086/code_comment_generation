package methodEmbedding.Standing_Ovation.S.LYD1416;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author JaiKamal
 */
public class case2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int T;
        int Smax;
        int [][] A= new int[100][100];
        int[] A1= new int[100];
        int [][] Green= new int[100][100];
        int flag=0;
        int max=-1;
        
        Scanner sc= new Scanner(System.in);
        
        T=sc.nextInt();
        String str=null;
        int str1=0;
        for(int tmp=0;tmp<T;tmp++)
        {
            Smax=sc.nextInt();
            
            /* General case 
            str=sc.next();
             int j=str.length();
             int i=0;
            while(j-->0)
            {
                A1[i++]=str.charAt(j);
            } */
            
            str1=sc.nextInt();
           
            for(int i=0;i<=Smax;i++)
            {
                A1[i]=str1%10;
                str1=str1/10;
            }
            
            int friend=0,sum=0,i=0;
            for(int j=Smax; j>=0; j--)
            {
                
                
                if(i>sum){
                    friend+=(i-sum);sum++;}
                 i++;   sum+=(A1[j]);
            }
             System.out.println("Case #"+(tmp+1)+": "+friend);
                    //else System.out.println("Case #"+(tmp+1)+": NO");
        }
    }
    
}
