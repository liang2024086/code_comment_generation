package methodEmbedding.Speaking_in_Tongues.S.LYD1103;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class main {
public static void main(String[] args) throws IOException{
		
		String text = "";
		int lineCounter = 0;
		int totalLength = 2;
		
		char[] Output=null;
		String output=null;
		PrintWriter out = null;
		
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
		
		text = in.readLine();
		totalLength = Integer.parseInt(text);
		System.out.print(totalLength);
		
		while(lineCounter < totalLength){
		text = in.readLine();
		
		
		System.out.println(text);
		
		
		if(text == null)break;
		
		
			
		Output = text.toCharArray();
		
		for(int i = 0; i < text.length();i++){
			switch (text.charAt(i)){
			case 'a':
				Output[i] = 'y';
				break;
			case 'b':
				Output[i] = 'h';
				break;
			case 'c':
				Output[i] = 'e';
				break;
			case 'd':
				Output[i] = 's';
				break;
			case 'e':
				Output[i] = 'o';
				break;
			case 'f':
				Output[i] = 'c';
				break;
			case 'g':
				Output[i] = 'v';
				break;
			case 'h':
				Output[i] = 'x';
				break;
			case 'i':
				Output[i] = 'd';
				break;
			case 'j':
				Output[i] = 'u';
				break;
			case 'k':
				Output[i] = 'i';
				break;	
			case 'l':
				Output[i] = 'g';
				break;
			case 'm':
				Output[i] = 'l';
				break;	
			case 'n':
				Output[i] = 'b';
				break;	
			case 'o':
				Output[i] = 'k';
				break;
			case 'p':
				Output[i] = 'r';
				break;
			case 'q':
				Output[i] = 'z';
				break;
			case 'r':
				Output[i] = 't';
				break;
			case 's':
				Output[i] = 'n';
				break;
			case 't':
				Output[i] = 'w';
				break;
			case 'u':
				Output[i] = 'j';
				break;
			case 'v':
				Output[i] = 'p';
				break;
			case 'w':
				Output[i] = 'f';
				break;
			case 'x':
				Output[i] = 'm';
				break;
			case 'y':
				Output[i] = 'a';
				break;
			case 'z':
				Output[i] = 'q';
				break;
			
			//End switch case
			}
			//End for loop	
		}
		//String Changed 
		
			output = new String(Output);
			
			out = new PrintWriter(new FileWriter("outputfile.out",true)); 
			out.println("Case #"+ String.valueOf(lineCounter+1)+ ": "+ output); 
			out.close();
			
			System.out.println(output);
			
			lineCounter++;
			
		}
		
	}
}
