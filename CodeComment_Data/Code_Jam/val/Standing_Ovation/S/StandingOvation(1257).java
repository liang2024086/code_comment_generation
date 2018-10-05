package methodEmbedding.Standing_Ovation.S.LYD1672;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class StandingOvation {
	public static void main(String args[]) throws IOException{
		//Scanner s=new Scanner(System.in);
		Scanner s=new Scanner(new FileReader("A-small-attempt1.in"));
		//PrintWriter pw=new PrintWriter(System.out);
		PrintWriter pw=new PrintWriter("output1.out","UTF-8");
		//BufferedWriter bw=new BufferedWriter(new FileWriter("output.txt"));
		int t=s.nextInt();
		for(int test=1;test<=t;test++){
			String waste=s.next();
			String str=s.next();
			int sum=0,count=0;
			for(int i=0;i<str.length();i++){
				int num=str.charAt(i)-48;
				if(num!=0){
					if(sum<i){
						count+=i-sum;
						sum+=count;
					}
					sum+=str.charAt(i)-48;
				}
			}
			pw.println("Case #"+test+": "+count);
		}
		pw.close();
	}

}
