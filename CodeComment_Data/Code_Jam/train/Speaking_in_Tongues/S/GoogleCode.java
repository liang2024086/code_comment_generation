package methodEmbedding.Speaking_in_Tongues.S.LYD1546;

import java.io.*;
public class GoogleCode {
	
	public static void main(String args[]) throws Exception {
	FileReader fr = new FileReader("C:/Users/moez/Desktop/A-small-attempt5.in");
	BufferedReader br = new BufferedReader(fr);
	FileWriter fstream = new FileWriter("C:/Users/moez/Desktop/out.txt");
	BufferedWriter out = new BufferedWriter(fstream);
	  int l= 1;
	String s;
	Coder coder=new Coder();
	char[] ch = new char [100];
	br.readLine();
	while((s = br.readLine()) != null) {
	ch = s.toCharArray();
	
	out.write("Case #"+l+": ");
	int i =0;
	for(i =0; i<s.length();i++)
		out.write( coder.convert(ch[i]));
	out.write("\r\n");
	
	
	l++;
	}
	out.close();
	fr.close();
	}
	}
