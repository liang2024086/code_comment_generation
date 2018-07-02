package methodEmbedding.Cookie_Clicker_Alpha.S.LYD126;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class CookieClickerSmall {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("output1.txt");
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		Scanner in =new Scanner(new File("input1.txt"));

		int count=Integer.parseInt( in.nextLine());
		int j,i;


		for (int ij=1;ij<=count;ij++)
		{
			int icount=0;
			double tmp_time=0.00;
			double c,f,x;
			String input=in.nextLine();

			String inarr[]=new String[3];
			inarr=input.split(" ");
			LinkedList<Double> time=new LinkedList<>();
			time.add(99999999999999.99);
			c=Double.parseDouble(inarr[0]);
			f=Double.parseDouble(inarr[1]);
			x=Double.parseDouble(inarr[2]);
			//timing conservation
			for(int z=0;;z++){
				icount++;
				for(int z1=0;z1<z;z1++){
					Double temp=c/(2+z1*f);
					tmp_time+=temp;
				}
				tmp_time+=x/(2+z*f);

				if(time.getLast()<tmp_time)
					break;
				double finalValue = Math.round( tmp_time * 10000000.0 ) / 10000000.0;
				time.add(finalValue);
				tmp_time=0;

			}

			bw.write("Case #"+ij+": "+ time.getLast()+"\n");

		}
		in.close();
		bw.close();

	}

}
