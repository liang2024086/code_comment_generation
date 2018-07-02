package methodEmbedding.Counting_Sheep.S.LYD1151;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashSet;

/**
 *
 * Java program to show how to remove element from Array in Java
 * This program shows How to use Apache Commons ArrayUtils to delete
 * elements from primitive array.
 *
 * @author http://java67.blogspot.com
 */


public class helloWorld{
	
	
    
    
	 public static void main(String args[]) {
		
		String inputFileName = args[0];
		System.out.println("Input file: " + inputFileName);
		String outputFileName=args[1];
		System.out.println("output file: " + outputFileName);
		long startTime = System.currentTimeMillis();
		//System.out.println(bulbSwitch(12) );
		String line = null;
		boolean flag = false;
		int T = 0;
		int N = 0;
		int lineCount = 0;
		HashSet<Integer> wordSet;

	    //List<String> list = new ArrayList<String>();
	    try {
	        BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
	        BufferedWriter br = new BufferedWriter(new FileWriter(outputFileName));
	        while((line = reader.readLine()) != null){
	        	if ( line.trim().length() == 0 ) {  
	        	    continue;  // Skip blank lines  
	        	  }
	        	if(!flag){
	        		//String[] nums = line.split(" ");
	        		T = Integer.parseInt(line);
	        		flag = true;
	        		//lineCount++;
	        		continue; 
	        	}
	        	else{
	        		N = Integer.parseInt(line);
	        		if(N==0){
	        			br.write("Case #" + (++lineCount) + ": INSOMNIA\n");
	        			continue;
	        		}
	        		int num = N;
	        		int count = 1;
	        		wordSet = new HashSet<Integer>();
	        		while(true){
	        			while(num >9){
	        				if(!wordSet.contains((num%10))){
	        					wordSet.add((num%10));
	        				}
	        				num = num/10;
	        			}
	        			if(!wordSet.contains(num)){
        					wordSet.add(num);
        				}
	        			//System.out.println(wordSet.size());
	        			if(wordSet.size()==10){
	        				br.write("Case #" + (++lineCount) + ": "+(N*count)+"\n");
	        				break;
	        			}
	        			++count;
	        			if (N != 0 && (count > (Integer.MAX_VALUE / N))) {
	        				br.write("Case #" + (++lineCount) + ": INSOMNIA\n");
	        				break;
	        			}
	        			num = N * (count);
	        			
	        		}
	        		
	        	}
	        	//System.out.println();
	        	
	        	//String[] vals = line.split("\\s+");
	        }
	        reader.close();
	        br.close();
	    }catch (Exception e) {
	        e.printStackTrace();
	    }
//		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
//	    int t = Integer.parseInt(in.nextLine());  // Scanner has functions to read ints, longs, strings, chars, etc.
//	    for (int i = 1; i <= t; i++) {
//	      //int n = in.nextInt();
//	      //int m = in.nextInt();
//	    	String word = in.nextLine();
//	      System.out.println("Words: " + word);
//	    }
	  
		

		long endTime = System.currentTimeMillis();
		//System.out.println("Took "+(endTime - startTime) + " ns");
		//System.out.println("Took "+((double)endTime - (double)startTime)/1000.0 + " us");
		System.out.println("Took "+((double)endTime - (double)startTime) + " ms");
		System.out.println("Took "+((double)endTime - (double)startTime)/1000.0 + " s");
	}




}
