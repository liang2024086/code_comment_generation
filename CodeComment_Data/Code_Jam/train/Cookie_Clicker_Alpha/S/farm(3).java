package methodEmbedding.Cookie_Clicker_Alpha.S.LYD178;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.text.*;
import java.util.*;

 class Farm 
{
   

public static void main(String arg[])throws IOException
{
    int i,t,j,n2,n3,index=-1;
 Scanner sc=new Scanner(System.in);
       t=sc.nextInt();
double x,f,c;

      
       int m=0;
      while(t>m)
{
    m++;
   c=sc.nextDouble();
   f=sc.nextDouble();
   x=sc.nextDouble();
   
   double count=2;
   double sum_c,sum_x;
   sum_c=c/count;
   sum_x=x/count;
   
   double temp;
   
   while(true)
   {count+=f;
   temp=sum_c+x/count;
   
   if(temp<sum_x)
       sum_x=temp;
   else
       break;
   sum_c+=c/count;
   }
      DecimalFormat twoDForm = new DecimalFormat("#.0000000");
//twoDForm.setText(new DecimalFormat("##.##").format(sum_x));
  //ouble value = 12.3457652133
  sum_x =Double.parseDouble(new DecimalFormat("##.#######").format(sum_x));

//    sum_x.setText(new DecimalFormat("##.##").format(i2));
 
System.out.println("Case #"+m+": "+(sum_x));

/*if(check>1)
System.out.println("Case #"+m+": "+"Bad magician!");

if(check<1)
System.out.println("Case #"+m+": "+"Volunteer cheated!");
 
*/

}


}

}
