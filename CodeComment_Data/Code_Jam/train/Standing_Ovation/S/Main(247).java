package methodEmbedding.Standing_Ovation.S.LYD1420;

import java.util.*;

public class Main {
	public static void main(String[] args){
		// TODO ?????????????????\?b?h?E?X?^?u
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int i=1;i<=test;i++){
			int max = sc.nextInt();
			String a = sc.next();
			int ans=0;
			int now=Integer.parseInt(a.charAt(0)+"");
			for(int j=1;j<a.length();j++){
				if(now<j){
					ans+=j-now;
					now+=j-now;
					now+=Integer.parseInt(a.charAt(j)+"");
				}else{
					now+=Integer.parseInt(a.charAt(j)+"");
				}
			}
			System.out.println("Case #"+i+": "+ans);
		}
	}
}
