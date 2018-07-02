package methodEmbedding.Speaking_in_Tongues.S.LYD112;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class SpeakingTongues {
	public static void main(String[] args) throws Exception {
		String sb = null;
		char map[] = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		BufferedReader is = new BufferedReader(new FileReader(new File("D:\\A-small-attempt0.in")));
		BufferedWriter os = new BufferedWriter(new FileWriter("D:\\out.txt"));

		os.flush();
		int loopIter = Integer.parseInt(is.readLine());
		
		//while ((sb = is.readLine()) != null) {
		for(int i=0; i<loopIter; i++){
			sb = is.readLine();
			
			char[] in = sb.toCharArray();
			char[] out = new char[in.length];
			
			for(int j=0; j<in.length; j++){
				if(in[j] != ' ')
					out[j] = map[in[j]-97];
				else 
					out[j] = ' ';
			}
			
			os.write("Case #" + (i+1) + ": " + new String(out)+"\n");
			os.flush();
		}
	}
}
