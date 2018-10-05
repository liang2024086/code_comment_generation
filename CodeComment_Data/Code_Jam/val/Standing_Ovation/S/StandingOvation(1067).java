package methodEmbedding.Standing_Ovation.S.LYD150;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StandingOvation {
    
    public static final String PATH = "A-small-attempt0.in";

    public static void main(String[] args) throws IOException {
        
        try (BufferedReader br = new BufferedReader(new FileReader(PATH))) {
            int T = Integer.parseInt(br.readLine());
            
            for (int tt = 0; tt < T; tt++) {
                String[] params = br.readLine().split(" ");
                int maxLevel = Integer.parseInt(params[0]);
                int friendsNeeded = 0;
                int reachableLevel = 0;
                
                for (int i = 0; i <= maxLevel; i++) {
                    int peopleCount = Character.getNumericValue(params[1].charAt(i));
                    reachableLevel += peopleCount;
                    
                    if (i == reachableLevel) {
                        friendsNeeded++;
                        reachableLevel++;
                    }
                }
                System.out.println("Case #" + (tt + 1) + ": " + friendsNeeded);
            }
        }
    }
}
