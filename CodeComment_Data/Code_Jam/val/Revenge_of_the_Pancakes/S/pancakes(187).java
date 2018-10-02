package methodEmbedding.Revenge_of_the_Pancakes.S.LYD854;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class pancakes {

	/**
	 * @param args
	 */
	static String INPUT_LOCATION = "C:\\Users\\srihari\\workspace\\codejam2016\\";
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(new FileReader(INPUT_LOCATION
//				+ "A-large.in"));
//		PrintWriter pw = new PrintWriter(new FileWriter(INPUT_LOCATION
//				+ "A-large.in.out"));
		
		Scanner sc = new Scanner(new FileReader(INPUT_LOCATION
				+ "B-small-attempt0.in"));
		PrintWriter pw = new PrintWriter(new FileWriter(INPUT_LOCATION
				+ "B-small-attempt0.in.out"));
		 
		//Scanner sc=new Scanner(System.in);
		int cnttests = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cnttests; i++) 
			{
				String pancakes = sc.nextLine();
				int result =0;
				char initial = pancakes.charAt(0);
				for(int item =0;item < pancakes.length();item++)
				{
				    if(initial != pancakes.charAt(item)){
				    	result ++;				    
				    	initial = pancakes.charAt(item);
				    }
				}
				if(initial =='-')
				{
				   
					String formatted = String.format("%d", result+1);
				    //System.out.println("Case #"+(i+1)+": "+ formatted);
				    pw.println("Case #"+(i+1)+": "+ formatted);
				}
				else
				{
					
					String formatted = String.format("%d", result);	
					//System.out.println("Case #"+(i+1)+": "+formatted);
					pw.println("Case #"+(i+1)+": "+formatted);
				}
			}
			
		pw.flush();
		pw.close();
		sc.close();

	   }
}
