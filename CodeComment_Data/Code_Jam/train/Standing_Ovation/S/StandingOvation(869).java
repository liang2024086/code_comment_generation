package methodEmbedding.Standing_Ovation.S.LYD1558;

import java.util.Scanner;

public class StandingOvation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//System.out.println("Give no of Test cases");
		int T=sc.nextInt();//no of test cases
		int[] result=new int[T];
		int k=0;
		if(T<=100 && T>=1){
			while(k<T){
				int maxShyness=sc.nextInt();
				String sInput=sc.next();
				int[] numberOfShyPeople= new int [maxShyness+1];
				int extraPeople=0;
				numberOfShyPeople[0]=(sInput.charAt(0)-'0');
				for(int i=1;i<=maxShyness;i++){
					int shyPeople=(sInput.charAt(i)-'0');
					//if no of people is greater than the required people then add the difference
					int addFriends=0;
					if(i>numberOfShyPeople[i-1]){
						addFriends=i-numberOfShyPeople[i-1];
					}
					numberOfShyPeople[i]=numberOfShyPeople[i-1]+shyPeople+addFriends;
					extraPeople+=addFriends;
				}
				result[k]=extraPeople;
				k++;
			}
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println("Case #"+(i+1)+": "+result[i]);
		}
		sc.close();
	}
}
