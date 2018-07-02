package methodEmbedding.Standing_Ovation.S.LYD1109;


import common.Input;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

/**
 * Created by Fabi on 4/11/2015.
 */
public class StandingOvations {
    public static void main(String[] args) {
        Input input = new InputSpec();
        Solver solver = new Solver();

        input.readFromFile("standingovations/A-small-attempt0.in");

        Iterator<TestCase> it = input.getTestCaseIterator();


        try {
            BufferedWriter fout = new BufferedWriter(new FileWriter(new File("standingovations/A-small.out")));

            while (it.hasNext()) {
                TestCase t = it.next();
                int neededFriends = solver.solveProblem(t);

                System.out.println("Case #" + t.getCaseNumber() + ": " + neededFriends);
                fout.write("Case #" + t.getCaseNumber() + ": " + neededFriends + "\n");


            }

            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
