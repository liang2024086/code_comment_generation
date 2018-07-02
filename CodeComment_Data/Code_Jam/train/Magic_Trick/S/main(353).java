package methodEmbedding.Magic_Trick.S.LYD487;


import java.util.Scanner;

public class main 
{
  public static void main(String[]args)
  {
      Scanner Input = new Scanner(System.in);
      int T=Input.nextInt();
      String result[]=new String[T];
      
      for(int i=0;i<T;i++)
      {
        int a1[][]=new int[4][4];
        int a2[][]=new int[4][4];
        int a=Input.nextInt();        
        for(int j=0;j<4;j++)
        {
            for(int k=0;k<4;k++)
              a1[j][k]=Input.nextInt();          
        }        
        int b=Input.nextInt();        
        for(int j=0;j<4;j++)
        {
            for(int k=0;k<4;k++)
              a2[j][k]=Input.nextInt();          
        }
        
        int count=0;
        int temp=-1;
        for(int j=0;j<4;j++)
        {
          for(int k=0;k<4;k++)
          {
              if(a1[a-1][j]==a2[b-1][k])
              {
                  count++;
                  temp=a1[a-1][j];
              } 
          }
        }
       
        
       if(count==1)           
        {
           result[i]=temp+"";
        }
       else if(count==0)      
         result[i]="Volunteer cheated!";       
       else
         result[i]="Bad magician!";    
        
      }
      
      for(int i=0;i<T;i++)
      {
          System.out.println("Case #"+(i+1)+": "+result[i]);
      }    
      
  }
}
