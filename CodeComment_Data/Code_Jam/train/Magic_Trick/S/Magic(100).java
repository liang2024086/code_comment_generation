package methodEmbedding.Magic_Trick.S.LYD156;



import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Magic {

    public static void main(String[] args) throws Exception{
	// write your code here
        Scanner s = new Scanner(new File("Magic.dat"));
        int cases = s.nextInt();
        for(int o=1; o<=cases; o++){
            System.out.print("Case #" + o + ": ");
            int[][] firstMatrix = new int[4][4];
            int[][] secondMatrix = new int[4][4];
            int firstRowVal = s.nextInt();
            for(int i=0; i<firstMatrix.length; i++){
                for(int j=0; j<firstMatrix.length; j++){
                    firstMatrix[i][j] = s.nextInt();
                }
            }
            int[] holdFirstVals = new int[4];
            for(int i=0; i<holdFirstVals.length; i++){
                holdFirstVals[i] = firstMatrix[firstRowVal-1][i];
            }
            int[] holdSecondVals = new int[4];
            int secondRowVal = s.nextInt();
            for(int i=0; i<secondMatrix.length; i++){
                for(int j=0; j<secondMatrix.length; j++){
                    secondMatrix[i][j] = s.nextInt();
                }
            }
            for(int i=0; i<holdSecondVals.length; i++){
                holdSecondVals[i] = secondMatrix[secondRowVal-1][i];
            }
            ArrayList<Integer> holdVals = new ArrayList<Integer>();
            for(int i=0; i<holdFirstVals.length; i++){
                int x = holdFirstVals[i];
                for(int j=0; j<holdFirstVals.length; j++){
                    if(x == holdSecondVals[j]){
                        holdVals.add(x);
                    }
                }
            }
            if(holdVals.size() == 1){
                System.out.println(holdVals.get(0));
            }else if(holdVals.size() == 0){
                System.out.println("Volunteer cheated!");
            }else{
                System.out.println("Bad magician!");
            }
            java.util.Arrays.sort(holdFirstVals);
            java.util.Arrays.sort(holdSecondVals);
            
        }
    }
}
