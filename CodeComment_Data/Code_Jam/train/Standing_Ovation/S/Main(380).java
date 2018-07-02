package methodEmbedding.Standing_Ovation.S.LYD633;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int T = 1; T<=t; T++){
            int max = sc.nextInt();
            String ip = sc.next();
            int[] a = new int[max+1];
            for(int i = 0; i < max+1; i++)
                a[i] = Integer.parseInt(""+ip.charAt(i));
            int standing = a[0], invite = 0;
            for(int i = 1; i < max+1 ; i++) {
                if (i > (standing + invite))
                    invite += (i - standing - invite);
                standing+=a[i];
            }
            System.out.println("Case #"+T+": "+invite);
        }
    }
}
