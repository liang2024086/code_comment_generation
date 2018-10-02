package methodEmbedding.Speaking_in_Tongues.S.LYD285;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class main {
	public static void main(String[] args) throws IOException {
		FileInputStream fstream = new FileInputStream("text.txt");
		DataInputStream in = new DataInputStream(fstream);
		  BufferedReader br = new BufferedReader(new InputStreamReader(in));
		  String strLine;
		  
		  String s1 = "ejp mysljylc kd kxveddknmc re jsicpdrysirbcpc ypc rtcsra" +
		  		" dkh wyfrepkym veddknkmkrkcdde" +
		  		" kr kd eoya kw aej tysr re ujdr lkgc jvqz";
		  String s2 = "our language is impossible to understand" +
		  		"there are twenty six factorial possibilities" +
		  		"so it is okay if you want to just give upzq";
		  String finalS = "";
		  int k = 1;
		  br.readLine();
		  while ((strLine = br.readLine()) != null)   {
			  for (int i = 0; i < strLine.length(); i++) {
				  for (int j = 0; j < s1.length(); j++) {
					  if (strLine.charAt(i) == s1.charAt(j)) {
						  finalS += s2.charAt(j);
						  break;
					  }
					  else {
						  if (j == s1.length() - 1) {
							  finalS += strLine.charAt(i);
						  }
					  }
				  }
			  }
			  System.out.println("Case #" + k + ": " + finalS);
			  k++;
			  finalS = "";
		  }
	}
}
