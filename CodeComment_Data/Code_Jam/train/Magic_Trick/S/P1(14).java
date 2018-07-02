package methodEmbedding.Magic_Trick.S.LYD2232;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	

		int T = sc.nextInt();
		int n1, n2;
		List<Integer> c1 = new ArrayList<Integer>();
		List<Integer> c2 = new ArrayList<Integer>();
		List<Integer> v = new ArrayList<Integer>();
		for(int i = 1; i <= T ; i++){
			c1.clear();
			c2.clear();
			v.clear();
			n1 = sc.nextInt();
			for(int j = 0; j < 16; j++){
				int n = sc.nextInt();
				if(j/4 == n1 - 1){
					c1.add(n);
				}
			}
			
			n2 = sc.nextInt();
			for(int j = 0; j < 16; j++){
				int n = sc.nextInt();
				if(j/4 == n2 - 1){
					c2.add(n);
				}
			}
			
			
			for(int x : c1){
				if(c2.contains(x)){
					v.add(x);
				}
			}
			
			if(v.size() == 1)
				System.out.println("Case #"+ i + ": " + v.get(0));
			else if(v.size() > 1)
				System.out.println("Case #"+ i + ": Bad magician!");
			else 
				System.out.println("Case #"+ i + ": Volunteer cheated!");
			
			
		}
		

	}

}
