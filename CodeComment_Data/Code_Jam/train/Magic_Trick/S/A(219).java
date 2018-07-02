package methodEmbedding.Magic_Trick.S.LYD228;

import java.util.*;


public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int counter = 1; counter <= t; counter++){
			int r1 = sc.nextInt();
			Set<Integer> l1 = new HashSet<Integer>();
			for(int i = 1; i<5; i++){
				for(int j = 0; j<4; j++){
					int tmp = sc.nextInt();
					if(r1 == i)
						l1.add(tmp);
				}
			}
			int r2 = sc.nextInt();
			Set<Integer> l2 = new HashSet<Integer>();
			for(int i = 1; i<5; i++){
				for(int j = 0; j<4; j++){
					int tmp = sc.nextInt();
					if(r2 == i)
						l2.add(tmp);
				}
			}
			l1.retainAll(l2);
			if(l1.size() == 1){
				for(Integer onlyone : l1)
					System.out.println("Case #" + counter +": "+ onlyone);
			} else if(l1.size() == 0){
				System.out.println("Case #" + counter + ": Volunteer cheated!");
			} else{
				System.out.println("Case #" + counter + ": Bad magician!");
			}
		}
	}


}
