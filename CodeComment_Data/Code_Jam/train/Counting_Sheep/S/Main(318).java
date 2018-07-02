package methodEmbedding.Counting_Sheep.S.LYD32;

import java.util.*;
class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Boolean bo = false; 
		int i = 1,y=1;
		while(t-->0)
		{
			y = 1;
			bo = false; 
			long n = sc.nextLong();
			int arr[] = new int[10];
			String s ="";
			s = n+"";
			while(!bo && n!=0){
				long num = n;
				for(int j=0;j<s.length();j++){
					arr[(int)s.charAt(j)-48]++;
				}
				for(int j=0;j<arr.length;j++){
					if(arr[j]==0){
						bo=false;
						break;
					}else{
						bo = true;
					}
					
				}
				if(bo)
					break;
				y++;
				num = n * y;
				s = num+"";
			}
			
			if(!bo || n==0)
				System.out.println("Case #"+i+": INSOMNIA");
			else
				System.out.println("Case #"+i+": "+n*y);
			
			i++;
			
		}
		
	}
}
