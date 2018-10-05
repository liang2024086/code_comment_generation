package methodEmbedding.Magic_Trick.S.LYD313;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class MagicTrick {
	public static void main(String args[]) {
		File fileName = new File("/Users/Star/Downloads/codejam/A-small-practice.in.txt");
		if(fileName.exists() == false) {
			return ;
		}

		BufferedReader in = null;
		BufferedWriter out = null;

		try {
			in = new BufferedReader(new FileReader(fileName));			
			out = new BufferedWriter(new FileWriter("/Users/Star/Downloads/codejam/A-small-practice.out.txt"));

			int caseCount = Integer.valueOf(in.readLine());
			
			for(int i=1; i<=caseCount; i++) {
				Set<String> magic = new HashSet<String>();
				
				int firstAnswer = Integer.valueOf(in.readLine());
				for(int j=1; j<=4; j++) {
					String line[] = in.readLine().split(" ");
					if(j == firstAnswer) {
						magic.addAll(Arrays.asList(line));
					}
				}
				
				Set<String> trick = new HashSet<String>();
				
				int secondAnswer = Integer.valueOf(in.readLine());
				for(int j=1; j<=4; j++) {
					String line[] = in.readLine().split(" ");
					if(j == secondAnswer) {
						for(String l : line) {
							if(magic.contains(l)) {
								trick.add(l);
							}
						}
					}
				}
				
				if(trick.size() == 1) {
					out.write("Case #" + i + ": " + trick.iterator().next() + "\n");
				}
				else if(trick.size() > 1) {
					out.write("Case #" + i + ": Bad magician!\n");
				}
				else if(trick.size() == 0) {
					out.write("Case #" + i + ": Volunteer cheated!\n");
				}
			}		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
