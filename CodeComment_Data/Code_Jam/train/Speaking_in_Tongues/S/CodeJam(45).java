package methodEmbedding.Speaking_in_Tongues.S.LYD831;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;

/**
 *
 * @author Ronak
 */
public class CodeJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        File f = new File("A-small-attempt0.in");
        FileInputStream fstream = new FileInputStream(f);
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine = "";
        int count = 0, T = 0;
        String key = "yhesocvxduiglbkrztnwjpfmaq";

        while ((strLine = br.readLine()) != null) {
            if (count == 0) {
                T = Integer.parseInt(strLine.trim());

            } else {

                System.out.print("Case #" + count + ": ");
                String str = strLine.trim();
                String ans = "";
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    if (ch == ' ') {
                        ans = ans + ' ';
                    } else {
                        int ascii = (int) ch;
                        ans = ans + key.charAt(ascii - 97);
                    }
                }


                System.out.println(ans);
            }
            count++;
        }
    }
}
