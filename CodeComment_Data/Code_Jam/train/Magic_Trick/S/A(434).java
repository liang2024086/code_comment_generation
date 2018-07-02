package methodEmbedding.Magic_Trick.S.LYD2045;

import java.util.*;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int t=1;t<=T;t++)
		{
			int row1 = scan.nextInt();
			int array[] = new int[4];
			for(int i=0;i<4;i++)
				for(int o=0;o<4;o++)
				{
					
					if(i+1==row1)
					{
						array[o]=scan.nextInt();
					}
					else
						scan.nextInt();
				}
			/*for(int i=0;i<4;i++)
				System.out.println(array[i]);*/
			row1 = scan.nextInt();
			Boolean found=false;
			Boolean found2=false;
			int test=0;
			for(int i=0;i<4;i++)
				for(int o=0;o<4;o++)
				{
					if(i+1==row1)
					{
						int temp = scan.nextInt();
						for(int p=0;p<4;p++)
							if(array[p]==temp)
							{
								if(found)
									found2=true;
								found=true;
								test=temp;
							}
								
						
					}
					else scan.nextInt();
				}
			System.out.print("Case #"+t+": ");
			if(found&&found2)
				System.out.println("Bad magician!");
			else if(found)
				System.out.println(test);
			else
				System.out.println("Volunteer cheated!");
		}
		scan.close();
	}

}
