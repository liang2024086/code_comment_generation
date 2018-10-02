package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1280;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		File file = new File("C:\\Users\\maggiomj\\Desktop\\B-small-attempt0.in");
		Scanner scanner;
		
		File outFile = new File("C:\\Users\\maggiomj\\Desktop\\B-small-out.txt");
	
		final String NL = System.getProperty("line.separator");  
			
			
			try {
				FileOutputStream outStream = new FileOutputStream(outFile);
				scanner = new Scanner(file);

				int n = scanner.nextInt();
				
				for(int i = 0; i < n; i++)
				{
					double c = scanner.nextDouble();
					double f = scanner.nextDouble();
					double x = scanner.nextDouble();
					
					double baseRate = 2;
					double answer = x/baseRate;
					
					for(int j =0; j < Math.round(x/c); j++)
					{
						double rate = baseRate;
						double mathystuff = 0;
						
						for(int k=0;k<j;k++)
						{
							mathystuff += c/rate;
							rate += f;
						}
						mathystuff += x/rate;
						
						if(mathystuff < answer)
						{
							answer = mathystuff;
						}
					}
					
					String ans = "Case #"+(i+1)+": " + Double.toString(answer);
					
					System.out.println(ans);
					
					outStream.write(ans.getBytes());
					outStream.write(NL.getBytes());
				}
					
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
