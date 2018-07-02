package methodEmbedding.Magic_Trick.S.LYD221;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 * @author Savvas
 */
public class Codejam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException, IOException {
        
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
        BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt"), "cp1253"));
        
        Scanner in = new Scanner(input);
        int numOfCases = in.nextInt();
        boolean[] chosen = new boolean[16];
        int[][] board= new int[4][4];
        int answer1, answer2;
        int flag;
        int result;
            
                       
            
        for (int i = 0; i < numOfCases; i++) {

            for (int l = 0; l < 16; l++) {
            chosen[l] = false;            
            }
            flag = 0;
            result = 0;

            answer1 = in.nextInt();
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    board[j][k] = in.nextInt();
                }
            }

            for (int j = 0; j < 4; j++) {
                chosen[board[answer1-1][j]-1] = true;
            }

            answer2 = in.nextInt();
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    board[j][k] = in.nextInt();
                }
            }

            for (int j = 0; j < 4; j++) {
                if(chosen[board[answer2-1][j]-1]==true){
                    if(flag==0){
                        flag += 1;
                        result = board[answer2][j];
                    }
                    else{
                        result = -1;
                    }
                }

            }
            
            if(result == -1){
                //print bad magician;
                output.append("Case #"+(i+1)+": Bad magician!");                
            }
            else if(flag==0){
                //print cheating
                output.append("Case #"+(i+1)+": Volunteer cheated!");
            }
            else{
                //print result
                output.append("Case #"+(i+1)+": "+(result-1));
            }
            output.newLine();
        }
        output.close();
    }
}
