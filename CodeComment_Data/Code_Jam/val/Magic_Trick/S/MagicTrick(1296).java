package methodEmbedding.Magic_Trick.S.LYD1701;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rajesh
 */
public class MagicTrick {
    public static void main(String []args) {
        int t;
        try {
            Path filePath = Paths.get("src/gcj/files/A-small-attempt0.in");
            File myFile = new File(filePath.toUri());
            Scanner sc = new Scanner(new FileReader(myFile));
            
            t = sc.nextInt();
            for(int i=0;i<t;i++) {
                int arrA[][] = new int[4][4];
                int arrB[][] = new int[4][4];
                
                int aAns = sc.nextInt();
                for(int j=0;j<4;j++) {
                    for(int k=0;k<4;k++) {
                        arrA[j][k] = sc.nextInt();
                    }
                }
                int bAns = sc.nextInt();
                for(int j=0;j<4;j++) {
                    for(int k=0;k<4;k++) {
                        arrB[j][k] = sc.nextInt();
                    }
                }
                int count = 0;
                int res = 0;
                aAns--;
                bAns--;
                for(int j=0;j<4;j++) {
                    for(int k=0;k<4;k++) {
                        if(arrA[aAns][j]==arrB[bAns][k]) {
                            count++;
                            res = arrA[aAns][j];
                        }
                    }
                }
                if(count == 0) {
                    System.out.println("Case #"+(i+1)+": "+"Volunteer cheated!");
                }else if(count > 1) {
                    System.out.println("Case #"+(i+1)+": "+"Bad magician!");
                }else if(count==1) {
                    System.out.println("Case #"+(i+1)+": "+res);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
}
