package methodEmbedding.Standing_Ovation.S.LYD1118;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;


public class ProblemA {
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		FileInputStream in=null;
		PrintStream out=null;
		try{
		 in=new FileInputStream(new File("prob.in"));
		 out=new PrintStream(new File("out.txt"));
		System.setIn(in);  
        System.setOut(out);  
		}catch(IOException e)
		{
			
		}
		Scanner i=new Scanner(System.in);
		int testcases=i.nextInt();
		int k=0;
		//System.out.println(testcases);
		int Smax;
		int y,ystand=0;
		int temp;
		while(testcases!=0)
		{
			y=0;
			ystand=0;
			Smax=i.nextInt();
			//System.out.println(Smax);
			String s=i.next();
			//System.out.println(s);
			for(int j=0;j<=Smax;j++)
			{
				temp=(int)s.charAt(j);
				temp-=48;
				ystand=ystand+temp;
				//System.out.println(ystand);
			if (ystand<=j) {
				y++;
				ystand++;
			}	
				
			}k++;
			System.out.println("Case #"+k+": "+y);
			
		
			
			testcases--;
		}
		i.close();
		out.close();
	}

}
