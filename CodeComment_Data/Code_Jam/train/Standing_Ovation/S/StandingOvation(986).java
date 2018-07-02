package methodEmbedding.Standing_Ovation.S.LYD411;

import java.io.*;
import java.util.Scanner;
public class StandingOvation{
	public static void main(String[]args) throws UnsupportedEncodingException,FileNotFoundException{
		int t,r,n,x,i,sum,c;
		String s;
		FileInputStream fis = new FileInputStream("A-small-attempt1.in") ;
		PrintWriter writer = new PrintWriter("out.txt", "UTF-8");
		Scanner sc = new Scanner(fis);
		t = sc.nextInt();
		for(x=0;x<t;x++){
			sum=0;r=0;
			n=sc.nextInt();
			s = sc.next();
			int l = s.length();
			for(i=0;i<l;i++){
				c=s.charAt(i)-48;
				if(i>sum){
					r=r+i-sum;
					sum=i;
				}
				sum+=c;
			}
			writer.println("Case #"+(x+1)+": "+r);
		}
		writer.close();
	}
}
