package methodEmbedding.Magic_Trick.S.LYD1623;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MagicTrick {

    public static void main(String[] args) {
        
        String base="files/";
        String in=base + "A-small-attempt1.in";
        String out=base + "output1.txt";
        
        
	    try {
	    	BufferedReader br = new BufferedReader(new FileReader(in));
	        
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();
	        
	        int tctotal = 0;
	        int tc = 0;
	        
	        int i = -1;
	        int j = 0;
	        
	        int row = -1;
	        int turn = 1;
	        
	        int [] guess1 = new int[4];
	        int [] guess2 = new int[4];
	        
	        int possible = 0;
	        int answer = 0;
	        
	        while (line != null) {
	        	i++;
	        	
		        if(i == 0){
	        		tctotal = Integer.parseInt(line);
	        		tc = 1;
	        	} else {
	        		if(j==0){
	        			row = Integer.parseInt(line);
	        			j++;
	        		} else if (j == 4 && row != j) {
	        			j = 0;
	        			row = -1;
	        		} else {
	        			if(row == j){
	        				
	        				if(turn == 1){
	        					String [] parts = line.split(" ");
	        					for(int c=0; c<4; c++){
	        						guess1[c] = Integer.parseInt(parts[c]);
	        					}
	        					turn = 2;
	        				} else if(turn == 2){
	        					String [] parts = line.split(" ");
	        					for(int c=0; c<4; c++){
	        						guess2[c] = Integer.parseInt(parts[c]);
	        					}
	        					
	        					// Analyze
	        					for(int c=0; c<4; c++){
	        						for(int d = 0; d<4; d++){
	        							if(guess1[c] == guess2[d]){
	        								possible++;
	        								answer = guess1[c];
	        							}
	        						}
	        					}
	        					
	        					// append
	        					if(possible == 0){
	        						sb.append("Case #"+tc+": Volunteer cheated!");
	        					} else if (possible == 1){
	        						sb.append("Case #"+tc+": "+answer);
	        					} else {
	        						sb.append("Case #"+tc+": Bad magician!");
	        					}
	        					sb.append(System.lineSeparator());
	        					// Reset
	        					guess1 = new int[4];
	        					guess2 = new int[4];
	        					possible = 0;
	        					turn = 1;
	        					answer = 0;
	        					row = -1;
	        			        tc++;
	        				}
	        			}
	        			if (j == 4) {
		        			j = 0;
		        			row = -1;
		        		} else {
		        			j++;
		        		}
	        		}
	        		
	        	}
		        
	        	line = br.readLine();
	        }
	        
	        String everything = sb.toString();
	        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
	                new FileOutputStream("files/output.txt"), "utf-8"));
	          writer.write(everything);
	          writer.close();

	    } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
	    }
    }
}
