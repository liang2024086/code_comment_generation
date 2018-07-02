package methodEmbedding.Cookie_Clicker_Alpha.S.LYD170;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CookieCutter {
	public static void main(String args[]) throws FileNotFoundException{
	
	FileInputStream fi = new FileInputStream
			("C:/Users/GARY BRO/Desktop/B-small-attempt0.in");
    Scanner scanner = new Scanner(fi);
    System.setOut(new PrintStream(new FileOutputStream
    		("C:/Users/GARY BRO/Desktop/Aout")));
    String numCase = scanner.nextLine();
	Integer nCase = Integer.parseInt(numCase);
	
	for(int i = 1; i<=nCase;i++){
		//populate arrays
		String cfz = scanner.nextLine();
		cfz = cfz.trim();
		String cfzArr[] = cfz.split(" ");
		Double cfzNum[] = new Double[3];
		for(int z=0;z<3;z++){
			cfzNum[z]= Double.parseDouble(cfzArr[z]);
		//C= cost of farm F= farm production X= Cost to win
		}
		double Rate = 2.0;
		double debt = 0.0;
		double nUpg = cfzNum[2]/Rate;
		double yUpg = (cfzNum[0]/Rate)+(cfzNum[2]/(Rate+cfzNum[1]));
		while(yUpg<nUpg){
			debt+= cfzNum[0]/Rate;
			Rate+= cfzNum[1];
			nUpg = cfzNum[2]/Rate;
			yUpg = (cfzNum[0]/Rate)+(cfzNum[2]/(Rate+cfzNum[1]));
			
		}
		nUpg+=debt;
		System.out.printf("Case #%d: %.7f",i,nUpg);
		if(i!=nCase){
			System.out.println();
			
		}
	}
	scanner.close();
	}
}
