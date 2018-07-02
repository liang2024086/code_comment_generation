package methodEmbedding.Magic_Trick.S.LYD1898;

import java.util.Scanner;


public class Magician1 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			int no = in.nextInt();
		
			for(int i=0;i<no;i++)
			{
				int choose = in.nextInt();
				int c[][] = new int[4][4];
				for(int a=0;a<4;a++)
				{
					for(int b=0;b<4;b++)
					{
						c[a][b] = in.nextInt();
						
					}
					
				}
				int choose2 = in.nextInt();
				int c2[][] = new int[4][4];
				for(int a=0;a<4;a++)
				{
					for(int b=0;b<4;b++)
					{
						c2[a][b] = in.nextInt();
						
					}
					
				}
				int counter=0;
				int n=0;
				for(int a=0;a<4;a++)
				{
					for(int b=0;b<4;b++)
					{
						if(c[choose-1][a]==c2[choose2-1][b])
						{
							counter++;
							n=c2[choose2-1][b];
						}
						
					}
					
				}
				if(counter==1)
				{
					System.out.println("Case #" + (i+1) +": " + n);
				}
				else if(counter>1)
				{
					System.out.println("Case #" + (i+1) +": Bad magician!");
				}
				else
				{
					System.out.println("Case #" + (i+1) +": Volunteer cheated!");
				}
			}

	}
}
