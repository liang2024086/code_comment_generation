package methodEmbedding.Counting_Sheep.S.LYD67;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

/**
 * Created by AGT on 2016/04/08.
 */
public class Problem1 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("E:\\Google Code Jam 2016\\input.txt"));
            int numberOfTest = Integer.valueOf(input.nextLine());
            long result[] = new long[numberOfTest];
            int[] inputs = new int[numberOfTest];
            String[] samp = {"0","1","2","3","4","5","6","7","8","9"};
            long sd = 0;
            boolean[] finds = new boolean[10];
            int find = 0;
            for (int i = 0; input.hasNext(); i++) {
                try {
                    inputs[i] = Integer.valueOf(input.nextLine());
                }catch (Exception ex){

                }
            }
            for (int i = 0; i < numberOfTest; i++) {
                if (inputs[i] == 0) {
                    continue;
                }else {
                    for (int j = 1;; j++) {
//                        System.out.println(j);
                        sd = j*inputs[i];
                        for (int k = 0; k < finds.length; k++) {
                            if (!finds[k]){
                                if (String.valueOf(sd).contains(samp[k])){
                                    finds[k] = true;
                                    find++;
                                }
                            }
                        }
                        if (find == 10){
                            result[i] = sd;
                            find = 0;
                            for (int k = 0; k < finds.length; k++) {
                                finds[k] = false;
                            }
                            break;
                        }
                    }
                }
            }




            Formatter output = new Formatter("E:\\Google Code Jam 2016\\output.txt");
            for (int i = 0; i < numberOfTest; i++) {
                if (result[i] != 0) {
                    output.format("Case #" + (i + 1) + ": " + result[i] + "\n");
                }else {
                    output.format("Case #" + (i + 1) + ": " + "INSOMNIA" + "\n");
                }
            }
            output.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
