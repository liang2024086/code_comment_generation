package methodEmbedding.Standing_Ovation.S.LYD2133;


import codejam2015.QualificationRound.ProblemA.OvationSolver;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List< String > input;
        try {
            input = Files.readAllLines(Paths.get("C:/CodeJam2015/StandingOvation/A-small-attempt1.in"), Charset.defaultCharset());
            String results = OvationSolver.calculateFriendInvites(input);
            System.out.println(results);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
