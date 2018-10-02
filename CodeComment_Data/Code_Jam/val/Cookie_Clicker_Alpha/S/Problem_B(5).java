package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1359;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem_B {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(new File("inputB.txt"));
	    PrintWriter writer = new PrintWriter("soln_probB.txt", "UTF-8");
	    
	    int T = scanner.nextInt();
	    
	    for(int t=1;t<=T;t++) {
	    	double c = scanner.nextDouble();
	    	double f = scanner.nextDouble();
	    	double x = scanner.nextDouble();
	    	
	    	//System.out.println(c + " " + f + " " + x);
	    	
	    	//ArrayList<Double> seconds = new ArrayList<Double>();
	    	//seconds.add(x/2);
	    	
	    	double seconds=x/2;
	    	
	    	double sum=0;
	    	double new_seconds= x/2;
	    	
	    	//double up_lim=x/2;
	    	
	    	int n=1;
	    	
	    	while(new_seconds<=seconds) {
	    		
	    		seconds=new_seconds;
	    		
	    		sum= sum + c/(2.0+(n-1)*f);
	    		new_seconds= sum + x/(2+n*f);
	    		//seconds.add( sum + x/(2+n*f) );
	    		n=n+1;
	    	}
	    	
	    	writer.println("Case #" + t + ": " + seconds);	    		
	    	
	    }
	    
	    scanner.close();
	    writer.close();

	}

}
