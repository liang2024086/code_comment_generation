package methodEmbedding.Magic_Trick.S.LYD2104;

import java.util.*;


public class MagicTrick {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T  = sc.nextInt();
		for(int t=0;t<T;t++){
			int N = sc.nextInt();
			for(int i=0;i<N;i++)
				sc.nextLine();
			Set<Integer> set = new HashSet<Integer>();
			for(int i=0;i<4;i++)
				set.add(sc.nextInt());
			for(int i=N;i<=4;i++)
				sc.nextLine();
			N = sc.nextInt();
			for(int i=0;i<N;i++)
				sc.nextLine();
			int count = 0;
			int store = 0;
			for(int i=0;i<4;i++){
				int r = sc.nextInt();
				if (set.contains(r)){
					count++;
					store = r;
				}
			}
			for(int i=N;i<=4;i++)
				sc.nextLine();
			String output = null;
			switch(count){
			case 0:
				output = "Volunteer cheated!";
				break;
			case 1:
				output = String.valueOf(store);
				break;
			case 2:
			case 3:
			case 4:
				output = "Bad magician!";
				break;
			}
			System.out.printf("Case #%d: %s\n",t+1,output);
		}
		sc.close();
	}

}
