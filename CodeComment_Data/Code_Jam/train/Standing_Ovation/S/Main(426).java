package methodEmbedding.Standing_Ovation.S.LYD1209;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Thomas on 11-4-2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File in = new File("res/A-small-attempt0.in");

        Scanner scanner = new Scanner(in);
        BufferedWriter writer = new BufferedWriter(new FileWriter("res/A-small-attempt0.out"));

        int cases = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i < cases+1; i++) {
            String line = scanner.nextLine();

            int maxShyness = Integer.parseInt(line.split("\\s")[0]);
            String shyValues = line.split("\\s")[1];

            int[] shyGuys = new int[maxShyness+1];
            for(int s=0; s < maxShyness+1; s++) {
                shyGuys[s] = Character.getNumericValue(shyValues.charAt(s));
            }

//            System.out.println("Case " + i + ":   " + line);
            AudienceSolver solver = new AudienceSolver(maxShyness, shyGuys);
            int friendsNeeded = solver.solve();

            writer.write("Case #" + i + ": " + friendsNeeded + "\n");
        }


        writer.close();
    }
}
