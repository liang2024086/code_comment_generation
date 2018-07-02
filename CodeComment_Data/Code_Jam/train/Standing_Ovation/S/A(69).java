package methodEmbedding.Standing_Ovation.S.LYD791;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Danish
 */
public class A {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        Scanner in = new Scanner(new File("A-small-attempt2.in"));
        FileWriter fw = new FileWriter("A-small-attempt2.out");
        int T = in.nextInt();
        
        for(int t = 0; t < T; t++){
            int sm = in.nextInt();
            String t1 = in.next();
            int[] arr = new int[sm+1];
            int c,x = 0;
            
            for(int i = 0; i <= sm; i++){
                arr[i] = (int)((int) t1.charAt(i) - 48);
            }
            c = arr[0];
            
            
            for(int i = 1; i <= sm ; i++){
                if(arr[i] == 0){}
                else{
                    if(c >= i){
                    }
                    else{
                       x += i - c;
                    }
                    c += arr[i] + x;
                }
            }
            fw.write("Case #"+(t+1)+": "+x);
            fw.write("\n");
        }
        fw.close();
    }
}
