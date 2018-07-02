package methodEmbedding.Counting_Sheep.S.LYD595;


import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(new File("input.in"));
		PrintWriter pw=new PrintWriter(new File("output.out"));
		int N=Integer.valueOf(sc.nextLine());
		
		for(int x=1;x<=N;x++){
			ArrayList<Character> digits=new ArrayList<Character>();
			int n=Integer.valueOf(sc.nextLine());
			long large=0;
			for(long i=1;i<660000&&digits.size()<10;i++){
				long a=i*n;
				String s=a+"";
				for(int y=0;y<s.length();y++){
					char c=s.charAt(y);
					if(digits.contains(c)){
						continue;
					}else{
						digits.add(c);
					}
				}
				if(digits.size()==10){
				large=a;
				}
			}
			if(digits.size()==10){
				pw.println("Case #"+x+": "+large);
			}else{
				pw.println("Case #"+x+": INSOMNIA");

			}
			
		}
		
		pw.flush();
		pw.close();
		sc.close();
		
		
	}

}
