package methodEmbedding.Standing_Ovation.S.LYD793;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A {
    public static void main(String[] args) throws FileNotFoundException {
        final Scanner scanner = new Scanner(new File("C:\\Users\\Samuel\\Downloads\\input.txt"));
        Integer cases = Integer.parseInt(scanner.nextLine());
        for (Integer i = 0; i < cases; i++) {
            String line = scanner.nextLine();
            String[] components = line.split(" ");
            Integer maxShy = Integer.parseInt(components[0]);
            String[] stringQuants = components[1].split("");
            ArrayList<Integer> shyQuants = new ArrayList<Integer>();
            for (String q : stringQuants) {
                shyQuants.add(Integer.parseInt(q));
            }
            ArrayList<Integer> runningTotal = new ArrayList<Integer>();
            Integer friends = 0;
            for (Integer shyLevel = 0; shyLevel <= maxShy; shyLevel++) {
                if (shyLevel == 0) {
                    runningTotal.add(shyLevel, shyQuants.get(shyLevel));
                } else {
                    Integer standing = runningTotal.get(shyLevel - 1);
                    if (standing >= shyLevel) {
                        runningTotal.add(shyLevel, runningTotal.get(shyLevel - 1) + shyQuants.get(shyLevel));
                    } else {
                        friends += shyLevel - standing;
                        runningTotal.add(shyLevel - 1, runningTotal.get(shyLevel - 1) + (shyLevel - standing));
                        runningTotal.add(shyLevel, runningTotal.get(shyLevel - 1) + shyQuants.get(shyLevel));
                    }
                }
            }
            System.out.println("Case #" + (i + 1) + ": " + friends);
        }
    }
}
