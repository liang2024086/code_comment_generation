package methodEmbedding.Speaking_in_Tongues.S.LYD918;

import java.util.Scanner;
import java.io.*;
public class A {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("A-small-attempt1.in"));
		FileWriter f = new FileWriter("A.out");
		int[] recnik = {24,7,4,18,14,2,21,23,3,20,8,6,11,1,10,17,25,19,13,22,9,15,5,12,0,16};
		int T=sc.nextInt();int poz;
		char slovo;
		sc.nextLine();
		for(int t=1;t<=T;t++){
			String s = sc.nextLine();
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)==32){
					sb.append(' ');
					continue;
				}
			
			
			poz=s.charAt(i)-97;
			slovo=(char)(recnik[poz]+97);
			sb.append(slovo);
			
			}
			
			s=new String(sb);
			
			f.write("Case #"+t+": "+s+"\n");
		}
		
		f.close();
	}
	
}
