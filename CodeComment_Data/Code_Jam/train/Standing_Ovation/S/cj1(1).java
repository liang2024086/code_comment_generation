package methodEmbedding.Standing_Ovation.S.LYD1307;

import java.io.*;
import java.util.*;
public class cj1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("A-small-attempt0.in"));
	//	StringTokenizer st = new StringTokenizer(sc.nextLine());
		int T = sc.nextInt();
		int ct=1;
		while (ct<=T)
		{	System.out.print("Case #"+ct+": ");
 
			int smax=sc.nextInt();
			String si=sc.next();
			char[] x=si.toCharArray();
		    int added=0;
		    int total=x[0]-'0';
			for (int i=1;i<x.length;i++)
			{	//		System.out.println("i="+i);
				if(i>total){
					added += i-total;
					//System.out.println("c1 added="+i+"total="+total);
					total=i;
			
				} 
				total+=x[i]-'0';
				//System.out.println("c2 total="+total);
			}
			System.out.println(added);
			ct++;
		}
	}

}
