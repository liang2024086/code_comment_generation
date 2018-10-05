package methodEmbedding.Counting_Sheep.S.LYD791;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, test;
		int i = 0;
		
		try {
			Scanner readfileScanner = new Scanner(new FileReader("A-small-attempt1.in"));
			if(readfileScanner.hasNextLine()){
				num = Integer.parseInt(readfileScanner.nextLine());
			}
			PrintWriter writer = new PrintWriter("A-small-attempt1.out");
			
			while(readfileScanner.hasNextLine()){
				//System.out.println("in while");
				String line = readfileScanner.nextLine();
				
				test = Integer.parseInt(line);
				long res;
				ArrayList<Integer> numbers = new ArrayList<Integer>();
				char[] dig;
				long k = 1;
				
				if(test == 0)
					writer.printf("Case #%d: INSOMNIA\n", i+1);
				else{
					main:
					while(true){
						res = (k * (long)test);
						String numS = String.valueOf(res);
						dig = numS.toCharArray();
						for (int j = 0; j < dig.length; j++) {
							if(!numbers.contains((int)dig[j]))
								numbers.add((int)dig[j]);
							if (numbers.size() >= 10) {
								writer.printf("Case #%d: %s\n", i+1, numS);
								break main;
							}
						}
						k++;
					}
				}
				i++;
			}
			writer.close();
			readfileScanner.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		num = scan.nextInt();
		char[] dig;
		
		for(int i = 0; i < num; i++){
			test = scan.nextInt();
			long res;
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			long k = 1;
			
			if(test == 0)
				System.out.printf("Case #%d: INSOMNIA\n", i+1);
			else{
				main:
				while(true){
					res = (k * (long)test);
					String numS = String.valueOf(res);
					dig = numS.toCharArray();
					for (int j = 0; j < dig.length; j++) {
						if(!numbers.contains((int)dig[j]))
							numbers.add((int)dig[j]);
						if (numbers.size() >= 10) {
							System.out.printf("Case #%d: %s\n", i+1, numS);
							break main;
						}
					}
					k++;
				}
			}
			
		}
		*/
	}

}
