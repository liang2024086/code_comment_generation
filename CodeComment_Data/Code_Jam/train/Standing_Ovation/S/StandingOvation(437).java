package methodEmbedding.Standing_Ovation.S.LYD225;


import java.io.*;

/**
 * Created by valizadeh on 4/11/2015.
 */
public class StandingOvation {

    private static final String INPUT_FILE = "E:\\source\\google-code-jam-2015\\src\\main\\resources\\a-standing-ovation-small.in";
    private static final String OUTPUT_FILE = "E:\\source\\google-code-jam-2015\\src\\main\\resources\\a-standing-ovation-small.out";
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(new File(INPUT_FILE)));
            writer = new BufferedWriter(new FileWriter(new File(OUTPUT_FILE)));
            Integer testCasesCount = Integer.valueOf(reader.readLine());

            int testCaseCounter = 1;

            while (reader.ready() && testCaseCounter <= testCasesCount) {

                String testCaseLine = reader.readLine();
                String[] testCaseParts = testCaseLine.split(" ");
                Integer maxShyness = Integer.valueOf(testCaseParts[0]);
                String people = testCaseParts[1];

                int sum = 0;
                int inv = 0;
                for (int shynessLevel = 0; shynessLevel < people.length(); shynessLevel++) {
                    Integer peopleNumber = Integer.valueOf(String.valueOf(people.charAt(shynessLevel)));
                    if (shynessLevel - (sum + inv) > 0) {
                        inv += shynessLevel - (sum + inv);
                    }

                    sum += peopleNumber;
                }


                writer.write("Case #" + testCaseCounter + ": " + inv);
                writer.newLine();
                testCaseCounter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }


    }
}
