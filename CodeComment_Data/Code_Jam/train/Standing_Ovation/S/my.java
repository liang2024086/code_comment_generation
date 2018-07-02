package methodEmbedding.Standing_Ovation.S.LYD56;

import java.io.*;
import java.util.*;
 
class code {


	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner keyboard = new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 
		 int t = Integer.parseInt(br.readLine());
		 int s=0;
		 int n,i,o;
		 int ans;
		 o=1;
		 
		 while(t>0){

			 String[] A = br.readLine().split(" ");
			 
			 n= Integer.parseInt(A[0]);
			 s=0;
			 i=0;
			 ans = 0;
			 
			 while(n>0){
				 	
				 s= s + A[1].charAt(i)-48;
				 i++;
				 
				 if(s<i){
					 
					 ans = ans + (i-s);
					 
					 s = i;
				 }
				 
				 n=n-1;
				 
			 }
			 //Case #1: 0
			System.out.println("Case #"+o+": "+ans);
			 t=t-1;
			 o=o+1;
		 
		 }
		 
		
		 
}
}
