package methodEmbedding.Counting_Sheep.S.LYD636;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Countingsheep {
	public static void main(String args[]) {
		try {
			Scanner input = new Scanner(new File("C:\\Users\\Edmund\\Desktop\\test.txt"));
			
			FileWriter fstream = new FileWriter("C:\\Users\\Edmund\\Desktop\\out.txt");
			BufferedWriter out = new BufferedWriter(fstream);

			int N;

			int testcases = input.nextInt();
			
			for (int t = 1; t <= testcases; t++) {
				HashSet <Integer>digits = new HashSet<Integer>();
				
				////////
				N = input.nextInt();
				int counter = 2;
				int number = N;
				////////
				end:
				while(digits.size()<10 & N!=0){
					char str_N[] = String.valueOf(number).toCharArray();
					for(int i=0; i<str_N.length;i++){
						char digit = str_N[i];
						digits.add(Integer.valueOf(String.valueOf(digit)));
						if(digits.size()==10){
							break end;
						}
					}
					number = counter*N;
					counter++;
				}
				
				////////
				if(N==0){
					System.out.println("Case #" + t + ": " + "INSOMNIA");
					out.write("Case #" + t + ": " + "INSOMNIA");
				} else {
					System.out.println("Case #" + t + ": " + number);
					out.write("Case #" + t + ": " + number);
				}
				if(t!=testcases){
					out.newLine();
				}
			}
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
