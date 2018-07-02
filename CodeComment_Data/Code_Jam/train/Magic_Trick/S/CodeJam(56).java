package methodEmbedding.Magic_Trick.S.LYD1906;

import java.util.*;
import java.io.*;
import java.lang.Math;

public class CodeJam{	
	public static long[] list = new long[9];
	public static void main(String[] args) throws FileNotFoundException{
		//////////// Reader & Printer /////////////////
		File file = new File("A-small-attempt1.in");
		//File file = new File("try.in");
		Scanner sc = new Scanner(file);
		sc.useDelimiter("\n| ");
		PrintStream out = new PrintStream(new File("out.txt"));
		///////////////////////////////////////////////
		/////////Variable declaration///////////
		
		///////////////////////////////////////
		for(int id = 1, khoi = sc.nextInt(); id <=khoi; id++){
			int first = sc.nextInt();
			
			for(int i = 0 ; i < first; i++){
				sc.nextLine();
			}	
			int[] firstArr = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
			
			for(int i = 0 ; i < 5 - first; i++){
				sc.nextLine();
			}
			//second
			int second = sc.nextInt();
			
			for(int i = 0 ; i < second; i++){
				sc.nextLine();
			}	
			int[] secondArr = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
			Arrays.sort(secondArr);
			for(int i = 0 ; i < 5 - second; i++){
				sc.nextLine();
			}
			/////////
			int result = 0;
			int count = 0;
			int remem = 0;
			for(int i = 0; i < 4; i++){
				result = Arrays.binarySearch(secondArr, firstArr[i]);
				if(result > -1) {
					count++;
					remem = firstArr[i];
				}
			}
			String finalString;
			if(count == 1){
				finalString = String.valueOf(remem);
				
			}else if(count == 0) {
				finalString = "Volunteer cheated!";
			}else finalString = "Bad magician!";
			
			
			out.println("Case #" + id + ": " + finalString);
	
		}
		///////////close reader & printer/////////////////
		sc.close();
		out.close();
	}
	

}
