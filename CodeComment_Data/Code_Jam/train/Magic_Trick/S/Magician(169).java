package methodEmbedding.Magic_Trick.S.LYD700;

import java.io.*;
import java.lang.Exception;

class Magician
 {  
    public static void main(String args[]) throws IOException
     {
       try{
        
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int cases=Integer.parseInt(br.readLine());
       //BufferedWriter bw=new BufferedWriter(); 
     

       for(int l=0;l<cases;l++)
        {
          int count=0,pos1=0,pos2=0;
          int row1=Integer.parseInt(br.readLine());// for first arrangement
          String s1[][]=new String[4][4];

          

          for(int i=0;i<4;i++)
           {
            String t1[]=br.readLine().split(" ");
            for(int j=0;j<4;j++)
             {
              s1[i][j]=t1[j];
              } 
            }

         int arr1[]=new int[4];

         for (int i=0;i<4;i++)
          {
            arr1[i]=Integer.parseInt(s1[row1-1][i]);
           }

          int row2=Integer.parseInt(br.readLine());  // for second arrangement
          
          String s2[][]=new String[4][4];

          

          for(int i=0;i<4;i++)
           {
               String t2[]=br.readLine().split(" ");
            for(int j=0;j<4;j++)
             {
              s2[i][j]=t2[j];
              } 
            }

         int arr2[]=new int[4];

         for (int i=0;i<4;i++)
          {
            arr2[i]=Integer.parseInt(s2[row2-1][i]);
           }

          for(int i=0;i<4;i++)
           {
             for(int j=0;j<4;j++)
             {
              if(count>1)
               break;
              if(arr1[i]==arr2[j])
               {
                count++;
                pos1=i;
                pos2=j;
                }
           if(count>1)
               break;
              
              }
            }
         if(count==1)
         {
          System.out.println("Case #"+(l+1)+": "+ arr1[pos1]);
           }
          
         if(count>1)
         {
          System.out.println("Case #"+(l+1)+": "+"Bad magician!");
           }
         if(count==0)
         {
          System.out.println("Case #"+(l+1)+": "+"Volunteer cheated!");
           }
         }}
   catch(Exception e)
    {e.printStackTrace();}
         }
      }
