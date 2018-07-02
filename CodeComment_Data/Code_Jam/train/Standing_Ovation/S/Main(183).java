package methodEmbedding.Standing_Ovation.S.LYD183;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String result = "";
        boolean gotError = false;

        File inputFile = new File("/Users/kaanmamikoglu/Documents/A-small-attempt1.in");
        try {
            Scanner scanner = new Scanner(inputFile);
            for (int caseNumber = 1; scanner.hasNext(); caseNumber++) {
                String line = scanner.nextLine();

                int maxLevelOfShyness;
                String[] dontBeShy;
                try {
                    maxLevelOfShyness = Integer.parseInt(line.split(" ")[0]);
                    dontBeShy = line.split(" ")[1].split("");
                } catch (NoSuchElementException e) {
                    caseNumber--;
                    continue;
                } catch (ArrayIndexOutOfBoundsException e) {
                    caseNumber--;
                    continue;
                }

                int numberOfFriendsRequired = 0;
                int numberOfAudienceStanding = 0;

                System.arraycopy(dontBeShy, 1, dontBeShy, 0, dontBeShy.length - 1);
                for (int shynessLevel = 0; shynessLevel < maxLevelOfShyness + 1; shynessLevel++) {
                    try {
                        int numberOfShyAudience = Integer.parseInt(dontBeShy[shynessLevel]);
                        int partialNumberOfFriendsRequired = 0;
                        if (numberOfAudienceStanding < shynessLevel) {
                            partialNumberOfFriendsRequired = shynessLevel - numberOfAudienceStanding;
                            numberOfFriendsRequired += partialNumberOfFriendsRequired;
                        }
                        numberOfAudienceStanding += partialNumberOfFriendsRequired + numberOfShyAudience;
                    } catch (NumberFormatException e) {
                        gotError = true;
                        break;
                    }
                }
                if (gotError) {
                    caseNumber--;
                    gotError = false;
                    continue;
                }
                result += "Case #" + caseNumber + ": " + numberOfFriendsRequired + "\n";
            }
            File outputFile = new File("/Users/kaanmamikoglu/Documents/output.txt");
            byte dataToWrite[] = result.getBytes();
            FileOutputStream out = new FileOutputStream(outputFile);
            out.write(dataToWrite);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
