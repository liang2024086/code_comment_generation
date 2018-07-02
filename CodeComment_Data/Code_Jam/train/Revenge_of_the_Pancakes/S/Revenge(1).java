package methodEmbedding.Revenge_of_the_Pancakes.S.LYD669;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class Revenge   {

	public static void main(String[] args) throws Exception {
		String inputFile = "B-small-attempt0.in";
		BufferedInputStream bs = new BufferedInputStream(new FileInputStream(inputFile));
		BufferedReader r = new BufferedReader(new InputStreamReader(bs, StandardCharsets.UTF_8));
		int t = Integer.parseInt(r.readLine());
		int count=1;
		String outputFile = "output_revenge.txt";
		PrintWriter p = new PrintWriter(outputFile);
		while(t>0) {
			char[] arr = r.readLine().toCharArray();
			int length = arr.length;
			boolean inPlusWindow = true, inNegWindow = false;
			long plusCount=0,negativeCount=0;
			long flips=0;
			for(int i=0;i<length;i++) {
				if(arr[i] == '+') {
					if(inPlusWindow)
						plusCount++;
					else {
						// this means we were in negative window
						flips+= (plusCount > 0 ? 2:1);
						plusCount = i+1;
						negativeCount=0;
						inPlusWindow=true;
						inNegWindow=false;
					}
				} else {
					if(inPlusWindow) {
						inNegWindow = true;
						negativeCount=1;
						inPlusWindow=false;
					} else {
						negativeCount++;
					}					
				}
			}
			if(inNegWindow) {
				flips += (plusCount > 0 ? 2:1);
			}
			p.println("Case #"+count+": " +flips);
			count++;
			t--;
		}
		r.close();
		p.close();
		
	}
	
}
