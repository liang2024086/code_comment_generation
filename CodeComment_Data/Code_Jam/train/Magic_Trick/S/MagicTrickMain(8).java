package methodEmbedding.Magic_Trick.S.LYD436;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class MagicTrickMain {
	public static void main (String[] args) throws FileNotFoundException, UnsupportedEncodingException {

		Scanner in = new Scanner(new File("A-small-attempt1.in")); 
		PrintWriter writer = new PrintWriter("MagicOutput.txt", "UTF-8");
		int testCases = in.nextInt();
		int c = 1;
		String store = "";
		String store2 = "";
		
		while(testCases > 0){
			
			int row = in.nextInt();
			
			for(int i = 0; i <= 4; i++){
				if(i == row){
					//save row. 
					store = in.nextLine();
				}else
					in.nextLine();

			}
			
			int row2 = in.nextInt();
			
			for(int i = 0; i <= 4; i++){
				if(i == row2){
					//save row. 
					store2 = in.nextLine();
				}else
					in.nextLine();

			}
			
			String[] s1 = store.split(" ");
			String[] s2 = store2.split(" ");
			ArrayList<String> fin = new ArrayList<String>();
			int matchesFound = 0;
			
			
			for(String s : s1){
				for(String ss : s2){
					if(s.equals(ss)){
						matchesFound++;
						fin.add(ss);
					}
				}
			}
			
			if(matchesFound == 0)
				writer.println("Case #" + c + ": Volunteer cheated!");
			if(matchesFound > 1)
				writer.println("Case #" + c + ": Bad magician!");
			if(matchesFound == 1)
				writer.println("Case #" + c + ": " + fin.get(0));
			
			
			testCases--;
			c++;
			
		}
		
		System.out.println("Done");
		writer.close();
		
	}
}
