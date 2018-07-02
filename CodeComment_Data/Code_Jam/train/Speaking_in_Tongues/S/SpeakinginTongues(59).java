package methodEmbedding.Speaking_in_Tongues.S.LYD69;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SpeakinginTongues {
    static public void main(String args[]) throws IOException {
        Map<Character, Character> m = new HashMap<Character, Character>();
        {
            System.setIn(new FileInputStream("src/y2012/SpeakinginTongues.in"));
            BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
            int nTests = Integer.valueOf(cin.readLine());
            String ins[] = new String[nTests];
            for (int i = 0; i < nTests; i++)
                ins[i] = cin.readLine();
            cin.close();
            System.setIn(new FileInputStream("src/y2012/SpeakinginTongues.out"));
            cin = new BufferedReader(new InputStreamReader(System.in));
            String outs[] = new String[nTests];
            for (int i = 0; i < nTests; i++)
                outs[i] = cin.readLine().replaceAll("Case #[0-9]+: ", "");
            cin.close();
            m.put('z', 'q');
            for (int i = 0; i < nTests; i++) {
                int j = 0;
                for (char c : ins[i].toCharArray()) {
                    if (c != ' ') {
                        if (!m.containsKey(c))
                            m.put(c, outs[i].charAt(j++));
                        else if (m.get(c) != outs[i].charAt(j++)) {
                            System.out.println("Error!" + i + " " + j);
                        }
                    } else
                        j++;
                }
            }
            char c1 = 0, c2 = 0;
            for (int i = 0; i < 26; i++) {
                if (!m.containsKey((char) (i + 'a')))
                    c1 = (char) (i + 'a');
                if (!m.containsValue((char) (i + 'a')))
                    c2 = (char) (i + 'a');
            }
            m.put(c1, c2);
        }
        {
            System.setIn(new FileInputStream("src/y2012/A-small-attempt0.in"));
            BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter wr = new BufferedWriter(new FileWriter("src/y2012/A-small-attempt0.out"));
            // BufferedWriter wr = new BufferedWriter(new FileWriter("src/y2012/A-large.out"));
            int nTests = Integer.valueOf(cin.readLine());
            String line;
            for (int i = 0; i < nTests; i++) {
                wr.write("Case #" + (i + 1) + ": ");
                line = cin.readLine();
                for (char c : line.toCharArray()) {
                    if (c != ' ')
                        wr.write(m.get(c));
                    else
                        wr.write(' ');
                }
                wr.write("\n");
            }
            wr.close();
            cin.close();
        }
    }
}
