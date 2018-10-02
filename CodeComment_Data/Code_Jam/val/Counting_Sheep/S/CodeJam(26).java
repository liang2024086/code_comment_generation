package methodEmbedding.Counting_Sheep.S.LYD1514;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author johnafish
 */
public class CodeJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new FileReader("input.in"));
            int t = s.nextInt();
            for (int i = 0; i < t; i++) {
                int n = s.nextInt();
                if (n==0){
                    System.out.println("Case #"+(i+1)+": INSOMNIA");
                    continue;
                }
                ArrayList<Integer> a = new ArrayList();
                int add = n;
                while(a.size()<10){
                    int k = n;
                    while(k>0){
                        if (!a.contains(k%10)){
                            a.add(k%10);
                        }
                        k/=10;
                    }
                    n+=add;
                }
                System.out.println("Case #"+(i+1)+": "+(n-add));
            }
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
    }
    
}
