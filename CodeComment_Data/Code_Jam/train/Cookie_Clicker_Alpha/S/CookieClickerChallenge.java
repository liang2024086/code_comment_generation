package methodEmbedding.Cookie_Clicker_Alpha.S.LYD315;

import java.util.*;
import java.io.*;

public class CookieClickerChallenge {

	public static void main(String[] args) throws IOException {

		// Object to write output to file

		FileOutputStream fos=new FileOutputStream("Output.txt");

		Scanner ob=new Scanner(System.in);

		// Number of test cases

		int t=Integer.parseInt(ob.nextLine());

		String output[]=new String[t];

		if(t>=1 && t<=100) {

		for(int i=0;i<t;i++) {

			double c=ob.nextDouble();

			double f=ob.nextDouble();

			double x=ob.nextDouble();

			// Checking limits

			if(c>=1.0 && c<=500.0 && f>=1.0 && f<=4.0 && x>=1.0 && x<=2000.0) {

			double cookieRate=2.0;

			double totalSec=0.0;

			double temp1=x/cookieRate;

			double temp2=(c/cookieRate)+(x/(cookieRate+f));

			// Check the max between time to get x cookies with current rate and next rate (after buying farm)

			while(temp1>temp2) {

				totalSec+=(c/cookieRate);

				cookieRate+=f;

				temp1=x/cookieRate;

				temp2=(c/cookieRate)+(x/(cookieRate+f));

			} 

			totalSec+=temp1;

			// To print output precison to 7 digits after decimal point

			String s=String.format("%.7f",totalSec);

			output[i]="Case #"+(i+1)+": "+s+"\n";

			}

		}

		for(int i=0;i<t;i++)

			try {

				byte[] data=output[i].getBytes();

				fos.write(data);

			} catch(Exception e) { System.out.println(e.getMessage()); }

		}

		fos.close();

	}

}
