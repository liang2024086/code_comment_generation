package methodEmbedding.Standing_Ovation.S.LYD1264;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;

public class StandingOvation {
    public static void main(String args[]) throws Exception {
        File file = new File("A-small-attempt0.in");
        System.setOut(new PrintStream("A-small-attempt0.out"));
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        int testCases = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < testCases; i++) {
            String testCase = br.readLine();
            final String[] split = testCase.split(" ");
            int maxShyness = Integer.parseInt(split[0]);
            String audience = split[1];
            int count = 0;
            int people = 0;
            for(int j = 0; j <= maxShyness; j++) {
                int audienceAtShynessLevel = Integer.parseInt(audience.charAt(j) + "");
                while(people < j) {
                    count++;
                    people++;
                }
                people += audienceAtShynessLevel;
            }
            System.out.println(String.format("Case #%d: %d", i+1, count));
        }
    }
}
