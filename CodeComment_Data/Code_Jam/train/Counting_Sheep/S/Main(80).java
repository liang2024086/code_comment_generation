package methodEmbedding.Counting_Sheep.S.LYD616;


import java.util.*;
import java.io.*;
public class Main {

    private static final String PATH = "C:\\Users\\arasic\\IdeaProjects\\untitled4\\src\\com\\company\\";

    public static void main(String[] args) {


        //Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        Scanner in = null;
        PrintWriter out = null;
        try {
            out = new PrintWriter(PATH+"A-small-attempt1.out");
            in = new Scanner(new File(PATH+"A-small-attempt1.in"));

        int nbCases = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        for(int caseNb = 1; caseNb <= nbCases; caseNb++) {
            int chosenN = in.nextInt();
            long currentN = 0;
            boolean isAsleep = false;
            long sum = 0;
            int counter = 0;
            Set<Integer> numbers = new HashSet<Integer>();

            while (true) {
                currentN = ++counter * chosenN;
                sum = currentN;
                if(currentN ==0 ){
                    break;
                }

                while(sum > 0 ){
                    int remainder = (int)(sum % 10L);
                    sum = sum / 10;
                    if(numbers.contains(remainder)) {
                        continue;
                    }
                    numbers.add(remainder);
                }
                if(numbers.size() == 10) {
                    break;
                }

            }

            if(currentN == 0) {
                out.println("Case #" + caseNb + ": INSOMNIA");
            } else {
                out.println("Case #" + caseNb + ": " + currentN);
            }
        }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            out.close();
            in.close();
        }
    }
}
