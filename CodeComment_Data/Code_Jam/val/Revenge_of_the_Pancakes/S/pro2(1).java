package methodEmbedding.Revenge_of_the_Pancakes.S.LYD690;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class pro2 {
	public static void main(String[] args) {
		BufferedReader in; 
		PrintStream out;
		String readString;
		
		try{
				in = new BufferedReader(new InputStreamReader(System.in));
				out = new PrintStream(System.out);

				readString = in.readLine();

int T = Integer.parseInt(readString);

for( int i=0; i<T ; i++ ){
	String S = in.readLine();
	int num_flip = 0;
	int len = S.length();

	char cur = S.charAt(0);
	char bef = cur;

	for( int j=1; j<len; j++ ){
		cur = S.charAt(j);
		if( cur == bef ){}
		else{ num_flip++;}
		bef = cur;
	}

	if( cur == '-' )	num_flip++;

	out.println("Case #"+(i+1)+": "+num_flip);
}






		}
		catch(Exception e){
			;
		}
		
	
	}

}
