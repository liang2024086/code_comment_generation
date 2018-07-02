package methodEmbedding.Magic_Trick.S.LYD1670;

import java.util.*;

public class PA{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i=1; i<=t; i++){
			int[] a = new int[5];
			int c = 0;
			int x = input.nextInt();
			for (int j=1; j<=(x-1)*4; j++)
				c = input.nextInt();
			for (int j=1; j<=4; j++)
				a[j] = input.nextInt();
			for (int j=x*4+1; j<=16; j++)
				c = input.nextInt();
			x = input.nextInt();
			for (int j=1; j<=(x-1)*4; j++)
				c = input.nextInt();
			int count = 0;
			int ans = 0;
			for (int j=1; j<=4; j++){
				c = input.nextInt();
				boolean f = false;
				for (int k=1; k<=4; k++)
					if (c == a[k]) f = true;
				if (f){count++; ans = c;}
			}
			for (int j=x*4+1; j<=16; j++)
				c = input.nextInt();
			System.out.print("Case #"+i+": ");
			if (count == 0) System.out.println("Volunteer cheated!");
			else if (count > 1) System.out.println("Bad magician!");
			else System.out.println(ans);
		}
	}
}
