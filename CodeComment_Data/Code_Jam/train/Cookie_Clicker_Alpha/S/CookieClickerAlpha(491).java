package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1462;

import java.math.BigDecimal;
import java.util.*;


public class CookieClickerAlpha {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		for(int i=1;i<N+1;i++){
			double C = sc.nextDouble();
			double F = sc.nextDouble();
			double X = sc.nextDouble();
			double result= X/2;
			//ArrayList<Double> cf_set = new ArrayList<Double>();
			double cf_price = 0.0;
			int j=0;
			for(;;){
				j++;
			//for(int j=1;j<((X-2)/F)+1;j++){
				cf_price += C/(2+(j-1)*F);
				double temp = X/(2+j*F) + cf_price;
				if(result>temp){
					//break;
					result = temp;
				}else{
					break;
				}
				//result = temp;
			}
			BigDecimal bd = new BigDecimal(result);
			BigDecimal bd1 = bd.setScale(7, BigDecimal.ROUND_HALF_UP); 
			System.out.println("Case #"+i+": "+String.format("%.7f",bd1.doubleValue()));
		}
	}
}
