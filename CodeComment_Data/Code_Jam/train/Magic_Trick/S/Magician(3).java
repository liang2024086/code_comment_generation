package methodEmbedding.Magic_Trick.S.LYD1428;


/**
 *
 * @author Adarsh
 */
import java.io.*;
import java.util.*;

public class Magician {
   static int TC ;
   
   public static void main(String[]args)throws IOException
   {
       Scanner sc=new Scanner(System.in);
       PrintWriter pw=new PrintWriter(System.out);
       TC=sc.nextInt();
       int choice;
       int a,b,c,d;
       int arr[][]=new int[5][5];
       for(int test=1; test<=TC ; test++)
       {
           choice=sc.nextInt();
           for(int i=1;i<=4;i++)
               for(int j=1;j<=4;j++)
                   arr[i][j]=sc.nextInt();
           
           a=arr[choice][1];
           b=arr[choice][2];
           c=arr[choice][3];
           d=arr[choice][4];
           choice=sc.nextInt();
           for(int i=1;i<=4;i++)
               for(int j=1;j<=4;j++)
                   arr[i][j]=sc.nextInt();
           boolean flag1=false , flag2=false;
           int data=0;
           for(int i=1;i<=4;i++)
           {
               if(!flag1)
               {if(arr[choice][i]==a || arr[choice][i]==c || arr[choice][i]==b || arr[choice][i]==d) {flag1=true;data=arr[choice][i];} }
               else
               {if(arr[choice][i]==a || arr[choice][i]==c || arr[choice][i]==b || arr[choice][i]==d) flag2=true;}  
           }
           if(flag1==false)
               pw.println("Case #"+test+": Volunteer cheated!");
           else if(flag2==true)
               pw.println("Case #"+test+": Bad magician!");
           else 
               pw.println("Case #"+test+": "+data);
               
               
       }
       pw.close();
   }
   
}
