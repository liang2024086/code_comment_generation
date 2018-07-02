package methodEmbedding.Magic_Trick.S.LYD2014;


import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class A {
        public static void main(String[] args) {
        int tc =0;

        {
            BufferedWriter bw = null;
            try {
                Scanner in = new Scanner(new FileReader("A-small-attempt0.in"));
                bw = new BufferedWriter(new FileWriter("A-small-attempt0.out"));
                int r1,r2,t;
                int[] row1,row2;
                
                tc = in.nextInt();
                for (int i = 0; i < tc; i++) {
                    int count=0,ans=0;
                    row1=new int[4];
                    row2=new int[4];
                    
                    r1 = in.nextInt()-1;
                    for (int j = 0; j < 4; j++) {
                        for (int k = 0; k < 4; k++) {
                            t = in.nextInt();
                            if(j==r1) row1[k] = t;
                        }
                    }
                    r2 = in.nextInt()-1;
                    for (int j = 0; j < 4; j++) {
                        for (int k = 0; k < 4; k++) {
                            t = in.nextInt();
                            if(j==r2) row2[k] = t;
                        }
                    }
                    
                    for (int j = 0; j < 4; j++) {
                        for (int k = 0; k < 4; k++) {
                            if(row1[j]==row2[k]){
                                count++;
                                ans = row1[j];
                            }
                        }
                    }
                    if(count==1){
                    bw.write("CASE #"+(i+1)+": "+ans+"\n");                    
                    }else if(count==0){
                    bw.write("CASE #"+(i+1)+": Volunteer cheated!\n");
                    }else{
                    bw.write("CASE #"+(i+1)+": Bad magician!\n");
                    }
                    
                }

            } catch (IOException ex) {
                
            } finally {
                try {
                    bw.close();
                } catch (IOException ex) {
                }
            }
        }
    }
}
