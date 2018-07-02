package methodEmbedding.Standing_Ovation.S.LYD754;

import java.io.*;
class hello {
	public static void main(String[] args)  throws IOException {
		BufferedReader input=new BufferedReader(new FileReader("A-small-attempt1.in"));
	    PrintWriter output=new PrintWriter("A-small-attempt1.out");
	    String T=input.readLine();
	    
	    int t = Integer.valueOf(T);
	    for(int i=0; i < t; i++) {
	    	String line = input.readLine();
	    	String[] nums = line.split(" ");
	    	int ovas;
	    	int n = 0;
	    	int Smax = Integer.valueOf(nums[0]);
	    	if(Integer.valueOf(nums[1].charAt(0)) - 48 == 0) {
	    		n++;
	    		ovas = n;
	    	} else {
	    		ovas = Integer.valueOf(nums[1].charAt(0)) - 48;
	    	}
	    	for(int j=1; j <= Smax; j++) {
	    		if (j > ovas) {
	    			n += j -  ovas;
	    			ovas = j;
	    		}
	    		ovas += Integer.valueOf(nums[1].charAt(j)) - 48;
	    	}
	    	output.println("Case #" + (i+1) + ": " + n);
	    }
	    input.close();
	    output.close();
    }
}
