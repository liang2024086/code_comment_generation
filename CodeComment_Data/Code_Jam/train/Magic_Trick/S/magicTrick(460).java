package methodEmbedding.Magic_Trick.S.LYD1345;

/**
 * 
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * @author dekannan
 *
 */
public class magicTrick {

	private static BufferedReader readfile;
	private static String r;
	

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int row = 4;
		int col = 4;
		readfile = new BufferedReader(new FileReader("/Users/dekannan/Documents/codejam/codejam/src/codejam/input.txt"));
		r = readfile.readLine();
		int count = Integer.parseInt(r);
		int count1 = count;
		ArrayList<String> result1;
		ArrayList<String> result2;
		ArrayList<String> result;
		String strresult1[] = null;
		String strresult2[] = null;
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(new File("/Users/dekannan/Documents/codejam/codejam/src/codejam/output1.txt")));  
		PrintWriter writer = new PrintWriter(osw);
		while(count!=0)
		{
			count--;
			result1 = new ArrayList<String>();
			int answer1 =  Integer.parseInt(readfile.readLine());
			int loop1=1;
			while (loop1!=5)
			{	
				r = readfile.readLine();
				if(loop1 == answer1)
				{
					 strresult1 = r.split(" ");
					
				}
				loop1++;
			}

			result2 = new ArrayList<String>();
			int answer2 =  Integer.parseInt(readfile.readLine());
			int loop2=1;
			while (loop2!=5)
			{	
				r = readfile.readLine();
				if(loop2 == answer2)
				{
					strresult2 = r.split(" ");
				}
				loop2++;
			}
			result = new ArrayList<String>();
			for(String temp: strresult1)
			{
				for(String temp1 : strresult2)
				{
					if(temp1.equals(temp))
					{
						result.add(temp);
					}
				}
			}
			System.out.print("Case #"+(count1-count)+": ");

			writer.print("Case #"+(count1-count)+": ");
			if(result.size() == 1)
			{
				System.out.println(result.get(0));
				writer.println(result.get(0));
			}
			else if (result.size() > 1)
			{
				System.out.println("Bad magician!");
				writer.println("Bad magician!");
			}
			else if(result.size()==0)
			{
				System.out.println("Volunteer cheated!");
				writer.println("Volunteer cheated!");
			}
			
		}
		writer.close();
	}

}
