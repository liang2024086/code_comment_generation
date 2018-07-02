package methodEmbedding.Counting_Sheep.S.LYD1124;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.*; 
public class prob2{
    public static void main(String args[]) throws FileNotFoundException
    {
        File file = new File("D:/A-large.in");
        Scanner sc=new Scanner(file);
        //System.out.println("f");
        try{
        BufferedWriter br = new BufferedWriter(new FileWriter("D:/output.txt"));        
        StringBuilder sb = new StringBuilder();
        int t=sc.nextInt();
        double d[]=new double[1000001];
        for(int i=1;i<=1000000;i++){
            int n[]=new int[10];int c=0;
            int i1=i,i2=i;int c1=2,cc=1;
            while(cc==1){
            while(i1>0)
            {
                if(n[i1%10]==0){ ++c;
                n[i1%10]=1;}                
                i1=i1/10;
            }
            if(c==10) { d[i]=i2; cc=0;}
            else {i2=i*c1;i1=i2;c1++; 
                }
            }
            d[i]=i2;
        }
        System.out.println(d[1692]);
        for(int i=0;i<t;i++)
        {
            int dd=sc.nextInt();
            if(dd==0) sb.append("CASE #"+(i+1)+": INSOMNIA\n");
            else
            sb.append("CASE #"+(i+1)+": "+(long)d[dd]+"\n");
        }
        br.write(sb.toString());
        br.close();}
        
        catch(Exception e){
        }
    }
}
