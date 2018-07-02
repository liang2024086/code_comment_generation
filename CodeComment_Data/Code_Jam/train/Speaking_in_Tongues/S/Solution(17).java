package methodEmbedding.Speaking_in_Tongues.S.LYD1080;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

	String c1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
	String o1 = "our language is impossible to understand";

	String c2 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
	String o2 = "there are twenty six factorial possibilities";

	String c3 = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
	String o3 = "so it is okay if you want to just give up";

	Map<Character, Character> gMap = new TreeMap<>();

	for (int i = 0; i < c1.length(); i++) {
	    gMap.put(c1.charAt(i), o1.charAt(i));
	    gMap.put(c2.charAt(i), o2.charAt(i));
	    gMap.put(c3.charAt(i), o3.charAt(i));
	}
	gMap.put('z', 'q');
	gMap.put('q', 'z');

	Scanner sc = new Scanner(new FileReader("A-small-attempt0.in"));
	PrintWriter pw = new PrintWriter(new FileWriter("A-small-attempt0.out"));

	int totalTestCase = Integer.parseInt(sc.nextLine());

	for (int testCase = 1; testCase <= totalTestCase; testCase++) {
	    StringBuilder answer = new StringBuilder();
	    String inputLine = sc.nextLine();
	    for (int i = 0; i < inputLine.length(); i++) {
		answer.append(gMap.get(inputLine.charAt(i)));
	    }
	    pw.println(String.format("Case #%d: %s", testCase, answer.toString()));
	}

	pw.flush();
	pw.close();
	sc.close();

    }

}
