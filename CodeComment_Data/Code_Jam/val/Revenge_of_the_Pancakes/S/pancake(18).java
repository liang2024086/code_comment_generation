package methodEmbedding.Revenge_of_the_Pancakes.S.LYD415;

import java.util.*;

public class pancake
{
static int k=1;
  public static void main(String args[])
  {
   int t,count;
   String s;
   Scanner in=new Scanner(System.in);
   t=in.nextInt();
   while(t>0)
   {
    s=in.next();
    count=0;
    for(int i=0;i<s.length()-1;i++)
    {
     if(s.charAt(i)=='-')
       if(s.charAt(i+1)=='+')
         count++;
         
      if(s.charAt(i)=='+')
       if(s.charAt(i+1)=='-')
         count++;   
    }
    if(s.charAt(s.length()-1)== '-')
       count++;
     System.out.println("Case #"+k+": "+count); 
     k++;
   t--;
   }
  
  }


}
