package methodEmbedding.Cookie_Clicker_Alpha.S.LYD983;

import java.util.*;

public class Cookie {

	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int tt = input.nextInt();	//no. of test cases
		double seconds[] = new double[tt];
		for(int z=0;z<tt;z++){
		double c = input.nextDouble();     //Cost of farm
		double F = input.nextDouble(); 	//cookies per second
		double x = input.nextDouble(); 	//no. of cookies to win
		double n = 2;
		double cookies=0;
		double temp=0;
		while(cookies<x){
			temp=c/n;
			if((c/n+x/(n+F))<x/n){
				n+=F;
				seconds[z]+=temp;
			
			}
			else{
				temp=x/n;
				seconds[z]+=(x/n);
				break;
			}
			
		}
		
		
		
		}
		
		for(int z=0;z<tt;z++)
		System.out.println("Case #"+(z+1)+": "+seconds[z]);
	}
}
