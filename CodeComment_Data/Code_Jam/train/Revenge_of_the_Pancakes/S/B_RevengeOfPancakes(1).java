package methodEmbedding.Revenge_of_the_Pancakes.S.LYD440;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class B_RevengeOfPancakes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = sc.nextInt();
		int n=1;
		while(t-->0){
			char s[] = sc.next().toCharArray();
			int len = s.length,cnt = 0,ans = 0;
			char last = s[0];
			for(int i=0;i<len-1;i++){
				if(s[i]!=s[i+1]){
					cnt++;
					last = s[i+1];
				}
			}
			if(last=='-')
				cnt++;
			System.out.println("Case #"+n+": " + cnt);
			n++;
		}
	}
}
