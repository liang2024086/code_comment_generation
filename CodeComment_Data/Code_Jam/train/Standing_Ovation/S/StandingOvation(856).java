package methodEmbedding.Standing_Ovation.S.LYD327;


import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author osilva
 */
public class StandingOvation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inputFile = "C:/Projects/GCJ/A-small-attempt0.in";
        
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                if (i++ == 0) continue;
                
                String[] components = line.split(" ");
                int friendsToInvite = 0;
                int totalAudience = 0;
                
                String input = components[1];
                for (int k = 0; k < input.length(); k++) {
                    int audienceCount = Character.getNumericValue(input.charAt(k));
                    if (totalAudience < k) {
                        friendsToInvite += (k - totalAudience);
                        totalAudience += (k - totalAudience) + audienceCount;
                    } else {
                        totalAudience += audienceCount;
                    }
                }
                System.out.println("Case #" + (i - 1) + ": " + friendsToInvite);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
