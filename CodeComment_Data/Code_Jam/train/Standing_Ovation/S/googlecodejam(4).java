package methodEmbedding.Standing_Ovation.S.LYD384;

import java.util.*;
import java.io.*;
public class googlecodejam{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
		int n = Integer.parseInt(in.readLine());
		for(int x=0;x<n;x++){
			String str = in.readLine();
			int num1 = Integer.parseInt(str.substring(0,str.indexOf(" ")));
			int [] arr = new int[num1+1];
			for(int y=0;y<arr.length;y++){
				arr[y] = Integer.parseInt(""+str.charAt(str.indexOf(" ")+1+y));
			}
			int people = 0;
			int count = 0;
			for(int y=0;y<arr.length;y++){
				if(people<y){
					count++;
					people++;
				}
				people+=arr[y];
			}
			System.out.println("Case #"+(x+1)+": "+count);
		}
	}
}
