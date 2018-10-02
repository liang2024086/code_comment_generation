package methodEmbedding.Standing_Ovation.S.LYD1992;

import java.io.*;

public class ovation {
	public static void main (String[] args) throws IOException {
		File file = new File("A-small-attempt2.in");
	    File outFile = new File("Output-A-small-attempt2.out");
	    BufferedReader br = new BufferedReader(new FileReader(file));
	    BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
	    int testCases = Integer.parseInt(br.readLine());
	    for(int t=1;t<=testCases;t++){
	        String line = br.readLine();
	        String[] lineArr = line.split(" ");
	        int arr_length = Integer.parseInt(lineArr[0]) + 1;
	        String s = lineArr[1];
	        int[] intArray = new int[arr_length];
	        for(int i=0;i<arr_length;i++) {
      			intArray[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
    		}
    		int new_needed = 0, clapping = 0, curr_needed = 0;
    		for (int i=0; i<arr_length; i++) {
    			curr_needed = 0;
    			if (intArray[i] != 0) curr_needed = i;
    			if (clapping >= curr_needed) {
    				clapping += intArray[i];
    			} else {
    				new_needed += curr_needed - clapping;
    				clapping += intArray[i] + curr_needed - clapping;
    			}
    		}

	        bw.write("Case #" + t +": "+new_needed);
	        bw.newLine();
	    }
	    br.close();
	    bw.close();
		}
}
