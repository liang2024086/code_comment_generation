package methodEmbedding.Speaking_in_Tongues.S.LYD1154;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alvin
 */
public class SpeakingInTongues {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kamus = "ynficwlbkuomxsevzpdrjgthaq";
        
        int nTC = sc.nextInt(); sc.nextLine();
        for (int tc = 1; tc <= nTC; tc++) {
            String masukan = sc.nextLine();
            
            StringBuilder hasil = new StringBuilder(masukan.length());
            for (int i = 0, n = masukan.length(); i < n; i++) {
                char setelah = masukan.charAt(i);
                if (setelah >= 'a' && setelah <= 'z') {
                    int sebelum = kamus.indexOf(setelah);
                    hasil.append((char) ('a' + sebelum));
                } else {
                    hasil.append(setelah);
                }
            }
            
            System.out.format("Case #%d: %s\n", tc, hasil);
        }
    }
    
}
