package methodEmbedding.Standing_Ovation.S.LYD1697;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;

/**
 * Created by cheto on 4/11/2015.
 */
public class StandingOvation {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[0].substring(0, args[0].length() - 2) + "out"));
        int testCases = Integer.parseInt(reader.readLine());
        System.out.println("Test cases: "+testCases);
        for (int test = 0; test < testCases; test++) {
            String[] splitLine = reader.readLine().split(" ");
            int maxShyness = Integer.parseInt(splitLine[0]);
            String crowdLevels = splitLine[1];
            int peopleStanding = 0;
            int friends = 0;
            for (int level = 0; level < maxShyness + 1; level++) {
                int newPeopleStanding = Integer.parseInt(crowdLevels.substring(level, level + 1));
                peopleStanding += newPeopleStanding;
                if(peopleStanding == level){
                    friends++;
                    peopleStanding++;
                }
            }
            writer.write("Case #"+(test+1)+": "+friends+"\n");
            System.out.println("Case #"+(test+1)+": "+friends+"\n");
        }
        reader.close();
        writer.flush();
        writer.close();
    }
}
