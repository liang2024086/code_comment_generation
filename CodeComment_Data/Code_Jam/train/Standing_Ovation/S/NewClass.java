package methodEmbedding.Standing_Ovation.S.LYD1456;

import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] s = new String[n];
        for(int i=0; i<n; i++) {
            int maxsh = in.nextInt();
            String aud = in.next();
            s[i] = aud;
        }
        
        for(int i=0; i<n; i++) {
            String aud = s[i];
            int standc=0;
            int needed=0;
            for(int j=0; j<aud.length(); j++) {
                if(j>standc) {
                    needed+=j-standc;
                    standc+=j-standc;
                }
                standc+=Integer.parseInt(""+aud.charAt(j));
            }
            System.out.println("Case #"+(i+1)+": "+needed);
        }
    }
}
