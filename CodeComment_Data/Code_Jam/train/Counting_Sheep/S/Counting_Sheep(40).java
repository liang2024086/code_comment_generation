package methodEmbedding.Counting_Sheep.S.LYD1562;

import java.io.*;
import java.util.*;
public class Counting_Sheep {
	static Scanner reader;
	static PrintWriter outWrite;
	static long n,res;
	static boolean seen[]=new boolean[256];
	public static void main(String[] args) throws Exception {
		reader=new Scanner(new File("A-small-attempt0.in"));
		outWrite=new PrintWriter(new File("countSheepOutput.txt"));
		int nTest=reader.nextInt();
		for (int test=1;test<=nTest;test++){
			n=reader.nextLong();
			
			if (test>1)
				outWrite.println();
			outWrite.print("Case #"+test+": ");
			if (n==0){
				outWrite.print("INSOMNIA");
				continue;
			}
			Arrays.fill(seen,false);
			for (res=1;true;res++){
				String s=Long.toString(res*n);
				for (int i=0;i<s.length();i++){
					seen[s.charAt(i)]=true;
				}
				boolean done=true;
				for(char c='0';c<='9';c++){
					if (seen[c]==false) {
						done=false;
						break;
					}
				}
				if (done==true) 
					break;
			}
			outWrite.print(res*n);
		}
		outWrite.close();

	}

}
