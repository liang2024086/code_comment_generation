package methodEmbedding.Speaking_in_Tongues.S.LYD432;

import java.io.File;
import java.lang.StringBuilder;
import java.util.Scanner;
import java.io.FileWriter;

public class SIT {
	//dunno H, Q, or V
	/*static final char[] lookup = {'y', 'n', 'f', 'i', 'c', 'w', 'l', '.',
								'k','u', 'o', 'm', 'x', 's', 'e', 'v', ',', 								'p','d', 'r', 'j', ';', 't', 'h', 'a', 'q'};*/
								
	static final char[] lookup = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x',
								'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r','z',
								't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
	
	
	public static void main(String[] args) throws Exception{
		File input = new File("A-small-attempt2.in");
		File output = new File("output.out");
		FileWriter fw = new FileWriter(output);
		Scanner s = new Scanner(input);
		
		int numloops = s.nextInt();
		s.nextLine(); //clear out newline
		
		for(int n=0; n<numloops; n++){
			StringBuilder sb = new StringBuilder("Case #" + (n+1) + ": ");
			
			String line = s.nextLine();
			for(int i=0; i< line.length(); i++){
				//System.out.println(line.charAt(i));
				
				if(line.charAt(i) == ' '){
					sb.append(' ');
					continue;
				}
				
				//System.out.println((int) (line.charAt(i)-97));
				sb.append(lookup[line.charAt(i) - 97]);
			}
			
			//System.out.println(sb.toString());
			
			fw.append(sb.toString() + "\n");
		}
		fw.close();
	}
}
