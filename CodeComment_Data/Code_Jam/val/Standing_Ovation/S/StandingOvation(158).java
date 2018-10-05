package methodEmbedding.Standing_Ovation.S.LYD124;


import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class StandingOvation {
	
	public static void main(String [] args) throws FileNotFoundException{
		Scanner in = new Scanner(System.in);
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("E:\\output.txt"))));
		int T = in.nextInt();
		for(int i=0;i<T;i++){
			int Smax = in.nextInt();
			String S = in.nextLine().split(" ")[1];
//			System.out.println(">>>"+S+"<<<");
			int ans = 0;
			int sum = 0;
			for(int j=0;j<=Smax;j++){
				if(S.charAt(j)!='0'){
					if(sum >= j){
//						System.out.println(j+" "+sum+"*");
					}
					else{
						ans = ans + j - sum;
//						System.out.println(j+" "+ans);
						sum = j;
					}
				}
				sum = sum + S.charAt(j) -'0';
			}
			
			System.out.println("Case #"+(i+1)+": "+ans);
		}
		System.out.close();
	}

}
