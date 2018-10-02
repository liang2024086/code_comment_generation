package methodEmbedding.Speaking_in_Tongues.S.LYD752;

import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner S= new Scanner(System.in);
		char[] caracteres= {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		String a,b;
		int T= S.nextInt(), i ,j;
		S.nextLine();
		for(i=0;i<T;i++){
			a= S.nextLine();
			b="";
			for(j=0;j<a.length();j++){
				if(a.charAt(j)!=' '){
					b+= caracteres[a.charAt(j)-'a'];
				}else{
					b+=' ';
				}
			}
			System.out.println("Case #"+(i+1)+": "+b);
		}
	}
}
