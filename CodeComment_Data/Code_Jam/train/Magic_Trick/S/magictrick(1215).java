package methodEmbedding.Magic_Trick.S.LYD23;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class magictrick
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader f = new BufferedReader(new FileReader("magictrick.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("magictrick.out")));
		int t = Integer.parseInt(f.readLine());
		for(int cas = 0;cas<t;cas++){
			int a = Integer.parseInt(f.readLine());
			int sa[][] = new int[4][4];
			for(int i = 0;i<4;i++){
				StringTokenizer st = new StringTokenizer(f.readLine());
				for(int j = 0;j<4;j++){
					sa[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			ArrayList<Integer> s = new ArrayList<Integer>();
			for(int j=0;j<4;j++){
				s.add(sa[a-1][j]);
			}
			int b = Integer.parseInt(f.readLine());
			for(int i = 0;i<4;i++){
				StringTokenizer sr = new StringTokenizer(f.readLine());
				for(int j = 0;j<4;j++){
					sa[i][j]=Integer.parseInt(sr.nextToken());
				}
			}
			ArrayList<Integer> ss = new ArrayList<Integer>();
			for(int i : s){
				for(int j=0;j<4;j++){
					if (i==sa[b-1][j]){
						ss.add(i);
					}
				}
			}
			out.print("Case #" + (cas+1) + ": ");
			if(ss.size()==0){
				out.println("Volunteer cheated!");
			}
			if(ss.size()>1){
				out.println("Bad magician!");
			}
			if(ss.size()==1){
				out.println(ss.get(0));
			}
		}
		out.close();
		System.exit(0);
	}
}
//for the record I don't know how to code
