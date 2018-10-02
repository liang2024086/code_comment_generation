package methodEmbedding.Cookie_Clicker_Alpha.S.LYD849;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;


public class PbB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FileReader fr = null ;
    	Scanner sc = null;
    	int n_cases = 0;
    	Locale.setDefault(Locale.US);
    
    	try{
    		fr = new FileReader(args[0]);
    		sc = new Scanner(fr);
    		
    		if (sc.hasNextInt()) n_cases = sc.nextInt();
    		
    		for (int i=0;i<n_cases;i++){
    			
    			double C = sc.nextDouble();
    			double F = sc.nextDouble();
    			double X = sc.nextDouble();
    			
    			
    			double min_time = X/2;
    			double spent_time = 0;
    			double speed = 2;
    			
    			while(spent_time<min_time){
    				double temp;
    				if((temp = spent_time + X/speed) < min_time){
    					min_time = temp;
    				}
    				spent_time += C/speed;
    				speed += F;
    			}
    			
    			System.out.println("Case #"+(i+1)+": "+String.format("%.7f", min_time));			
    		}
    		
    	} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    	finally{
    		if(sc != null) sc.close();
    		if(fr != null)	try {fr.close();} catch (Exception e) {}
    	}
       	

	}

}
