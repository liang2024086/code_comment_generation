package methodEmbedding.Counting_Sheep.S.LYD765;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Insomnia
{
    public static void main (String [] args) throws FileNotFoundException{
        File infile = new File("C:/Users/Demetrios/Documents/java projects/Insomnia/A-small-attempt1.in");
        Scanner scnr = new Scanner(infile);
        int T = scnr.nextInt();
        int N[] =new int[T];
        int [] m = new int [10];
        int i,j,t,k,n,sum;
        for ( i=0; i<T; i++) 
             N[i]= scnr.nextInt();
        for (j=0; j<T; j++){
            t=1;
            sum=0;
            for (i=0; i<10;i++){
                m[i]=0;
            }
            while (sum<10 && t<=100){
                n=t*N[j];
                t=t+1;
                while (n!=0){
                    k = n%10;
                    n = n/10;
                    
                    if (m[k]==0){
                        m[k]=1;
                       sum=sum+1;
                    }  
                }
            }
            if (sum==10)
                System.out.println("Case #" +(j+1)+ ": " +(t-1)*N[j] ); 
            else 
                System.out.println("Case # "+(j+1)+": INSOMNIA");
        }
    }
}
