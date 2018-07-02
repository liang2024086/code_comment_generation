package methodEmbedding.Standing_Ovation.S.LYD197;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class gcj {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ttt.out")));
		
		int t = in.nextInt();
		label2:
		for(int test = 1; test <= t; test++){
			int temp = in.nextInt();
			String rest = in.next();
			
			int[] counts = new int[temp+1];
			for(int i=0; i <= temp; i++){
				counts[i] = Integer.parseInt(rest.charAt(i)+"");
			}
			label:
			for(int amnt = 0; amnt <= 9999999; amnt++){
				int[] arr = counts.clone();
				arr[0]+= amnt;
				//check if works
				int count = 0;
				for(int i=0; i <= temp; i++){
					if(count< i) continue label;
					else count+= arr[i];
				}
				out.println("Case #" + test +": " + amnt);
				continue label2;
			}
			
		}
		out.close();
		
	}

}
