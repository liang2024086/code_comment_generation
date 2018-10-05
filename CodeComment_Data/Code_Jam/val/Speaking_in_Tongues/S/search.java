package methodEmbedding.Speaking_in_Tongues.S.LYD266;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class search {

	static HashMap<Character, Character> replace;
	
	public static void main(String[] args) throws FileNotFoundException {
		replace = new HashMap<Character, Character>();
		
		Scanner in = new Scanner(new File("replace.txt"));
		
		while(in.hasNextLine()){
			String line = in.nextLine();
			replace.put(line.charAt(0), line.charAt(2));
		}
		
		in = new Scanner(System.in);
		
		int i = Integer.parseInt(in.nextLine());
		
		int index = 1;
		
		while(i-->0)
		{
			char line[] = in.nextLine().toCharArray();
			
			System.out.print("Case #" + index + ": ");
			for(char c : line){
				System.out.print( replace.get(c) );
			}
			
			System.out.println();
			index++;
		}
		
		
	/*	Set<Character> keys = replace.keySet();
		
		Iterator<Character> it = keys.iterator();
		
		while(it.hasNext()){
			Character c = it.next();
			System.out.println(c.toString() + " " + replace.get(c).toString() );
		}*/
	}

}
