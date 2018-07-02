package methodEmbedding.Standing_Ovation.S.LYD682;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Stand {
	public static void main(String[] args) throws IOException{
			File out = new File ("output.txt");
		    PrintWriter printWriter = new PrintWriter (out);
		    
			File file = new File("A-small-attempt0.in");
	        Scanner sc = new Scanner(file);
	        int num = sc.nextInt();
	        int res;
        	int sum;
	        //tests
	        for (int i = 1; i <= num; i++) {
            	int smax = sc.nextInt();
            	String member = sc.next();
            	sum = 0;
            	res = 0;
            	for(int s = 0; s <= smax; s++) {
            		int p = member.charAt(s)-'0';
            		if (p != 0 && s > sum) {
            			res += (s-sum);
            			sum += res;
            		}
            		sum += p;
            	}
            	printWriter.println("Case #"+i+": "+ res);
            } 
	        sc.close();
	        printWriter.close ();
	}
}
