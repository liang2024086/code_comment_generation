package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1228;

import java.util.*;
public class Cookie {
  public static void main(String[] args){
	  Scanner input = new Scanner(System.in);
	  int cases = input.nextInt();
	  for(int caseNo = 0; caseNo < cases ; caseNo++){
		  double C = input.nextDouble();
		  double F = input.nextDouble();
		  double X = input.nextDouble();
		  double S = 2.0;
		  
		  double t1 = X/S;
		  double t2 = C/S + X/(S+F);
		  
		  int cnt = 1;
		  while(t1 > t2){
			  t1 = t2;
			  t2 = 0;
			  for(int i = 0; i <= cnt ; i++){
				  t2 += C/(S+i*F);
			  }
			  t2 += X/(S+ (++cnt * F));
			  
			 
		  }
		  System.out.printf("Case #%d: %.7f\n",(caseNo+1),Math.round(t1*1e7)/1e7);
	  }
  }
}
