package methodEmbedding.Cookie_Clicker_Alpha.S.LYD252;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.Scanner;


public class cookie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		try{
		int number_of_testcase=0;
		double C=0,F=0,X=0,total_seconds=0,minimumseconds=0,number_ofitems=0,rate=2;

		 Scanner a = new Scanner(System.in);
		 number_of_testcase = a.nextInt();
			File file = new File("output.txt");
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
		 for(int j=0;j<number_of_testcase;j++)
		 {number_ofitems=0;
			 
			 C = a.nextDouble();
			 F = a.nextDouble();
			 X = a.nextDouble();
			 minimumseconds=X/2;

			 double secondstaken=0;

for(int k=0;k<100;k++){	
	secondstaken=0;
	rate=2;
for(int i=0;i<number_ofitems;i++)
{
secondstaken=secondstaken+(C/rate);

rate=rate+F;
}
secondstaken=secondstaken+(X/rate);

if(minimumseconds>secondstaken)
	minimumseconds=secondstaken;
if(minimumseconds<secondstaken)
	break;
	
number_ofitems++;
			
			
		 
		 }
              bw.write("Case #"+(j+1)+": ");
              Double d = new Double(minimumseconds);

              //bw.write(String.format("%.7g%n", minimumseconds)+".");
              BigDecimal bd = new BigDecimal(minimumseconds);
              bd = bd.setScale(7, BigDecimal.ROUND_HALF_UP);
              bw.write(bd+"");
              if(j<number_of_testcase-1)
              bw.newLine();
		 }
		 bw.close();}catch(Exception e)
	{
		System.out.println(e);
	}
	}
}
