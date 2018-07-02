package methodEmbedding.Counting_Sheep.S.LYD65;


import java.util.Scanner;

public class QRA {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=1; i<=t; i++){
			
			int n = in.nextInt();
			
			System.out.print("Case #" + i + ": ");
			
			if (n == 0) {
				System.out.print("INSOMNIA");
			} else {
				boolean[] digitsSeen = new boolean[10];
				for (int j = 0; j<=9; j++) digitsSeen[j] = false;
				int mult = 0;
				while (true) {
					mult++;
					int prod = n*mult;
					while (prod > 0) {
						digitsSeen[prod % 10] = true;
						prod /= 10;
					}
					boolean check = true;
					for (int j = 0; j<=9 && check; j++) {
						check &= digitsSeen[j];
					}
					if (check) {
						break;
					}
				}
				System.out.print(n*mult);
				
			}
			
			System.out.println();
		}
		
		in.close();
	}
}
