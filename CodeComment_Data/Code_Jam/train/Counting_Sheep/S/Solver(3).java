package methodEmbedding.Counting_Sheep.S.LYD902;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Solver{
	public static void main(String[] args) throws Exception{
		Scanner scan=new Scanner(new FileReader("A-small-attempt0.in"));
		int N=scan.nextInt();
		long num;
		int j=0;
		boolean isInsomnia;
		while(scan.hasNextLine()){
			isInsomnia=false;
			num=scan.nextInt();
			j++;
			
			long c=1;
			long prod=num;
			
			HashSet hs=new HashSet();
			HashSet hsX=new HashSet();
			String str=""+num*c;
			
			char[] ch=str.toCharArray();
			if(hsX.contains(str)){
				System.out.println("Case #"+j+": "+"insomnia");
				isInsomnia=true;
				continue;
			}
			else{
				hsX.add(str);
			}
			
			for(int i=0; i<ch.length;i++){
				if(!hs.contains(ch[i])){
					hs.add(ch[i]);
				}
			}
		
			while(true){
				if(hs.size()==10){
					break;
				}
				c++;
				prod=num*c;
				str=""+prod;
				ch=str.toCharArray();
				if(hsX.contains(str)){
					System.out.println("Case #"+j+": "+"insomnia");
					isInsomnia=true;
					break;
				}
				else{
					hsX.add(str);
				}
				
				
				for(int i=0;i<ch.length;i++){
					if(!hs.contains(ch[i])){
						hs.add(ch[i]);
					}
				}
			}
			
				if(!isInsomnia){
					System.out.println("Case #"+j+": "+prod);
				}
				
			
			
		}
	}
}
