package methodEmbedding.Revenge_of_the_Pancakes.S.LYD604;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class pack {
	public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        for(int j=1; j<=t; j++){
        	String s[] = in.next().split("");
        	int moves = 0;
        	for(int i=1; i<s.length; i++){
        		if(!s[i].equals(s[i-1])){
        			moves++;
        			for(int k = i-1; k>=0; k--)
        				s[k] = s[i];
        		}
        	}
        	if(s[s.length-1].equals("-"))
        		moves++;
        	System.out.println("Case #" + j + ": "+ moves);
        	writer.println("Case #" + j + ": "+ moves);
        }
        writer.close();
	}
}
