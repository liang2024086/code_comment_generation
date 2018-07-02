package methodEmbedding.Counting_Sheep.S.LYD440;

import java.util.HashMap;
import java.util.Scanner;


public class gcj1 {
	
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		
		int tc=sc.nextInt();
		int i=1;
		while(i<=tc){
			int num=sc.nextInt();
			int arr[]=new int[10];
			if(num==0){
				System.out.println("Case #"+i+": "+"INSOMNIA");
			}
				else
				{
					boolean all=false;
					int k=1;
					while(!all){
					
					int number=num*k;
					int copy=number;
					while(copy!=0){
						int rem=copy%10;
						copy/=10;
						arr[rem]=1;
					}
					k++;
					int yo=0;
					for(yo=0;yo<10;yo++){
						if(arr[yo]==1)
							continue;
						else
							break;
					}
					if(yo==10){
						all=true;
						System.out.println("Case #"+i+": "+number);}
					}
					
					
				}
			i++;
			}
		}
		
	}


