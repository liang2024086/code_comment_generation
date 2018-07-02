package methodEmbedding.Speaking_in_Tongues.S.LYD618;

import java.util.HashMap;
import java.io.*;


public class codeJam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('y', 'a');
		map.put('n', 'b');
		map.put('f', 'c');
		map.put('i', 'd');
		map.put('c', 'e');
		map.put('w', 'f');
		map.put('l', 'g');
		map.put('b', 'h');
		map.put('k', 'i');
		map.put('u', 'j');
		map.put('o', 'k');
		map.put('m', 'l');
		map.put('x', 'm');
		map.put('s', 'n');
		map.put('e', 'o');
		map.put('v', 'p');
		map.put('z', 'q');
		map.put('p', 'r');
		map.put('d', 's');
		map.put('r', 't');
		map.put('j', 'u');
		map.put('g', 'v');
		map.put('t', 'w');
		map.put('h', 'x');
		map.put('a', 'y');
		map.put('q', 'z');
		
		try{
			 FileReader fr=new FileReader("A-small-attempt1 (1).in"); 
		
			 BufferedReader  br = new BufferedReader (fr);
		     int numCases = Integer.parseInt(br.readLine());
		     BufferedWriter bw = new BufferedWriter(new FileWriter(new File("solution.txt"), true));
     
		     for(int i=1; i <=numCases; i++ ){
		    	 StringBuffer linea = new StringBuffer(br.readLine());
		    	
		    	 for (int j=0; j<linea.length(); j++ ){
		    		
		    		 if(linea.charAt(j) != ' '){
		    			 linea.setCharAt(j, map.get(linea.charAt(j)));
		    		 }else{
		    			 linea.setCharAt(j,' ');
		    		 }			 
		    	 }
		    	 //System.out.println("Case #" + i+": "+linea);
		    	 bw.write("Case #" + i+": "+linea);
		         bw.newLine();
		         
		     }
		     
		 bw.close();
		}catch (Exception e){//Catch exception if any
		    	  System.err.println("Error: " + e.getMessage());
		}
			  
		

		
	}
}


