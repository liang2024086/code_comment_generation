package methodEmbedding.Magic_Trick.S.LYD2044;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagicTrick {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;

        int cases = 0;

        try {
            fileInputStream = new FileInputStream("input/MagicTrick.in");
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

            printWriter = new PrintWriter("output/MagicTrick.out");

            cases = Integer.parseInt(bufferedReader.readLine());

            for (int i = 1; i <= cases; i++) {
                int[] arrOne = new int[4];
                int[] arrTwo = new int[4];

                List<Integer> matchedList = new ArrayList<Integer>();

                int answerOne = Integer.parseInt(bufferedReader.readLine());

                for (int j = 1; j <= 4; j++) {
                    if (j == answerOne) {
                        String options = bufferedReader.readLine();
                        String[] arrOptions = options.split(" ");
                        for(int k = 0; k <= 3; k++){
                            arrOne[k] = Integer.parseInt(arrOptions[k]);
                        }
                    } else {
                        bufferedReader.readLine();
                    }
                }

                int answerTwo = Integer.parseInt(bufferedReader.readLine());

                for (int j = 1; j <= 4; j++) {
                    if (j == answerTwo) {
                        String options = bufferedReader.readLine();
                        String[] arrOptions = options.split(" ");
                        for(int k = 0; k <=3; k++){
                            arrTwo[k] = Integer.parseInt(arrOptions[k]);
                        }
                    } else {
                        bufferedReader.readLine();
                    }
                }

                for(int j = 0; j < 4; j++ ){
                    for(int k =0; k< 4; k++){
                        if(arrOne[j] == arrTwo[k]){
                            matchedList.add(arrOne[j]);
                            break;
                        }
                    }
                }
                if(matchedList.isEmpty()){
                    printWriter.println("Case #"+i+": Volunteer cheated!");
                } else if(matchedList.size() == 1){
                    printWriter.println("Case #"+i+": "+matchedList.get(0));
                } else if(matchedList.size() > 1){
                    printWriter.println("Case #"+i+": Bad magician!");
                }
            }
            bufferedReader.close();
            printWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
