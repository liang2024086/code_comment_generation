package methodEmbedding.Counting_Sheep.S.LYD1602;

import java.util.*;

public class csheep {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int[] pwr={1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};
		
		int T=input.nextInt();
		
		for(int t=1;t<=T;t++){
			
			System.out.print("Case #" + t + ": ");
			
			int n=input.nextInt();
			
			int ct=1;
			
			boolean[] v=new boolean[10];
			
			while(ct<=10000){
				
				int tn=ct*n;
				int dig=1;
				
				while(tn>=10){
					tn/=10;
					dig++;
				}
				
				tn=ct*n;
			
				for(int i=0;i<dig;i++)					
					v[tn%pwr[i+1]/pwr[i]]=true;
				
				ct++;
				
				int ret=0;
				
				for(int i=0;i<10;i++)
					if(v[i])
						ret++;
				
				if(ret==10){
					System.out.println(tn);
					break;
				}
				
			}
			
			if(ct>10000)
				System.out.println("INSOMNIA");
			
		}
		
		input.close();

	}

}
