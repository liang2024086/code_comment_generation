package methodEmbedding.Speaking_in_Tongues.S.LYD707;

import java.util.Scanner;

public class CodeJam12A {

    public static void main(String[] args) {

        char[] go = {
            'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b',
            'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'
        };

        Scanner in = new Scanner(System.in);
        int T = new Integer(in.nextLine()).intValue();
        for (int zz = 1; zz <= T; zz++) {
            String line = in.nextLine();
            char[] lineIN = line.toCharArray();
            char[] lineOUT = new char[lineIN.length];
            for (int i = 0; i < lineIN.length; i++) {
                if (lineIN[i] == ' ') {
                    lineOUT[i] = ' ';
                } else {
                    lineOUT[i] = go[(int) lineIN[i] - 97];
                }

            }
            StringBuilder out = new StringBuilder("Case #");
            out.append(zz);
            out.append(": ");
            out.append(lineOUT);
            System.out.println(out);
        }
    }
}
