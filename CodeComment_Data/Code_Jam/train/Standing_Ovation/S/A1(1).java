package methodEmbedding.Standing_Ovation.S.LYD397;



import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int max = sc.nextInt();
			int ans = 0;
			String st = sc.next();
			char[] ar = st.toCharArray();
			int pr = 0;
			for (int j = 0; j < ar.length; j++) {
				int x = ar[j]-'0';
				if(x==0)
					continue;
				if(pr < j){
					ans += j- pr;
					pr = j+x;					
				}else{
					pr += x;
				}
			}
			System.out.println("case #" + (i+1) + ": " + ans);
		}	
	}
}
