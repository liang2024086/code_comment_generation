package methodEmbedding.Standing_Ovation.S.LYD1953;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

/**
 * Created by Jalal on 2015/04/11.
 */
public class Problem1 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("E:\\Google jam\\input.txt"));
            int numberOfTest = Integer.valueOf(input.nextLine());
            int numberOfAudience[] = new int[numberOfTest];
            int shyness[][] = new int[numberOfTest][];
            int result[] = new int[numberOfTest];
            String temp;
            String temp2;
            for (int i = 0; i < numberOfTest; i++) {
                temp = input.nextLine();
                numberOfAudience[i] = Integer.valueOf(temp.substring(0,temp.lastIndexOf(' ')));
                temp = temp.substring(temp.indexOf(' ')+1,temp.length());
                shyness[i] = new int[numberOfAudience[i]+1];
                for (int j = 0; j < numberOfAudience[i]+1; j++) {
                    temp2 = temp.substring(j,j+1);
                    shyness[i][j] = Integer.valueOf(temp2);
                }
            }
            int no = 0;
            for (int i = 0; i < shyness.length; i++) {
                no = shyness[i][0];
                for (int j = 1; j < shyness[i].length; j++) {
                    if (no<j && shyness[i][j]>0) {
                        result[i]+=j-no;
                        no +=(j-no)+shyness[i][j];
                    }else if (no>=j){
                        no+=shyness[i][j];
                    }
                }
            }
            Formatter output = new Formatter("E:\\Google jam\\output.txt");
            for (int i = 0; i < numberOfTest; i++) {
                output.format("Case #"+(i+1)+": "+result[i]+"\n");
            }
            output.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
