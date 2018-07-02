package methodEmbedding.Speaking_in_Tongues.S.LYD1125;

import java.io.*;
import java.util.HashMap;

public class mains {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		BufferedReader map, input;
		BufferedWriter output;
		
		try {
			map = new BufferedReader(new FileReader("map.txt"));
			input = new BufferedReader(new FileReader("A-small-attempt3.in"));
			output = new BufferedWriter(new FileWriter("output.out"));
			
			String buf;
			while((buf = map.readLine()) != null) {
				hm.put(String.valueOf(buf.charAt(0)), String.valueOf(buf.charAt(2)));
			}
			
			map.close();
			
			int totalCount = Integer.parseInt(input.readLine());
			int index = 0;
			String result;
			
			while(index++ < totalCount) {
				buf = input.readLine();
				System.out.println(buf);
				result = "";
				for(int i  = 0 ; i < buf.length(); ++i) {
					result += hm.get(String.valueOf(buf.charAt(i)));
				}
				
				output.write("Case #" + index + ": " + result);
				output.newLine();
			}
			
			output.close();
			input.close();
			
			
		} catch(Exception e) {
			return;
		}
	}
}
