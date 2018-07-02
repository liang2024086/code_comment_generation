package methodEmbedding.Standing_Ovation.S.LYD2084;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Hashtable;

public class StandingOvation {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("/home/solomon/Desktop/input.txt")));
		PrintStream out = new PrintStream(new File("/home/solomon/Desktop/output.txt"));
		
		int cases = Integer.parseInt(reader.readLine());
		for(int i=0;i<cases;i++){
			Hashtable<Integer, Integer> counts = new Hashtable<>();
			String ln=reader.readLine();
			int index = ln.indexOf(" ");
			
			StringBuilder line = new StringBuilder(ln.substring(index+1));
			
			for(int j=0;j<line.length();j++){
				int count = Integer.parseInt(line.substring(j, j+1));
				counts.put(j, count);
			}
			
			int added = 0;
			int standing = 0;
			int currentShyLevel = 0;
			while(!counts.isEmpty()){
				int diff = currentShyLevel-standing;
				if(diff>0){
					added+=diff;
					standing+=diff;
				}
				if(counts.containsKey(currentShyLevel)){
					standing+=counts.remove(currentShyLevel);
				}
				currentShyLevel++;
			}
			out.println("Case #"+(i+1)+": "+added);
		}
		
		reader.close();
		out.close();
	}
}
