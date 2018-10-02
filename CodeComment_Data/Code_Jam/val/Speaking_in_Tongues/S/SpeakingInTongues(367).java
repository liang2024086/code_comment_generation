package methodEmbedding.Speaking_in_Tongues.S.LYD1038;


import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SpeakingInTongues {

    public static void main(String[] args) {

        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] alphabet2 = {'y', 'n', 'f', 'i', 'c', 'w', 'l', 'b', 'k', 'u', 'o', 'm',
            'x', 's', 'e', 'v', 'z', 'p', 'd', 'r', 'j', 'g', 't', 'h', 'a', 'q'};

        try {

            FileWriter fw = new FileWriter("C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Google Code Jam\\src\\Out.out");
            Scanner input = new Scanner(new File("C:\\Users\\Razvan\\Documents\\NetBeansProjects\\Google Code Jam\\src\\A-small-attempt1.in"));
            PrintWriter outfile;
            outfile = new PrintWriter(fw);

            int runs = input.nextInt();

            String word = "";
            String temp = input.nextLine();
            for (int i = 1; i <= runs; i++) {
                temp = input.nextLine();
                StringTokenizer st = new StringTokenizer(temp);
                while (st.hasMoreTokens()) {
                    String scrambledWord = st.nextToken();
                    for (int x = 0; x < scrambledWord.length(); x++) {
                        for (int y = 0; y < 26; y++) {
                            if (scrambledWord.charAt(x) == alphabet2[y]) {
                                word = word + alphabet[y];
                                break;
                            }
                        }
                    }
                    word = word + " ";
                }
                outfile.println("Case #" + i + ": " + word);
                word = "";
            }
            input.close();
            fw.close();
            outfile.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
