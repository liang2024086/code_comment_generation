package methodEmbedding.Speaking_in_Tongues.S.LYD137;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

class GoogleCodeJam14 
{
    public static void main(String args[]) throws IOException
    {
            FileInputStream fstream = new FileInputStream("C:\\1\\in1.txt");
            //DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            PrintWriter out = new PrintWriter(new File("C:\\1\\out.out"));
            String strLine;
            strLine = br.readLine().trim();
            int test = Integer.parseInt(strLine.trim());
            HashMap<Character, Character> hash = new HashMap<Character, Character>();
            hash.put('a', 'y');
            hash.put('b', 'h');
            hash.put('c', 'e');
            hash.put('d', 's');
            hash.put('e', 'o');
            hash.put('f', 'c');
            hash.put('g', 'v');
            hash.put('h', 'x');
            hash.put('i', 'd');
            hash.put('j', 'u');
            hash.put('k', 'i');
            hash.put('l', 'g');
            hash.put('m', 'l');
            hash.put('n', 'b');
            hash.put('o', 'k');
            hash.put('p', 'r');
            hash.put('q', 'z');
            hash.put('r', 't');
            hash.put('s', 'n');
            hash.put('t', 'w');
            hash.put('u', 'j');
            hash.put('v', 'p');
            hash.put('w', 'f');
            hash.put('x', 'm');
            hash.put('y', 'a');
            hash.put('z', 'q');
            hash.put(' ', ' ');
            Character[] charArr;
            for (int i=0;i<test;i++) {
                strLine = br.readLine().trim();
                charArr = new Character[strLine.length()];
                for (int j=0;j<strLine.length();j++) {
                    charArr[j] = hash.get(strLine.charAt(j)); 
                }
                int k = i+1;
                out.print("Case #" + k + ": ");
                for (int j=0;j<strLine.length();j++)
                out.print(charArr[j]);
                out.println();
            }
            //out.flush();
            out.close();
            br.close();
    }
}
