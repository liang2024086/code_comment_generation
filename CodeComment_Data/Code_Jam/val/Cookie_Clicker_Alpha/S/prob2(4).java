package methodEmbedding.Cookie_Clicker_Alpha.S.LYD698;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;

public class prob2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br = null;
		StringBuffer output = null;
		String input[];
		double c,f,x;
		double totalValue=0.0;
		
		double initialValue=2.0;
		
		BufferedWriter bw=null;
		try {
			br=new BufferedReader(new FileReader(new File("C:/Google-Codejam/2014/Input.txt")));
			bw=new BufferedWriter(new FileWriter("c:/Google-Codejam/2014/output.txt"));
			int count=Integer.parseInt(br.readLine());
			for (int i = 0; i < count; i++) {
				output = new StringBuffer("Case #"+(i+1)+": ");
				input=br.readLine().split(" ");
				
				c=Double.parseDouble(input[0]);
				f=Double.parseDouble(input[1]);
				x=Double.parseDouble(input[2]);
				
				do{
					if(x/initialValue>(x/(initialValue+f)+c/initialValue)){
						totalValue+=c/initialValue;
						initialValue=initialValue+f;						
					}else{
						totalValue+=x/initialValue;
						break;
					}
				}while(totalValue<x);
				
				DecimalFormat df = new DecimalFormat("#0.0000000");
				output.append(df.format(totalValue));
				initialValue=2.0;totalValue=0.0;
				bw.write(output.toString());
				bw.newLine();
			}
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
