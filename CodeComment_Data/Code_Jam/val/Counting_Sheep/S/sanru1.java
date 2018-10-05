package methodEmbedding.Counting_Sheep.S.LYD815;


import java.util.*;
public class sanru1 {
    public static void main(String [] args)
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ans=1;
    
    
   
    //for(int i=0;i<n;i++)
       
    while(n>0)
    {
        int ut=0;
        int yo=0;
        long yns=1;
    long m=sc.nextLong();
     char arr[]=new char []{'1','2','3','4','5','6','7','8','9','0'};
    long d=m;
    int l=n+1;
    int yoyo=0;
    while(l>n)
    {
     
   String s=""+m;
    //System.out.println(ut+" "+yo+" "+m+" "+s);
   char a[]=s.toCharArray();
  
   for(int i=0;i<a.length;i++)
   {
       for(int j=0;j<arr.length;j++)
   {
      // System.out.println(a[i]+" "+arr[i]);
      if(a[i]==arr[j])
      {
      arr[j]='x';
      }
   }
  
   }
   

   ut=yo;
   yo=0;
   for(int j=0;j<arr.length;j++)
   {
       if(arr[j]=='x')
           yo++;
       
   }

   if(yo==10)
   {
       System.out.println("Case #"+ans+": "+ m);
       ans++;
       break;
   }
   
   if(ut==yo)
   {
        yoyo++;
   }
   if(yoyo==100)
   {
   System.out.println("Case #"+ans+":"+" INSOMNIA");
   ans++;
       break;
   
   }
   
   
      yns++;
   m=yns*d;
   
    }
        
    n--;
    }
    
    }
}
