package methodEmbedding.Speaking_in_Tongues.S.LYD1565;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A_speaking_in_tongues {
	static public void main(String[] args){
		String s1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
		String s2 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		String s3 = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
		
		String in1 = "our language is impossible to understand";
		String in2 = "there are twenty six factorial possibilities";
		String in3 = "so it is okay if you want to just give up";
		
		char ar[] = new char[26];
		for(int i=0;i<26;i++){
			ar[i] = 0;
		}
		
		ar['q'-'a'] = 'z';
		String s = s1+s2+s3;
		String in = in1+in2+in3;
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) != ' ')
				ar[s.charAt(i) - 'a'] = in.charAt(i);
			
		}
		int remain =0;
		int ar1[] = new int[26];
		for(int i=0;i<26;i++){
			ar1[i] = 0;
		}
		for(int i=0;i<26;i++){
			if(ar[i] != 0){
				ar1[ar[i]-'a'] = 1;
			}
			else{
				remain = i;
			}
		}
		for(int i=0;i<26;i++){
			if(ar1[i] ==0){
				ar[remain] = (char) ('a'+i);
			}
		}
		
		try {
			Scanner inp = new Scanner(new FileInputStream("A_s_input.txt"));
			int i=0,j=0,k=0,tc=0;
			int T = inp.nextInt();
			inp.nextLine();
			for(tc=0;tc<T;tc++){
				String st = inp.nextLine();
				String result = "";
				for(j=0;j<st.length();j++){
					if(st.charAt(j) != ' ')
						result = result+ ar[st.charAt(j)-'a'];
					else
						result = result+ ' ';
				}
				
				k=tc+1;
				System.out.println("Case #" + k +": "+result);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
