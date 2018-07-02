package methodEmbedding.Speaking_in_Tongues.S.LYD987;


import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Amila
 * Date: 4/14/12
 * Time: 12:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class CodeJamTwo {
    public static void main(String[] args) {
        String ss = "our language is impossible to understand";
        String s = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
        char[] cs = s.toCharArray();
        char[] css = ss.toCharArray();
        HashMap<Character, Character> map = new HashMap<Character, Character>(26);
        for (int i = 0; i < cs.length; i++) {
            map.put(cs[i], css[i]);
        }
        ss = "there are twenty six factorial possibilities";
        s = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
        cs = s.toCharArray();
        css = ss.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            map.put(cs[i], css[i]);
        }
        ss = "so it is okay if you want to just give up";
        s = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
        cs = s.toCharArray();
        css = ss.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            map.put(cs[i], css[i]);
        }
        map.put('q','z');
        map.put('z','q');
//        map.put('q','q');
//        map.put('z','z');

        File file = new File("D:\\small.txt");
        try {
            Scanner scanner = new Scanner(file);
            int cases = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < cases; ) {
                String txt = scanner.nextLine();
                char [] chAr = txt.toCharArray();
                char [] oriAr = new char[chAr.length];
                for (int j = 0; j < chAr.length; j++) {
                    oriAr[j] = map.get(chAr[j]);
                }
                System.out.println("Case #" + (++i) + ": " + new String(oriAr));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
