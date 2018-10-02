package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1140;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		int T = sc.nextInt();
		for(int test_case=1; test_case<=T; test_case++) {
			String penCake = sc.next();
			
			int count = 0;
			boolean plusBefore = false;
			boolean minusBefore = false;
			for(int i=0; i<penCake.length(); i++) {
				if(penCake.charAt(i) == '+') {
					if(minusBefore){
						if(plusBefore) {
							//System.out.println("1 at " + i);
							count += 2;
						} else {
							//System.out.println("2 at " + i);
							count++;
						}
						//penCake = ('+'*i) + '+' + penCake.substring(i+1, penCake.length());
						minusBefore = false;
					}
					plusBefore = true;
				} 
				
				if(penCake.charAt(i) == '-') {
					minusBefore = true;
					if(i == penCake.length()-1) {
						if(plusBefore) {
							//System.out.println("3 at " + i);
							count += 2;
						} else {
							//System.out.println("4 at " + i);
							count++;
						}						
					}
				}
				
			}
			
			
			System.out.println("Case #" + test_case + ": " + count);
		}
	}
}
