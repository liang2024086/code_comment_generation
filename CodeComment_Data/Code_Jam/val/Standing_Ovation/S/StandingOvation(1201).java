package methodEmbedding.Standing_Ovation.S.LYD1803;


import java.io.*;
import java.util.Scanner;

public class StandingOvation {

    public static void main(String[] args) throws IOException {
        InputStream is = StandingOvation.class.getResourceAsStream("/data.txt");
        Scanner s = new Scanner(is);
        OutputStream os = new FileOutputStream("out.txt");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        int totalCnt = s.nextInt();
        for (int test = 0; test < totalCnt; test++) {
            int cnt = s.nextInt();
            String data = s.next();
            bw.write("Case #" + (test + 1) + ": ");
            int total = 0;
            int toAdd = 0;
            for (int i = 0; i <= cnt; i++) {
                int currentCount = data.charAt(i) - '0';
                if (currentCount > 0 && i > total) {
                    int needPeople = i - total;
                    toAdd += needPeople;
                    total += needPeople;
                }
                total += currentCount;
            }
            bw.write(toAdd + "\n");
        }
        bw.flush();
        os.close();
        s.close();
    }
}
