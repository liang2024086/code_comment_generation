package methodEmbedding.Counting_Sheep.S.LYD1011;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class CopyOfCountingSheetASmallC2 {
	public static void main(String[] args) throws FileNotFoundException, IOException
	{	
		String everything, chaine = "";
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\workspace\\reverse words\\src\\file\\A-small-attempt11.in"))) {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();
		    while (line != null) {
		        sb.append(line+";");
		        line = br.readLine();
		    }
		     everything = sb.toString();
		}
		String[] tbT =  everything.split(";") ;
		int number = 0,n=1;
		for (int j = 0; j < 100; j++) {
			number = Integer.parseInt(tbT[j+1]);			
		for (int i = 1; i <= tbT.length; i++) {//print Insomnia whether it is zero otherwise count!---number is zero output INSOMNIA , if i>100 break otherwise count
			if(n==101){break;}
			if(number==0){System.out.println("Case #"+n+": INSOMNIA");n++;break;}else{
			chaine += String.valueOf(i*number);
			
			if(chaine.contains("0")&& chaine.contains("1")&&chaine.contains("2")
					&&chaine.contains("3")&&chaine.contains("4")&&chaine.contains("5")
					&&chaine.contains("6")&&chaine.contains("7")&&chaine.contains("8")
					&&chaine.contains("9"))
					{
						System.out.println("Case #"+n+": "+i*number);n++;
						chaine = "";
						break;}
			}}	}}}
