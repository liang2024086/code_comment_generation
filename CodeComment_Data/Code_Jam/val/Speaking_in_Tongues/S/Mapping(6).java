package methodEmbedding.Speaking_in_Tongues.S.LYD1243;

import java.io.*;
import java.util.*;

class Mapping {
    public static void main(String[] args) 
    throws Exception {
	InputStreamReader is = 
	    new InputStreamReader(
				  new FileInputStream("Googlerese"));
	BufferedReader br = new BufferedReader(is);
	String totLine = new String();
	String line;
	while ((line = br.readLine()) != null) {
	    line = line.replaceAll(" ", "");
	    totLine += line;
	}
	String[] G = totLine.split("");
	for (int i=0; i < G.length; i++) {
            //System.out.println(G[i]);
        }

	InputStreamReader is2 = 
	    new InputStreamReader(
				  new FileInputStream("Values"));
        BufferedReader br2 = new BufferedReader(is2);
	totLine = new String();
	while ((line = br2.readLine()) != null) {
	    //System.out.println(line);
            line = line.replaceAll(" ", "");
            totLine += line;
        }
	String[] A = totLine.split("");
	for (int i=0; i < A.length; i++) {
            //System.out.println(A[i] + "->");
        }
	for (int i=0; i < G.length; i++) {
	    //System.out.println(G[i] + "->" + A[i]);
	}
	Map<String, String> map = new HashMap<String, String>();
	//int cnt = 0;
	for (int i=0; i < G.length; i++) {
	    if (!map.containsKey(G[i])) {
		//System.out.println(G[i] + "->" + A[i]);
		    map.put(G[i], A[i]);
		    //System.out.println(cnt++);
		}
        }
	map.put("z", "q");
	map.put("q", "z");
	br.close();
	br2.close();
	//System.out.println("missing");
	InputStreamReader is3 =
            new InputStreamReader(
                                  new FileInputStream("Input"));
        BufferedReader br3 = new BufferedReader(is3);
        totLine = new String();
	line = br3.readLine();
	int cnt = 1;
        while ((line = br3.readLine()) != null) {
            //System.out.println(line);
	    System.out.print("Case #" + cnt++ + ": ");
	    String[] str = line.split("");
	    for (int i = 0; i <  str.length; i++) {
		if (map.containsKey(str[i])) {
		    System.out.print(map.get(str[i]));
		}
		else { 
		    System.out.print(str[i]);
		}
	    }
	    System.out.println();
	}
	br3.close();
    }
}
