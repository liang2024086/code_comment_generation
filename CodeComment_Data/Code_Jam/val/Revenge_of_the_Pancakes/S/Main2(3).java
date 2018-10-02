package methodEmbedding.Revenge_of_the_Pancakes.S.LYD135;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws Exception {
        Scanner sr = new Scanner(System.in);
        int t;
        String n;
        int c;
        int res;
        while (sr.hasNext()) {
            t = sr.nextInt();
            sr.nextLine();
            c = 0;
            for (int i = 0; i < t; i++) {
                c++;
                n = sr.nextLine();
                String[] ns = n.split("[\\+]+");

                res = ns.length * 2;
                if (ns != null && ns.length > 0 && ns[0].equals("")) {
                    res -= 2;
                }
                if (n.startsWith("-")) {
                    res--;
                }
                System.out.println("Case #" + c + ": " + res);
            }
        }
        sr.close();
    }
}
