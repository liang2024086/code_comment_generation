package methodEmbedding.Counting_Sheep.S.LYD1717;

import java.util.*;
public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int test = sc.nextInt();
		sc.nextLine();
		for (int i=1;i<=test;i++)
		{
			int num = sc.nextInt();
			sc.nextLine();
			int number = num;
			if (num==0)
			{
				System.out.println("Case #"+ i + ": INSOMNIA");
				continue;
			}
			int count1=0,count5=0,count6=0,count7=0;
			int count2 =0,count8=0,count9=0,count0=0;
			int count3 =0;
			int count4=0;  
			int a=2;
			while(true)
			{
				
			int k=num;
			while (k!=0)
			{
				int r = k%10;
				//System.out.println(r);
				switch(r){
				case 0 : 
					count0++;
					break;
				case 1 :
					count1++;
					break;
				case 2 : 
					count2++;
					break;
				case 3 : 
					count3++;
					break;
				case 4 : 
					count4++;
					break;
				case 5 : 
					count5++;
					break;
				case 6 : 
					count6++;
					break;
				case 7 : 
					count7++;
					break;
				case 8 : 
					count8++;
					break;
				case 9 : 
					count9++;
					break;
					
				}
				k=k/10;
			}
			
			//System.out.println(count0);
			//System.out.println(count1);
			if (count0!=0&&count1!=0 && count2!=0 && count3!=0 && count4!=0 && count5!=0 && count6!=0 && count7!=0 && count8!=0 && count9!=0)
			{
				System.out.println("Case #" + i + ": "+ num);
				break;
			}
			
			num = number*(a);
			a++;
			
			//System.out.println("This is i "+a);
			//System.out.println(num);
			}
		}
		
		sc.close();

	}

}
