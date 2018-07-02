package methodEmbedding.Revenge_of_the_Pancakes.S.LYD977;

import java.io.*;
import java.util.Scanner;
import java.lang.*;

class q1{
	public static void main(String[]args) throws UnsupportedEncodingException,FileNotFoundException,IOException{
		int t,i,count,index;
		char ch;
		String s;
		FileInputStream fis = new FileInputStream("B-small-attempt0.in") ;
		Scanner sc = new Scanner(fis);
		t=sc.nextInt();
		PrintWriter writer = new PrintWriter("out1.txt", "UTF-8");
		for(i=1;i<=t;i++){
			count = 0;
			ch = '-';
			s = sc.next();
			index = s.length();
			while((index=s.lastIndexOf(ch, index)-1)>=-1){
				ch = ch=='+'?'-':'+';
				count++;
			}
			System.out.println("Case #"+i+":"+count);
			writer.println("Case #"+i+": "+count);
		}
		writer.close();
	}
}
