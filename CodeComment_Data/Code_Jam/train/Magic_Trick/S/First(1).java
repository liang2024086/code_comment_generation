package methodEmbedding.Magic_Trick.S.LYD551;

import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class First{

       public static void main(String[] args) throws Exception{
        LinkedList ls=new  LinkedList();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine()),i=0;
        int x[][]=new int[4][4];
		int x1[][]=new int[4][4];
        String y []=new String[n];
        int k=0,a=0,cnt=0,tmp=0;
        for(i=0;i<n;i++)
        {
            int f=Integer.parseInt(br.readLine())-1;
            for(int j=0;j<4;j++)
            {
                String str=br.readLine();
                String st[]=str.split(" ");
                x[j][0]=Integer.parseInt(st[0]);
                x[j][1]=Integer.parseInt(st[1]);
                x[j][2]=Integer.parseInt(st[2]);
                x[j][3]=Integer.parseInt(st[3]);
            }
            int l=Integer.parseInt(br.readLine())-1;
            for(int j=0;j<4;j++)
            {
                String str=br.readLine();
                String st[]=str.split(" ");
                x1[j][0]=Integer.parseInt(st[0]);
                x1[j][1]=Integer.parseInt(st[1]);
                x1[j][2]=Integer.parseInt(st[2]);
                x1[j][3]=Integer.parseInt(st[3]);
            }
            
			for(k=0,cnt=0;k<4;k++)
            {
                   for(a=0;a<4;a++)
                   {
					//System.out.println(x[f][k]+"  " +x1[l][a]);
					   if(x[f][k]==x1[l][a])
                       {
                           tmp=x[f][k];
                           cnt++;
                       }
                   }
            }
            if(cnt==0)
                y[i]="Volunteer cheated!";
            if(cnt==1)
                y[i]=""+tmp;
            if(cnt==2||cnt==3||cnt==4)
                y[i]="Bad magician!";
            
           
        }
		BufferedWriter bw=new BufferedWriter(new FileWriter("output.txt"));
        for(i=0,cnt=1;i<n;i++,cnt++)
        {

            String str="Case #"+cnt+": ";
             str=str+y[i];
			 bw.write(str);
			bw.write("\r\n");
		
        }
		bw.close();
        
    }
    
}

