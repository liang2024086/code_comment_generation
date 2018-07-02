package methodEmbedding.Speaking_in_Tongues.S.LYD377;

import java.io.*;

public class A {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int z = Integer.parseInt(br.readLine());
		
		char[] map = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
		
		for(int i=0; i<z; i++){
			String s = br.readLine();
			StringBuilder sb = new StringBuilder();
			
			for(int j=0; j<s.length(); j++){
				if(s.charAt(j) != ' '){
					sb.append(map[s.charAt(j) - 'a']);
				}else{
					sb.append(' ');
				}
			}
			
			System.out.println("Case #" + (i+1) + ": " + sb);
		}
	}
}
