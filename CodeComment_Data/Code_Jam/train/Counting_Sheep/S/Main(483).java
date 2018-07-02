package methodEmbedding.Counting_Sheep.S.LYD170;

import java.io.IOException;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// Parser
		InputStream fluxin = new FileInputStream("A-small-attempt1.txt"); 
		InputStreamReader lecture = new InputStreamReader(fluxin);
		BufferedReader buffin = new BufferedReader(lecture);
		
		// Writer
		OutputStream fluxout = new FileOutputStream("out.txt");
		OutputStreamWriter write = new OutputStreamWriter(fluxout);
		BufferedWriter buffout = new BufferedWriter(write);
		
		int N = Integer.parseInt(buffin.readLine());
		int iterator = 1;
		
		for (int i=0; i<N; i++) {
			int val = Integer.parseInt(buffin.readLine());
			
			if (val != 0) {
				int res = 0;
				boolean pas_fini = true;
				boolean digits[] = new boolean[10];
				while (pas_fini) {
					res = res + val;
					for (int j=0; j<10; j++) {
						if (Integer.toString(res).contains(Integer.toString(j))) {digits[j] = true;}
					}
					for (int j=0; j<10; j++) {
						pas_fini = pas_fini && digits[j];
					}
					pas_fini = !pas_fini;
				}
				buffout.write("Case #" + iterator +": ");
				buffout.write(Integer.toString(res) + "\n");
				iterator++;
			} else {
				buffout.write("Case #" + iterator +": ");
				buffout.write("INSOMNIA\n");
				iterator++;
			}
			
		}
		
		
		buffin.close();
		buffout.close();		
	}

}
