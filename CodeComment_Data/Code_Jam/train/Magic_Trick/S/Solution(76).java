package methodEmbedding.Magic_Trick.S.LYD1061;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[] ) throws Exception {
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
	int i,j,k,ans1,ans2;
	String ans = "";
	String line;
	String A[][] = new String[4][4];
	String B[][] = new String[4][4];
	for(i = 0; i < T; i++){
		ans1 = Integer.parseInt(br.readLine()) - 1; 
		for(j = 0; j < 4; j++){
			line = br.readLine();
			A[j] = line.split(" ");
		}
		ans2 = Integer.parseInt(br.readLine()) - 1; 
		for(j = 0; j < 4; j++){
			line = br.readLine();
			B[j] = line.split(" ");
		}

		int count = 0;
		for(j = 0; j < 4; j++){
			for(k = 0; k < 4; k++){
				if(A[ans1][k].compareTo(B[ans2][j]) == 0){
					ans = A[ans1][k];	
					count++;
				}
			}
		}
		int t = i+1;
		if(count == 1)
			System.out.println("Case #"+t+": "+ans);
		else if(count == 0)
			System.out.println("Case #"+t+": Volunteer cheated!");
		else
			System.out.println("Case #"+t+": Bad magician!");
			
	}

    }
} 
