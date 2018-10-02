package methodEmbedding.Magic_Trick.S.LYD65;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by kojilin on 2014/04/12.
 */
public class MagicTrick {

  public static void main(String[] args) throws IOException {
    Path path = FileSystems.getDefault().getPath("GCJ", "m1.txt");
    List<String> lines = Files.lines(path).collect(Collectors.toList());
    int testCases = Integer.parseInt(lines.get(0));
    for (int i = 0; i < testCases; ++i) {
      int row1 = Integer.parseInt(lines.get(1 + 10 * i));
      String[] target1 = lines.get(row1 + 1 + 10 * i).split("\\s");
      int row2 = Integer.parseInt(lines.get(6 + 10 * i));
      String[] target2 = lines.get(row2 + 6 + 10 * i).split("\\s");

      int count = 0;
      String gotit = null;
      for (int j = 0; j < target1.length; ++j) {
        for (int k = 0; k < target2.length; ++k) {
          if (target2[k].equals(target1[j])) {
            gotit = target1[j];
            ++count;
          }
        }

      }
      if (count == 0) {
        System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
      } else if (count == 1) {
        System.out.println("Case #" + (i+1) + ": " + gotit);
      } else {
        System.out.println("Case #" + (i+1) + ": Bad magician!");
      }
    }

  }

}
