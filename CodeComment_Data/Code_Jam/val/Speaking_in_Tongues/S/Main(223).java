package methodEmbedding.Speaking_in_Tongues.S.LYD1523;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		char[][]dic = {{' ','a','b','c','d','e','f','g','h','i',	'j','k','l','m','n','o','p','q','r','s',	't','u','v','w','x','y','z'}
					  ,{' ','y','n','f','i','c','w','l','b','k',	'u','o','m','x','s','e','v','z','p','d',	'r','j','g','t','h','a','q'}};
		String []output;
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("input.in")));
			PrintWriter out = new PrintWriter("output.out");
			int N = Integer.valueOf(br.readLine());
			output = new String[N];
			for(int i=0;i<N;i++){
				String s=br.readLine();
				String tmp="";
				for(int j=0;j<s.length();j++){
					for(int k=0;k<27;k++){
						if(s.charAt(j)==dic[1][k]){
							tmp+=dic[0][k];
						}
					}
				}
				out.println("Case #"+(i+1)+": " + tmp);
				out.flush();
			}
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
