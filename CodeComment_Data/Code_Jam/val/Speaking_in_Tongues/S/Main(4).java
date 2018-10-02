package methodEmbedding.Speaking_in_Tongues.S.LYD1474;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String args[]) {
        {
            FileWriter fostream = null;
            FileInputStream fis = null;
            DataInputStream in = null;
            BufferedReader br = null;
            BufferedWriter bw = null;

            String strLine;
            int testCase;
            try {


                fis = new FileInputStream("src\\io\\A-small-attempt0.in");
                in = new DataInputStream(fis);
                br = new BufferedReader(new InputStreamReader(in));

                fostream = new FileWriter("src\\io\\out.txt", false);
                bw = new BufferedWriter(fostream);

                testCase = Integer.parseInt(br.readLine());
                StringBuffer b;
                String g = "ynficwlbkuomxsevzpdrjgthaq";
                String e = "abcdefghijklmnopqrstuvwxyz";
                for (int i = 1; i <= testCase; i++) {
                    b = new StringBuffer();
                    String s[] = br.readLine().split(" ");
                    for (int j = 0; j < s.length; j++) {

                        CharacterIterator it = new StringCharacterIterator(s[j]);
                        for (char ch = it.first(); ch != CharacterIterator.DONE; ch = it.next()) {
                            b.append(e.charAt(g.indexOf(ch)));
                        }
                        b.append(" ");
                    }
                    if (i == testCase) {
                        bw.write("Case #" + i + ": " + b.toString());
                        bw.flush();
                    } else {
                        bw.write("Case #" + i + ": " + b.toString() + "\n");
                        bw.flush();
                    }

                }
            } catch (FileNotFoundException ex) {
            } catch (IOException ex) {
            } finally {
                try {
                    fostream.close();
                    fis.close();
                    br.close();
                } catch (IOException ex) {
                }
            }
        }

    }
}
