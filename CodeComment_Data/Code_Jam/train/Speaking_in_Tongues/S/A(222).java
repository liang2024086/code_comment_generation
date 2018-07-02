package methodEmbedding.Speaking_in_Tongues.S.LYD118;

import java.util.Scanner;
import java.math.*;

public class A {
	public static void main(String[] args) {
		char[] googlerese = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		in.nextLine();
		for(int zz = 1; zz <= T;zz++){
			char text[] = in.nextLine().toCharArray();
			for(int i = 0; i<text.length;i++){
				if((int)text[i] == 32)continue;
				text[i] = googlerese[Math.abs(97-(int)text[i])];
			}
			System.out.format("Case #%d: %s\n", zz, new String(text));
		}
	}
}
