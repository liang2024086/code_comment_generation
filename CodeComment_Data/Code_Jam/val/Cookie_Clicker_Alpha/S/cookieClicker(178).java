package methodEmbedding.Cookie_Clicker_Alpha.S.LYD536;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class cookieClicker {

	private static PrintWriter writer;
	private static BufferedReader readfile;
	private static String r;
	private static OutputStreamWriter osw;

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		osw = new OutputStreamWriter(new FileOutputStream(new File("/Users/dekannan/Documents/codejam/codejam/src/codejam/output2.txt")));  
		writer = new PrintWriter(osw);
		readfile = new BufferedReader(new FileReader("/Users/dekannan/Documents/codejam/codejam/src/codejam/input.txt"));
		r = readfile.readLine();
		int count = Integer.parseInt(r);
		int count1 = count;
		
		while(count!=0)
		{
			count--;
			String strinput = readfile.readLine();
			String[] inputs = strinput.split(" ");
			double C = Float.parseFloat(inputs[0]);
			double F = Float.parseFloat(inputs[1]);
			double X = Float.parseFloat(inputs[2]);
			//System.out.println(C + " " +  F + " " + X);
			
			double currcookiecount = 0;
			double timetocurrcookiecount = 0;
			double timetoxfromcurrcookiecount =0;
			double timetoxfromnextcookiecount =0;
			double currentcookierate =2;
			
			while(timetoxfromcurrcookiecount >= timetoxfromnextcookiecount )
			{
				timetoxfromcurrcookiecount = (X/currentcookierate) + timetocurrcookiecount;
				timetoxfromnextcookiecount = (X/(currentcookierate+F)) + timetocurrcookiecount + (C/currentcookierate);
				currcookiecount++;
				timetocurrcookiecount += C/currentcookierate;
				currentcookierate += F;	
			}
			System.out.println("Case #"+(count1-count)+": "+ timetoxfromcurrcookiecount);
			writer.println("Case #"+(count1-count)+": "+ timetoxfromcurrcookiecount);
		}
		writer.close();
		
	}

}
