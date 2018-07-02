package methodEmbedding.Standing_Ovation.S.LYD1253;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class StandingOvation {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader read = new BufferedReader(new FileReader("A-small-attempt1.in"));
		PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter("StandingOvation.txt")));
		StringTokenizer st;
		int t=Integer.parseInt(read.readLine());
		int index=1;
		while(index<=t){
			st=new StringTokenizer(read.readLine());
			int n=Integer.parseInt(st.nextToken());
			String ch=st.nextToken();
			int c=0;
			int s=ch.charAt(0)-48;
			for(int i=1;i<ch.length();i++){
				if(ch.charAt(i)!='0'&&ch.charAt(i-1)=='0'){
					if(i>s){
						c+=i-s;
						s+=c;
					}
				}
				s+=ch.charAt(i)-48;
			}
			write.println("Case #"+index+": "+c);
			index++;
		}
		write.close();
		read.close();
		System.exit(0);
	}

}
