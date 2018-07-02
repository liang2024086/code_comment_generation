package methodEmbedding.Speaking_in_Tongues.S.LYD1602;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;


public class CodeJam {
	public static void main(String[] args){
		BufferedReader   reader = new BufferedReader(new InputStreamReader(System.in));
		Hashtable<Character, Character> hashTable = new Hashtable<Character, Character>();
		
		String line1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
		String line2 = "our language is impossible to understand";
		hashTable.put('z', 'q');
		hashTable.put('q', 'z');
		hashTable.put(' ', ' ');
		
		for(int i=0;i<line1.length();i++){
			//System.out.println(line1.charAt(i) +" - "+ line2.charAt(i)+" "+(line1.codePointAt(i)-96)+" - "+(line2.codePointAt(i)-96)+" "+(line1.charAt(i) - line2.charAt(i))+" ");
			char temp = line1.charAt(i);
			if(!hashTable.containsKey(temp)){
				hashTable.put(temp, line2.charAt(i));
			}
		}
		
		String line3 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		String line4 = "there are twenty six factorial possibilities";
		
		for(int i=0;i<line3.length();i++){
			char temp = line3.charAt(i);
			if(!hashTable.containsKey(temp)){
				hashTable.put(temp, line4.charAt(i));
			}
			//System.out.println(line3.charAt(i) +" - "+ line4.charAt(i)+" "+(line3.codePointAt(i)-96)+" - "+(line4.codePointAt(i)-96)+" "+(line3.charAt(i) - line4.charAt(i))+" ");
		}
		
		String line5 = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String line6 = "so it is okay if you want to just give up";
		
		for(int i=0;i<line5.length();i++){
			char temp = line5.charAt(i);
			if(!hashTable.containsKey(temp)){
				hashTable.put(temp, line6.charAt(i));
			}
		}
		
		try{
			String countString = reader.readLine();
			int count = Integer.parseInt(countString);

			for(int i=0;i<count;i++){
				String line = reader.readLine();
				System.out.print("\nCase #"+(i+1)+": ");
				for(int j=0;j<line.length();j++){
					System.out.print(hashTable.get(line.charAt(j)));
				}
				System.out.print("");
			}   			
		}	
		catch (IOException ioe){
			System.out.println("An unexpected error occured.");
		}
	}
}
