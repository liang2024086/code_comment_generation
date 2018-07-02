package methodEmbedding.Standing_Ovation.S.LYD21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class OneA {
	
    static BufferedWriter writer;  
    static BufferedReader reader;  
    @SuppressWarnings("null")
    
	public static void main(String[] args) throws IOException {
        File inFile = new File("C://GCJ/Prelims/OneA/input.txt"); // input file  
        File outFile = new File("C://GCJ/Prelims/OneA/output.txt"); // outfile  
        FileWriter fwriter = new FileWriter(outFile);  
        writer = new BufferedWriter(fwriter);  
        FileReader freader = new FileReader(inFile);  
        reader = new BufferedReader(freader);  
        int numCases = Integer.parseInt(reader.readLine());  
        System.out.println("numcases = " + numCases);  
        for (int i = 0; i < numCases; ++i) {  
        	String line = reader.readLine();
        	System.out.println(line);
        	String[] details = line.split(" ");
        	//System.out.println(details.length);
        	int smax = Integer.parseInt(details[0]);
        	System.out.println("smax :"+smax+ " - string "+ details[1]);
        	char[] strArray = details[1].trim().toCharArray();
/*        	for (int x=0; x<strArray.length;x++){
        		System.out.println(strArray[x]);
        	}
*/        	System.out.println("string Array length "+strArray.length);
        	int[] shyness = new int[strArray.length];
        	for(int j = 0; j < strArray.length; j++) {
        		//System.out.println(j +" "+strArray[j]);
        		shyness[j] = Character.getNumericValue(strArray[j]);
        	}
        	
        	int envShyness = 0;
        	int invite = 0;
        	int invited = 0;
        	for (int k=0; k<shyness.length; k++){
        		
/*        		if(k==0 && shyness[0]!=0){
        			envShyness = shyness[0];
        		}else{
        			if(envShyness >= k){
            			System.out.println(k + " " + envShyness + " : No Problem");
            		}else{
            			invite = k - envShyness;
            			System.out.println(invite+" : Invite");
            		}
        			envShyness = envShyness+shyness[k]+invite;

        			System.out.println(k +" : shyness : "+envShyness);
        		}
*/        		
        		if(k <= envShyness){
        			envShyness = envShyness + shyness[k];
        		}else{
        			invite = k - envShyness;
        			envShyness = envShyness + invite + shyness[k];
        			invited = invited+invite;
        		}
        		
        	}
        	System.out.println("Invited " +invited);
            writer.write("Case #" + (i + 1) + ": " +invited);  
            writer.newLine();  
        }
        writer.close();  

	}

}
