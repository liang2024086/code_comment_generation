package methodEmbedding.Standing_Ovation.S.LYD1313;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class AProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner fileScanner;
		int tests = 0;
		int cases = 1;
		try {
			fileScanner = new Scanner(new File("C:/Users/User/Desktop/input.txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/User/Desktop/AOutput.txt"));
			if(fileScanner.hasNextLine()) {
				tests = Integer.parseInt(fileScanner.nextLine());
			}
			while (fileScanner.hasNextLine()){
				//int sMax = fileScanner.nextInt();
				String s = fileScanner.nextLine();
				String[] splitString = s.split(" ");
				int sMax = Integer.parseInt(splitString[0]);
				String in = splitString[1];
				//System.out.println(in);
				int count = 0;
				int result = 0;
				for(int i = 0; i <= sMax; i++) {
					int x = in.charAt(i) - 48;
					if(count >= i) {
						count += x;
					}
					else if(x > 0){
						result += i - count;
						count += i - count;
						count += x;
					}
					//System.out.println(cases + " : " + (in.charAt(i) - 48) + " : " + count);
				}
				if(cases != 1)
					writer.newLine();
				writer.write("Case #" + cases++ + ": ");
				writer.write("" + result);
			}
			writer.close();
		}
		//09
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
