package methodEmbedding.Standing_Ovation.S.LYD767;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class a1s {
	public static void main(String args[]){
		int i=0;
		String[] ReadPass = new String[101];
		try (BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in")))
		{
			String sCurrentLine;
			i = 0;		
			while ((sCurrentLine = br.readLine()) != null) {
				
				ReadPass[i] = sCurrentLine;
				++i;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		int n = Integer.parseInt(ReadPass[0]);
		int[] smax = new int[n];
		int y[] = new int[n];
		String output="";
		int a, b;
		char c;
		for(int k = 0; k<n ; k++){
			c = ReadPass[k+1].charAt(0);
			smax[k] = Character.getNumericValue(c);
			a = 0;
			y[k] = 0;
			for(int l = 0; l<smax[k]; l++){
				a = a + Character.getNumericValue(ReadPass[k+1].charAt(2+l));
				b = Character.getNumericValue(ReadPass[k+1].charAt(3+l));
				if(a==0){
					y[k]++;
					a++;
				}
				if(b!=0){
					if(l+1>a){
						y[k] = y[k] + (l+1-a);
						a = l+1;
					}
				}
			}

			try {		 
				output = output + "Case #" +(k+1)+": "+y[k]+"\n";
				File file = new File("output.txt");
				if (!file.exists()) {
					file.createNewFile();
				}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(output);
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
