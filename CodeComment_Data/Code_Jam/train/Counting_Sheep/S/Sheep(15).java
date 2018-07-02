package methodEmbedding.Counting_Sheep.S.LYD97;

import java.util.*;

public class Sheep {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int cas = in.nextInt();
		
		for(int i = 1; i <= cas; i++) {
			System.out.print("Case #" + i + ": ");
			int v = in.nextInt();
			int c = v;
			int k = c;
			int u;
			if(v == 0) {
				System.out.println("INSOMNIA");
			} else {
				boolean found[] = new boolean[10];
				while(true) {
					k = c;
					while(k > 0) {
						found[k % 10] = true;
						k /= 10;
					}
					u = 0;
					for(int j = 0; j < 10; j++) {
						if(!found[j]) u++;
					}
					if(u == 0) {
						System.out.println(c);
						break;
					} else {
						c += v;
					}
				}
			}
		}
		
	}

}
