package methodEmbedding.Counting_Sheep.S.LYD375;


import java.io.File;
import java.util.Scanner;

public class Sheep {
	public static void main(String[] args) {
		boolean[] aux = new boolean[10];
//		Scanner sc = new Scanner(new File("input000.txt"));
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		for(int t=0; t < testCases; t++) {
			for(int k=0; k < 10; k++) {
				aux[k] = false;
			}
			long n = Long.parseLong(sc.nextLine());
			if(n == 0) {
				System.out.println("Case #" + (t+1) + ": INSOMNIA");
				continue;
			}
			for(int i=1; true ;i++) {
				String result = Long.toString(n*i);
				for(int j=0; j < result.length(); j++) {
					aux[result.charAt(j)-48] = true;
				}
				boolean done = true;
				for(int m=0; m < 10; m++) {
					if(!aux[m]) {
						done=false;
						break;
					}
				}
				if(done) {
					System.out.println("Case #" + (t+1) + ": " + n*i);
					break;
				}
			}
		}
		sc.close();
	}
}
