package methodEmbedding.Revenge_of_the_Pancakes.S.LYD983;

import java.io.*;
import java.util.*;
import java.lang.Math.*;

class RevengeOfThePancakes {
	public static void main(String[] args) throws Exception {
       		int i,j,l,len; 
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String s[] = new String[t+1];
		int b[] = new int[t+1];
		int c[] = new int[t+1];
		for(i=1;i<=t;i++) {
        		s[i] =br.readLine();
			l= s[i].length();
			for(j=l-1;j>=0;j--) {
				if((s[i].charAt(j)) == '-') {
					b[i] = j+1;
					break;
				}
			}
		}
		for(i=1;i<=t;i++) {
			int count = 0 ,k;
			len = b[i];
			int l1 = s[i].length();
			while(len != 0) {
				char[] m = s[i].toCharArray();
				for(j=0;j<len;j++) {
					if(m[j] == '+') {
						m[j] = '-';
					}
					else {
						m[j] ='+' ;
					}
					
				}
				s[i]=new String(m);
				for(k=l1-1;k>=0;k--) {
					if(s[i].charAt(k) == '-' ) {
						len = k+1;
						break;
					}
					else {
						len = k;
					}
				
				}
			count++;
			}
			c[i] = count;
		}		
		for(i=1;i<=t;i++) { 
			 System.out.println("Case #" + i + ": " + c[i]);
		}			
		
	}
}
