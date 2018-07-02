package methodEmbedding.Standing_Ovation.S.LYD1842;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author UrielTan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("A.txt"));
        int N=sc.nextInt();
        int max;
        for(int i=0;i<N;i++){
            max=sc.nextInt();
            String s=sc.next();
            int add=0;//how many ppl to add
            int current=0;//current num of ppl //level=j
            for(int j=0;j<=max;j++){
                int x=s.charAt(j)-48;
                if(current<j){
                    current++;
                    add++;
                }
                current+=x;
            }
            System.out.println("Case #"+(i+1)+": "+add);
            
        }
                
                
    }
    
}
