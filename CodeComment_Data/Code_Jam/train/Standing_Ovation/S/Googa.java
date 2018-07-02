package methodEmbedding.Standing_Ovation.S.LYD2178;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Googa {

    /**
     * @param args the command line arguments
     */
    /*
    public void print(String s){
        if(s!=null) System.out.print(s);
    }
    public void print(int s){
       System.out.print(s);
    }*/
    public static void main(String[] args) {
       int numberOfCases=0,need = 0,cpt=0;
       String str="";
       System.out.println("Enter the nomber of cases  \n");
       Scanner scanIn = new Scanner(System.in);
       str = scanIn.next();
       numberOfCases= Integer.parseInt(str);
       //System.out.print(numberOfCases);
       for(int i=1;i<= numberOfCases;i++ ){
                   //  System.out.println("Enter the Number digit  \n");
                     str = scanIn.next(); 
                     int strlenght=Integer.parseInt(str)+1;
                     str = scanIn.next();
                     need=0;
                     cpt=0;
                     for(int j =0 ; j<strlenght;j++){
                         int digit=Integer.parseInt(""+str.charAt(j));
                        // System.out.println("digit "+digit);
                         if(digit==0){
                             
                         }
                         else {
                             if(j>cpt){
                                 need=need+(j-cpt);
                                 cpt=cpt+need;
                                  //System.out.println("needd "+need+"at "+j);
                             }
                             cpt=cpt+digit;
                                                      }
                         
                     }
                     //Case #1:
                    // Case #1: 0
                    // Case #1: 5
                     System.out.println("Case #"+i+": "+ need+"\n");
                     
       }
       scanIn.close();           
       
    }
    
}
