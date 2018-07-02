package methodEmbedding.Standing_Ovation.S.LYD1822;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;


public class StandingOvation {

	
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(args[0]);
//		FileInputStream fis = new FileInputStream("input");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
					
		String line = null;
		int nline = 0;
		while((line = br.readLine())!=null) {
			if(nline == 0) {
				nline++;
				continue;
			}
			
			int invitados = 0;
			int standing = 0;
			String[] l = line.split(" ");
			String kth = l[1];			
			for(int shynesslevel = 0; shynesslevel < kth.length(); shynesslevel++) {
				int p = Character.getNumericValue(kth.charAt(shynesslevel));
				if( p == 0) {
					continue;
				}
				if(standing < shynesslevel) {
					invitados +=   shynesslevel - standing;					
					standing += shynesslevel - standing;
				}
				standing += p;				
			}
			
			System.out.format("Case #%d: %d\n", nline, invitados);
			
			nline++;
		}
			
		br.close();
		
	}
	
}
