package methodEmbedding.Counting_Sheep.S.LYD1624;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Sagar
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args){
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt();
		for(int i = 1 ; i <= t; i++){
			long n = in.nextLong();
			boolean digits[] = new boolean[10];
			byte b = 0;
			int j=1;
			if(n != 0)
			o:while(true){
				long number = n * j;
				long tn = number;
				while(tn != 0){
					int u = (int) (tn %10);
					if(digits[u] == false){
						digits[u] = true;
						b++;
					}
					if(b == 10){
						System.out.println("Case #" + i + ": " + number);
						break o;
					}
					tn = tn / 10;
				}
				j++;
			}
			if(b != 10)
				System.out.println("Case #" + i + ": INSOMNIA");
		}
		in.close();
	}
}
