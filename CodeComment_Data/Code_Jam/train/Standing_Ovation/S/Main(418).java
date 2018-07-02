package methodEmbedding.Standing_Ovation.S.LYD670;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//System.out.println("Give no of Test cases");
		int T=sc.nextInt();//no of test cases
		int[] result=new int[T];
		int k=0;
		if(T<=100 && T>=1){
			while(k<T){
				int smax=sc.nextInt();//smax for that testcase
				String sInput=sc.next();
				//System.out.println(sInput);
				int[] shynesslevel= new int [smax+1];
				int countshyness=0;
				int totalFriendsAdded=0;
				shynesslevel[0]=(sInput.charAt(0)-'0');
				for(int i=1;i<=smax;i++){
					int shyPeople=(sInput.charAt(i)-'0');
					//if no of people is greater than the required people then add the difference
					int addFriends=0;
					if(i>shynesslevel[i-1]){
						addFriends=i-shynesslevel[i-1];
					}
					shynesslevel[i]=shynesslevel[i-1]+shyPeople+addFriends;
					totalFriendsAdded+=addFriends;
					
					//countshyness+=shynesslevel[i];
				}
				result[k]=totalFriendsAdded;
			//	System.out.println();
				k++;

			
			}
			
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println("Case #"+(i+1)+": "+result[i]);
		}
			
		
	}

}
