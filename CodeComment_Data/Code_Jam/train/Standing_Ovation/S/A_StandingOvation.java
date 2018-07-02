package methodEmbedding.Standing_Ovation.S.LYD310;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;


public class A_StandingOvation {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			int t = Integer.parseInt(br.readLine());
			for (int i = 0; i < t; i++) {
				int total = 0, missing = 0, p = 0;
				String[] data = br.readLine().split(" ");
				int highest = Integer.parseInt(data[0]);
				String[] audence = data[1].split("");
				for (int j = 1; j <= highest + 1; j++) {
					p = Integer.parseInt(audence[j]); 
					if( p != 0 && total >= j-1)
						total +=  p;
					else{
						if( p == 0)
							if(total < j){
								total += 1;
								missing++;
							}	
					}
					}
				System.out.println("Case #" + (i +1) +": " + missing);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}

