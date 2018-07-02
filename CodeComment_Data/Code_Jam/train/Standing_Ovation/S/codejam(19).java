package methodEmbedding.Standing_Ovation.S.LYD594;

/*
ID: your_id_here
LANG: JAVA
TASK: test
*/
import java.io.*;
import java.util.*;

class test {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    BufferedReader f = new BufferedReader(new FileReader("test.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));

    int n = Integer.parseInt(f.readLine());
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(f.readLine());
      String length = st.nextToken();
      String list = st.nextToken();
      int people = 0;
      int total = 0;
      for (int j = 0; j < list.length(); j++) {
        int num = Integer.parseInt("" + list.charAt(j));
        if (total < j) {
          people += j - total;
          total += j - total;
        }
        total += num;
      }
      String output = "Case #" + (i+1) + ": " + people;
      System.out.println(output);
      out.println(output);
    }
    out.close();
    System.exit(0);                               // don't omit this!
  }
}
