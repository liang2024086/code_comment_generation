package methodEmbedding.Counting_Sheep.S.LYD1301;

import java.util.Scanner;
import java.util.Arrays;

public class BelatrixSheep {

    public static void main(String[] args) {
        
        int N=0,T;
        int z=0;
        int ab=0;
        boolean truly=false;
        int check[]=new int[10];
        int phony=0;
        int casenumber=0;
        
        Scanner scanner=new Scanner(System.in);
        
        T=scanner.nextInt();
        
        int input[]= new int[T];
        
        for(int i=0;i<T;i++)
        {
            N=scanner.nextInt();
            input[i]=N;
        }
     
       if(T>=0 && T<=100)
       {
           if(N>=0 && N<=200)
           {
               
       for(int thiss=0;thiss<T;thiss++)
       {
           casenumber++;
          
       int CurN=input[thiss];
       
      
        
        for(int i=0;i<10;i++)
       {
           check[i]=0;
       }
        
           phony=0;
           truly=false;
           z=0;
           ab=0;
           if(CurN==0)
           {
               truly=true;
               System.out.println("Case #"+casenumber+": Insomnia");
           }
       while(truly==false)
       {
           
           z++;
           int x=CurN*z;
           String tally=String.valueOf(x);
           
           for(int l=0;l<tally.length();l++)
           {
              
              char charac=tally.charAt(l);
              int a = Character.getNumericValue(charac);
             
              check[a]=1;
              int yaas=0;
              for(int ll=0;ll<10;ll++)
              {
                  if(check[ll]==1)
                  {
                      yaas++;
                  }
              }
             
              if(yaas==10)
              {
                  phony++;
                  if(phony==1)
                  {System.out.println("Case #"+casenumber+": "+x);}
                  ab=yaas;
                 
                 
              }
           }
           if(ab==10)
           {
             truly=true;  
           }
           
       }
       }

           }
     
       }
    }
    }
    

