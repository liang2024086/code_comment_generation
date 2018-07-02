package methodEmbedding.Standing_Ovation.S.LYD107;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		File file = new File("input/A-small-attempt2.in.txt");
	    File outFile = new File("output/A-small-attempt2.out");
	    BufferedReader br = new BufferedReader(new FileReader(file));
	    BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
	    int testCases = Integer.parseInt(br.readLine());
	    for(int t=1;t<=testCases;t++){
	    	String line = br.readLine();
	        String[] strs = line.trim().split(" ");
	        int smax= Integer.parseInt(strs[0]);
	        int inlen = strs[1].length();
//	        System.out.println(strs[1]);
//	        System.out.println(inlen);
	        
	        int[] input = new int[inlen];
	        int count =0;
	        int total = 0;
	        
	        for(int i=0;i<inlen && total<smax;i++){
//	        	System.out.println(i);
	        	input[i] = Integer.parseInt(String.valueOf(strs[1].charAt(i)));
	        	if(input[i]>0 && total<i){
	        		count += (i-total);
	        		total = total + (i-total)+input[i];
	        	}
	        	else{
	        		total+=input[i];
	        	}
	        }
	        bw.write("Case #" + t +": "+count+ "\n");
//	        bw.write(count+"\n");
	        
	    }
	    br.close();
	    bw.close();

	}

}
