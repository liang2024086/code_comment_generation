package methodEmbedding.Counting_Sheep.S.LYD551;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class JavaApplication15{

     public static void main(String []args){
        // Scanner in2=new Scanner(System.in);
       Scanner in=new Scanner(System.in);
     int u=in.nextInt();
        in.nextLine();
       for( int l=0;l<u;l++){
       
       int i=0;
       int j=0;
       ArrayList<Integer> list = new ArrayList<Integer>();
        String s ;
       // int u=in.nextInt();
     //   for(int l=0;l<u;l++){
        int k=1;
        int w=0;
        s=in.nextLine();
     j=Integer.parseInt(s);
        if(j==0){
            System.out.println("Case #"+(l+1)+": INSOMNIA");}
        else{
            while(i!=10){
                for(int m=0;m<s.length();m++){
                if(list.contains( Integer.parseInt(s.charAt(m)+""))){
                    
                    }
                else{
                    list.add(Integer.parseInt(s.charAt(m)+""));
                    i++;
                }    
                    
                    
                }
                w=j*(k+1);
                k=k+1;
                s=Integer.toString(w);
                
            }
            System.out.println("Case #"+(l+1)+": "+j*(k-1));
        }
       }
     }
}
