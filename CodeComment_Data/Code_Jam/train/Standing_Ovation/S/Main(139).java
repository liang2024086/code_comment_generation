package methodEmbedding.Standing_Ovation.S.LYD448;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
	public static void main(String args[]) throws FileNotFoundException{
		File file = new File("testfile");
		 Scanner scan = new Scanner(file);
		 String result = "";
		 int numCase = Integer.parseInt(scan.nextLine());
		 for(int i = 0; i < numCase; i++){
			 String line[] = scan.nextLine().split(" ");
			 int maxShyness = Integer.parseInt(line[0]);
			 int standing = 0;
			 int toAdd = 0;
			 for(int j = 0; j <= maxShyness; j++){
				 if(standing >= j){
					 standing += Character.getNumericValue(line[1].charAt(j));
				 }else{
					 toAdd += j - standing;
					 standing += (j - standing) + Character.getNumericValue(line[1].charAt(j));
				 }
			 }
			 result += "Case #" + (i+1) + ": " + toAdd + "\n";
		 }
		 System.out.println(result);
	}
}
