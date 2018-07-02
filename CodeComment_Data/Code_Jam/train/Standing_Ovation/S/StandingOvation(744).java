package methodEmbedding.Standing_Ovation.S.LYD350;

import java.util.*; 
import java.io.*; 
import static java.lang.System.*;

public class StandingOvation {

	public static void main(String[] args ) throws IOException{
		FileReader fr= new FileReader("in.txt");
		BufferedReader textReader = new BufferedReader(fr); 
		int num  = Integer.parseInt(textReader.readLine());
		for(int k=0; k<num; k++){
		String read = textReader.readLine();
		
		String [] str = read.split(" ");
		int count = 0; 
		int friends = 0; 
		
		for(int Si=0; Si<Integer.parseInt(str[0])+1; Si++){
			
			int people = Integer.parseInt(str[1].substring(Si, Si+1)); 
			count += people;
			
			if(count<Si+1){ 
			friends += 1;
			count ++; 
			
			} 
			
		}
		out.printf("Case #%d: ", k+1);
		out.println(friends); 
		} 
	}
}

/*
  
*/ 
