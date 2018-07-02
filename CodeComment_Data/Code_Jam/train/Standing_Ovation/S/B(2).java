package methodEmbedding.Standing_Ovation.S.LYD919;

import java.util.Scanner;


class B {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int t= sc.nextInt();
	for (int i = 1; i <= t; i++) {
		int n=sc.nextInt();
		String a=sc.next();
		int ab[]=new int[n+1];
		int max=0;
		int in=0;
		int sum=0;
		for (int j = 0; j < a.length();j++) {
			ab[j]=a.charAt(j)-48;
			if(ab[j]>=max){
			max=ab[j];in=j;
			}
			
			
			
			
		}
		//System.out.println(in);
		for (int j = in; j >=0 ; j--) {
			sum+=ab[j];
			
						
		}
		int ans=0;
		//sum=sum-ab[in];
		//System.out.println(in);
		//System.out.println(sum);
	
	//System.out.println("Case #"+i+": "+ans);
		sum=ab[0];
		int max2=0;
		for (int j = 1; j < ab.length; j++) {
			if(sum>=j){
				//System.out.println("as");
				
				sum+=ab[j];
				
			}
			else{
				
				ans=j-sum;
				if(ans>max2)max2=ans;
				sum+=ab[j];
			
			}
			
			
			
			
		}
		System.out.println("Case #"+i+": "+max2);
		
		
		
	}
}
}
