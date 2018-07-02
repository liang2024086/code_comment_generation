package methodEmbedding.Cookie_Clicker_Alpha.S.LYD244;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class SeenManCookieGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int T; double C; double F; double X;
		String[] output;
		double currRate=2.0; double nextRate;
		double time;
		
		try{
			Scanner sc=new Scanner(new FileReader("B-small-attempt0.in"));
			T=sc.nextInt();
			sc.nextLine();
			output=new String[T];
			
			for(int i=0; i<T; i++){
				time=0;
				currRate=2.0;
				C=sc.nextDouble();
				F=sc.nextDouble();
				X=sc.nextDouble();
				sc.nextLine();
				
				nextRate=currRate+F;
				while(C/currRate+X/nextRate<X/currRate){
					time+=C/currRate;
					currRate=nextRate;
					nextRate+=F;
				}
				time+=X/currRate;
				output[i]="Case #"+(i+1)+": "+time;
			}
			
			for(int i=0; i<T; i++)
				System.out.println(output[i]);
		}
		catch(FileNotFoundException e){
			
		}

	}

}
