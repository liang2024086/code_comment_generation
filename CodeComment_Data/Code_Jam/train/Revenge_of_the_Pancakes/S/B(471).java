package methodEmbedding.Revenge_of_the_Pancakes.S.LYD246;

import java.util.*;
import java.io.*;
import java.math.*;

public class B {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(new BufferedReader(new FileReader("B-small-attempt0.in")));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
		int T = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < T; i++) {
			String pancake_stack = sc.nextLine();
			String[] pank = pancake_stack.split("");
			String temp = pank[0];
			int count = 0;
			for(String sign: pank){
				if(!sign.equals(temp)){
					count += 1;
					temp = sign;
				}
			}
			if(pank[pank.length - 1].equals("+")){
				out.println("Case #" + (i+1) + ": "+count);
			}
			else{
				out.println("Case #" + (i+1) + ": "+ (count+1));
			}
		}
		sc.close();
		out.close();
	}
}
