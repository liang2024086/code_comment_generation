package methodEmbedding.Speaking_in_Tongues.S.LYD1575;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;


public class Googlerese {

    /**
     * @param args
     */
    public static void main(String[] args) {
	String a = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
	String ar = "our language is impossible to understand";
	String b = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
	String br = "there are twenty six factorial possibilities";
	String c = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
	String cr = "so it is okay if you want to just give up";
	
	Map<Character,Character> charMap = new HashMap<Character,Character>();
	for(int i=0;i<a.length();i++){
	    charMap.put(a.charAt(i),ar.charAt(i));
	    charMap.put(b.charAt(i),br.charAt(i));
	    charMap.put(c.charAt(i),cr.charAt(i));
	}
	charMap.put('y','a');
	charMap.put('e','o');
	charMap.put('q','z');
	charMap.put('z','q');
	
	try {
	    FileInputStream fstream = new FileInputStream("D:/work/java dev/Google code jam 2012/bin/A-small-attempt0.in");
	    // Get the object of DataInputStream
	    DataInputStream in = new DataInputStream(fstream);
	    BufferedReader reader = new BufferedReader(new InputStreamReader(in));
	    String numberOfTest = reader.readLine();
	    Integer T = Integer.valueOf(numberOfTest);
	    File result = new File("D:/work/java dev/Google code jam 2012/bin/result.txt");
	    FileWriter writer = new FileWriter(result);
	    PrintWriter pWriter = new PrintWriter(writer);
	    for(int j=0;j<T;j++){
		String googlerese = reader.readLine();
		StringBuffer normal = new StringBuffer();
		for(int i=0;i<googlerese.length();i++){
		    char gChar = googlerese.charAt(i);
		    char nChar = charMap.get(gChar);
		    normal.append(nChar);
		}
		pWriter.println("Case #"+(j+1)+": "+normal.toString());
	    }
	    pWriter.flush();
	    pWriter.close();
	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	
    }

}
