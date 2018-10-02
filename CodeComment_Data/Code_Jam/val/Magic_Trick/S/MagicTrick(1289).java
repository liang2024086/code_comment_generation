package methodEmbedding.Magic_Trick.S.LYD720;

import java.io.BufferedReader;  
import java.io.BufferedWriter;  
import java.io.File;  
import java.io.FileReader;  
import java.io.FileWriter;  
import java.io.IOException; 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MagicTrick {
	static BufferedWriter bufferWriter;  
      static BufferedReader bufferReader;
      static HashMap<Integer, String[]> map=new HashMap<Integer, String[]>();
      static List<String> list=new ArrayList<String>();
	public static void main(String[] args) throws IOException {
		 
	           File inputFile = new File("/Users/rajagrawal/Desktop/A-small-attempt1.in"); // input file  
	           File outputFile = new File("/Users/rajagrawal/Desktop/output.out"); // outfile  
	           FileWriter filewriter = new FileWriter(outputFile);  
	           FileReader filereader = new FileReader(inputFile);  
	           bufferWriter = new BufferedWriter(filewriter);  
	           bufferReader = new BufferedReader(filereader);  
	           int numberOfCases = Integer.parseInt(bufferReader.readLine());  
	           System.out.println("numcases = " + numberOfCases); 
	           for(int i=0;i<numberOfCases;i++){
	        	   int guessOne=Integer.parseInt(bufferReader.readLine());
	        	   System.out.println("Guess One = " + guessOne);
	        	  for(int j=1;j<=4;j++){
	        		  map.put(j,bufferReader.readLine().split(" "));  
	        	  }
	        	   String[] stringArrayOne=map.get(guessOne);
	        	  list.add(stringArrayOne[0]);
	        	  System.out.println("Element 1 = " + stringArrayOne[0]);
	        	  System.out.println("Element 2 = " + stringArrayOne[1]);
	        	  System.out.println("Element 3 = " + stringArrayOne[2]);
	        	  System.out.println("Element 4 = " + stringArrayOne[3]);
	        	  list.add(stringArrayOne[1]);
	        	  list.add(stringArrayOne[2]);
	        	  list.add(stringArrayOne[3]);
	        	   map.clear();
	        	   int guessTwo=Integer.parseInt(bufferReader.readLine());
	        	   System.out.println("Guess Two = " + guessTwo);
	        	   for(int j=1;j<=4;j++){
	        		   map.put(j,bufferReader.readLine().split(" ") );
	        	   }
	        	   
	        	   String number = null;
	        	   int count=0;
	        	   String[] stringArrayTwo=map.get(guessTwo);
	        	   for(int j=0;j<4;j++){
	        		   System.out.println("Element "+j+" = " + stringArrayTwo[j]);
	        		   if(list.contains(stringArrayTwo[j])){
		        		   number=stringArrayTwo[j];
		        		   count++;
		        	   }   
	        	   }
	        	   if(count==1){
	        		   bufferWriter.write("Case #" + (i + 1) + ": " + number);  
	                   bufferWriter.newLine();  
	        	   }else if(count==0){
	        		   bufferWriter.write("Case #" + (i + 1) + ": " + "Volunteer cheated!");  
	                   bufferWriter.newLine();
	        	   }else{
	        		   bufferWriter.write("Case #" + (i + 1) + ": " + "Bad magician!");  
	                   bufferWriter.newLine();
	        	   }
	        	   list.clear();
	           }
	           bufferWriter.close();
	}

}
