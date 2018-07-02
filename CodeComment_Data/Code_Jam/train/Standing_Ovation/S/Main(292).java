package methodEmbedding.Standing_Ovation.S.LYD419;

import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner input = null;
		PrintWriter printer= null;
		try{
			input = new Scanner(new File("A-small-attempt0.in"));
			printer = new PrintWriter(new File("out"));
		}
		catch(Exception e){
			System.exit(1);
		}
		
		int T = Integer.parseInt(input.nextLine()), count =0, temp, add;
		for(int j=1; j<=T; j++){
			count = 0;
			add= 0;
			String line = input.nextLine();
			String[] splitLine = line.split(" ");
			String newLine = splitLine[1];
			for(int i=0; i<newLine.length(); i++){
				temp = Integer.parseInt(newLine.charAt(i) + "");
				if(temp > 0){
					if(i > count){
						add += (i-count);
						count += (i-count);
					}
					count +=temp;
				}
			}
			printer.println("Case #" + j + ": " +add);
		}
		printer.close();
	}

}
	


