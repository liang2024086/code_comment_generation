package methodEmbedding.Revenge_of_the_Pancakes.S.LYD568;

import java.io.*;
import java.util.*;

public class codejam2 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		String s = "";
		for(int i = 1; i <= n; i++) {
			s = sc.nextLine();
			boolean pos = true;
			long res = 0;
			if(s.length() == 0){
				System.out.println("Case #" + i + ": " +0);
				continue;
			}
			for(int j = s.length() - 1; j >= 0; j--) {
				if(s.charAt(j) == '+'){
					if (!pos){
						pos = true;
						res++;
					}
				}else {
					if (pos){
						pos = false;
						res++;
					}
				}
			}	
			System.out.println("Case #" + i + ": " + res);
		}
		sc.close();
	}

}
