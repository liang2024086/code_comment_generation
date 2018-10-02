package methodEmbedding.Standing_Ovation.S.LYD417;

import java.io.*;
import java.util.*;

class StandingOvation{

	static long[] arr;
	static long extra;
	

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t=0; t<tc; t++){
		
			int smax = sc.nextInt();
			String shyness = sc.next();
			arr = new long[smax+1];
			for(int i=0; i<=smax; i++){
				arr[i] = Integer.parseInt(shyness.charAt(i)+"");
			}
			extra = 0;
			for(int i=1; i<=smax; i++){
				if(arr[i] >0 && i - arr[i-1] > 0){
					extra += i - arr[i-1];
					arr[i] += (arr[i-1] + extra);
				}else{
					arr[i] += arr[i-1];
				}
			}
			System.out.println("Case #"+(t+1)+": "+extra);
		}
	}

}
