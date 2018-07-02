package methodEmbedding.Standing_Ovation.S.LYD652;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.regex.Pattern;

public class Main {
	
	public static Pattern p = Pattern.compile("\\s+");
	
	public static void main (String[] args) throws IOException{
		String inputTest = args[0];
		String outputFile = args[1];
		
		BufferedReader input =  new BufferedReader(new FileReader(inputTest));	
		
		StringBuilder outputStr = new StringBuilder();
		int numberOfTest = Integer.parseInt(input.readLine());
		for ( int t = 1; t <= numberOfTest; t++ ){
			String[] test = p.split(input.readLine(), -1);
			
			int maxS = Integer.parseInt(test[0]);			
			
			int accumed = 0;
			int minRequred = 0;
			int current = 0;
			for(int slevel = 0; slevel <= maxS; slevel++){
				
				switch(test[1].charAt(slevel)){
				case '0':
					current = 0;
					break;
				case '1':
					current = 1;
					break;
				case '2':
					current = 2;
					break;
				case '3':
					current = 3;
					break;
				case '4':
					current = 4;
					break;
				case '5':
					current = 5;
					break;
				case '6':
					current = 6;
					break;
				case '7':
					current = 7;
					break;
				case '8':
					current = 8;
					break;
				case '9':
					current = 9;
					break;
				}
				if(current>0){
					minRequred += (slevel > accumed ? (slevel - accumed) : 0);
					accumed += current + minRequred;
				}
			}
			outputStr.append("Case #")
				.append(t).append(": ")
				.append(minRequred).append("\n");
			
		}
		input.close();
		
		Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile)));
		writer.write(outputStr.toString());
		writer.close();
	}

}
