package methodEmbedding.Speaking_in_Tongues.S.LYD949;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Problem
 *
 * We have come up with the best possible language here at Google, called
 * Googlerese. To translate text into Googlerese, we take any message and
 * replace each English letter with another English letter. This mapping is
 * one-to-one and onto, which means that the same input letter always gets
 * replaced with the same output letter, and different input letters always get
 * replaced with different output letters. A letter may be replaced by itself.
 * Spaces are left as-is.
 *
 * For example (and here is a hint!), our awesome translation algorithm includes
 * the following three mappings: 'a' -> 'y', 'o' -> 'e', and 'z' -> 'q'. This
 * means that "a zoo" will become "y qee".
 *
 * Googlerese is based on the best possible replacement mapping, and we will
 * never change it. It will always be the same. In every test case. We will not
 * tell you the rest of our mapping because that would make the problem too
 * easy, but there are a few examples below that may help.
 *
 * Given some text in Googlerese, can you translate it to back to normal text?
 *
 * Solving this problem
 *
 * Usually, Google Code Jam problems have 1 Small input and 1 Large input. This
 * problem has only 1 Small input. Once you have solved the Small input, you
 * have finished solving this problem.
 *
 * Input
 *
 * The first line of the input gives the number of test cases, T. T test cases
 * follow, one per line.
 *
 * Each line consists of a string G in Googlerese, made up of one or more words
 * containing the letters 'a' - 'z'. There will be exactly one space (' ')
 * character between consecutive words and no spaces at the beginning or at the
 * end of any line.
 *
 * Output
 *
 * For each test case, output one line containing "Case #X: S" where X is the
 * case number and S is the string that becomes G in Googlerese.
 *
 * Limits
 *
 * 1 <= T <= 30 G contains contains at most 100 characters. None of the text is
 * guaranteed to be valid English
 *
 * Sample
 *
 * Input 3 ejp mysljylc kd kxveddknmc re jsicpdrysi
 * rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd
 * de kr kd eoya kw aej tysr re ujdr lkgc jv
 *
 * Output
 * 
 * Case #1: our language is impossible to understand
 * Case #2: there are twenty six factorial possibilities
 * Case #3: so it is okay if you want to just give up
 *
 *
 *

 *
 * @author Leandro Baena Torres
 */
public class A {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("A.in"));
        String linea;
        int numCasos;

        linea = br.readLine();
        numCasos = Integer.parseInt(linea);
        String[] map = new String[26];

        map[0] = "y"; //a
        map[1] = "h"; //b
        map[2] = "e"; //c
        map[3] = "s"; //d
        map[4] = "o"; //e
        map[5] = "c"; //f
        map[6] = "v"; //g
        map[7] = "x"; //h
        map[8] = "d"; //i
        map[9] = "u"; //j
        map[10] = "i"; //k
        map[11] = "g"; //l
        map[12] = "l"; //m
        map[13] = "b"; //n
        map[14] = "k"; //o
        map[15] = "r"; //p
        map[16] = "z"; //q****
        map[17] = "t"; //r
        map[18] = "n"; //s
        map[19] = "w"; //t
        map[20] = "j"; //u
        map[21] = "p"; //v
        map[22] = "f"; //w
        map[23] = "m"; //x
        map[24] = "a"; //y
        map[25] = "q"; //z***

        for (int i = 0; i < numCasos; i++) {
            StringBuilder S = new StringBuilder();
            linea = br.readLine();
            for (int j = 0; j < linea.length(); j++) {
                if(linea.charAt(j) == ' '){
                    S.append(' ');
                } else {
                    S.append(map[linea.charAt(j) - 'a']);
                }
            }
            System.out.println("Case #" + (i + 1) + ": " + S);
        }
    }
}
