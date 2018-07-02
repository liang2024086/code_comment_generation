package methodEmbedding.Counting_Sheep.S.LYD333;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class pro1 {
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
	readString = in.readLine();
	int N = Integer.parseInt(readString);
	if( N == 0 ){
		out.println("Case #"+(i+1)+": INSOMNIA");
		continue;
	}

	boolean[] mask = new boolean[10];

	int sum = 0; // when sum = 46 ( 0 == 1 )
	int cur_N = 0;
	while( sum < 46 ){
		cur_N += N;
		int temp = cur_N;
		while( temp != 0 ){
			int digit = temp % 10;
			if( !mask[digit] ){
				sum += digit;
				if( digit == 0 ) sum++;
				mask[digit] = true;
			}
			temp /= 10;
//out.println("temp "+temp);
//out.println("sum"+sum);
		}
	}
	

	out.println("Case #"+(i+1)+": "+cur_N);
}






		}
		catch(Exception e){
			;
		}
		
	
	}

}
