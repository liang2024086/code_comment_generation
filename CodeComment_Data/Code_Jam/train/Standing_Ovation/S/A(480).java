package methodEmbedding.Standing_Ovation.S.LYD1101;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class A {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(new BufferedReader(new FileReader("A.in")));
		PrintStream out = new PrintStream("A.out");
		int T = in.nextInt();
		String line = in.nextLine();
		for(int t=0;t<T;t++){
			line = in.nextLine();
			String[] arr = line.split(" ");
			int S = Integer.parseInt(arr[0]);
			int ans = 0;
			int sum = 0;
			for(int s=0; s<=S; s++){
				if (sum<s){
					ans += s-sum;
					sum = s;
				}
				int n = arr[1].charAt(s)-'0';
				sum += n;
			}
			out.println("Case #"+(t+1)+": "+ans);
		}
		in.close();
		out.close();
	}

}
