package methodEmbedding.Cookie_Clicker_Alpha.S.LYD68;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class cookie {
	public static void main(String args[]){
		
		
		
		File file = new File("C:\\Users\\Brahma\\Downloads\\B-small-attempt2.in");
		try {
			boolean ok= true;
			Scanner input = new Scanner(file);
			int testCases= Integer.parseInt(input.nextLine());
			PrintWriter f0 = new PrintWriter(new FileWriter("output.out"));
			for(int i=1;i<=testCases;i++){
				String arrayLine= input.nextLine();
				String[] values= arrayLine.split(" ");
				double Cost= Float.parseFloat(values[0]);
				double Frequency= Float.parseFloat(values[1]);
				double Xtreme= Float.parseFloat(values[2]);
				double time=0;
				ok=true;
//				double wait=C/F;
				double cf=2;
				while(ok){
					double A= Xtreme/cf;
					double B= Cost/cf + Xtreme/(cf+Frequency);
					if(B<A){
						time=time + Cost/cf;
						cf= cf+ Frequency;
					}
					else{
						time= time + A;
						ok=false;
					}
					
					
				}
				
				System.out.println(time);
				f0.println("Case #"+ i+": " + time);
			}
			f0.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
