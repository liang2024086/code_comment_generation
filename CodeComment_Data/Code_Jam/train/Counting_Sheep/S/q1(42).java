package methodEmbedding.Counting_Sheep.S.LYD1369;

import java.io.*;
import java.util.Scanner;
import java.lang.*;

class q1{
	public static void main(String[]args) throws UnsupportedEncodingException,FileNotFoundException,IOException{
		int t,i,j;
		long n,a,x,l;
		boolean c[] = new boolean[10];
		boolean flag;
		FileInputStream fis = new FileInputStream("A-small-attempt0.in") ;
		Scanner sc = new Scanner(fis);
		t=sc.nextInt();
		PrintWriter writer = new PrintWriter("out1.txt", "UTF-8");
		for(i=1;i<=t;i++){
			n = sc.nextLong();
			if(n==0)	writer.println("Case #"+i+": INSOMNIA");
			else{
				for(j=0;j<10;j++){
					c[j] = false;
				}
				x=0;
				flag = false;
				while(!flag){
					x+=n;
					for(a=x;a!=0;a/=10){
						c[(int)a%10] = true;
					}
					flag = true;
					for(j=0;j<10;j++){
						if(!c[j])	flag = false;
					}
				}
				writer.println("Case #"+i+": "+x);
			}
		}
		writer.close();
	}
}
