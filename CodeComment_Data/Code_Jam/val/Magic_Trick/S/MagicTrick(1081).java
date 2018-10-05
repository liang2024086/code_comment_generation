package methodEmbedding.Magic_Trick.S.LYD1816;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MagicTrick {
	
	public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList();
        try {
            FileInputStream fstream = new FileInputStream("D:\\codeJam\\inputData.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;

            //Read File Line By Line
            while ((strLine = br.readLine()) != null) {
                lines.add(strLine);
            }
            //Close the input stream
            in.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        
        int numberOfCases = Integer.parseInt(lines.get(0));
        //starting Logic for each case
        int LineNumber = 1;
        for(int i = 1; i<=numberOfCases ; i++ ) {
        	        	
        	int firstAns = Integer.parseInt(lines.get(LineNumber));
        	String[] firstRow = lines.get(LineNumber+ firstAns).split(" ");
        	LineNumber+=5;
        	int secodAns = Integer.parseInt(lines.get(LineNumber));
        	String[] secondRow = lines.get(LineNumber+ secodAns).split(" ");
        	LineNumber+=5;     
        	//get intersection 
        	String result="";
        	int found = 0;
        	for (int x=0; x<4 ; x++){
        		for (int y=0; y<4 ; y++){
            		if(firstRow[y].equals(secondRow[x])){
            			result = firstRow[y];
            			found ++;
            		}
            	}
        	}
        	
        	// printing the output
        	if (found == 0){
        		System.out.println("Case #" +i +": Volunteer cheated!");
        	} else if (found == 1){
        		System.out.println("Case #" +i +": "+result);
        	} else {
        		System.out.println("Case #" +i +": Bad magician!");
        	}
        }                
	}
}
