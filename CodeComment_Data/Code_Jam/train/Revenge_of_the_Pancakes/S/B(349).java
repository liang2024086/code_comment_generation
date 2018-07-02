package methodEmbedding.Revenge_of_the_Pancakes.S.LYD814;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;


public class B {

	private static String fileName = "b";
	private static String inputFileName = fileName + ".in";
	private static String outputFileName = fileName + ".out";
	
	public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
		Scanner in = new Scanner(new File(inputFileName));
		PrintWriter out = new PrintWriter(outputFileName);
		int tests = Integer.parseInt(in.nextLine());
	
		for (int t = 1; t <= tests; t++) {
			String s=in.nextLine();
			char[] ar=s.toCharArray();
			ArrayList<Integer> list=new ArrayList<Integer>();
			out.print("Case #"+t+": ");
			char pre='A';
			int ans=0;
			for(char a:ar){
				if(pre!=a && a=='-'){
					if(pre=='+'){
						ans+=2;
					}
					else{
						ans++;
					}
				}
				pre=a;
			}
			out.println(ans);
		}
		in.close();
		out.close();
	}

}
