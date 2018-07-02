package methodEmbedding.Speaking_in_Tongues.S.LYD896;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;
import java.util.Scanner;

public class dico {

	public static void main (String[] arg) throws IOException{
		
		 Scanner sc;
	        
	        PrintWriter pWriter = null;
	        
	        try {
	        BufferedWriter bw = new BufferedWriter(new FileWriter("A.out"));
			pWriter = new PrintWriter(bw);
			
	        sc = new Scanner(new File("A-small-attempt1.in"));
	        
	        Hashtable dico = new Hashtable();
	        dico.put(" ", " ");
	        dico.put("a", "y");
	        dico.put("b", "h");
	        dico.put("c", "e");
	        dico.put("d", "s");
	        dico.put("e", "o");
	        dico.put("f", "c");
	        dico.put("g", "v");
	        dico.put("h", "x");
	        dico.put("i", "d");
	        dico.put("j", "u");
	        dico.put("k", "i");
	        dico.put("l", "g");
	        dico.put("m", "l");
	        dico.put("n", "b");
	        dico.put("o", "k");
	        dico.put("p", "r");
	        dico.put("q", "z");	//
	        dico.put("r", "t");
	        dico.put("s", "n");
	        dico.put("t", "w");
	        dico.put("u", "j");
	        dico.put("v", "p");
	        dico.put("w", "f");
	        dico.put("x", "m");
	        dico.put("y", "a");
	        dico.put("z", "q");	//
	        
	        
	        int T = sc.nextInt();
	        //System.out.println("T = " +T);
	        String ligne = sc.nextLine();
	        
	        for(int i=1; i<=T; i++){
	        	ligne = sc.nextLine();
	        	
	        	//System.out.println(ligne);
	        	
	        	//System.out.print("Case #"+i +": ");
        		pWriter.print("Case #"+i +": ");
	        	
	        	for(int j=0 ; j <ligne.length() ; j++){
	        		char c = ligne.charAt(j);
	        		String c2 = null;
	        		if(dico.containsKey(""+c))
	        			c2= (String) dico.get(""+c);
	        		//System.out.print(c2);
	        		pWriter.print(c2);
	        	}
	        		
	        	//System.out.println("");
	        	pWriter.println("");
	        }
	        
	        } catch (FileNotFoundException e) {
	        		e.printStackTrace();

	        }finally{
	        	//System.out.println("out");
	        	pWriter.close() ;
	        }
		
	}
}
