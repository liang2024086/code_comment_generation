package methodEmbedding.Cookie_Clicker_Alpha.S.LYD508;


import java.math.BigDecimal;
import java.util.Scanner;

public class CookieClickerAlpha {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		in.nextLine();
		//BigDecimal[] result=new BigDecimal[T];
		double[] result=new double[T];
		for(int i=0;i<T;i++){
/*			BigDecimal C=new BigDecimal(""+in.nextFloat());
			BigDecimal F=new BigDecimal(""+in.nextFloat());
			BigDecimal X=new BigDecimal(""+in.nextFloat());
			BigDecimal speed=new BigDecimal("2.0");
			BigDecimal time=new BigDecimal("0.0");*/
			double C=in.nextDouble();
			double F=in.nextDouble();
			double X=in.nextDouble();
			double speed=2.0;
			double time=0.0;
			while(X>C){
				if(C/speed+X/(speed+F)<X/speed){
					time+=C/speed;
					speed+=F;
				}else{
					time+=X/speed;
					break;
				}
			}
			if(X<C){
				time+=X/speed;
			}
			/*while(X.compareTo(C)>0){
				if((C.divide(speed,8,BigDecimal.ROUND_DOWN).add(X.divide(speed.add(F),8,BigDecimal.ROUND_DOWN))).compareTo(X.divide(speed,8,BigDecimal.ROUND_DOWN))<0){
					time=time.add(C.divide(speed,8,BigDecimal.ROUND_DOWN));
					speed=speed.add(F);
				}else{
					time=time.add(X.divide(speed,8,BigDecimal.ROUND_DOWN));
					break;
				}
			}
			if(X.compareTo(C)<0){
				time=time.add(X.divide(speed,8,BigDecimal.ROUND_DOWN));
			}*/
			result[i]=time;
		}
		for(int i=0;i<T;i++){
			System.out.println("Case #"+(i+1)+": "+result[i]);
		}
	}

}
