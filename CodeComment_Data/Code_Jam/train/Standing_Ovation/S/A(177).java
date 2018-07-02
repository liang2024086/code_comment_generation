package methodEmbedding.Standing_Ovation.S.LYD873;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A {
	public static void main(String[] args){
		Scanner s;
		try {
			s = new Scanner(new File("A-small-attempt2.in"));
			int cases = s.nextInt();
			for (int i = 0; i < cases; i++){
				int[] arr = new int[s.nextInt()+1];
				String[] parts = s.next().split("");
				for(int n = 0; n < parts.length; n++) {
				   arr[n] = Integer.parseInt(parts[n]);
				}
				int sum = arr[0];
				int additions = 0;
				for (int j = 1; j < arr.length; j++){
					if (arr[j] != 0){
						if (sum >= j){
							sum+=arr[j];
						} else {
							additions+= j-sum;
							sum += additions + arr[j];
						}
					}
					
				}
				System.out.println("Case #" + (i+1) + ": " + additions);
			}
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
