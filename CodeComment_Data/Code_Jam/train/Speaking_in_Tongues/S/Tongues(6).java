package methodEmbedding.Speaking_in_Tongues.S.LYD414;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Tongues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try{
			
			File dance = new File("C:\\Users\\Moeen\\Documents\\0 ECLIPSE\\IO Folder\\Input\\A-small-attempt0.in");
			FileWriter outFile = new FileWriter("C:\\Users\\Moeen\\Documents\\0 ECLIPSE\\IO Folder\\Output\\A-small-attempt0.out");
			PrintWriter outPrint = new PrintWriter(outFile);
			
			Scanner scan = new Scanner(dance);
			String inputString = new String();
			String convertString = new String();
			ArrayList<String> stringArray = new ArrayList<String>();
			
			inputString = scan.nextLine();
			int totalNoCases = Integer.parseInt(inputString);
			System.out.println("Total Number of Cases: " + totalNoCases);
			
			HashMap hm = new HashMap ();
			hm.put('y', 'a');
			hm.put('n', 'b');
			hm.put('f', 'c');
			hm.put('i', 'd');
			hm.put('c', 'e');
			hm.put('w', 'f');
			hm.put('l', 'g');
			hm.put('b', 'h');
			hm.put('k', 'i');
			hm.put('u', 'j');
			hm.put('o', 'k');
			hm.put('m', 'l');
			hm.put('x', 'm');
			hm.put('s', 'n');
			hm.put('e', 'o');
			hm.put('v', 'p');
			hm.put('z', 'q');
			hm.put('p', 'r');
			hm.put('d', 's');
			hm.put('r', 't');
			hm.put('j', 'u');
			hm.put('g', 'v');
			hm.put('t', 'w');
			hm.put('h', 'x');
			hm.put('a', 'y');
			hm.put('q', 'z');
			hm.put(' ', ' ');
			
			for (int caseNo = 1; caseNo <= totalNoCases; caseNo++){
				System.out.print("Case #" + caseNo + ": ");
				outPrint.print("Case #" + caseNo + ": ");
				
				inputString = scan.nextLine();
				
				
				stringArray.add(inputString);
				//System.out.println(stringArray);
				//System.out.println(inputString);

				
				for(int i=0; i<inputString.length(); i++){
					//System.out.println(inputString.charAt(i));
					
					char singleLetter = inputString.charAt(i);
					singleLetter = (char) hm.get(singleLetter);
					//String converter = converter + singleLetter;
					System.out.print(singleLetter);
					outPrint.print(singleLetter);
				}
				
				System.out.println();
				outPrint.println();
				stringArray.clear();
			}
			
			scan.close();
			outPrint.close();
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1){
			System.out.println("Error" + e1);
		}


	}

}
