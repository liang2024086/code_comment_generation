package methodEmbedding.Revenge_of_the_Pancakes.S.LYD592;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class revengePancake {
	public static void main(String[] args) throws IOException {
		StringBuffer sb; 
		Scanner sc = new Scanner(new FileReader("B-small-attempt1.in"));
		int N=Integer.valueOf(sc.nextLine());
		FileOutputStream fs = new FileOutputStream(new File("116.txt"));
		PrintStream p = new PrintStream(fs);
		loop:for(int i=1;i<=N;i++){
			int count=0;
			String str=sc.nextLine();
			System.out.println(str);
			for(int j=str.length()-1;j>=0;j--){
				String s="";
				if(str.charAt(j)=='-'){
					count++;
					
					if(str.charAt(0)=='+'){
						count++;
						for(int k=0;k<str.length()-1;k++){
							if(str.charAt(k)=='+'){
								s="+"+s;
							}
							if(str.charAt(k)=='-'){
								break;
							}
						}
					}
					for(int k=s.length();k<str.length();k++){
						if(str.charAt(k)=='-')
							s="+"+s;
						else
							s="-"+s;
					}
					str=s;
					str=str.substring(0,str.length()-1);
					if(i==94){
						System.out.println(str);
					}
				}
				else{
					str=str.substring(0,str.length()-1);
					if(i==94){
						System.out.println(str);
					}
					continue;
				}
			}
			System.out.println("Case #"+i+": "+count);
			p.println("Case #"+i+": "+count);
		}
	}
}
