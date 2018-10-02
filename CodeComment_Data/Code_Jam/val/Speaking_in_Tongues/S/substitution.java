package methodEmbedding.Speaking_in_Tongues.S.LYD1055;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class substitution {

	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in)); //copy test data into standard input
		char[] subs={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		int num=Integer.parseInt(reader.readLine());
		for(int i=1;i<=num;i++){
			String s=reader.readLine();
			System.out.print("Case #"+i+": ");
			for(int j=0;j<s.length();j++){
				char c=s.charAt(j);
				if(c>='a'&&c<='z'){
					System.out.print(subs[c-'a']);		//prints to standard out
				}else{
					System.out.print(c);
				}
			}
			System.out.println();
		}
	}

}

