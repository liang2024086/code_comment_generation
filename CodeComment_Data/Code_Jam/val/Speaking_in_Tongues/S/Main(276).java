package methodEmbedding.Speaking_in_Tongues.S.LYD1534;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        HashMap<Character, Character> map = new HashMap<>();
        map.put('a','y');
        map.put('b','h');
        map.put('c','e');
        map.put('d','s');
        map.put('e','o');
        map.put('f','c');
        map.put('g','v');
        map.put('h','x');
        map.put('i','d');
        map.put('j','u');
        map.put('k','i');
        map.put('l','g');
        map.put('m','l');
        map.put('n','b');
        map.put('o','k');
        map.put('p','r');
        map.put('q','z');
        map.put('r','t');
        map.put('s','n');
        map.put('t','w');
        map.put('u','j');
        map.put('v','p');
        map.put('w','f');
        map.put('x','m');
        map.put('y','a');
        map.put('z','q');
        map.put(' ',' ');
       
        Scanner in = new Scanner(new File("c:\\input.txt"));
        PrintWriter out = new PrintWriter(new File("c:\\output.txt"));
        int t = in.nextInt();
        in.nextLine();
        for (int j = 1; j<=t; j++){
            String str = in.nextLine();
            int len = str.length();
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < len; i++) {
                res.append(map.get(str.charAt(i)));
            }
            out.println("Case #"+j+": "+res.toString());
        }
        out.flush();
        out.close();
        in.close();
    }
}
