package methodEmbedding.Cookie_Clicker_Alpha.S.LYD871;


import java.io.*;
import java.net.URISyntaxException;

/**
 * Created by zeejfps on 4/11/14.
 */
public class CookieClicker {

    public static void main(String[] args) {

        try {

            File input_file = new File(CookieClicker.class.getResource("input.in").toURI());
            File output_file = new File("/home/zeejfps/Programming/Java/GoogleCodeJam/src/gcj2014/qualification/b/output.txt");

            BufferedReader br = new BufferedReader(new FileReader(input_file));
            BufferedWriter bw = new BufferedWriter(new FileWriter(output_file));

            int test_cases = Integer.parseInt(br.readLine());

            for (int i = 0; i < test_cases; i++) {

                System.out.println("Case #" + (i+1) + ":");
                String[] tokens = br.readLine().split(" ");

                double farm_cost = Double.parseDouble(tokens[0]);
                double farm_output = Double.parseDouble(tokens[1]);
                double goal = Double.parseDouble(tokens[2]);

                System.out.println("--> Farm cost: " + farm_cost);
                System.out.println("--> Farm output: " + farm_output);
                System.out.println("--> Goal: " + goal);

                double gps = 2;
                double total_time = 0;
                double time_to_goal = goal / gps;
                double time_to_farm = farm_cost / gps;
                double time_to_farm_to_goal = goal / (gps + farm_output) + time_to_farm;

                while (time_to_goal > time_to_farm_to_goal) {

                    /*
                    System.out.println("-->~~~~~~~~~~~~~~~~~~~~~~~<--");
                    System.out.println("--> Gold per Second: " + gps);
                    System.out.println("--> Time till farm: " + time_to_farm);
                    System.out.println("--> Time till goal: " + time_to_goal);
                    System.out.println("--> Time to farm and goal " + time_to_farm_to_goal);
                    */

                    total_time += time_to_farm;
                    gps += farm_output;

                    time_to_goal = goal / gps;
                    time_to_farm = farm_cost / gps;
                    time_to_farm_to_goal = goal / (gps + farm_output) + time_to_farm;

                }
                /*
                System.out.println("-->~~~~~~~~~~~~~~~~~~~~~~~<--");
                System.out.println("--> Gold per Second: " + gps);
                System.out.println("--> Time till farm: " + time_to_farm);
                System.out.println("--> Time till goal: " + time_to_goal);
                System.out.println("--> Time to farm and goal " + time_to_farm_to_goal);t
                */

                total_time += time_to_goal;
                System.out.println("--> Total time: " + total_time);
                bw.write("Case #" + (i+1) + ": " + String.format("%7f", total_time));
                bw.newLine();

            }

            br.close();
            bw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }

}
