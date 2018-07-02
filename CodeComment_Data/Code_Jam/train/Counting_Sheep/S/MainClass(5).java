package methodEmbedding.Counting_Sheep.S.LYD1185;


import java.util.Scanner;

public class MainClass {
	
// coin jam	
//	public static void main(String[] args){
//		Scanner in = new Scanner(System.in);
//		in.nextInt();
//
//		int N = in.nextInt();
//		int J = in.nextInt();
//		
//		String result = new CoinJam().solve(N, J);
//		System.out.printf("Case #1:\n%s", result);
//		
//		in.close();
//	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();

		for(int t=0; t<T; t++){
			
			int N = in.nextInt();
			
			long result = new CountingSheep().solve(N);
			
			System.out.printf("Case #%d: %s\n", t+1, result == -1? "INSOMNIA" : result);
		}
		
		in.close();
	}
}
