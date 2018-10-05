package methodEmbedding.Magic_Trick.S.LYD37;


import java.io.*;
import java.net.URISyntaxException;

/**
 * Created by zeejfps on 4/11/14.
 */
public class MagicTrick {

    public static void main(String[] args) {

        try {

            File input_file = new File(MagicTrick.class.getResource("input.in").toURI());
            File output_file = new File("/home/zeejfps/Programming/Java/GoogleCodeJam/src/gcj2014/qualification/a/output.txt");

            BufferedReader br = new BufferedReader(new FileReader(input_file));
            BufferedWriter bw = new BufferedWriter(new FileWriter(output_file));

            int num_cases = Integer.parseInt(br.readLine());

            for (int i = 0; i < num_cases; i ++) {

                System.out.println("Case #" + (i+1) + ": ");

                int pick = Integer.parseInt(br.readLine());
                int[] numbers = new int[4];
                String[][] lines = new String[4][4];
                for (int j = 0; j < lines.length; j++) {

                    lines[j] = br.readLine().split(" ");

                }

                for (int j = 0; j < 4; j++) {

                    numbers[j] = Integer.parseInt(lines[pick-1][j]);
                    System.out.println("--> Number: " + numbers[j]);

                }

                int pick2 = Integer.parseInt(br.readLine());
                int[] numbers2 = new int[4];
                for (int j = 0; j < lines.length; j++) {

                    lines[j] = br.readLine().split(" ");

                }

                for (int j = 0; j < 4; j++) {

                    numbers2[j] = Integer.parseInt(lines[pick2-1][j]);
                    System.out.println("--> Numbers2: " + numbers2[j]);

                }

                int matches = 0;
                int number = 0;
                for (int j = 0; j < numbers.length; j++) {

                    for (int k = 0; k < numbers2.length; k++) {

                        if (numbers[j] == numbers2[k]) {

                            matches++;
                            number = numbers[j];

                        }

                    }

                }

                if (matches == 0) {
                    System.out.println("--> Volunteer cheated!");
                    bw.write("Case #" + (i+1) + ": Volunteer cheated!");
                    bw.newLine();
                } else if (matches > 1) {
                    System.out.println("--> Bad magician!");
                    bw.write("Case #" + (i+1) + ": Bad magician!");
                    bw.newLine();
                } else {
                    System.out.println("--> " + number);
                    bw.write("Case #" + (i+1) + ": " + number);
                    bw.newLine();
                }

            }

            bw.close();
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }

}
