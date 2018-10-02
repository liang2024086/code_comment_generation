package methodEmbedding.Standing_Ovation.S.LYD637;

/*
ID: mkural31
LANG: JAVA
TASK: ovation
*/
import java.io.*;
import java.util.*;

public class ovation{
	public static void main (String [] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("ovation.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ovation.out")));
		StringTokenizer sc = new StringTokenizer(f.readLine());
		int t = Integer.parseInt(sc.nextToken());
		for(int waka = 0;waka<t;waka++){
			sc = new StringTokenizer(f.readLine());
			int smax = Integer.parseInt(sc.nextToken());
			String s = sc.nextToken();
			int need = 0;
			int total = 0;
			for(int i = 0;i<=smax;i++){
				System.out.println(total + " " + i);
				if(total>=i){
					total+=((int)s.charAt(i)-(int)'0');
				}
				else{
					need+=i-total;
					total+=i-total;
					total+=((int)s.charAt(i)-(int)'0');
					System.out.println("need " + need);
				}
			}
			out.print("Case #" + (waka + 1) + ": ");
			out.println(need);
		}
		out.close();
		System.exit(0);
	}
}
