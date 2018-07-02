package methodEmbedding.Cookie_Clicker_Alpha.S.LYD156;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class JAM_B 
{
	public static double INITIAL_RATE =2.0;
	public static void main(String[] args) throws FileNotFoundException
	{
//		Scanner sc = new Scanner(System.in);
//		Scanner sc = new Scanner(new FileInputStream("D:/Users/????/workspace/JAM_B/src/input.txt"));
		Scanner sc = new Scanner(new FileInputStream("D:/Users/????/workspace/JAM_B/src/B-small-attempt0.in"));
//		Scanner sc = new Scanner(new FileInputStream("D:/Users/????/workspace/JAM_B/src/B-large-attempt0.in"));
		PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
		System.setOut(out);
		int TEST_CASE_NUMBER = sc.nextInt();
//		System.out.println(TEST_CASE_NUMBER);
		
		for(int test_case = 1;test_case <= TEST_CASE_NUMBER;test_case++)
		{
			String str = sc.next();
			//CHANCE_TO_OBTAIN_EXTRA_RATE
			double C = Double.parseDouble(str);

//			//EXTRA_RATE
			str = sc.next();
			double F = Double.parseDouble(str);
//			//GOAL_SCORE
			str = sc.next();
			double X = Double.parseDouble(str);
//			System.out.println(C+" "+F+" "+X);
			
			double Answer = 0.0;
			double current_rate = INITIAL_RATE;
			ArrayList<Double> timeList = new ArrayList<Double>(); 
			while((X - C + F*(X-C)/current_rate)> X)
			{
				timeList.add(C/current_rate);
				current_rate +=F;				
			}
			
			timeList.add(X/current_rate);
			for(Double element: timeList)
			{
				Answer += element; 
			}
			
			System.out.println("Case #"+test_case+": "+Answer);
		}
	}

}
