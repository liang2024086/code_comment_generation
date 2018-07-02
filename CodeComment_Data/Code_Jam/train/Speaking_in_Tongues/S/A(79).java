package methodEmbedding.Speaking_in_Tongues.S.LYD94;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class A {

		public static void main(String[] args) throws Exception {
			
			String fs_in = "/Users/ctynan/Downloads/test.txt";
			String fs_out = "/Users/ctynan/Documents/A-out.txt";
			String line;
			BufferedReader br = new BufferedReader(new FileReader(fs_in));
			BufferedWriter bw = new BufferedWriter(new FileWriter(fs_out));
			
			line=br.readLine();
			line=line.toLowerCase();
			int tst = Integer.valueOf(line);
			
			char[] map = {'y','h','e','s','o',
					'c','v','x','d','u',
					'i','g','l','b','k',
					'r','z','t','n','w',
					'j','p','f','m','a','q'};
			
			
			for(int ii=0;ii<tst; ii++) {
				line=br.readLine();
				String output = "Case #" + Integer.toString(ii+1) +": ";
				for(int i=0; i<line.length(); i++) {
					char a = line.charAt(i);
					if(a==' ') output+=a;
					else {
						output+=map[a-'a'];
					}	
				}
				bw.write(output);
				if(ii<tst-1) bw.write('\n');
			}
			bw.close();
			return;
		}
}
