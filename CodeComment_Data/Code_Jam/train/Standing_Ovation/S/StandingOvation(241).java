package methodEmbedding.Standing_Ovation.S.LYD787;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;


public class StandingOvation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		Writer writer = null;
		
		try{
			file = new File("C:\\Users\\Sword_2\\workspace\\StandingOvation\\bin\\A-small-attempt0.in");
		    fr = new FileReader(file);
		    br = new BufferedReader(fr);
		    
		    
		    writer = new FileWriter("C:\\Users\\Sword_2\\workspace\\StandingOvation\\bin\\output.txt");

		    
		    int caseTotal = 0;
		    String line;
		    
		    if((line = br.readLine()) != null){
		    	caseTotal = Integer.parseInt(line);
		    }
		    
		    for(int i = 0; i < caseTotal; i++){
		    	if((line = br.readLine()) != null){
		    		String[] lineParts = line.split(" ");
		    		if(lineParts.length == 2){
		    			String audiences = lineParts[1];
		    			int sMax = Integer.parseInt(lineParts[0]);
		    			
		    			
		    			if(/*audiences.endsWith("0")*/Character.digit(audiences.charAt(sMax), 10) == 0){
		    				throw new Exception("The string cannot be ended by '0'");
		    			}
		    			
		    			int standingAudiences = 0;
		    			int guests = 0;
		    			for(int j = 0; j <= sMax; j++){
		    				int shyAudiences = Character.digit(audiences.charAt(j), 10);
		    				if(standingAudiences < j){
		    					int guestsAdded = j - standingAudiences;
		    					standingAudiences += guestsAdded;
		    					guests += guestsAdded;
		    					
		    				}
		    				
		    				standingAudiences += shyAudiences;
		    				
		    			}
		    			
		    			//System.out.println("Case #" + i + ": " + guests);
		    			writer.write("Case #" + (i+1) + ": " + guests + System.getProperty("line.separator"));
		    		}
		    	}
		    	
		    }
		    
		    
		    /*while((line = br.readLine()) != null){
		        
		        System.out.println(line);
		        
		    }*/
		}catch(Exception e){
			e.printStackTrace();
		}finally{
		    try{
		    	br.close();
		    }catch(Exception ex){
		    	ex.printStackTrace();
		    }
		    try{
		    	fr.close();
		    }catch(Exception ex){
		    	ex.printStackTrace();
		    }
		    try{
		    	writer.close();
		    }catch(Exception ex){
		    	ex.printStackTrace();
		    }
		}
	}

}
