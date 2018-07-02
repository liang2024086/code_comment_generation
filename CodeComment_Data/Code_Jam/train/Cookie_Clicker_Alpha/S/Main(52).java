package methodEmbedding.Cookie_Clicker_Alpha.S.LYD346;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		// XYZ + XY = 6pp
		// Integer.parseInt("");
		/*
		String p = "XYZ";
		String q = "XY";
		String r = "6PP";
		
		int x=1;
		int y=1;
		int z=1 ;
		int result = 0;
		
		for(int i=1; i<10; i++){
			
			 x=i*110;
			 
			 for(int j=1; j<10; j++){
				 if(i==j)
					 continue;
				 y=j*11;
				 
				 for(int k=1; k<10; k++){
					 if(k==i || k==j)
						 continue;
					 z=k;
					 
					 result = x+y+z;
					 
					 if(result == 600 || 
						result == 611 ||
						result == 622 ||
						result == 633 ||
						result == 644 ||
						result == 655 ||
						result == 666 ||
						result == 677 ||
						result == 688 ||
						result == 699){
						 
						System.out.println(i + "/" + j + "/" + k + "/" + result);
						 
					 }
					 
					 
				 }
			 }
			 
		}
		
		
		*/
		
		FileInputStream fis = new FileInputStream("test.txt");
		DataInputStream dis = new DataInputStream(fis);
		BufferedReader br = new BufferedReader(new InputStreamReader(dis));
		String strLine;
		
		FileWriter fw = new FileWriter("out.txt");

		Scanner scan = new Scanner(new File("test.txt"));
		BufferedWriter bw = new BufferedWriter(fw);

		
		String line = null;
		
		int test_case =0 ;
		
		double c = 0;
		double f = 0; 
		double x = 0;

		
		test_case = scan.nextInt();
		
		for(int i=0; i<test_case; i++){
			
			c = scan.nextDouble();
			f = scan.nextDouble();
			x = scan.nextDouble();
			
			double tc = 2;
			double tn1 =0;
			double tn2 =0;
			double tn3 =0;
			
			double ttn =0;
			
			tn1 = x/tc;
			while(true){
				
				ttn+=c/tc;
				tc+=f;
				tn2 = x/tc + ttn;
				
				
				//System.out.println(tn1 + "/" + tn2);
				
				if(tn1<tn2)
					break;
				
				tn1 = tn2;
						
			}
			
			
			
			int no = i+1;
			
			String tmp = String.format("%.7f", tn1);
			
			System.out.println("Case #" + no + ": " + tmp + "\n");
			bw.write("Case #" + no + ": " + tmp + "\n");
			 

		}
		
		 bw.close();

		
		
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}
