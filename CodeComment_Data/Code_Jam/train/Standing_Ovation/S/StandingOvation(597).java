package methodEmbedding.Standing_Ovation.S.LYD307;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StandingOvation {

    public static void main(String[] args) {
        String currentPath = Paths.get("").toAbsolutePath().toString();

        try {
            List<String> inputLines = Files.readAllLines(Paths.get(currentPath, args[0])),
                    outputLines = new ArrayList<>();
            int caseCount = Integer.valueOf(inputLines.get(0)),
                    currentCase = 1,
                    currentLine = 1;

            while (currentCase <= caseCount) {
                String params[] = inputLines.get(currentLine++).split("\\s");
                List<Integer> audience = new ArrayList<>();
                for (char c : params[1].toCharArray()) {
                    audience.add(Integer.valueOf("" + c));
                }
                int audienceStanding = 0, friendsNeeded = 0;
                for (int shyness = 0; shyness < audience.size(); shyness++) {
                    while (audienceStanding < shyness) {
                        friendsNeeded++;
                        audienceStanding++;
                    }
                    audienceStanding += audience.get(shyness);
                }

                outputLines.add(String.format("Case #%d: %d", currentCase++, friendsNeeded));
            }

            Files.write(Paths.get(currentPath, args[1]), outputLines);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
