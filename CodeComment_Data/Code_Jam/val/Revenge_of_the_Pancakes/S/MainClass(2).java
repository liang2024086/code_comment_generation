package methodEmbedding.Revenge_of_the_Pancakes.S.LYD104;


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

// Counting Sheep
//	public static void main(String[] args){
//		Scanner in = new Scanner(System.in);
//		int T = in.nextInt();
//
//		for(int t=0; t<T; t++){
//			
//			int N = in.nextInt();
//			
//			long result = new CountingSheep().solve(N);
//			
//			System.out.printf("Case #%d: %s\n", t+1, result == -1? "INSOMNIA" : result);
//		}
//		
//		in.close();
//	}
	
	// Pancake
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		in.nextLine();
		
		for(int t=0; t<T; t++){
			
			String s = in.nextLine();
			
			int result = new Pancake().solve(s);
			
			System.out.printf("Case #%d: %d\n", t+1, result);
		}
		
		in.close();
	}
}
