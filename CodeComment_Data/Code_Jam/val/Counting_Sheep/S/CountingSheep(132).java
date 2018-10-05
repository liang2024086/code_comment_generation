package methodEmbedding.Counting_Sheep.S.LYD978;

import java.util.HashSet;
import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String[] result = new String[t];
		HashSet<Integer> allDigits = new HashSet<Integer> ();
		for(int i=0; i<10; i++){
			allDigits.add(i);
		}
		for(int test=0; test<t; test++){
			int n = sc.nextInt();
			if(n==0){
				result[test] = "INSOMNIA";
				continue;
			}
			int i=1;
			String nextNum = null;
			HashSet<Integer> seenDigits = new HashSet<Integer> ();
			while(!seenDigits.containsAll(allDigits)){
				nextNum = Integer.toString(n*i);
				for(int j=0; j<nextNum.length(); j++){
					seenDigits.add(Character.getNumericValue(nextNum.charAt(j)));
				}
				i++;
			}
			result[test] = nextNum;
		}
		for(int i=0; i<result.length; i++){
			System.out.println("Case #"+(i+1)+": "+result[i]);
		}
		sc.close();
	}
}
