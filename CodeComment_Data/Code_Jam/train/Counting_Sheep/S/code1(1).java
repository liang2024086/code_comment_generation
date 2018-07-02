package methodEmbedding.Counting_Sheep.S.LYD400;

import java.io.*;
import java.util.*;
class code1{
	public static void main(String... args) throws Exception{
		BufferedReader br=new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter pw=new PrintWriter("output.txt");
		int t=Integer.parseInt(br.readLine());
		for(int i=1;i<=t;i++){
			int n=Integer.parseInt(br.readLine());
			if(n==0){
				pw.println("Case #"+i+": INSOMNIA");
			}
			else{
				String s="";
				for(int j=1;;j++){
					if(s.length()==10){
						pw.println("Case #"+i+": "+(n*(j-1)));
						break;
					}
					else{
						long aa=(long)n*j;
						String ss=aa+"";
						for(int k=0;k<ss.length();k++){
							CharSequence cs=ss.charAt(k)+"";
							if(!s.contains(cs)){
								s+=ss.charAt(k);
							}
						}
						
					}
				}
			}
		}
		pw.close();
	}
}
