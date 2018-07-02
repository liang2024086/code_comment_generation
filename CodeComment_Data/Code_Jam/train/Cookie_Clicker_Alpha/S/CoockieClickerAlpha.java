package methodEmbedding.Cookie_Clicker_Alpha.S.LYD571;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class CoockieClickerAlpha {
	
	public static void main(String[] args) {
	    boolean lineBreaker=true;
		BufferedReader reader=null;
		BufferedWriter writer=null;
		try {
			writer=new BufferedWriter(new FileWriter("output.txt"));
			reader=new BufferedReader(new FileReader("input.txt"));
			String s=reader.readLine();
			int testCase=Integer.parseInt(s);
			for(int i=1;i<=testCase;i++){
				if(lineBreaker){
					lineBreaker=false;
				}else
				writer.write("\n");
				s=reader.readLine();
				String [] input=s.split(" ");
				double c=Double.parseDouble(input[0]);
				double f=Double.parseDouble(input[1]);
				double x=Double.parseDouble(input[2]);
				double time=0.0;
				double divider=2.0;
				while(true){
					if(x<=c)
					{
						time=x/divider;
						break;
					}
					
					time+=c/divider;
					if(((x-c)/divider)>(x/(divider+f))){
						divider=divider+f;
					}
					else
					{
						time=time+(x-c)/divider;
						break;
					}
					
				}
					writer.write("Case #"+i+": "+new DecimalFormat("#0.0000000").format(time));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
			writer.flush();
			writer.close();
			reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
