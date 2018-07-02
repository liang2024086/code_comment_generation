package methodEmbedding.Counting_Sheep.S.LYD302;

import java.io.*;
import java.util.*;
public class CountingSheep {
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[]args)throws Exception{
		int t=Integer.parseInt(br.readLine());
		Set<Integer> set;
		
		for(int c=0;c<t;c++) {
			int num=0;
			set=new TreeSet<Integer>();
			int n=Integer.parseInt(br.readLine());
			System.out.print("Case #"+(c+1)+": ");;
			if(n==0) {
				System.out.println("INSOMNIA");
				continue;
			}
			int sum=0;
			for(int i=0;i<10000;i++) {
				sum+=n;
				String s=Integer.toString(sum);
				for(int j=0,p=s.length();j<p;j++) {
					set.add((int)s.charAt(j));
				}
				if(set.size()==10) {
					num=i+1;
					break;
				}
			}
			if(num==0) {
				System.out.println("INSOMNIA");
			}
			System.out.println(sum);
		}
		
	}

}
