package methodEmbedding.Counting_Sheep.S.LYD1606;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException {

		File input = new File("input.txt");
		File output = new File("output.txt");
		if (!output.exists()){
			output.createNewFile();
			output.canWrite();
		}
		FileWriter fileWrite=new FileWriter(output, false);
		PrintWriter filePrint = new PrintWriter(fileWrite);
		
		HashSet<Integer> seenDigits = new HashSet<Integer>();		
		try {
			Scanner sc = new Scanner(input);
			if (sc.hasNext()){
				int T=Integer.parseInt(sc.nextLine());
				if (T>100)
					T=100;
				if (T>0){					
					for (int X=1; X<=T; X++){
						int N = Integer.parseInt(sc.nextLine());
						seenDigits.clear();
						int i = 1;
						int res = 0;
						if (N > 0){
							while (seenDigits.size() < 10){
								res = N * i;
								int resTmp = res;
								while (resTmp > 0) {
									seenDigits.add(resTmp % 10);
									resTmp = resTmp / 10;
								}
								i++;
							}
						}												
						if (res != 0){
							filePrint.printf("Case #"+X+": "+res+"\n");
						} else {
							filePrint.printf("Case #"+X+": INSOMNIA\n");
						}
					}
					filePrint.close();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Done! Check out \"output.txt\" file!");
	}
}
