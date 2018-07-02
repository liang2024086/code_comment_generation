package methodEmbedding.Counting_Sheep.S.LYD156;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		
		int l=0;
			while(t-->0){
				l++;
				int arr[]= new int[10];
				Arrays.fill(arr, -1);

				int n=sc.nextInt();
				long tem=n;
				
			
				boolean f = true;
				for (int i = 1; i < 100; i++) {
					tem=n*i;
					//System.out.println("tem  "+tem);
					while(tem>0){
						long d=tem%10;
						//System.out.println("d "+d);
						arr[(int)d]=1;
						tem/=10;
					}
					 f=true;
					for (int j = 0; j < arr.length; j++) {
						if(arr[j]==-1){
						//	System.out.println(arr[j]);
							f=false;
						}
						
					}
					if(f){
						tem=n*i;
						break;}
					
					
				}
				if(f){
					System.out.printf("Case #%d: %d\n",l,tem);
				}
				else
					System.out.printf("Case #%d: INSOMNIA\n",l);
				
				
			}
		
		
	}

}
