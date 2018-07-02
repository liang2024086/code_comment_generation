package methodEmbedding.Standing_Ovation.S.LYD1783;

import java.util.Scanner;


public class StandingOviation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=1;i<T+1;i++){
			int shyMax = sc.nextInt();
			int people = sc.nextInt();
			int friendCount = 0;
			int level = (int)Math.pow(10,shyMax);
			
			int standCount = people/level;
			int currentShyLevel = 1;
			int temp = people%level;
			level/=10;
			while(temp>0){
				if(standCount<currentShyLevel && temp/level!=0){
					friendCount += currentShyLevel-standCount;
					standCount += currentShyLevel-standCount;
				}
				standCount += temp/level;
				temp%=level;
				level/=10;
				currentShyLevel++;
			}
		
			System.out.println("Case #"+i+": "+friendCount);			
		}
	}

}
