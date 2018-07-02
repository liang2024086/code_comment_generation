package methodEmbedding.Speaking_in_Tongues.S.LYD908;

import java.util.*;
import java.io.*;
public class SpeakingInTongues {
	public static void main(String[] args){
		HashMap<String, String> code = new HashMap<String, String>();
		

		
		code.put("a", "y");
		code.put("b", "h");
		code.put("c", "e");
		code.put("d", "s");
		code.put("e", "o");
		code.put("f", "c");
		code.put("g", "v");
		code.put("h", "x");
		code.put("i", "d");
		code.put("j", "u");
		code.put("k", "i");
		code.put("l", "g");
		code.put("m", "l");
		code.put("n", "b");
		code.put("o", "k");
		code.put("p", "r");
		
		code.put("q", "z");
		
		code.put("r", "t");
		code.put("s", "n");
		code.put("t", "w");
		code.put("u", "j");
		code.put("v", "p");
		code.put("w", "f");
		code.put("x", "m");
		code.put("y", "a");
		code.put("z", "q");
		
		code.put(" ", " ");
		
		try{
			Scanner scan = new Scanner(new File("C:/personal/GoogleCode2012/Tongues/A-small-attempt.in"));
			BufferedWriter output = new BufferedWriter(new FileWriter(new File("C:/personal/GoogleCode2012/Tongues/output.txt")));
			boolean isFirstLine=true;
			int n =0;
			int linecount=0;
			while(scan.hasNextLine()){
				if(isFirstLine){
					isFirstLine=false;
					n= Integer.parseInt(scan.nextLine());
					continue;
				}
				
				String line = scan.nextLine();
				String result="";
				for(int i=0; i< line.length(); i++){
					result+=code.get(line.substring(i,i+1));
				}
				linecount++;
				output.write("Case #"+Integer.toString(linecount)+": "+result);
				output.newLine();
				
			}
			output.close();
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		
		
	}
}

