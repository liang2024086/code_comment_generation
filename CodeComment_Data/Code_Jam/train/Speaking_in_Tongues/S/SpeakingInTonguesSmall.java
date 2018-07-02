package methodEmbedding.Speaking_in_Tongues.S.LYD920;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class SpeakingInTonguesSmall {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new FileReader(new File("./speakingintongues/a-small-attempt0.in")));
		BufferedWriter bw=new BufferedWriter(new FileWriter(new File("./speakingintongues/small.out")));
		
		HashMap<Character, Character>map=new HashMap<Character,Character>();
		
		map.put('a', 'y');
		map.put('b', 'h');
		map.put('c', 'e');
		map.put('d', 's');
		map.put('e', 'o');
		map.put('f', 'c');
		map.put('g', 'v');
		map.put('h', 'x');
		map.put('i', 'd');
		map.put('j', 'u');
		map.put('k', 'i');
		map.put('l', 'g');
		map.put('m', 'l');
		map.put('n', 'b');
		map.put('o', 'k');
		map.put('p', 'r');
		map.put('q', 'z');
		map.put('r', 't');
		map.put('s', 'n');
		map.put('t', 'w');
		map.put('u', 'j');
		map.put('v', 'p');
		map.put('w', 'f');
		map.put('x', 'm');
		map.put('y', 'a');
		map.put('z', 'q');
		
		
		int caseNumber=Integer.parseInt(br.readLine());
		
		StringBuilder out=new StringBuilder();
		for(int i=1;i<=caseNumber;i++){
			StringBuilder output=new StringBuilder();
			String input=br.readLine();
			out.append("Case #"+i+": ");
			
			for(int j=0;j<input.length();j++){
				
				
				
				char c=input.charAt(j);
				if(c!=' '){
					output.append(map.get(c));
				}else
					output.append(" ");
				
				
			}
			
			out.append(output.toString());
			if(i<caseNumber){
				out.append("\n");
			}
			
		}
		
		bw.write(out.toString());
		bw.close();
		br.close();

	}

}
