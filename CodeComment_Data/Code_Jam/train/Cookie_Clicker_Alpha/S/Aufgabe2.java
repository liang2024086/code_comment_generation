package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1399;

import java.io.BufferedReader;
import java.text.*;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Aufgabe2 {

	
	
	public static void main(String[]args) throws IOException
	{
		String quelle =("bla.in");
		
		double C=1;
		double F=2;
		double X=1;
		
		double mini=0;
		double mini2=0;
		double newF=F;
		double zeitkonto=0;
		
		
	
		
			
		DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance();
		dfs.setDecimalSeparator('.');
		DecimalFormat f = new DecimalFormat("#.0000000", dfs);

	FileReader fr = new FileReader(quelle);
	BufferedReader br = new BufferedReader(fr);
	
	FileWriter fw = new FileWriter("out.txt");
	BufferedWriter bw = new BufferedWriter(fw);
	
	int foo = Integer.parseInt(br.readLine());
	System.out.println(foo);
	
	for (int i=1; i<=foo; i++)
	{
		String blub= br.readLine();
		String[] result =blub.split(" ");
		
		String erste= result[0];
		String zweite= result[1];
		String dritte= result[2];
		
		C = Double.parseDouble(erste);
		F =Double.parseDouble(zweite);
		X =Double.parseDouble(dritte);
		
		
		mini=X/2;
		zeitkonto=C/2;
		newF= 2+F;
		mini2=(X/newF)+zeitkonto;
		
		while(mini>mini2)
		{
			
			mini=mini2;
			zeitkonto=zeitkonto+(C/newF);
			newF=newF+F;
			mini2=(X/newF)+zeitkonto;
		}
		System.out.println(mini);
		bw.write("Case #"+i+": "+(f.format(mini))+" \n");
		
				
			
	}
	
	
	bw.close();
	br.close();
	
	}
	
	
}
