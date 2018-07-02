package methodEmbedding.Cookie_Clicker_Alpha.S.LYD71;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
	int i,j,k;
	Double C,F,X;
	String line,ar[];
	Double ans;
	double prev,curr;
	double ARR[],BRR[];
	for(i = 0; i < t; i++){
		ARR = new double[500001];
		BRR = new double[500001];
		for(k = 0; k < 500000; k++){
			ARR[k] = BRR[k] = 0.0;
		}
		line = br.readLine(); 
		ar = line.split(" ");
		C = Double.parseDouble(ar[0]);
		F = Double.parseDouble(ar[1]);
		X = Double.parseDouble(ar[2]);
	
		double rate = 2.0;
		ARR[0] = BRR[0] = BRR[1] = 0;	
		k = 1;
		prev = 0;
		curr = 0;
		while(true){
			ARR[k] = X/rate;
			BRR[k+1] = BRR[k]+ C/rate;
			if(k>1){
				prev = ARR[k-1] + BRR[k-1];
				curr = ARR[k] + BRR[k];
			}
			if(prev < curr)
				break;		
			k++;
			rate += F;
		}	
		System.out.println("Case #"+(i+1)+": "+ prev);	 

	}


    }
} 
