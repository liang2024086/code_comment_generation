package methodEmbedding.Magic_Trick.S.LYD1528;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import net.egork.io.IOUtils;
import net.egork.utils.io.InputReader;
import net.egork.utils.io.OutputWriter;

public class A {
  public static void main(String[] args) throws Exception, IOException {
    final String problem = "A";
    final String folder = "qual";
    InputStream inputStream;
    final String regex = problem + "-(small|large|practice).*[.]in";
    File directory = new File(folder);
    File[] candidates = directory.listFiles(new FilenameFilter() {
      public boolean accept(File dir, String name) {
        return name.matches(regex);
      }
    });
    File toRun = null;
    for (File candidate : candidates) {
      if (toRun == null || candidate.lastModified() > toRun.lastModified())
        toRun = candidate;
    }
    inputStream = new FileInputStream(toRun);

    OutputStream outputStream = new FileOutputStream(folder + "/" + problem + ".out");

    InputReader in = new InputReader(inputStream);
    OutputWriter out = new OutputWriter(outputStream);
    int cases = in.readInt();
    for (int zz = 1; zz <= cases; zz++) {
      new A(zz, in, out);
    }
    out.close();
  }

  public A(int testCase, InputReader in, OutputWriter out) {
    int row = in.readInt() - 1;
    int[] first = new int[4];
    for (int i = 0; i < 4; i++) {
      if (i == row) {
        first = IOUtils.readIntArray(in, 4);
      } else {
        in.readLine();
      }
    }
    row = in.readInt() - 1;
    int[] second = new int[4];
    for (int i = 0; i < 4; i++) {
      if (i == row) {
        second = IOUtils.readIntArray(in, 4);
      } else {
        in.readLine();
      }
    }

    int count = 0;
    int ans = -1;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        if (first[i] == second[j]) {
          count++;
          ans = first[i];
        }
      }
    }

    if (count == 0) {
      out.println("Case #" + testCase + ": Volunteer cheated!");
    } else if (count == 1) {
      out.println("Case #" + testCase + ": " + ans);
    } else {
      out.println("Case #" + testCase + ": Bad magician!");
    }
  }
}
