package methodEmbedding.Revenge_of_the_Pancakes.S.LYD463;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		// Parser
		InputStream fluxin = new FileInputStream("B-small-attempt1.in"); 
		InputStreamReader lecture = new InputStreamReader(fluxin);
		BufferedReader buffin = new BufferedReader(lecture);
		
		// Writer
		OutputStream fluxout = new FileOutputStream("out.txt");
		OutputStreamWriter write = new OutputStreamWriter(fluxout);
		BufferedWriter buffout = new BufferedWriter(write);
		
		int iterator = 1;
		int N = Integer.parseInt(buffin.readLine());
		String pancakes;
		
		for (int i = 0; i<N; i++) {
			pancakes = buffin.readLine();
			int res = 0;
			boolean suite = false;
			for (int j=0; j<pancakes.length(); j++) {
				if ((pancakes.charAt(j) == '+')&&(suite)) {
					res += 2;
					suite = false;
				} else if (pancakes.charAt(j) == '-') {
					suite = true;
				}
			}
			if ((suite)&&(pancakes.charAt(pancakes.length()-1)=='+')) {res++;}
			if ((suite)&&(pancakes.charAt(pancakes.length()-1)=='-')) {res+=2;}
			if (pancakes.charAt(0)=='-') {res--;}
			buffout.write("Case #" + iterator +": ");
			buffout.write(Integer.toString(res) + "\n");
			iterator++;
		}
				
		buffin.close();
		buffout.close();

	}

}
