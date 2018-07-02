package methodEmbedding.Cookie_Clicker_Alpha.S.LYD113;

import java.util.*;

public class CookieClickerAlpha{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++){
			double C = sc.nextDouble();
			double F = sc.nextDouble();
			double X = sc.nextDouble();
			
			double t=0;
			double t_next=0;
			double t_setup = 0;
			int n=0;
			boolean loop = true;
			
			while(loop){
				if(n==0){
					t = X / 2;
				}else{
					t_setup += C / (2 + (n-1)*F);
					t_next = t_setup + X / (2 + n*F);
					
					if(t>t_next){
						t = t_next;
					}else{
						loop = false;
					}
				}
				n++;
			}
			System.out.println("Case #"+(i+1)+": "+t);
		}
		
	}
	
}
