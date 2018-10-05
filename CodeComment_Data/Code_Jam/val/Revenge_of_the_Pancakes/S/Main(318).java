package methodEmbedding.Revenge_of_the_Pancakes.S.LYD19;


import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

		int t = in.nextInt();  

		for (int i = 0; i < t; i++) {		 
			String n = in.next(); 	
			if(n.indexOf("-")<0) System.out.println("Case #" + (i + 1) + ": " +0);
			else if(n.indexOf("+")<0) System.out.println("Case #" + (i + 1) + ": " +1);
			else{
				
				StringBuffer buf= new StringBuffer(n);
				String plusoumoins="+";
			     int nombredefois=0;
			     int indiceplus=n.indexOf("+");			     
				if(buf.indexOf("+")<buf.indexOf("-") ) {plusoumoins="-"; indiceplus=buf.indexOf(plusoumoins);}
				
				while(buf.indexOf("-")>=0  ){
					if(buf.indexOf("+")<0) {nombredefois++;break;}
					 buf.replace(0, indiceplus, plusoumoins).toString();
					if(plusoumoins=="+" ) {plusoumoins="-"; indiceplus=buf.indexOf(plusoumoins);nombredefois++;}
					else {plusoumoins="+";indiceplus=buf.indexOf(plusoumoins);nombredefois++;}
					
				
				}
				
				System.out.println("Case #" + (i + 1) + ": " +nombredefois);				
			}
			}
		}
 
}
