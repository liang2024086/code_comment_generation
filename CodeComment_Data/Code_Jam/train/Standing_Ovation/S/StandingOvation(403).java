package methodEmbedding.Standing_Ovation.S.LYD445;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class StandingOvation {
    public static void main(String[] args) throws Exception {
        File file = new File(args[0]);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            int testCases = Integer.parseInt(br.readLine());
            for (int n = 1; n <= testCases; n++) {
                String[] splitLine = br.readLine().split(" ");
                String str = splitLine[1];
                int totalAudience = 0;
                int minAudience = 0;
                for (int i = 0; i < str.length(); i++) {
                    int nAudience = Integer.parseInt(Character.toString(str.charAt(i)));
                    if (nAudience == 0) {
                        continue;
                    }
                    if (totalAudience < i) {
                        int audienceNeeded = i - totalAudience;
                        minAudience += audienceNeeded;
                        totalAudience += audienceNeeded + nAudience; 
                    } else {
                        totalAudience += nAudience;
                    }
                }
                System.out.println(String.format("Case #%d: %d", n, minAudience));
            }
        }
    }
}
