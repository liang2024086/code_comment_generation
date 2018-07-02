package methodEmbedding.Revenge_of_the_Pancakes.S.LYD883;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

/**
 * Created by AGT on 2016/04/08.
 */
public class Problem2 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("E:\\Google Code Jam 2016\\input.in"));
            int numberOfTest = Integer.valueOf(input.nextLine());
            String[] inputs = new String[numberOfTest];
            int result[] = new int[numberOfTest];
            boolean[][] bInputs = new boolean[numberOfTest][];
            for (int i = 0; input.hasNext(); i++) {
                inputs[i] = input.nextLine();
                bInputs[i] = new boolean[inputs[i].length()];
                for (int j = 0; j < inputs[i].length(); j++) {
                    if (inputs[i].charAt(j) == '+') {
                        bInputs[i][j] = true;
                    }else {
                        bInputs[i][j] = false;
                    }
                }
            }
            int cont = 0;
            int s = 0;
            int correct = 0;
            boolean now = false;
            for (int i = 0; i < numberOfTest; i++) {
                cont = 0;

                while (true) {
                    correct = 0;
                    s = 0;
                    now = bInputs[i][0];
                    for (int k = 0; k < bInputs[i].length; k++) {
                        if (bInputs[i][k]){
                            correct++;
                        }
                        if (bInputs[i][k] == now){
                            s++;
                        }else {
                            break;
                        }

                    }
                    if (correct == bInputs[i].length){
                        break;
                    }
                    for (int j = 0; j < s; j++) {
                        bInputs[i][j] = !bInputs[i][j];
                    }
                    cont++;
                    
                }
                result[i] = cont;
                
                
                
            }





            Formatter output = new Formatter("E:\\Google Code Jam 2016\\output.txt");
            for (int i = 0; i < numberOfTest; i++) {
                output.format("Case #"+(i+1)+": "+result[i]+"\n");
//                System.out.print("Case #"+(i+1)+": "+result[i]+"\n");
            }
            output.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
