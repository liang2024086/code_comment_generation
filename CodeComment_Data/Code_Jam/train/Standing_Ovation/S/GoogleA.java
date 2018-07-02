package methodEmbedding.Standing_Ovation.S.LYD889;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GoogleA {

	public static void main(String[] args) {
		 
		BufferedReader br = null;
		int t = 0;
		
 
			try {
				br = new BufferedReader(new FileReader("C:\\Users\\akepa\\codeJam2015\\Google\\bin\\A-small-attempt0.in"));
				
			
			String sCurrentLine = br.readLine();
			t = Integer.valueOf(sCurrentLine);
			for(int i = 0; i < t; i++){
				// Read test case
				sCurrentLine = br.readLine();
				String[] split = sCurrentLine.split(" ");
				int smax = Integer.valueOf(split[0]);
				Integer s[] = new Integer[smax+1];
				for(int j = 0; j <= smax; j++){
					s[j] = Integer.valueOf(split[1].charAt(j))-48;
				}
				// Solve test case
				int c = s[0];
				int f = 0;
				for(int j = 1; j <= smax; j++){
					int dif = j-c;
					if(dif > 0 && s[j] != 0){
						// Hacen falta amigos
						f+=dif;
						c+=dif;
					}
					c+=s[j];
				}
				// Print test case
				System.out.println("Case #" + (i+1) + ": " + f);
			}
			
//			while ((sCurrentLine = br.readLine()) != null) {
//				System.out.println(sCurrentLine);
//			}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
