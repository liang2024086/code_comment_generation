package methodEmbedding.Revenge_of_the_Pancakes.S.LYD419;

import java.io.*;
import java.util.*;
public class Code2{
	public static void main(String... args) throws Exception{
		BufferedReader br=new BufferedReader(new FileReader("B-small-attempt0.in"));
		PrintWriter pw=new PrintWriter("output2.txt");
		int t=Integer.parseInt(br.readLine());
		for(int i=1;i<=t;i++){
			String s=br.readLine();
			if(!s.contains("-")){
				pw.println("Case #"+i+": 0");
			}
			else if(!s.contains("+")){
				pw.println("Case #"+i+": 1");
			}
			else{
				int c=0;
				boolean neg=false;
				int sn=s.length();
				for(int j=0;j<sn;j++){
					if(s.charAt(j)=='-'){
						neg=true;
					}
					else if((s.charAt(j)=='+')&&(neg==true)){
						neg=false;
						c++;
						if((j<(sn-1))&&(s.charAt(j+1)=='-')){
							c++;
						}
					}
					else if((s.charAt(j)=='+')&&(neg==false)){
						if((j<(sn-1))&&(s.charAt(j+1)=='-')){
							c++;
						}
					}
				}
				if(neg){
					c++;
				}
				pw.println("Case #"+i+": "+c);
			}
		}
		pw.close();
	}
}
