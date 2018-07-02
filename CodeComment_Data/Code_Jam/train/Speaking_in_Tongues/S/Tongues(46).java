package methodEmbedding.Speaking_in_Tongues.S.LYD1011;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Tongues {
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader in = new BufferedReader(new FileReader(new File("tongues.in")));
		PrintWriter out = new PrintWriter(new FileWriter("tongues.out"));
		
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("e", "o");
		map.put("j", "u");
		map.put("p", "r");
		map.put("m", "l");
		map.put("y", "a");
		map.put("s", "n");
		map.put("l", "g");
		map.put("c", "e");
		map.put("k", "i");
		map.put("d", "s");
		map.put("x", "m");
		map.put("v", "p");
		map.put("n", "b");
		map.put("r", "t");
		map.put("i", "d");
		map.put("h", "x");
		map.put("w", "f");
		map.put("f", "c");
		map.put("g", "v");
		map.put("q", "z");
		map.put("a", "y");
		map.put("u", "j");
		map.put("t", "w");
		map.put("b", "h");
		map.put("o", "k");
		map.put("z", "q");
		int nbr_lignes=0;
		
	String ligne = "";
	nbr_lignes = Integer.parseInt(in.readLine());
	int index = 0;
	while(index < nbr_lignes){
		String new_ligne = "";
		ligne = in.readLine();
		StringTokenizer tok = new StringTokenizer (ligne.trim());
		
		while(tok.hasMoreTokens()){
			String myToken = tok.nextToken().trim();
			int index_tok = 0;
			String new_tok="";
			while(index_tok < myToken.length()){
				char c = myToken.charAt(index_tok);
				//System.out.println(c+"  correspond ?   "+map.get(c+"").charAt(0)+"   index :    "+index_tok);
				
				new_tok+=map.get(c+"");
				
				 
					
				index_tok++;
				
			
			}
			new_ligne+=new_tok+" ";
		}
		new_ligne=new_ligne.substring(0, new_ligne.length()-1);
		
		
		if (index!=nbr_lignes-1){
			out.println("Case #"+(index+1)+": "+new_ligne);
			}
		else 
			out.print("Case #"+(index+1)+": "+new_ligne);
		
	index++;	
	}
		out.close();
	}

}
