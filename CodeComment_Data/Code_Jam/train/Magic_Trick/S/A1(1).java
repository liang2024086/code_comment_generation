package methodEmbedding.Magic_Trick.S.LYD407;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.StringTokenizer;


public class A1 {

	public static void main (String [] args) throws FileNotFoundException
	{
		
		PrintStream out = new PrintStream(new FileOutputStream("output.out"));
		System.setOut(out);

		int T;
		Scanner keyboard = new Scanner(new File("C:\\A-small-attempt1.in"));
		T = keyboard.nextInt();

		for(int i=1;i<=T;i++)
		{

			int[] A = new int[4];
			int[] B = new int[4];
			int count = 0;
			int answer = 0;
			int R1;
			R1 = keyboard.nextInt();
			String d = keyboard.nextLine();
			String L1 = keyboard.nextLine();
			String L2 = keyboard.nextLine();
			String L3 = keyboard.nextLine();
			String L4 = keyboard.nextLine();


			if (R1 == 1)
			{
				StringTokenizer st = new StringTokenizer(L1);
				int m = 0;
				while (st.hasMoreElements()) 
				{
					String temp = (String) (st.nextElement());
					A[m]= Integer.parseInt(temp);
					m++;
				}
			}
			else if (R1 == 2)
			{
				StringTokenizer st = new StringTokenizer(L2);
				int m = 0;
				while (st.hasMoreElements()) 
				{
					String temp = (String) (st.nextElement());
					A[m]= Integer.parseInt(temp);
					m++;
				}
			}
			else if (R1 ==3)
			{
				StringTokenizer st = new StringTokenizer(L3);
				int m = 0;
				while (st.hasMoreElements()) 
				{
					String temp = (String) (st.nextElement());
					A[m]= Integer.parseInt(temp);
					m++;
				}
			}
			else if (R1 ==4)
			{
				StringTokenizer st = new StringTokenizer(L4);
				int m = 0;
				while (st.hasMoreElements()) 
				{
					String temp = (String) (st.nextElement());
					A[m]= Integer.parseInt(temp);
					m++;
				}
			}


			int R2;
			R2 = keyboard.nextInt();
			d = keyboard.nextLine();
			L1 = keyboard.nextLine();
			L2 = keyboard.nextLine();
			L3 = keyboard.nextLine();
			L4 = keyboard.nextLine();


			if (R2 ==1)
			{
				StringTokenizer st = new StringTokenizer(L1);
				int m = 0;
				while (st.hasMoreElements()) 
				{
					String temp = (String) (st.nextElement());
					B[m]= Integer.parseInt(temp);
					m++;
				}
			}
			else if (R2 ==2)
			{
				StringTokenizer st = new StringTokenizer(L2);
				int m = 0;
				while (st.hasMoreElements()) 
				{
					String temp = (String) (st.nextElement());
					B[m]= Integer.parseInt(temp);
					m++;
				}
			}
			else if (R2 ==3)
			{
				StringTokenizer st = new StringTokenizer(L3);
				int m = 0;
				while (st.hasMoreElements()) 
				{
					String temp = (String) (st.nextElement());
					B[m]= Integer.parseInt(temp);
					m++;
				}
			}
			else if (R2 ==4)
			{
				StringTokenizer st = new StringTokenizer(L4);
				int m = 0;
				while (st.hasMoreElements()) 
				{
					String temp = (String) (st.nextElement());
					B[m]= Integer.parseInt(temp);
					m++;
				}
			}

			for(int k=0;k<4;k++)
			{
				for(int j=0;j<4;j++)
				{
					if(A[k]==B[j])
					{
						count++;
						answer=A[k];
					}
				}

			}

			if (count==1)
			{
				System.out.println("Case #"+i+": "+answer);
			}
			else if (count>1)
			{
				System.out.println("Case #"+i+": "+"Bad magician!");
			}
			else
			{
				System.out.println("Case #"+i+": "+"Volunteer cheated!");
			}
		}
		
		

	}
	
	
}





