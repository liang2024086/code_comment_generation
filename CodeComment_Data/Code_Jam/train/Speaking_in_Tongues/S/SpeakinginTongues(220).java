package methodEmbedding.Speaking_in_Tongues.S.LYD1672;

import java.io.*;
import java.util.*;
public class SpeakinginTongues {
	public static void main(String[] args)throws Exception{
		int n,n2,n3,n4,caso;
		String file = "A-small-attempt0";
        BufferedReader br = new BufferedReader(new FileReader(file + ".in"));
        FileWriter archivo = new FileWriter(file+".out");
        PrintWriter printer = new PrintWriter(archivo);
        printer.flush();
		String line,linetotal="";
		String abc1="abcdefghijklmnopqrstuvwxyz";
		String abc2="yhesocvxduiglbkrztnwjpfmaq";
		StringTokenizer st;
		n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++){
			line=br.readLine();
			linetotal="";
			st= new StringTokenizer(line);
			n2=st.countTokens();
			for(int e=0;e<n2;e++){
				line=st.nextToken();
				String[] arrayletra = line.split("");
				n4=arrayletra.length;
				for(int j=1;j<n4;j++){
       					n3=abc1.indexOf(arrayletra[j]);
       					arrayletra[j]=abc2.substring (n3, n3+1);
       				
				}
					for(int j=1;j<n4;j++){
       					linetotal=linetotal+arrayletra[j];
       				
				}
				linetotal=linetotal+" ";
			}
			printer.println("Case #"+(i+1)+": "+linetotal);
		}
		 br.close();
		 printer.close();
        System.exit(0);	
	}
	
}
