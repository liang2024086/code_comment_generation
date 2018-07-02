package methodEmbedding.Standing_Ovation.S.LYD1488;


import java.io.*;

public class StandingOvation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("files/standing_ovation/in.txt")));
        PrintStream ps = new PrintStream("files/standing_ovation/out.txt");

        int numCases = Integer.parseInt(br.readLine());

        for (int i = 0; i < numCases; i++) {
            String[] parts = br.readLine().split(" ");
            int numShynessLevels = Integer.parseInt(parts[0]);
            int numPeopleTillNow = 0;
            int numPeopleRequired = 0;
            for (int j = 0; j < numShynessLevels + 1; j++) {
                int numPeopleAtShynessJ = Integer.parseInt("" + parts[1].charAt(j));

                if (j > numPeopleTillNow) {
                    numPeopleRequired += j - numPeopleTillNow;
                    numPeopleTillNow += numPeopleAtShynessJ + (j - numPeopleTillNow);
                } else {
                    numPeopleTillNow += numPeopleAtShynessJ;
                }
            }

            ps.println("Case #" + (i + 1) + ": " + numPeopleRequired);
        }
    }
}
