package methodEmbedding.Standing_Ovation.S.LYD1722;



import java.util.ArrayList;
import java.util.Scanner;

public class StandingOvation {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int S;
		int a;
		int k, k1;
		int m = 1;
		int count = 0,count1 = 0;
		int b = 0;
		ArrayList<String> Shy = new ArrayList<String>();
		ArrayList<String> person = new ArrayList<String>();
		for(int i=0;i<T;i++){
			person.add(s.next());
			Shy.add(s.next());
		}
		for(int j=0;j<T;j++){
			S = Integer.parseInt(Shy.get(j));
			k = Shy.get(j).length();
			while(k>0){
				a = S%10;
				S = S/10;
				b = a+b*10;
				k--;
			}
			count = b%10;
			while(b>0){
				//k = b%10;
				b = b/10;
				k1 = b%10;
				
				if(count>=m){
					count = k1 + count;
					m++;
				}
				else{
					count1++;
					count = k1 + count;
				}
				
			}
			System.out.println("Case #" + (j+1)+": "+count1);
			count1 = 0;
			m = 1;
		}
	}

}
