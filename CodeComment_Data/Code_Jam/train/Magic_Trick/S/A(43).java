package methodEmbedding.Magic_Trick.S.LYD783;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class A {

    private static final String INPUT = "A-small-attempt0.in";
    private static final String OUTPUT = "A-small-attempt0.out";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(INPUT));
        PrintWriter pw = new PrintWriter(OUTPUT);
        int totalTests = Integer.parseInt(br.readLine());
        for (int testNo = 1; testNo <= totalTests; testNo++) {
            Set<Integer> all1 = new HashSet<Integer>();
            Set<Integer> all2 = new HashSet<Integer>();
            int x = Integer.parseInt(br.readLine()) - 1;
            String[] s = new String[4];
            for (int i = 0; i < 4; i++) {
                s[i] = br.readLine();
            }
            for (String nr : s[x].split(" ")) {
                all1.add(Integer.parseInt(nr));
            }

            x = Integer.parseInt(br.readLine()) - 1;
            s = new String[4];
            for (int i = 0; i < 4; i++) {
                s[i] = br.readLine();
            }
            for (String nr : s[x].split(" ")) {
                all2.add(Integer.parseInt(nr));
            }

            /*System.out.println(all1);
            System.out.println(all2);
            System.out.println(".............");*/
            Set<Integer> finalSet = new HashSet<Integer>();
            for (int y : all1) {
                if (all2.contains(y)) {
                    finalSet.add(y);
                }
            }

            pw.print("Case #" + testNo + ": ");
            if (finalSet.size() == 1) {
                pw.println(finalSet.iterator().next());
                System.out.println(finalSet.iterator().next());
            } else if (finalSet.size() == 0) {
                pw.println("Volunteer cheated!");
                System.out.println("Volunteer cheated!");
            } else {
                pw.println("Bad magician!");
                System.out.println("Bad magician!");
            }
        }

        pw.flush();
        pw.close();

    }
}
