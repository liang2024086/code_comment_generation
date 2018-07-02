package methodEmbedding.Counting_Sheep.S.LYD913;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		TreeSet<Integer> data = new TreeSet<Integer>(); 
		String result = "Case #";
		int t = in.nextInt();
		for (int i = 1; i <= t; ++i) {
			long n = in.nextLong();
			long k = n;
			while(k>0){
				data.add((int)k%10);
				k /= 10;
			}
			for (long j = 2,m = n ;; j++) {
				m = n * j;
				if (m == n) {
					result += i + ": " + "INSOMNIA";
					break;
				}
				
				while(m>0){
					data.add((int)m%10);
					m /= 10;
				}
				if(data.size() == 10){
					result += i + ": " + n*j;
					break;
				}
			}
			System.out.println(result);
			data.clear();
			result = "Case #";
		}
		in.close();
	}
}
