package methodEmbedding.Counting_Sheep.S.LYD807;

import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;


public class CountingSheep {

	public static void main(String[] args) {
		
		try {
			
			FileReader fr = new FileReader("bin/A-small-attempt3.in");
			
			Scanner sc = new Scanner(fr);
			
			PrintWriter pw = new PrintWriter (new FileWriter("output.txt"));
			
			int caseNumber = sc.nextInt();
			
			for (int x =0; x < caseNumber; x++){
				int[] Sleeperay = new int[10];
				pw.print("Case #" + (x+1) + ":");
				int N = sc.nextInt();
				int i = 0;
				int z = 0;
				for (int nextNum = N; ; nextNum = i*N){
					i = i+1;
					int counter = 0;
					if (N==0){
						break;
					}
					String sN = Integer.toString(nextNum);
					
					String[] splitN = sN.split("");
					for (int y=1; y< splitN.length; y++){
						
						String stringN = splitN[y];
						
						int P = Integer.parseInt(stringN);
						
						Sleeperay[P] = 1;
						
					}
					
					for (int q=0; q< Sleeperay.length; q++){
						int test = Sleeperay[q];
						if (test == 1){
						counter = counter+1;
						}
						
						}
													
				if (counter == 10){
					z=1;
					pw.print(" "+nextNum);
					pw.println();
					break;
				}
							
				}
				if(z == 0){
					pw.print(" INSOMNIA");
					pw.println();
				}
				
			
			}
			sc.close();
			pw.flush();
			pw.close();
			
		}
		catch (IOException e) {
			System.out.println("Error!");
			
		}
		
	}

}
