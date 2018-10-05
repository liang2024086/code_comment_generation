package methodEmbedding.Speaking_in_Tongues.S.LYD481;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Main {
	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//array of chars
		char[] dict = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
		
		Scanner scan  = new Scanner(new File("in"));
	
		scan.nextLine();//removes int at start
		
		int counter = 0;
		
		while (scan.hasNextLine()){
			
			counter++;
			
			System.out.print("Case #"+counter+": ");
			
			String str = scan.nextLine();
			//translates
			for (int i = 0; i<str.length(); i++){
				//gets google char
				char goog = str.charAt(i);
				
				//gets index a--> 0
				int index = (int) goog - 97;
				
				char eng ;
				eng = goog;
				//replace if char is not space
				if (index>=0){
				//get new char
				eng = dict[index];
				}
				System.out.print(eng);
			}
			System.out.println();
			
		}
	
		
	}

}
