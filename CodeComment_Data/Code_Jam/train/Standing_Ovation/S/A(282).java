package methodEmbedding.Standing_Ovation.S.LYD17;


import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int t, S, res, up, s, q;
        String fila;
        for(t = 1; t <= T; t++) {
            S = sc.nextInt();
            fila = sc.next();
            res = 0;
            up = 0;
            for(s = 0; s <= S; s++) {
                q = Integer.parseInt("" + fila.charAt(s));
                if(q == 0) continue;
                if(s > up) {
                    res += s - up;
                    up = s;
                }
                up += q;
            }
            System.out.println("Case #" + t + ": " + res);
        }
        
    }
}
