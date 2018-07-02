package methodEmbedding.Standing_Ovation.S.LYD1001;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.math.*;
import java.io.*;
public class A {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        int cas,s,val[];
        String valeur="",cm="",res;
        long present=0,invite=0;
        res=sc.nextLine();
        cas=Integer.parseInt(res);
        for(int i=0;i<cas;i++)
        {
            cm=sc.next();
            s=Integer.parseInt(cm);
           valeur=sc.next();
           
           val=new int[valeur.length()];
           
           for(int k=0;k<valeur.length();k++)
           {
               val[k]=Integer.parseInt(""+valeur.charAt(k));
           }
           
           present=0;
           for(int j=0;j<val.length;j++)
           {
               present=present+val[j];
               if(present<(j+1))
               {
                   present++;
                   invite++;
               }
           }
        
            System.out.println("Case #"+(i+1)+": "+invite);
            //compteur=0;
            present=0;
            invite=0;
            valeur="";
           
             //System.out.println();
        }
    }
    
}
