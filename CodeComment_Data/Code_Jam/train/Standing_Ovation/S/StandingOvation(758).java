package methodEmbedding.Standing_Ovation.S.LYD1436;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class StandingOvation {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fstream = new FileInputStream("A-small-attempt1.in");
		DataInputStream entrada = new DataInputStream(fstream);
	    BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
	    
	   	int t = Integer.parseInt(buffer.readLine());
	   	
	    for (int i = 0; i < t; i++) {
	    	String []values = buffer.readLine().split(" ");
	    	int n_a = Integer.parseInt(values[0]);
	    	String n_b = values[1];
	    	int res=0;
	    	int total =0;
	    	for (int j = 0; j <= n_a; j++) {
				if(total<j){
					res+= (j-total);
					total+=(j-total);
				}
				total+= Integer.parseInt(""+(char)n_b.charAt(j));
				//System.out.println("RES: " + res );
				//System.out.println("TOTAL: "+total);
			}
	    	System.out.println("Case #"+(i+1)+": " +res);
	    	
	    	
	    }

	}

}
