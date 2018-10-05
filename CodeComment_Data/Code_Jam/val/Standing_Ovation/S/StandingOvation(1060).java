package methodEmbedding.Standing_Ovation.S.LYD2100;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class StandingOvation {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("A-small-attempt2.in"));
        //BufferedReader br = new BufferedReader(new FileReader("A-small.in"));
        PrintWriter pw = new PrintWriter("A-small-attempt2.out");
        //PrintWriter pw = new PrintWriter("A-small.out");

        int nbCases = Integer.parseInt(br.readLine());

        //System.out.println(nbCases);
        a:
        for (int i = 0; i < nbCases; i++) {

            String fullString = br.readLine();

            String[] fullStringTab = fullString.split(" ");

            //System.out.println("String1: "+fullStringTab[0]);
            //System.out.println("String2: "+fullStringTab[1]);
            int sMax = Integer.parseInt(fullStringTab[0]);
            int[] tab = new int[sMax + 1];

            for (int j = 0; j < sMax + 1; j++) {
                tab[j] = Integer.parseInt("" + fullStringTab[1].charAt(j));
            }

            //sMax and tab of sMax+1 values
            int res = 0;
            int totalClaping = 0;

            for (int j = 0; j < sMax; j++) {

                if (totalClaping >= sMax) {
                    break;
                }
                if ((tab[j] == 0) && (totalClaping < j+1)) {
                    totalClaping++;
                    res++;
                } else if (tab[j] != 0) {
                    totalClaping += tab[j];
                }

            }

            /*
             System.out.print(sMax + " ");
             for (int j = 0; j < sMax + 1; j++) {
             System.out.print(" " + tab[j]);
             }
             System.out.println("");
             */
            //if (res<0){res=0;}
            //System.out.println("Case #" + (i + 1) + ": " + res);
            pw.println("Case #" + (i + 1) + ": " + res);

        }

        pw.close();
        System.exit(0);
    }
}
