package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1304;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
	int i,j,k;
	Double C,F,X;
	String line,ar[];
	Double ans;
	double prev,curr;
	double A[],B[];
	for(i = 0; i < T; i++){
		A = new double[5000];
		B = new double[5000];
		for(k = 0; k < 5000; k++){
			A[k] = B[k] = 0.0;
		}
		line = br.readLine(); 
		ar = line.split(" ");
		C = Double.parseDouble(ar[0]);
		F = Double.parseDouble(ar[1]);
		X = Double.parseDouble(ar[2]);
	
		double rate = 2.0;
		A[0] = B[0] = B[1] = 0;	
		k = 1;
		prev = 0;
		curr = 0;
		while(true){
			A[k] = X/rate;
			B[k+1] = B[k]+ C/rate;
			if(k>1){
				prev = A[k-1] + B[k-1];
				curr = A[k] + B[k];
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
