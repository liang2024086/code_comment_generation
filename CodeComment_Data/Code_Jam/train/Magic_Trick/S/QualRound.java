package methodEmbedding.Magic_Trick.S.LYD314;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.TreeMap;


public class QualRound {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int t_cases = sc.nextInt();
		for(int t=1;t<=t_cases;t++){
			int fr = sc.nextInt();
			TreeMap<Integer, Integer> map1 = new TreeMap<Integer, Integer>();
			TreeMap<Integer, Integer> map2 = new TreeMap<Integer, Integer>();
			for(int j =1;j<=4;j++){
				for(int k =1;k<=4;k++){
					int a = sc.nextInt();
					if(j==fr){
						map1.put(a, fr);
					}
				}
			}
			int se = sc.nextInt();
			for(int j =1;j<=4;j++){
				for(int k =1;k<=4;k++){
					int a = sc.nextInt();
					if(j==se){
						map2.put(a, se);
					}
				}
			}
			int count = 0;
			int ans = -1;
			for(int e :map1.keySet()){
				if(map2.containsKey(e)){
					count++;
					ans = e;
				}
			}
			if(count>1){
				System.out.println("Case #" +t+ ": Bad magician!");
			}
			else if(count==0){
				System.out.println("Case #" +t+": Volunteer cheated!");
			}
			else{
				System.out.println("Case #"+t+": " +ans);
			}
		} 
		sc.close();

	}

}
