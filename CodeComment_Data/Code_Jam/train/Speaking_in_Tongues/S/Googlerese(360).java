package methodEmbedding.Speaking_in_Tongues.S.LYD853;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Googlerese {
	static public void main (String[] argv) throws Exception{
		char[] map = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
		BufferedReader in = new BufferedReader(new InputStreamReader(
				new FileInputStream("test.in")));
		PrintWriter pw = new PrintWriter(new FileOutputStream("result.txt"));
		int number = Integer.parseInt(in.readLine());
		String line = "";
		StringBuffer result=new StringBuffer();
		int l=1;
		for (int i=0;i<number;i++){
			line=(in.readLine());
			for (int j=0;j<line.length();j++){
				if (line.charAt(j)!=' ') {		
					result.append(map[(int)line.charAt(j)-97]);
				}
				else
				{
					result.append (' ');
				}
			}
			pw.append("Case #" + l + ": " + result+ "\n");
			l++;
			result.delete(0, result.length());
		}
		pw.flush();
		
	}
}
