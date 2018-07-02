package methodEmbedding.Standing_Ovation.S.LYD87;

import java.util.*;
class Audience{
  public static void main(String rg[]){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0){
      int sz=sc.nextInt();
      sz++;
      String s=sc.next();
      String[] ar=s.split("");
      int c=0,tot=Integer.parseInt(ar[1]),c1=0;
      //for(int i=0;i<=sz;i++)
       // System.out.print(ar[i]+",");
      //System.out.println();
      for(int j=2;j<=sz;j++){
        int i=j-1;
        if(i>tot ){
        	c+=i-tot;
         	//System.out.println(i+"  "+tot+"  "+j); 
        }
        //else
         //System.out.println(i+"  "+tot+"  "+j+"  "+Integer.parseInt(ar[j])); 
        tot+=Integer.parseInt(ar[j])+c;
        c1+=c;
        c=0;
      }
      System.out.println(c1);
      t--;
    }
  }
}
