package methodEmbedding.Counting_Sheep.S.LYD1026;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CountingSheep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputFile="A-small-attempt0.in";
		String outputFile="OUTPUTFILE.txt";
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\samarjaw\\workspace\\codeJam\\src\\"+inputFile)));
			PrintWriter out=new PrintWriter("C:\\Users\\samarjaw\\workspace\\codeJam\\src\\"+outputFile); 
			int t = Integer.parseInt(br.readLine());
			char d[] = null;
			int n = 0,digit=0;
			String num = "",aux="";
			long next=0;
			for (int i = 0; i < t; i++) {
				boolean flags[] = new boolean[11];
				int cnt = 0, len = 0,coeff=1;
				num = br.readLine();
				n=i+1;
				if(num.equals("0")){
					out.println("Case #"+n+":"+" INSOMNIA");
					continue;
				}
				aux=num;
				while (true) {

					d = aux.toCharArray();
					len = d.length;
					for (int j = 0; j < len; j++) {
						digit=(int)d[j]-48;
						if(!flags[digit]){
							cnt++;
							flags[digit]=true;
						}
					}
					if(cnt==10){
						out.println("Case #"+n+": "+next);
						break;
					}
					coeff++;
					next=Long.parseLong(num);
					next=coeff*next;
					aux=Long.toString(next);	
				}
			}
			out.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
