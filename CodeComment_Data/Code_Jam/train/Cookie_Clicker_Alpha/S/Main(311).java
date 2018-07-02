package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1556;


import java.util.Scanner;

public class Main {

    public static final double DEF_RATE = 2.0F;

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int t = in.nextInt();
//____________TEST LOOP_________________________________________________________
        for (int i = 1; i <= t; i++) {
            System.out.print("Case #" + i + ": ");
            //__________________________________________________________________
            double c, f, x;
            c = in.nextFloat();
            f = in.nextFloat();
            x = in.nextFloat();
            //__________________________________________________________________
            double fr,
                    pt,
                    ffc = 0.0f,
                    ff,
                    tto = 999999999,
                    tt = 0.0f;

            for (int j = 0;; j++) {
                fr = 2 + (j * f);
                pt = x / fr;
                ff = (c / fr);

                tt = pt + ffc;

//                System.out.println("tt = "+tt+"\t PT = "+pt+"\t FF = "+ff+"\t FFC = "+ffc+"\t I = "+j);
                if (tto <= tt) {
                    System.out.println(tto);
                    break;
                }
                tto = tt;
                ffc = ffc + ff;
            }

        }
    }
}
