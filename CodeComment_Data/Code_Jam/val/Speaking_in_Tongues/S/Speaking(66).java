package methodEmbedding.Speaking_in_Tongues.S.LYD316;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Speaking {

	static char ab[]={ 'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("/home/debian/Descargas/A-small-attempt0.in"));
		int f = Integer.parseInt(br.readLine());
		String input = "";
		for(int i=0;i<f;i++){
			System.out.print("Case #"+(i+1)+": ");
			input = br.readLine();
			for(int j=0;j<input.length();j++){
				if(input.charAt(j)!=' '){
					System.out.print(ab[input.charAt(j)-'a']);
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
