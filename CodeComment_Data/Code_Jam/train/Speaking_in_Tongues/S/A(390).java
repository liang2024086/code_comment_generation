package methodEmbedding.Speaking_in_Tongues.S.LYD249;


import java.io.*;

/**
 *
 * @author Scott DellaTorre
 */
public class A {

    private static final String[] inputStrings = {"a", "o", "z", "q",
        "ejp mysljylc kd kxveddknmc re jsicpdrysi",
        "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
        "de kr kd eoya kw aej tysr re ujdr lkgc jv"};
    private static final String[] outputStrings = {"y", "e", "q", "z",
        "our language is impossible to understand",
        "there are twenty six factorial possibilities",
        "so it is okay if you want to just give up"};

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("src/gcj2012/qr/A.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("src/gcj2012/qr/A.out")));

        char[] mappings = new char[26];

        for (int i = 0; i < inputStrings.length; i++) {
            for (int j = 0; j < inputStrings[i].length(); j++) {
                if (inputStrings[i].charAt(j) != ' ') {
                    mappings[(int) (inputStrings[i].charAt(j) - 'a')] = outputStrings[i].charAt(j);
                }
            }
        }

//        boolean[] used = new boolean[26];
//        for (int i=0; i<26; i++) {
//            int mapping = (int)(mappings[i]-'a');
//            if (mapping >=0) {
//                used[mapping] = true;
//            }
//        }        
//        for (int i=0; i<26; i++) {
//            System.out.println(i + " " + used[i]);
//        }
//
//        for (int i = 0; i < 26; i++) {
//            System.out.println("'" + (char) (i + 'a') + "' -> '" + mappings[i] + "'");
//        }

        int T = Integer.parseInt(in.readLine());
        for (int i = 0; i < T; i++) {
            out.print("Case #" + (i + 1) + ": ");
            String G = in.readLine();
            for (char c : G.toCharArray()) {
                if (c == ' ') {
                    out.print(' ');
                } else {
                    out.print(mappings[(int) (c - 'a')]);
                }
            }
            out.println();
        }

        out.close();
    }
}
