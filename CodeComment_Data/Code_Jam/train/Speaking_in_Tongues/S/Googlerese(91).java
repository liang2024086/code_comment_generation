package methodEmbedding.Speaking_in_Tongues.S.LYD246;

import java.io.*;
import java.util.*;

public class Googlerese {

	public static void main(String [] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String dict = "yhesocvxduiglbkrztnwjpfmaq";

		int T = Integer.parseInt(in.readLine());
		
		for(int i = 0; i < T; i++){
			String s = in.readLine();
			String ans = "";
			for(int j = 0; j < s.length(); j++){
				if(s.charAt(j)<97||s.charAt(j)>122){
					ans+=s.charAt(j);
				} else {
					ans+=dict.charAt(s.charAt(j)-97);
				}
			}
			System.out.println("Case #" + (i + 1) + ": " + ans);
		}
	}

}
