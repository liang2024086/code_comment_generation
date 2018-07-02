package methodEmbedding.Counting_Sheep.S.LYD450;

import java.util.Scanner;


public class First {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int x = 1; x <= t; x++) {
			int[] arr=new int[10];
			int n=sc.nextInt();
			int count=0,finite=0;
			int m=n,l=0,z=0;
			while(count!=10){
				finite++;
				 z=n;
				while(n!=0){
					 l=n%10;
					n=n/10;
					if(arr[l]!=1){
						arr[l]=1;
						count++;
						//System.out.println(l);
					}
				}
				n=(finite+1)*m;
				if(finite==100000)
					break;
				
			}
			
			if(finite==100000)
			System.out.println("Case #"+x+": INSOMNIA");
			else
				System.out.println("Case #"+x+": "+z);	
						
		}
			
		}
	
		
	}

