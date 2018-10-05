package methodEmbedding.Speaking_in_Tongues.S.LYD490;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class SpeakingInTongues {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader in = new BufferedReader(new FileReader("A-small-attempt5.in"));
        FileWriter out = new FileWriter("A-small-attempt5.out");
        StringTokenizer x = new StringTokenizer(in.readLine());
        char t = 'a';
        char arr[] = new char[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = t;
            t++;
        }


        char cor[] = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};

        int k = Integer.parseInt(x.nextToken());
        for (int i = 1; i <= k; i++) {
            String s = "";
            String h = "";
            StringTokenizer y = new StringTokenizer(in.readLine());
            int g= y.countTokens();
            for (int j = 0; j <g; j++) {
                s += y.nextToken() + " ";
            }
            for (int p = 0; p < s.length(); p++) {
                if (s.charAt(p) == ' ') {
                    h += s.charAt(p);
                    continue;
                } else {
                    int index = 0;
                    for (int j = 0; j < arr.length; j++) {
                        if (s.charAt(p) == arr[j]) {
                            index = j;
                            break;
                        }
                    }
                    h += cor[index];
                }
            }
            out.write("Case #" +i+ ": " + h + "\n");
        }
        out.close();
    }
    // out.write("Case #"+i+": "+c+"\n");
}
