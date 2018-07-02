package methodEmbedding.Magic_Trick.S.LYD1522;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainClass {
	public static void main (String args[]) throws FileNotFoundException, IOException{
		Scanner scanner = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter pw = new PrintWriter(new File("A-small-attempt0.out"));
		int t = scanner.nextInt();
		for(int i = 1; i <= t; i++){
			int row1 = scanner.nextInt();
			scanner.nextLine();
			List<Integer> list1 = new ArrayList<Integer>();
			for(int j = 1; j <= 4; j++){
				if(j == row1){
					for(int k = 0; k < 4; k++){
						list1.add(scanner.nextInt());
					}
				}
				scanner.nextLine();
			}
			int row2 = scanner.nextInt();
			scanner.nextLine();
			List<Integer> list2 = new ArrayList<Integer>();
			for(int j = 1; j <= 4; j++){
				if(j == row2){
					for(int k = 0; k < 4; k++){
						list2.add(scanner.nextInt());
					}
				}
				scanner.nextLine();
			}
			list1.retainAll(list2);
			if(list1.size() > 1){
				pw.println("Case #" + i + ": Bad magician!");
			}else if(list1.size() == 1){
				pw.println("Case #" + i + ": " + list1.get(0));
			}else{
				pw.println("Case #" + i + ": Volunteer cheated!");
			}
		}
		scanner.close();
		pw.close();
	}
}
