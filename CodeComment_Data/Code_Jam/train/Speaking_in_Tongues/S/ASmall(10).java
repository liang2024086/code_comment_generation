package methodEmbedding.Speaking_in_Tongues.S.LYD1;

import java.io.*;

class ASmall {
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		char ar[]={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q',};
		for(int i=0;i<n;i++){
			String old=br.readLine();
			String ne="";
			for(int j=0;j<old.length();j++){
				if(old.charAt(j)==' ')ne+=" ";
				else ne+=ar[old.charAt(j)-97];
			}
			System.out.println("Case #"+(i+1)+": "+ne);
		}
	}
}
