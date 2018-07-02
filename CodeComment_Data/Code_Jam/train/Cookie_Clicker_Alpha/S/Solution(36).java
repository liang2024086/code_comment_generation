package methodEmbedding.Cookie_Clicker_Alpha.S.LYD82;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

class Solution {

    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

	int i,j,k;

	Double C,F,X;
	String str,ar[];
	Double ans;
	double prev,curr;
	double arr[],A[];
	for(i = 0; i < t; i++){

		arr = new double[500010];
		A = new double[500010];
		for(k = 0; k < 500000; k++){
			arr[k] = A[k] = 0.0;
		}

		str = br.readLine(); 
		ar = str.split(" ");
		C = Double.parseDouble(ar[0]);
		F = Double.parseDouble(ar[1]);
		X = Double.parseDouble(ar[2]);
	
		double rate = 2.0;
		arr[0] = A[0] = A[1] = 0;	
		k = 1;
		prev = 0;
		curr = 0;
		while(true){

			arr[k] = X/rate;
			A[k+1] = A[k]+ C/rate;

			if(k>1){
				prev = arr[k-1] + A[k-1];
				curr = arr[k] + A[k];
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
