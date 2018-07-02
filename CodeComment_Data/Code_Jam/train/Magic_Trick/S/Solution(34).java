package methodEmbedding.Magic_Trick.S.LYD354;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(new File("C:\\Users\\keerthys\\Desktop\\input.txt"));
            fileWriter = new FileWriter(new File("C:\\Users\\keerthys\\Desktop\\output.txt"));
        }
        catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try {
            int testCases = Integer.parseInt(bufferedReader.readLine());
            int answer1, answer2;
            int arrangement1[] = new int[4];
            int arrangement2[] = new int[4];
            for (int i = 1; i <= testCases; i++) {
                answer1 = Integer.parseInt(bufferedReader.readLine());
                for (int j = 1; j <= 4; j++) {
                    String input = bufferedReader.readLine();
                    if (j == answer1) {
                        StringTokenizer stringTokenizer = new StringTokenizer(input, " ");
                        for (int k = 0; k < 4; k++) {
                            arrangement1[k] = Integer.parseInt(stringTokenizer.nextToken());
                        }
                    }
                }

                answer2 = Integer.parseInt(bufferedReader.readLine());
                for (int j = 1; j <= 4; j++) {
                    String input = bufferedReader.readLine();
                    if (j == answer2) {
                        StringTokenizer stringTokenizer = new StringTokenizer(input, " ");
                        for (int k = 0; k < 4; k++) {
                            arrangement2[k] = Integer.parseInt(stringTokenizer.nextToken());
                        }
                    }
                }
                List<Integer> matchedValue = new ArrayList<>();
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 4; k++) {
                        if (arrangement1[j] == arrangement2[k]) {
                            matchedValue.add(new Integer(arrangement1[j]));
                        }
                    }
                }

                if (matchedValue.size() > 1) {
                    fileWriter.write("Case #" + i + ": Bad magician!\n");

                }
                else if (matchedValue.size() == 0) {
                    fileWriter.write("Case #" + i + ": Volunteer cheated!\n");
                }
                else {
                    fileWriter.write("Case #" + i + ": " + matchedValue.get(0).intValue()+"\n");
                }

            }
        }
        catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            fileReader.close();
            fileWriter.close();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
