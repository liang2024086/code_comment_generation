package methodEmbedding.Speaking_in_Tongues.S.LYD1367;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Temp {
	public static void main(String[] args) throws IOException{
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("y", "a");
		hm.put("n", "b");
		hm.put("f", "c");
		hm.put("i", "d");
		hm.put("c", "e");
		hm.put("w", "f");
		hm.put("l", "g");
		hm.put("b", "h");
		hm.put("k", "i");
		hm.put("u", "j");
		hm.put("o", "k");
		hm.put("m", "l");
		hm.put("x", "m");
		hm.put("s", "n");
		hm.put("e", "o");
		hm.put("v", "p");
		hm.put("z", "q");
		hm.put("p", "r");
		hm.put("d", "s");
		hm.put("r", "t");
		hm.put("j", "u");
		hm.put("g", "v");
		hm.put("t", "w");
		hm.put("h", "x");
		hm.put("a", "y");
		hm.put("q", "z");
		
		FileInputStream fstream = new FileInputStream("/home/gagan/Downloads/A-small-attempt0.in");
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in,"UTF-8"));
		String str = br.readLine();
		int noOfCases = Integer.valueOf(str);
		if(noOfCases > 30) noOfCases = 30;
		int counter = 1;
		FileWriter fw = new FileWriter("problemA-out.txt");
		BufferedWriter out = new BufferedWriter(fw);
		String writeStr = null;
		int length = 0;
		while((str = br.readLine()) != null && counter <= 30){
			writeStr = "";
			writeStr += "Case #"+counter+": ";
			length = str.length();
			if(length > 100) length = 100;
			for(int i =0; i < str.length(); i++){
				String c = String.valueOf(str.charAt(i));
				if(hm.containsKey(c)){
					writeStr += hm.get(c);
				}
				else{
					writeStr += c;
				}
			}
			writeStr += "\n";	
			out.write(writeStr);
			counter++;
		}
		out.close();
	}
}
