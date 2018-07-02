package methodEmbedding.Speaking_in_Tongues.S.LYD1553;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	    try{
    	    FileInputStream fstream = new FileInputStream("A-small-attempt0.in");
    	    DataInputStream in = new DataInputStream(fstream);
    	        BufferedReader br = new BufferedReader(new InputStreamReader(in));
    	    String strLine;
 
    	    
    	    strLine = br.readLine();
    	    int T = Integer.valueOf(strLine);
//   	    System.out.println(T);
    	    String G[] = new String[T];
    	    String S[] = new String[T];
    	    
    	    	    	    
    	    int j = 0;
    	    
    	    while ((strLine = br.readLine()) != null)   {
    	    	G[j]=strLine;
    	    	j++;
    	    }
    	    
    	    
    	    
    	    
    	    
    	    for (int k=0; k<T; k++)
    	    {
    	    	
    	    	//for (int i=0; i<G[k].length();i++){
    	    		 
    	    		
    	    		S[k]=G[k].replace('a', 'Y').
    	    	    		replace('b', 'H').
    	    	    		replace('c', 'E').
    	    	    		replace('d', 'S').
    	    	    		replace('e', 'O').
    	    	    		replace('f', 'C').
    	    	    		replace('g', 'V').
    	    	    		replace('h', 'X').
    	    	    		replace('i', 'D').
    	    	    		replace('j', 'U').
    	    	    		replace('k', 'I').
    	    	    		replace('l', 'G').
    	    	    		replace('m', 'L').
    	    	    		replace('n', 'B').
    	    	    		replace('o', 'K').
    	    	    		replace('p', 'R').
    	    	    		replace('q', 'Z').
    	    	    		replace('r', 'T').
    	    	    		replace('s', 'N').
    	    	    		replace('t', 'W').
    	    	    		replace('u', 'J').
    	    	    		replace('v', 'P').
    	    	    		replace('w', 'F').
    	    	    		replace('x', 'M').
    	    	    		replace('y', 'A').
    	    		replace('z','Q').toLowerCase();
    	    	//}
    	    	
    	    	
    	    	System.out.print("Case #");
    	    	System.out.print(k+1);
    	    	System.out.print(": ");
    	    	System.out.print(S[k]);
    	    	
    	    	
    	    	System.out.println();
   	    		
    	    	
    	    }
    	    
    	    
    	    //Close the input stream
    	    in.close();
    	    }catch (Exception e){//Catch exception if any
    	      System.err.println("Error: " + e.getMessage());
    	    }

	}

}
