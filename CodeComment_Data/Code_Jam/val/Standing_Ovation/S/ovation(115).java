package methodEmbedding.Standing_Ovation.S.LYD590;

import java.util.Scanner;
import java.util.Arrays;
public class ovation
{
  
  public static void main(String []args)
  {
    int i=0;
  Scanner scan = new Scanner(System.in);
  int tcases=scan.nextInt();
  while(i++<tcases)
  {
    int minextra=0;
    int minaud=0;
   int smax=scan.nextInt();
   String aud=scan.nextLine();
   char[] ad = aud.toCharArray();
    int[] audi = new int[smax+1];
    int j=0;
    for(char c: ad)
    { if (c==' ')
       continue;
      int k=Integer.parseInt(""+c);
      audi[j++]=k;
    }
    if (smax==0)
    {
      System.out.println("Case #"+i+": 0");
      continue;
    }
  
    for(j=1;j<(smax+1);j++)
    {
      int temp=j;
    
    while(temp >audi[0])
    {
     
      minextra=minextra+1;
      audi[0]=audi[0]+1;     
    }

    if(temp <= audi[0])
      audi[0]=audi[0]+audi[j];
    
    
    
  }
    System.out.println("Case #"+i+": "+minextra);
      continue;
  
  
  
}

  
  
  
}
}
