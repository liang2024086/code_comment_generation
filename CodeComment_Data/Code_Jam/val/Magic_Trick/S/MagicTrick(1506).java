package methodEmbedding.Magic_Trick.S.LYD592;


import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import de.jungblut.datastructure.ArrayUtils;
import de.jungblut.jam.Constants;
import de.jungblut.jam.StringReaderUtils;

public class MagicTrick {

  public static void main(String[] args) throws Exception {
    List<String> lines = Files.readAllLines(
        Paths.get(Constants.HOME_DIR + "A-small-attempt0.in"),
        Charset.defaultCharset());
    StringBuilder sb = new StringBuilder();

    int first = 0, second = 0;
    int[][] firstBoard = null;
    int[][] secondBoard = null;

    int currentReadIndex = 0;
    int numTests = Integer.parseInt(lines.get(currentReadIndex++));
    for (int i = 0; i < numTests; i++) {
      first = Integer.parseInt(lines.get(currentReadIndex++)) - 1;
      firstBoard = StringReaderUtils.readMatrix(
          lines.subList(currentReadIndex, currentReadIndex += 4), 4, 4);
      second = Integer.parseInt(lines.get(currentReadIndex++)) - 1;
      secondBoard = StringReaderUtils.readMatrix(
          lines.subList(currentReadIndex, currentReadIndex += 4), 4, 4);

      int[] intersection = ArrayUtils.intersectionUnsorted(firstBoard[first],
          secondBoard[second]);
      String result = null;

      if (intersection.length == 0) {
        result = "Volunteer cheated!";
      } else if (intersection.length != 1) {
        result = "Bad magician!";
      } else {
        result = intersection[0] + "";
      }

      sb.append("Case #").append(i + 1).append(": ").append(result)
          .append("\n");
    }

    Files.write(Paths.get(Constants.HOME_DIR + "A-small-attempt0.out"), sb
        .toString().getBytes());
  }
}
