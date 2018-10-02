package methodEmbedding.Standing_Ovation.S.LYD401;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class pro1 {

	
	public static void main(String[] args) {
		BufferedReader br; 
		BufferedWriter bw;
		
		StringTokenizer st;
		
		int T;

		try{
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));

			T = Integer.parseInt(br.readLine());
			for( int j=0; j<T; j++){
				st = new StringTokenizer(br.readLine());
				int S = Integer.parseInt(st.nextToken());
				int[] array = new int[S+1];

				String str = st.nextToken();
				for( int i= 0; i < S+1; i++){
					array[i] = Integer.parseInt(str.substring(i, i+1));
				}
				
				int sum = 0;
				int friend = 0;
				for( int i=0; i< S+1; i++){
					if( array[i] == 0 )	continue;
					if( sum < i ){
						friend += i-sum;
						sum = i;
					}
					sum += array[i];
				}

				bw.write("Case #"+(j+1)+": "+friend+"\n");
			
			}
			br.close();
			bw.close();
		}
		catch(Exception e){
			;
		}
		
	
	}

}

