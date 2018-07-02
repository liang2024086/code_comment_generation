package methodEmbedding.Magic_Trick.S.LYD1073;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class QualiQ1 {

	public static void main(String[] args) {
	    try {
	    	String question = "A-small-Attempt0";
		    BufferedReader br = new BufferedReader(new FileReader("/Users/arieslam/Documents/workspace/testjava/Quali/"+question+".in"));
		    BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/arieslam/Documents/workspace/testjava/Quali/"+question+".out"));

		    //Close writer
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();
	        int t = Integer.parseInt(line);
	        
	        for (int i=0;i<t;i++){
	            line = br.readLine();
	            int guess1 = Integer.parseInt(line);
	            int[] possibles = new int[17];
	            for (int j=0;j<17;j++){
	            	possibles[j] = 0;
	            }
	            for (int j=0;j<4;j++){
            		line = br.readLine();
	            	if (j==guess1-1){
	            		StringTokenizer st = new StringTokenizer(line);
	            		while (st.hasMoreTokens()){
	            			int num = Integer.parseInt(st.nextToken());
	            			possibles[num] = 1;
	            			System.out.println(num);
	            		}
	            	}
	            }
	            line = br.readLine();
	            int guess2 = Integer.parseInt(line);
	            int found = 0;
	            boolean multiple = false;
	            for (int j=0;j<4;j++){
            		line = br.readLine();
	            	if (j==guess2-1){
	            		StringTokenizer st = new StringTokenizer(line);
	            		while (st.hasMoreTokens()){
	            			int num = Integer.parseInt(st.nextToken());
	            			System.out.println(num);
	            			if(possibles[num]==1){
	            				if (found==0){
	            					found = num;
	            				} else {
	            					multiple = true;
	            				}
	            			}
	            		}
	            	}
	            }
	            if (multiple){
	            	writer.write("Case #"+(i+1)+": "+"Bad magician!");
	            } else if (found==0){
	            	writer.write("Case #"+(i+1)+": "+"Volunteer cheated!");
	            } else {
	            	writer.write("Case #"+(i+1)+": "+found);
	            }
			    writer.newLine();
	        }

//	        while (line != null) {
//	        }
	        br.close();
		    writer.close();
	    } catch (IOException e) {
			e.printStackTrace();
		} finally {
	    }
	}

}
