package methodEmbedding.Counting_Sheep.S.LYD641;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class sheep {
	public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        for(int j=1; j<=t; j++){
        	int n = in.nextInt();
        	if(n == 0){
        		System.out.println("Case #" + j + ": INSOMNIA");
        		writer.println("Case #" + j + ": INSOMNIA");
        	}else{
        		long s = 0, check;
        		int k = 1, m = n;
        		while(true){
        			m *= k;
        			check = m;
        			while(check>0){
        				long r = check%10;
        				s |= (1 << r);
        				check /= 10;
        			}
        			k++;
        			if(s == 1023)
        				break;
        			m = n;
        		}
        		System.out.println("Case #" + j + ": " + m);
        		writer.println("Case #" + j + ": " + m);
        	}
        }
        writer.close();
	}
}
