package methodEmbedding.Standing_Ovation.S.LYD313;


import java.io.*;

/**
 * Created by Wojtek on 11/04/15.
 */
public class ProblemA {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
                BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {
            Integer caseNumber = 1, testCases = Integer.parseInt(reader.readLine());
            String inputLine;

            while ((inputLine = reader.readLine()) != null) {
                Integer peopleTotal, peopleAdded = 0;
                String testCase;

                testCase = inputLine.split(" ")[1];
                peopleTotal = Integer.parseInt(String.valueOf(testCase.charAt(0)));
                for (int i = 1; i < testCase.length(); i++) {
                    if (i > peopleTotal) {
                        peopleAdded += (i - peopleTotal);
                        peopleTotal += (i - peopleTotal);
                    }
                    peopleTotal += Integer.parseInt(String.valueOf(testCase.charAt(i)));
                }

                System.out.println("Case #" + caseNumber + ": " + peopleAdded);
                caseNumber++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
