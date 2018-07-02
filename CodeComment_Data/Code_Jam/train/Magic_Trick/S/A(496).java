package methodEmbedding.Magic_Trick.S.LYD1443;

import java.util.Scanner;
import java.io.*;
import java.util.*;


public class A{
	public static void main(String[] args){
		Scanner sc = null;
		try{
			sc = new Scanner(new File("A-small-attempt0.in"));
		}
		catch(Exception ex){}

		String next;

		int cases = Integer.parseInt(sc.nextLine());
		int current = 0;



		try{
			FileWriter fs = new FileWriter("output.txt");
			BufferedWriter buff = new BufferedWriter(fs);
			while(current < cases){
				// read first and second set of numbers into array
				String[] numbers1;
				int line1 = Integer.parseInt(sc.nextLine());
				String targetLine1 = "";
				for(int i = 1; i <= 4; i++){
					if(i == line1){
						targetLine1 = sc.nextLine();
					} else{
						sc.nextLine();
					}
				}
				numbers1 = targetLine1.split(" ");

				String[] numbers2;
				int line2 = Integer.parseInt(sc.nextLine());
				String targetLine2 = "";
				for(int i = 1; i <= 4; i++){
					if(i == line2){
						targetLine2 = sc.nextLine();
					} else{
						sc.nextLine();
					}
				}
				numbers2 = targetLine2.split(" ");

				// compare results
				boolean resultFound = false;
				String out = "Volunteer cheated!";
				for(int i = 0; i < 4; i++){
					if(Arrays.asList(numbers2).contains(numbers1[i])){
						if(resultFound){
							out = "Bad magician!";
							break;
						} else{
							resultFound = true;
							out = numbers1[i];
						}
					}
				}

				current++;
				buff.write("Case #" + current + ": " + out + "\n");
			}
			buff.close();
		}
		catch(Exception ex){}
	}
}
