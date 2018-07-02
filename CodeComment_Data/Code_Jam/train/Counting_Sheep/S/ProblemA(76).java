package methodEmbedding.Counting_Sheep.S.LYD527;


import java.util.*;

public class ProblemA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] testCase = new int[t];
		int[] result = new int[t];
		boolean flag;
		
		for(int i = 0; i < t; i++){
			testCase[i] = sc.nextInt();
		}
		
		for(int j = 0; j < t; j++){
			List<Integer> digits = new ArrayList<>();
			for(int d = 0; d < 10; d++){
				digits.add(-1);
			}
//			int[] digits = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
			int count = 1;
			flag = true;
			while(flag){
				int n = testCase[j]*count;
				if(n==0) {result[j] = 0; break;}
				String temp = String.valueOf(n);
				while(temp.length()>=1){
					int a = Integer.valueOf(temp.substring(0, 1));
//					digits[a] = a;
//					System.out.println("a = "+ a );
					digits.set(a, a);
					if(temp.length()==1) temp = "";
					else temp = temp.substring(1);
				}
				for(int k = 0; k < 10; k++){
//					if(digits[k] == -1) break;
					if(digits.get(k)==-1){
//						System.out.println(digits);
						break;
					}
					else if(k==9&&digits.get(k)!=-1) {
						result[j] = n;
						flag = false;
					}
				}
				count++;
			}
		}
		int count = 1;
		for(int re : result ){
			if(re==0) System.out.println("Case #"+ count + ": INSOMNIA");
			else System.out.println("Case #"+ count + ": " + re);
			count++;
		}
	}
}
