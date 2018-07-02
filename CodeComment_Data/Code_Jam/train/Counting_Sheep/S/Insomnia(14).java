package methodEmbedding.Counting_Sheep.S.LYD1504;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class Insomnia {
	
	public static void main(String args[]) throws Exception {
		//Scanner in = new Scanner(System.in);
	
		
		Scanner in = new Scanner(new File("input.in"));
		
		PrintWriter writer = new PrintWriter(new FileOutputStream("B.out"));
		int T = in.nextInt();
		//System.out.println(T);
		in.nextLine();
		
		for (int i = 0; i < T; i++) {
			int number= in.nextInt();
			String text="0123456789";
			int x=1;
			int aa=x*number;
			//System.out.println(number);
			while (true) {
				for (int j = 0; j < String.valueOf(aa).length(); j++) {
					//System.out.println(text+"- "+String.valueOf(aa).charAt(j)+"");
					text= text.replace(String.valueOf(aa).charAt(j)+"", "");
					
				}
				
				
				
				
				if (x==1000) {
					break;
				}
				if (text.length()==0) {
					break;
				}
				x++;
				aa = number*x;
			}
			
			
			
			//int[] number= new int[max];
			//String charnumber=in.nextLine().trim(); 
				
			//System.out.println("Case #"+(i+1)+": "+ans);
			//writer.println("Case #"+(i+1)+": "+ans);
			if (x==1000) {
				System.out.println("Case #"+(i+1)+": INSOMNIA");
				writer.println("Case #"+(i+1)+": INSOMNIA");
			}else {
				System.out.println("Case #"+(i+1)+": "+aa);
				writer.println("Case #"+(i+1)+": "+aa);
			}
			
			
		}
		in.close();
		writer.close();
	}

}
