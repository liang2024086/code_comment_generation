package methodEmbedding.Revenge_of_the_Pancakes.S.LYD249;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args){ 
		Scanner scan = new Scanner(System.in);
		int total = scan.nextInt();
		int positiveValue = 43;
		int negativeValue = 45;
		for(int i=0; i<total; i++){
			String word = scan.next();
			int block = 0;
			for(int j=0; j<word.length()-1;j++){
				if(word.charAt(j)!=word.charAt(j+1)){
					block++;
				}
			}
			if(word.charAt(word.length()-1)==45){
				block++;
			}
			System.out.println("Case #" + (i+1) + ": " + block);
		}
	}
}
