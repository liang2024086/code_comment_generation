package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1085;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class CookieClickerAlpha {
	public static void main(String[] args) {
		Scanner entrada;
		try {
			entrada = new Scanner(new File("B-small-attempt0.in"));
			entrada.useLocale(Locale.US);
			int numeroDeCasos=entrada.nextInt();
			for(int caso=1;caso<=numeroDeCasos;caso++){
				double c=entrada.nextDouble();
				double f=entrada.nextDouble();
				double x=entrada.nextDouble();
				double t=0;
				int numeroDeFazendas=0;
				while(true){
					//System.out.println(c+" "+f+" "+x);
					double r0=numeroDeFazendas*f+2;
					double r1=r0+f;
					double tc=x/r1+c/r0;
					double ts=x/r0;
					if(ts>=tc){
						numeroDeFazendas+=1;
						t+=c/r0;
					}else{
						t+=x/r0;
						break;
					}
				}
				System.out.println("Case #"+caso+": "+t);
				
			}
		} catch (FileNotFoundException e) {}
		
	}
}
