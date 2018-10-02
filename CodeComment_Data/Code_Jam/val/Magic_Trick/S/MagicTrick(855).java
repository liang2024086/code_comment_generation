package methodEmbedding.Magic_Trick.S.LYD1277;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by kyihein on 12/4/14.
 */
public class MagicTrick {
    public static void main(String[] args) throws Exception {
        List<TestCase> cases = TestCaseReader.read("/Users/kyihein/CodeJam/MagicTrick/A-small-attempt0.in", 10);
        List<String> outputs = new ArrayList<>();

        for(TestCase tc : cases) {
            Set<Integer> firstRow = new HashSet<>();
            Set<Integer> secondRow = new HashSet<>();

            List<String> lines = tc.getLines();

            int first = Integer.parseInt(lines.get(0));

            String[] tmp = lines.get(first).split(" ");

            for (String s : tmp) {
                firstRow.add(Integer.parseInt(s));
            }

            int second = Integer.parseInt(lines.get(5));

            tmp = lines.get(second + 5).split(" ");

            for (String s : tmp) {
                secondRow.add(Integer.parseInt(s));
            }

            firstRow.retainAll(secondRow);

            String o = "Volunteer cheated!";
            if(firstRow.size() == 1) {
                o = String.valueOf(firstRow.iterator().next());
            } else if(firstRow.size() > 1) {
                o = "Bad magician!";
            }
            outputs.add(o);
        }

        OutputWriter.write("/Users/kyihein/CodeJam/MagicTrick/out-sample", outputs);
    }
}
