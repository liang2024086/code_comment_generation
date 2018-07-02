package methodEmbedding.Standing_Ovation.S.LYD1239;

import java.util.*;
public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numCases = s.nextInt();
		for(int z = 1; z <= numCases; z++){
			int maxShyness = s.nextInt() + 1;
			int[] numShyness = new int[maxShyness];
			String shynesses = s.next();
			for(int a = 0; a < maxShyness; a++){
				numShyness[a] = shynesses.charAt(a) - '0';
			}
			int res = 0;
			int running = 0;
			for(int a = 0; a < maxShyness; a++){
				if(running < a){
					res += a - running;
					running = a;
				}
				running += numShyness[a];
			}
			System.out.printf("Case #%d: %d\n", z, res);
		}
	}
}
