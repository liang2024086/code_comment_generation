package methodEmbedding.Standing_Ovation.S.LYD2078;

import java.io.*;
import java.util.*;
class A{

	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(new FileInputStream("A-small-attempt0.in"));

		int T = Integer.parseInt(sc.nextLine());
		
		FileWriter fw = new FileWriter("output.txt",false);
	
		

		for(int ctr=0; ctr<T; ctr++){

			int MAX = sc.nextInt();
			int stood = 0;
			int needed = 0;

			String aud = sc.next();
			
			char arr[] = aud.toCharArray();
			
			int a[] = new int[arr.length];
			
			for(int j=0;j<arr.length;j++){
				a[j] = arr[j] - '0';
			}
			
			for(int i=0;i<a.length;i++){
				if(i == 0){
					stood = a[0];
				}else{
					if((stood+needed) >= i){
						stood += a[i];
					}else{
						needed += i-(stood+needed);
						stood += a[i];
					}
				}
				
			}

			fw.write("Case #"+(ctr+1)+": "+needed+System.lineSeparator());

		}
		
		fw.close();

	}
	
}
