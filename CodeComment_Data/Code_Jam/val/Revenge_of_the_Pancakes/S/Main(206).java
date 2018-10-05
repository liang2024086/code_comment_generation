package methodEmbedding.Revenge_of_the_Pancakes.S.LYD238;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Isaac
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            int r = 0;
            s = br.readLine();
            int l = s.length()-1;
            boolean flag = true;
            while (l >= 0) {
                if (flag) {
                    if (s.charAt(l) == '-') {
                        r++;
                        flag = !flag;
                    }
                } else {
                    if (s.charAt(l) == '+') {
                        r++;
                        flag = !flag;
                    }
                }
                l--;
            }
            System.out.println("Case #" + i + ": " + r);
        }
    }

}
