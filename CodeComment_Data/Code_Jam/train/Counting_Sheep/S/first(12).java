package methodEmbedding.Counting_Sheep.S.LYD330;

import java.util.*;
public class first
{
 public static void main(String args[])
 {int p;
  int t;int s;int a[]=new int[10];
  Scanner in=new Scanner(System.in);
  t=in.nextInt();int re=1,l=0;;
  for(int i=0;i<t;i++)
  {int yu=i+1;s=in.nextInt();int rt=s;re=1;l=0;
   if(s==0){re=0;System.out.println("Case #"+yu+": INSOMNIA");}
loop:   for(int j=1;re==1;j++)
   { p=s*j;int wu=p;
     while(p!=0){
      if(l==0)
      {
       a[l]=p%10;
       p=p/10;
       l++;
      }
      else{int o=0;
       int y=p%10;p=p/10;
       for(int k=0;k<l;k++)
       {
        if(y==a[k])
        {
         o=1;
        }
       }
        if(o==0)
        {
         a[l]=y;l++;
         if(l==10){System.out.println("Case #"+yu+": "+wu);re=0;break loop;}
        }
     }
}
}
}
 }
} 
    
    
