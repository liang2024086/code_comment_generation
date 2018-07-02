package methodEmbedding.Counting_Sheep.S.LYD81;



import java.util.Scanner;

public class CountingSheep {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();		
		for(int z = 1; z <= t; z++){
			
			int n = in.nextInt();
			int[] arr = new int[1000];
			int x = n;
			int i = 0;
			int ans = 0;
			
			while(x > 0){
				arr[i++] = x%10;				
				ans |= 1<<(x%10);
				x = x/10;
			}
			int curr[] = new int[i];
			for(int j = 0 ; j < i ; j++) curr[j] = arr[j];
			
			int A = (1<<10)-1;
			
			if(i == 0){
				System.out.println("Case #"+z+": INSOMNIA");
			}
			else{
				
				while(ans != A){
					int carry = 0;
					for(int j = 0; j < curr.length; j++){
						arr[j] += curr[j]+carry;
						carry = arr[j]/10;
						arr[j] = arr[j]%10;
						ans |= 1<<(arr[j]);
					}
					if(carry > 0){
						int j = curr.length;
						while(carry > 0){
							arr[j] += carry;
							carry = arr[j]/10;
							arr[j] = arr[j]%10;
							ans |= 1<<(arr[j]);
							j++;
						}
						if(j > i) i = j;
					}					
				}
				System.out.print("Case #"+z+": ");
				for(int j = i-1; j >= 0; j--){
					System.out.print(arr[j]);
				}
				System.out.println();
			}
			
		}
	}
}
