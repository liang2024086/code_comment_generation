package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1011;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class ProblemB {
	public static void main(String[] args){
		String filename = "src/input.txt";
		String output = "src/output.txt";
		String answer = "";
		
		try {
			Scanner scan = new Scanner(new File(filename));
			int a = scan.nextInt();
			for(int i = 0; i < a; i++){
				double c = scan.nextDouble();
				double f = scan.nextDouble();
				double x = scan.nextDouble();
				double min = x;
				int j = 0;
				while(true){
					double t = x/(2+f*j);
					for(int k = 0; k < j; k++){
						t += c/(2+f*k);
					}
					if(t < min){
						min = t;
					}else{
						break;
					}
					j++;
				}
				answer += "Case #" + (i+1) + ": " + min + "\n";
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			PrintWriter writer = new PrintWriter(new File(output));
			writer.print(answer);
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
