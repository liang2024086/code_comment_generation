package methodEmbedding.Standing_Ovation.S.LYD2099;



import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

 
public class StandingOvation {

    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args)throws IOException  {
        // TODO code application logic here
        File file = new File("A-small-attempt0.in");
        FileWriter writer = new FileWriter("A-small-attempt0.out");
        Scanner in = new Scanner(file);
        int testCase = in.nextInt();
        
        for(int test=1; test <= testCase; test++) {
    
            int ShyLevelMax = in.nextInt();
            String PeopleInAudience = in.next();
            int PeopleStandUp = 0;
            int levelOfShy = 0;
            int FriendsToInvite = 0;

            while (levelOfShy < ShyLevelMax) {
                PeopleStandUp += Character.getNumericValue
                            (PeopleInAudience.charAt(levelOfShy));
                if (levelOfShy >= PeopleStandUp) {
                    FriendsToInvite++;
                    PeopleStandUp++;
                }
                levelOfShy++;
            }
            String result = "Case #"+test+": "+FriendsToInvite+"\n";
            writer.write(result);
            writer.flush();
            
        }
    }
}
