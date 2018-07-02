package methodEmbedding.Speaking_in_Tongues.S.LYD1302;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class googlerese {
	public static void main(String[] args) throws Exception{
		char rese[] = {'y', 'h', 'e', 's', 'o',
						'c', 'v', 'x', 'd', 'u',
						'i', 'g', 'l', 'b', 'k', 
						'r', 'z', 't', 'n', 'w', 
						'j', 'p', 'f', 'm', 'a',
						'q'};
		int n;
		String temp;
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter write = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(read.readLine());
		
		for(int i=0; i<n; i++) {
			write.write(String.format("Case #%d: ", i+1));
			
			temp = read.readLine();
			for (int j=0; j<temp.length(); j++) {
				if (temp.charAt(j) == 32) {
					write.write(" ");
				}
				else {
					write.write(rese[temp.charAt(j) - 97]);
				}
			
			}
			write.write("\n");
			
		}
		write.flush();
	}
}
		
