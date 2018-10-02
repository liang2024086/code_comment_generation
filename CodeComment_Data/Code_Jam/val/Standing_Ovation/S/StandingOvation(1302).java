package methodEmbedding.Standing_Ovation.S.LYD1045;

import java.io.*;
import java.util.Scanner;

public class StandingOvation {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("A-small-attempt2.in");
        Scanner reader = new Scanner(fileReader);

        int numOfCases = reader.nextInt();
        reader.nextLine();

        FileWriter fileWriter = new FileWriter("output.txt");

        for(int i = 0; i < numOfCases; i++) {

            String string = reader.nextLine();

            string = string.replaceAll(" ", "");

            int firstNumber = (int) Integer.parseInt(string.substring(0,1));
            string = string.substring(1);

            int totalExtraNeeded = 0;

            int currentClapping = 0;
            for(int currentNeeded = 0; currentNeeded < firstNumber+1; currentNeeded++) {

                int num = Integer.parseInt(string.substring(currentNeeded,currentNeeded+1));

                if(currentClapping >= currentNeeded) {
                    currentClapping += num;
                } else {
                    int additionalNeeded = currentNeeded - currentClapping;
                    currentClapping += additionalNeeded;
                    totalExtraNeeded += additionalNeeded;
                    currentClapping += num;
                }
            }

            int num2 = i+1;
            StringBuilder stringBuilder = new StringBuilder("");
            stringBuilder.append("Case #");
            stringBuilder.append(num2);
            stringBuilder.append(": ");
            stringBuilder.append(totalExtraNeeded);
            stringBuilder.append("\n");

            fileWriter.write(stringBuilder.toString());
        }
    fileWriter.close();

    }
}
