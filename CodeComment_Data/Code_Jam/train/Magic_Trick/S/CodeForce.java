package methodEmbedding.Magic_Trick.S.LYD1732;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class CodeForce {
   
  
    public static void main(String[] args) throws Exception{
        File input = new File("1.in");
        File output = new File("out.txt");
        Scanner sc = new Scanner(input);
        PrintWriter pw = new PrintWriter(output);
        
        int i,j,testCase,firstAnswer,secondAnswer;
        int[][] originalGrid = new int[4][4];
        int[][] afterGrid = new int[4][4];
        
        testCase = sc.nextInt();
        for(int k=0;k<testCase;k++){
        firstAnswer = sc.nextInt();
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                originalGrid[i][j]=sc.nextInt();
            }
        }
        
        secondAnswer = sc.nextInt();
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                afterGrid[i][j]=sc.nextInt();
            }
        }
        
        int guessNum = -1;
        int sameNum = 1;
        
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                if(originalGrid[(firstAnswer-1)][i] == afterGrid[(secondAnswer-1)][j]){
                    if(guessNum == -1){
                    guessNum = originalGrid[(firstAnswer-1)][i];
                }else{
                    sameNum++;
                }
                }
            }
        }
        if(guessNum == -1){
            pw.printf("Case #%d: Volunteer cheated!\n",(k+1));
        }else{
            if(sameNum>1){
                pw.printf("Case #%d: Bad magician!\n",(k+1));     
            }else{
             pw.printf("Case #%d: %d\n",(k+1),guessNum);
            }
        }
        }
        
        sc.close();
        pw.close(); 
    }
}

