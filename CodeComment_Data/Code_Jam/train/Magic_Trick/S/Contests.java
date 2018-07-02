package methodEmbedding.Magic_Trick.S.LYD1874;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author cllfst
 */
public class Contests {

    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s=new Scanner(new File("A-small-attempt0.in"));
        System.setOut(new PrintStream(new File("output")));
        int cas=s.nextInt();
        int first;
        int second;
        int match=0;
        int count;
        int[][] mat1= new int[4][4];
        int[][] mat2= new int[4][4];
        for(int i=1;i<=cas;i++){
            count=0;
            first=s.nextInt()-1;
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    mat1[j][k]=s.nextInt();
                }
            }
            second=s.nextInt()-1;
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    mat2[j][k]=s.nextInt();
                }
            }
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    if(mat1[first][j]==mat2[second][k]){
                        count++;
                        match=mat1[first][j];
                    }
                }
            }
            if(count==0){
                System.out.println("Case #"+i+": Volunteer cheated!");
            }
            else if(count==1){
                System.out.println("Case #"+i+": "+match);
            }
            else {
                System.out.println("Case #"+i+": Bad magician!");
            }
        }

    }
    
}
