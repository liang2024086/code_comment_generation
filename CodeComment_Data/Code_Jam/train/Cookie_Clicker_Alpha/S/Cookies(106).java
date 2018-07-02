package methodEmbedding.Cookie_Clicker_Alpha.S.LYD232;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA. User: xueyichen Date: 4/12/14 Time: 11:05 AM To change this template
 * use File | Settings | File Templates.
 */
public class Cookies {

  public static void main(String[] args) throws IOException {
    BufferedReader br = null;
    FileReader fr = null;
    BufferedWriter bw = null;
    FileWriter fw = null;
    try {
      fr = new FileReader("/tmp/input");
      br = new BufferedReader(fr);
      fw = new FileWriter("/tmp/output");
      bw = new BufferedWriter(fw);

      int cases = Integer.parseInt(br.readLine());
      for(int t=1; t<=cases; ++t) {
        String line = br.readLine();
        String[] fields = line.split(" ", 3);
        double c = Double.parseDouble(fields[0]);
        double f = Double.parseDouble(fields[1]);
        double x = Double.parseDouble(fields[2]);
        if(x < c) {
          bw.write(String.format("Case #%d: %.7f", t, x / 2));
          bw.newLine();
          continue;
        }
        double time = 0;
        double r = 2;
        for(int i=0;; ++i) {
          time += c/r;
          if( (x - c ) / r < x / (r + f) ) {
            break;
          }
          r += f;
        }
        time += (x-c)/r;
        bw.write(String.format("Case #%d: %.7f", t, time));
        bw.newLine();
      }
      bw.flush();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if(br != null) {
        br.close();
      }
      if(fr != null) {
        fr.close();
      }
    }
  }
}
