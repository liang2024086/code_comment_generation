package methodEmbedding.Speaking_in_Tongues.S.LYD1519;

import java.io.*;
public class A {
  static final String decode = "yhesocvxduiglbkrztnwjpfmaq"; // deduced from sample test cases
  public static void main (String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(in.readLine());
	char c;
	for (int t = 0; t < n; t++) {
	  String str = in.readLine();
	  String msg = "";
	  for (int i = 0; i < str.length(); i++) {
	    c = str.charAt(i);
		if (c == ' ')
		  msg += " ";
		else
		  msg += ""+decode.charAt((int)(c-'a'));
	  }
	  System.out.println("Case #"+(t+1)+": " + msg);
	}
	in.close();
  }
}
