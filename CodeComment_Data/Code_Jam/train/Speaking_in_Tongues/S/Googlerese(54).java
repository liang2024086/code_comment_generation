package methodEmbedding.Speaking_in_Tongues.S.LYD569;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Googlerese {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String english="abcdefghijklmnopqrstuvwxyz ";
		String googler="ynficwlbkuomxsevzpdrjgthaq ";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.valueOf(in.readLine()), m=1;
		String res="";
		while(m<=n){
			res+="Case #"+m+": ";
			String inString=in.readLine();
			for(int i=0;i<inString.length();i++)
				res+=english.charAt(googler.indexOf(inString.charAt(i)));
			res+="\n";
			m++;
		}
		
		
		System.out.println(res);
	}

}
