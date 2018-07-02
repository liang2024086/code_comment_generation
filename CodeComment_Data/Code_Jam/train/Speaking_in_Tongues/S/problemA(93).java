package methodEmbedding.Speaking_in_Tongues.S.LYD363;

import java.io.*;
import java.util.*;

public class problemA{
	
	public static void main(String args[]) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			char[] trans = { 'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l',
					'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
			
			int T = Integer.valueOf(br.readLine());
			int c;
			for(int i = 0; i < T; i++){
				System.out.print("Case #" + (i+1) + ": ");
				c = br.read();
				while(c != 10){
					if(c == 32) System.out.print(' ');
					else System.out.print(trans[c-97]);
					c = br.read();
				}
				System.out.println();
			}
			
		} catch(Exception e){
			
		}
	}
}
