package methodEmbedding.Counting_Sheep.S.LYD756;

import java.util.*;
class codeJam{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int count = 1;
		while(t>0){
			int n = s.nextInt();
			if(n==0){
				System.out.println("Case #"+count+": "+"INSOMNIA");
				t--;count++;
				continue;
			}
			Set<Integer> set = new HashSet<Integer>();
			for(int i=1;true;i++){
				int temp = i*n;
				while(temp>0){
					set.add(temp%10);temp /= 10;
				}
				if(set.size()==10){
					System.out.println("Case #"+count+": "+i*n);
					break;
				}
			}
			t--;	
			count++;
		}
	}
}
