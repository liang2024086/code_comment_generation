package methodEmbedding.Revenge_of_the_Pancakes.S.LYD788;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by sami on 08/04/2016.
 */
public class GCJ2016QRB {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("B-small-attempt0.in"));
        PrintWriter out = new PrintWriter(new File("output.txt"));
        int T = in.nextInt();
        for (int i = 0; i < T; i++){
            /////////////////////////////////////
            int r = 0;
            String os = in.next();
            StringBuilder ns = new StringBuilder();
            for (int j = 0; j < os.length(); j++){
                if(os.charAt(j) == '+')
                    ns.append('1');
                else
                    ns.append('0');
            }
            String s = ns.toString();

            StringBuilder ap = new StringBuilder();
            StringBuilder am = new StringBuilder();
            for (int j = 0; j < s.length(); j++){
                ap.append('1');
                am.append('0');
            }

            if (s.equals(ap.toString())){
                out.println("Case #" + (i+1) + ": " + 0);
                continue;
            }

            if(s.equals(am.toString())){
                out.println("Case #" + (i+1) + ": " + 1);
                continue;
            }

            while(!s.equals(ap.toString())){
                if (s.charAt(0) == '0'){
                    int k = 0;
                    for (int j = 1; j < s.length(); j++){
                        if(s.charAt(j) != '0') {
                            k = j;
                            break;
                        }
                    }
                    boolean b = false;
                    for (int j = k+1; j < s.length(); j++){
                        if(s.charAt(j) != '1') {
                            k = j;
                            StringBuilder sb = new StringBuilder();
                            for (int l = 0; l < k; l++){
                                sb.append('1');
                            }
                            sb.append(s.substring(k,s.length()));
                            s = sb.toString();
                            r++;
                            b =  true;
                            break;
                        }
                    }
                    if(!b) {
                        r++;
                        s = ap.toString();
                    }
                }
                else {
                    int k = 0;
                    for (int j = 1; j < s.length(); j++){
                        if(s.charAt(j) != '1') {
                            k = j;
                            break;
                        }
                    }
                    boolean b = false;
                    for (int j = k+1; j < s.length(); j++){
                        if(s.charAt(j) != '0') {
                            k = j;
                            StringBuilder sb = new StringBuilder();
                            for (int l = 0; l < k; l++){
                                sb.append('1');
                            }
                            sb.append(s.substring(k,s.length()));
                            s = sb.toString();
                            r += 2;
                            b = true;
                            break;
                        }
                    }
                    if (!b) {
                        r += 2;
                        s = ap.toString();
                    }
                }
            }

            out.println("Case #" + (i+1) + ": " + r);

            /////////////////////////////////////

        }

        in.close();
        out.close();
    }
}
