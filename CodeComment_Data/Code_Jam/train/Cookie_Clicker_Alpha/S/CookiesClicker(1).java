package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1549;

/**
 * 
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Blandine
 *
 */
public class CookiesClicker {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int i,j,k,rec,nbr; double C,F,f=2,X,N,inc,prev,b,s,cour;

		String ch;
		File f2=new File("output.in");
		PrintWriter pw=new PrintWriter(f2);
		FileReader f1=new FileReader("input.in");
		BufferedReader br=new BufferedReader(f1);
		nbr=Integer.parseInt(br.readLine());
		for(i=0;i<nbr;i++){
			
			ch=br.readLine();
			StringTokenizer tok=new StringTokenizer(ch);
			C=Double.parseDouble(tok.nextToken());
			F=Double.parseDouble(tok.nextToken());
			X=Double.parseDouble(tok.nextToken());
			
			f = 2; // gain initiale apr?s une seconde
			s = 0; // temps ecoule
			prev = X/f; // prevision future
			boolean gp = false;
			while (!gp) {
			   cour = prev;
			   prev = (C/f) + (X/(f+F)) + s;
			   if(prev > cour) { // Comparaison de la possibilite futur et celle actuelle
			      gp = true;
			      s = s+ X/f;
			   }
			   else{
			     s = s + (C/f);
			     f =f +F;
			   }
			  
			}

			pw.println("Case #" + (i + 1) + ": "+s);


			
		}
		pw.close();
	}
}
