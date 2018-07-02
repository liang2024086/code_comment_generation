package methodEmbedding.Cookie_Clicker_Alpha.S.LYD634;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Aloha
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FileReader in=new FileReader("C:/Users/Aloha/Documents/NetBeansProjects/JavaApplication2/src/javaapplication2/B-small-attempt2.in");
        FileWriter out=new FileWriter("C:/Users/Aloha/Documents/NetBeansProjects/JavaApplication2/src/javaapplication2/out.txt");
       Scanner filescanner=new Scanner(in);
       try
       {
           int t,i,j=0;
           double c,f,x,t2=1,t3=0,t1=0,farm=2;
   
           t=filescanner.nextInt();
           
           i=t;
                   while(i!=0)
                   {t2=1;
                   t3=0;
                   t1=0;
                   farm=2;
                      c=filescanner.nextDouble();
                      //System.out.println(c);
                      f=filescanner.nextDouble();
                      x=filescanner.nextDouble();
                      //System.out.println(x);
                     while(t2>t3)
                     {  
           //             System.out.println("----------");
                         t1=t1+c/farm;
                         farm=farm+f;
         //                System.out.println("t1: "+t1);
       //                  System.out.println("farm: "+farm);
                         t2=t1+x/farm;
                         if(t2>t3&&t2!=0&&t3!=0)
                         {
                             t2=t3;
                             break;
                         }
     //                   System.out.println("t2:"+t2);
                         t1=t1+c/farm;
   //                      System.out.println("t1: "+t1);
                         farm=f+farm;
                     // System.out.println(t1);
 // System.out.println("farm: "+farm);
                         t3=t1+x/farm;
                       // System.out.println("t3: "+t3); 
                          }
                      if(x/2<t2)
                         {  t2=x/2;
                             
                         }
                   // System.out.println(farm);
                     //System.out.println("----------");
                    
                   //   System.out.println("ans: "+t2);
                     out.write("Case"+" "+"#"+(t-i+1)+":"+" "+t2+"\n");
                      i--;
                   }
           
       }
       finally
       {
           
           in.close();
           out.close();
       }
           
        // TODO code application logic here
    }
}
