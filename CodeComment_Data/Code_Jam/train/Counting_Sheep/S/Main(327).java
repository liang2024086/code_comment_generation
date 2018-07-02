package methodEmbedding.Counting_Sheep.S.LYD1378;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
	static int[] Seen = new int[10];
	static int T;
	static int N; 
	
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("src/qualification/a_countingsheep/A-small-attempt0.in"));
		System.setOut(new PrintStream("src/qualification/a_countingsheep/A-small-attempt0.out"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		
		for(int test_case = 1; test_case <= T; test_case++){
			for(int i = 0; i < 10; i++){
				Seen[i] = 0;
			}
			N = Integer.parseInt(br.readLine());
			
			long tempNum = 0;
			long num = N;
			long count = 0;
			while(num != tempNum){
				String numString = Long.toString(num);
				for(int i = 0; i < numString.length(); i++){
					int digit = numString.charAt(i)-'0';
					if(Seen[digit]==0){
						Seen[digit] = 1;
						count++;
					}
				}
				if(count == 10) break;
				else {
					tempNum = num;
					num += N;
				}
			}
			if(num == tempNum) System.out.println("Case #"+test_case+": INSOMNIA");
			else System.out.println("Case #"+test_case+": "+num);
		}
	}
}
