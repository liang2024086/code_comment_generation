package methodEmbedding.Revenge_of_the_Pancakes.S.LYD548;


/**
 *
 * @author furiousknit
 */
import java.io.*;

class RevangePancake {

    public static void main(String args[]) throws FileNotFoundException, IOException {
        String inf = "/home/furiousknit/NetBeansProjects/CodeJam/B-small-attempt0.txt";
        String outf = "/home/furiousknit/NetBeansProjects/CodeJam/outfRP.txt";
        BufferedReader br = new BufferedReader(new FileReader(inf));
        PrintWriter pw = new PrintWriter(outf);
        int t = Integer.parseInt(br.readLine());
        for (int TT = 1; TT <= t; TT++) {

            int cnt = 0;
            String s = br.readLine();
           // System.out.println(TT+" "+s);
            if (s.length() == 1 && s.charAt(0) == '+') {
                cnt = 0;
            } else if (s.length() == 1 && s.charAt(0) == '-') {
                cnt = 1;
            } else {
                int i = 0;
                while (i + 1 < s.length()) {
                    if (s.charAt(i) != s.charAt(i + 1)) {
                        cnt++;
                    }
                    i++;
                }
                if (s.charAt(i) == '-') {
                    cnt++;
                }
            }
            pw.println("Case #" + TT + ": " + cnt);
            
        }
        br.close();
        pw.close();

    }
}
