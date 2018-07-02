package methodEmbedding.Magic_Trick.S.LYD1548;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.*;

/**
 *
 * @author abc
 */
 class digita 
{
   

public static void main(String arg[])throws IOException
{
    int t,n,i,j,n2,n3,index=-1;
 Scanner sc=new Scanner(System.in);
       t=sc.nextInt();

       int a[][]=new int[4][4];
       int b[][]=new int[4][4];
       int m=0;
      while(t>m)
{m++;
   n2=sc.nextInt();
   
   for(i=0;i<4;i++)
     for(j=0;j<4;j++)
       a[i][j]=sc.nextInt();

   int store_a[]=new int[4];
      for(i=0;i<4;i++)
store_a[i]=a[n2-1][i];
   
   n3=sc.nextInt();      
   
   for(i=0;i<4;i++)
     for(j=0;j<4;j++)
        b[i][j]=sc.nextInt();

    int store_b[]=new int[4];

    for(i=0;i<4;i++)
       store_b[i]=b[n3-1][i];

    int check=0;
    
    for ( i = 0; i < 4; i++)
    {
        for (int k = 0; k < 4; k++)
        {
           if(store_a[i]==store_b[k])
           {
                check++;
                index=i;
                break;
           }
        }
    }
      if(check==1)
System.out.println("Case #"+m+": "+(store_a[index]));

if(check>1)
System.out.println("Case #"+m+": "+"Bad magician!");

if(check<1)
System.out.println("Case #"+m+": "+"Volunteer cheated!");
 


}


}

}
