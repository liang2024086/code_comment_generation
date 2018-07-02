package methodEmbedding.Magic_Trick.S.LYD1440;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class A {
	
	static BufferedWriter writer;
	static BufferedReader reader;
	
	public static void main(String[] args)throws IOException{
		
		File inFile = new File("A-small-attempt0.in"); // input file  
        File outFile = new File("output.out"); // outfile  
        FileWriter fwriter = new FileWriter(outFile);  
        writer = new BufferedWriter(fwriter);  
        FileReader freader = new FileReader(inFile);  
        reader = new BufferedReader(freader);  
        int numCases = Integer.parseInt(reader.readLine());  
        System.out.println("numcases = " + numCases); 
        
        int [] cards= new int[16];
        for(int g=0;g<16; g++){
        	cards[g]=0;
        }
        
        HashMap<Integer, Integer> cardsHash;
        
        String line="";
        for (int i = 0; i < numCases; ++i) { 
        	String[] lineChoosen;
        	cardsHash = new HashMap<Integer, Integer>();
        	int lineNo=Integer.parseInt(reader.readLine());
        	//System.out.println("LIne"+lineNo);
        	
        	for(int j=0 ; j < 4 ; j++){
        		line = reader.readLine();// read thr row 
        		
        		if(lineNo==(j+1)){
        			//System.out.println(line);
	        		lineChoosen=line.split(" ");
	        		for(int numbersLn=0; numbersLn<4;numbersLn++){
	        			int n=Integer.parseInt(lineChoosen[numbersLn]);
	        			cardsHash.put(n, 1);
	        			//System.out.print(cardsHash.get(n)+" ");
	        			cards[n-1]++;
	        		}
        		}
        		
        	
        	}
        	int matches=0;
        	int guess=-1;
        	lineNo=Integer.parseInt(reader.readLine());
        	//System.out.println("LIne"+lineNo);
        	for(int j=0 ; j < 4 ; j++){
        		line = reader.readLine();// read thr row 
        		if(lineNo==(j+1)){
        			//System.out.println(line);
        			lineChoosen=line.split(" ");
	        		for(int numbersLn=0; numbersLn<4;numbersLn++){
	        			int n=Integer.parseInt(lineChoosen[numbersLn]);
	        			//System.out.print(cardsHash.get(n)+" "+cardsHash.containsKey(n));
	        			if(cardsHash.containsKey(n)){
	        				matches++;
	        				guess=n;
	        			}
	        		}
        		}
        		
        	}
        	
        	switch(matches){
        		case(1):
        			//System.out.println("Case #"+i+" "+guess);
		    		writer.write("Case #"+(i+1)+": "+guess);
		    		writer.newLine();
        			break;
        		case(0):
        			//System.out.println("Case #"+i+" Bad magician!");
        			writer.write("Case #"+(i+1)+": Bad magician!");
        			writer.newLine();
        			break;
        		default:
        			//System.out.println("Case #"+i+" Volunteer cheated!");
        			writer.write("Case #"+(i+1)+": Volunteer cheated!");
        			writer.newLine();
        			
        	}
        		
        	
        }
		
        writer.close();
		
	}

}
