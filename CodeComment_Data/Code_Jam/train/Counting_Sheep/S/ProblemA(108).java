package methodEmbedding.Counting_Sheep.S.LYD159;

import java.util.*;

public class ProblemA {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); 
		for (int i=0; i<t; i++) {
			long n = sc.nextInt();
			long ans = 0;
			int cnt = 0;
			if(n==0) {
				System.out.printf("Case #%d: INSOMNIA%n",i+1);
			} else {
				int k = 1;
				ArrayList<Integer> digit = new ArrayList<Integer>();
				for(int j=0; j<10;j++) {
					digit.add(j);
				}
				while (cnt != 10) {
					long num = n*k;
					ans = num;
					//System.out.println("n = " + num +" ans = "+ans);
					while(num!=0) {
						for(int j=0; j<digit.size();j++) {
							if ( num % 10 == (int)digit.get(j)) {
							cnt++;
							//System.out.println("found number + "+digit.get(j));
							digit.remove(j);
							}
						}
						num = num/10;
					}
					k++;
					//System.out.println("n = " + num);
				}
				System.out.printf("Case #%d: %d%n",i+1,ans);
			}
		}
	}

}
