package methodEmbedding.Counting_Sheep.S.LYD96;

import java.util.HashSet;
import java.util.Scanner;

public class SheepAccountant {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		for(int t = 0; t < cases; t++){
			HashSet<Integer> set = new HashSet<>();
			int n = scan.nextInt();
			String res = "";
			if(n == 0) res = "INSOMNIA";
			else{
				int i = 1;
				int nextn = n;
				while(set.size()<10){
					nextn = i++ * n;
					int tempn = nextn;
					while(nextn != 0){
						tempn = nextn%10;
						set.add(tempn);
						nextn = (nextn-tempn)/10;
					}
				}
				res = String.valueOf(n*(i-1));
			}
			System.out.println(String.format("Case #%d: %s",t+1, res));
		}
	}

}
