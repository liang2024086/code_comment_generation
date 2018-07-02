package methodEmbedding.Standing_Ovation.S.LYD309;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class main {
	public static void main(String[] args) throws IOException {
		File dir = new File(".");
		File fin = new File(dir.getCanonicalPath() + File.separator + "A-small-attempt5.in");
		BufferedReader br = new BufferedReader(new FileReader(fin));
		 
		String line = null;
		String[] line_parts = null;
		int count = 0;
		int s_max = 0;
		String audiences = null;
		int invite_members  = 0;
		PrintWriter writer = new PrintWriter("results.out");
		int members = 0;
		int current_members = 0;
		while ((line = br.readLine()) != null) {
			if(count == 0) {
				count++;
				continue;
			}
			line_parts = line.split(" ");
			s_max = Integer.parseInt(line_parts[0]) + 1;
			audiences = line_parts[1];
			for(int i = 0; i < s_max; i++) {
				current_members = Integer.parseInt(audiences.charAt(i) + "");
				if(current_members == 0)
					continue;
				if(i > members) {
					invite_members += ( i - members);
					members +=   ( current_members + i - members);
				} else {
					members +=   current_members;
				}
			} 
			writer.println("Case #" + count + ": " +  invite_members);
			count++;
			members = 0 ;
			invite_members = 0;
		}
	 
		br.close();
		writer.close();
	}

}
