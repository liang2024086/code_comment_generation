package methodEmbedding.Counting_Sheep.S.LYD1591;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Masood
 */
public class CountingSheep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader("A-small-attempt0.in"));
        PrintWriter pw = new PrintWriter(("out.txt"));
        int T = sc.nextInt();
        
        for(int z=1;z<=T;z++){
            int N = sc.nextInt();
            Set<Integer> set = new HashSet<>();
            int num = 0;
            if(N!=0){
                int i=1;
                while(true){
                    num = N*i;
                    int t = num;
                    while(t>0){
                        set.add(t%10);
                        t /= 10;
                    }
                    if(set.size()==10){
                        break;
                    }
                    i++;
                }
            }
            if(N==0){
                System.out.printf("Case #%d: INSOMNIA\n",z);
                pw.printf("Case #%d: INSOMNIA",z);
                pw.println();
            }
            else{
                System.out.printf("Case #%d: %d\n",z,num);
                pw.printf("Case #%d: %d",z,num);
                pw.println();
            }
            
        }
        
        sc.close();
        pw.flush();
        pw.close();
    }
    
}
