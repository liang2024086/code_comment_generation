package methodEmbedding.Standing_Ovation.S.LYD622;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class StandingOvation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader
                 (new File("C:/Users/trans1stor/Documents/code_jam/ovations/A-small-attempt3.in")));
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        //int t = 0;
        StringBuilder resultBuilder = new StringBuilder();
        for (int t = 0; t < T; t++) {
            String [] input = reader.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int sum = 0;
            int addedFriends = 0;
            for (int i = 0; i <= N; i++) {
                int members = Character.getNumericValue(input[1].charAt(i));
                int added = (i - sum) > 0 ? (i - sum) : 0;
                sum += members;
                sum += added;
                addedFriends += added;
            }
            resultBuilder.append("Case #").append(t + 1).append(": ")
            .append(addedFriends).append(System.lineSeparator());
        }
            
        System.out.println(resultBuilder);
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("C:/Users/trans1stor/Documents/code_jam/ovations/out.txt")));
        writer.write(resultBuilder.toString());
        writer.close();
        reader.close();
    }
}
