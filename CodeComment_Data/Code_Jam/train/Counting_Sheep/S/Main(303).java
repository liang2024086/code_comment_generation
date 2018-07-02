package methodEmbedding.Counting_Sheep.S.LYD858;


import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		int T = sc.nextInt();
		for(int test_case=1; test_case<=T; test_case++) {
			int N = sc.nextInt();
			if(0 == N) {
				System.out.println("Case #"+test_case+": " + "INSOMNIA");
				continue;
			}
			
			
			int checked = 0;
			boolean[] checkbox = new boolean[10];
			for(int i=0; i<10; i++) {
				checkbox[i] = false;
			}
			
			for(int i=1; i<100000; i++) {
				int currentNum = N*i;
				String currentNumStr = Integer.toString(currentNum);
				for(int j=0; j<currentNumStr.length(); j++) {
					int tryCheckIndex = currentNumStr.charAt(j) - '0';
					if(!checkbox[tryCheckIndex]) {
						checkbox[tryCheckIndex] = true;
						checked++;
					}
					if(checked == 10) {
						break;
					}
				}
				if(checked == 10) {
					System.out.println("Case #"+test_case+": " + currentNum);
					break;
				}
			}
		}
	}
}
