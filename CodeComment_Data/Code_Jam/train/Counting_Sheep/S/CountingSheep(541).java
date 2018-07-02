package methodEmbedding.Counting_Sheep.S.LYD1165;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CountingSheep {
	static int MAX_T = 100;
	static int MAX_N = 1000000;
	public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        int cnt ;
        for( int k = 1 ; k  <= T ; k ++ ){
        	 cnt = 0;
        	line = br.readLine();
        	int N  = Integer.parseInt(line);
	        boolean [] check = new boolean[10];
	        for( int i = 0 ; i < 10 ; i ++ )check[i] = false;
	        for( int i = 1 ; cnt < 10 && i < 1e6 ; i ++ ){
	        	if(N == 0)break;
	        	int temp = i * N ;
	        	while(temp>0){
	        		int t = temp % 10;
	        		temp /= 10;
	        		if(!check[t]){
	        			check[t] = true;
	        			cnt ++ ;
	        			if(cnt == 10){
	        				System.out.println("Case #" + k + ": " + (i*N));
	        				break;
	        			}
	        		}
	        	}
	        }
	        if(cnt < 10)System.out.println("Case #" + k + ": INSOMNIA");
        }
	}
}
