package methodEmbedding.Standing_Ovation.S.LYD1153;

import java.io.*;

public class StandingOvation {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(new FileInputStream(new File("E:\\CodeJam_inputs\\StandingOvation\\A-small-attempt1.in"))));
        PrintWriter pw = new PrintWriter(new FileOutputStream(new File("E:\\CodeJam_inputs\\StandingOvation\\A-small-attempt1.out")));

        int t = Integer.parseInt(stdin.readLine());
        for(int j=0;j<t;j++) {
            String in[] = stdin.readLine().split(" ");
            int smax = Integer.parseInt(in[0]);
            int curStandingAudience = in[1].charAt(0) - '0';
            int friendsNeeded = 0;
            for(int i=1;i<=smax;i++) {  
                int audWithShynessSi = in[1].charAt(i) - '0';
                if(audWithShynessSi > 0 && curStandingAudience < i) {
                    friendsNeeded += i - curStandingAudience;
                    curStandingAudience = i;
                }
                curStandingAudience += audWithShynessSi;
            }
            pw.write("Case #" + (j+1) + ": " + friendsNeeded + "\n");
        }
        pw.close();
    }
}
