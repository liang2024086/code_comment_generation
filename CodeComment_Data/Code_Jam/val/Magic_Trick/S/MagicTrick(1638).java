package methodEmbedding.Magic_Trick.S.LYD1219;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;



/**
 *
 * @author Thomas
 */
public class MagicTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner br=new Scanner(new File("A-small-attempt1.in"));
        PrintWriter pw = new PrintWriter ("output.txt");
        if(!br.hasNextInt()){
            return;
        }
        int testcases=br.nextInt();
        int firstAnswer;
        int secondAnswer;
        int[][] array1=new int [4][4];
        int[][] array2=new int [4][4];
        for(int i=0;i<testcases;i++){
            firstAnswer=br.nextInt();
            for(int k=0;k<4;k++){
                for(int j=0;j<4;j++){
                    array1[k][j]=br.nextInt();
                }
            }
            secondAnswer=br.nextInt();
            for(int k=0;k<4;k++){
                for(int j=0;j<4;j++){
                    array2[k][j]=br.nextInt();
                }
            }
            int correctNum=-1;
            int counter=0;
            for(int j=0;j<4;j++){
            for(int k=0;k<4;k++){
                if(array1[firstAnswer-1][j]==array2[secondAnswer-1][k]){
                    correctNum=array1[firstAnswer-1][j];
                    counter++;
                }
            }
            }
            if(counter>1){
                pw.println("Case #"+(i+1)+": Bad magician!");
            }
            else if(counter==0){
                pw.println("Case #"+(i+1)+": Volunteer cheated!");
            }
            else{
                pw.println("Case #"+(i+1)+": "+correctNum);
            }
        }
        pw.close();
    }
    
}
