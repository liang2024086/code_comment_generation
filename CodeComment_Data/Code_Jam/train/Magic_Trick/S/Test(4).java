package methodEmbedding.Magic_Trick.S.LYD1562;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author sjs007
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World!");
        try{
            // declare vars
            int T;
            
            int[] row1values = new int[4];
            int[] row2values = new int[4];
            StringTokenizer strTok;
            // read in number of test cases
            FileReader fr = new FileReader("C:\\Users\\sjs007\\Documents\\NetBeansProjects\\test\\src\\test\\filename.txt");
            BufferedReader textReader = new BufferedReader(fr);
            T = Integer.parseInt(textReader.readLine());
            int[] ans1 = new int[T];
            int[] ans2 = new int[T];
            // declare matrices
            int[][][] firstArrangement = new int[T][4][4];
            int[][][] secondArrangement = new int[T][4][4];
            // populate matrices
            for(int t = 0; t < T; t++){
                ans1[t] = Integer.parseInt(textReader.readLine()) - 1;
                for(int i = 0; i < 4; i++){
                    strTok = new StringTokenizer(textReader.readLine());
                    for(int j = 0; j < 4; j++){
                        firstArrangement[t][i][j] = Integer.parseInt(strTok.nextToken());
                    }
                }
                ans2[t] = Integer.parseInt(textReader.readLine()) - 1;
                for(int i = 0; i < 4; i++){
                    strTok = new StringTokenizer(textReader.readLine());
                    for(int j = 0; j < 4; j++){
                        secondArrangement[t][i][j] = Integer.parseInt(strTok.nextToken());
                    }
                }
            }
            textReader.close();
            // now apply problem solving logic
            File f = new File("solution.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            int solution = 0;
            // count the number of values that appear in both row1values and row2values
            int count = 0;
            for(int t = 0; t < T; t++){
                count = 0;
                for(int i = 0; i < 4; i++){                    
                    for(int j = 0; j < 4; j++){
                        if(firstArrangement[t][ans1[t]][i] == secondArrangement[t][ans2[t]][j]){
                            solution = firstArrangement[t][ans1[t]][i];
                            count++; 
                        }                    
                    }
                }
                // case 1: one unique solution -> count == 1
                if (count == 1){
                    bw.write("Case #" + (t+1) + ": " + solution);
                    bw.newLine();
                }
                // case 2: more than one solution -> count > 2
                if (count > 1){
                    bw.write("Case #" + (t+1) + ": Bad magician!");
                    bw.newLine();
                }
                // case 3: no solutions count == 0
                if (count == 0){
                    bw.write("Case #" + (t+1) + ": Volunteer cheated!");
                    bw.newLine();
                }
            }
            bw.close();
            
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    
}
