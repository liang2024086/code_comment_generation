package methodEmbedding.Speaking_in_Tongues.S.LYD1394;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Speaking {
	public static void main(String[] args) {
		try {
			// lets get the data in
			FileInputStream fstream = new FileInputStream("E:/workspace_java/CodeJam12/src/SpeakingInTongues/input.in");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			
			// open file for writing
			FileWriter fwstream = new FileWriter("E:/workspace_java/CodeJam12/src/SpeakingInTongues/output.out");
			BufferedWriter out = new BufferedWriter(fwstream);
			
			// declare variables
			int i,j,k;
			int numCases;
			String[] strArr;
			
			// get number of cases
			strLine = br.readLine();
			numCases = Integer.parseInt(strLine);
			
			// declare specific vars
			String line, converted;
			Map<String, String> map = new HashMap<String, String>();
			map.put("a", "y");
			map.put("b", "h");
			map.put("c", "e");
			map.put("d", "s");
			map.put("e", "o");
			map.put("f", "c");
			map.put("g", "v");
			map.put("h", "x");
			map.put("i", "d");
			map.put("j", "u");
			map.put("k", "i");
			map.put("l", "g");
			map.put("m", "l");
			map.put("n", "b");
			map.put("o", "k");
			map.put("p", "r");
			map.put("q", "z");
			map.put("r", "t");
			map.put("s", "n");
			map.put("t", "w");
			map.put("u", "j");
			map.put("v", "p");
			map.put("w", "f");
			map.put("x", "m");
			map.put("y", "a");
			map.put("z", "q");
			
			int len;
			String ch;
			
			// loop through cases
			for(i=0;i<numCases;i++){
				// read case
				line = br.readLine();
				len = line.length();
				
				converted = "";
				
				for(j=0; j<len; j++){
					ch = line.substring(j,j+1);
					if(! ch.equals(" ")){
						converted = converted.concat(map.get(ch));
					} else {
						converted = converted.concat(" ");
					}
				}
				
				
				
					
					
					//System.out.println(one + " " + two + " " + three);
				System.out.print("Case #"+(i+1)+": ");
				out.write("Case #"+(i+1)+": ");
				System.out.println(converted);
				out.write(converted);
				out.newLine();
			}
			
			
			//System.out.print("Case #"+(i+1)+": ");
			//out.write("Case #"+(i+1)+": ");
			//System.out.println(seanP2sum);
			//out.write(Integer.toString(seanP2sum));
			//out.newLine();
			
			
			out.close();
			in.close();
			
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}

	}
}
