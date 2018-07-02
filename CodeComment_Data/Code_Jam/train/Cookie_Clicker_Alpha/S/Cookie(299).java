package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1591;

import java.util.*;

public class Cookie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double c=0.0,f=0.0,x=0.0;
		int tc=sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=tc;i++){
			String[] line = sc.nextLine().split(" ");
			//c=sc.nextDouble();
			//f=sc.nextDouble();
			//x=sc.nextDouble();
			c=Double.parseDouble(line[0]);
			f=Double.parseDouble(line[1]);
			x=Double.parseDouble(line[2]);
			double sum = c/2;
			double r1 = x/2;
			double r2 = x/(2+f)+sum;
			double fnew = 2;
			while(r2<r1){
				fnew=fnew+f;
				r1=r2;
				sum+=(c/fnew);
				r2=(sum+(x/(fnew+f)));
				
				
				
			}
			
			System.out.println("Case #"+i+": "+r1);
			
			
			
		}
		
	}

}

