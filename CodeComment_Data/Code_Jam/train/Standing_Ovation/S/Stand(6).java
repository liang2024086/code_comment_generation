package methodEmbedding.Standing_Ovation.S.LYD1670;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Stand {
    public static void main(String args[]) throws FileNotFoundException{
    Scanner sc=new Scanner (new File("A-small-attempt5.in"));
   //    Scanner sc=new Scanner(System.in);
    PrintWriter pr=new PrintWriter(new File("output.txt"));
    int i=sc.nextInt();
    for(int a=0;a<i;a++){
    int b=0;
    int ii=sc.nextInt();
   
    String ar=sc.next();
    String arr[]=ar.split("");
    int arrI[]=new int[arr.length];
    int e=0;
    for(String f:arr){
    arrI[e++]=Integer.parseInt(f);
    }
    int hasClapped=0;
    for(int ap=0;ap<arrI.length;ap++){
       if(arrI[ap]>0){
           if(ap>hasClapped){
           // System.out.println("hasClapped="+hasClapped+":"+"ap="+ap+":"+"b="+b) ;
           b+=(ap-hasClapped);
           hasClapped+=b;
           }
           
     
         hasClapped+=arrI[ap];
       }
        //System.out.println("hasClapped="+hasClapped+":"+"ap="+ap+":"+"b="+b) ;
    
      
       
    
    }
   
    pr.write("Case #"+(a+1)+": "+b+"\n");
  // System.out.print("Case #"+(a+1)+": "+b+"\n");
    }
    pr.flush();
    pr.close();
    }
}
