package methodEmbedding.Standing_Ovation.S.LYD1620;


import java.io.*;
import java.util.Scanner;

/**
 * Created by gerrytan on 11/04/2015.
 */
public class Main {
  public static void main(String[] args) throws IOException {
    InputStream in = args.length > 0 ? new FileInputStream(args[0]) : System.in;
    PrintStream out = args.length > 1 ? new PrintStream(new FileOutputStream(args[1])) : System.out;
    Scanner scanner = new Scanner(in);
    int T = scanner.nextInt();

    for(int t=1;t<=T;t++) {
      int smax = scanner.nextInt();

      int s=0; // shyness level
      int nst=0; // num of audience standing up
      int req=0; // extra audience required

      for(char c : scanner.next().toCharArray()) {
        int n = c-'0'; // num of people with this syhness

        // if number of audience standing up so far is less than shyness level, add some friends so this group will
        // stand. only if there's at least 1 audience in this group
        if(n > 0 && nst < s) {
          req += (s-nst);
          nst += (s-nst);
        }

        nst += n;
        s++;
      }

      out.format("Case #%d: %d\n", t, req);
    }

    out.close();
    in.close();

  }
}
