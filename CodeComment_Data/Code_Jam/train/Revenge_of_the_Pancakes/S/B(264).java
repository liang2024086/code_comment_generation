package methodEmbedding.Revenge_of_the_Pancakes.S.LYD631;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		//Scanner scanner = new Scanner(new File("C:\\Users\\snk\\workspace\\CodeJam\\bin\\B-small-attempt1.in"));
		int numCases = scanner.nextInt();
		scanner.nextLine();
		for(int i = 1; i <= numCases; i++){
			String str = scanner.nextLine();
			int count = 0;
			boolean firstTime = str.startsWith("-");
			for(int j =0 ; j <str.length(); ){
				while(j < str.length() && str.charAt(j) == '+')
					j++;
				if(j >= str.length())
					break;
				if(str.charAt(j) == '-'){
					if(firstTime){
						count ++;
						firstTime = false;
					}
					else					
						count+=2;
				}
				while(j<str.length() && str.charAt(j) == '-')
					j++;
				
			}
			System.out.println("Case #"+i+": " +count);
		}
	}

}
