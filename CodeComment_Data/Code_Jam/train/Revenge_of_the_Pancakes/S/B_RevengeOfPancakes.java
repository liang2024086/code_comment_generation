package methodEmbedding.Revenge_of_the_Pancakes.S.LYD598;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class B_RevengeOfPancakes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
//        File file = new File("src/codejam/InputB.txt");
//        Scanner teclado = new Scanner(file);
        Scanner teclado = new Scanner(System.in);
//        if(file.isFile()==false){
//            System.out.println("Error!!!");
//            return;
//        }
        int T=Integer.parseInt(teclado.nextLine());
        int k,flips;
        StringBuilder str = new StringBuilder();
        boolean x[];
        boolean cierto=true,falso=false;
        for (int t = 1; t <= T; t++) {
            str.append(teclado.nextLine());
            k=0;
//            System.out.println(str.length()+": "+str.toString());
            x=new boolean[str.length()];
            flips=0;
            cierto=true;
            falso=false;
            while(str.length()>0){
                if(str.charAt(0)=='+'){
                    x[k++]=true;
                }else{
                    x[k++]=false;
                }
                str.delete(0, 1);
            }
//            while(k<str.length()){
//                if(str.charAt(k)=='+'){
//                    x[k++]=true;
////                    System.out.print("+");
//                }else{
//                    x[k++]=false;
////                    System.out.print("-");
////                    System.out.print("-");
//                }
//            }
//            System.out.println("");
            str.delete(0, str.length());
            k=x.length-1;
            while(k>=0){
                if(x[k]==cierto){
                    k--;
                }else{
                    while(k>=0&&x[k]==falso){
                        k--;
                    }
                    cierto=!cierto;
                    falso=!falso;
                    flips++;
                }
            }
            System.out.println("Case #"+t+": "+flips);
        }
    }
    
}
