package methodEmbedding.Cookie_Clicker_Alpha.S.LYD498;

import java.util.*;
class Alpha{
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int T=in.nextInt();
	for(int t=1;t<=T;t++)
	{
		double C=in.nextDouble(),F=in.nextDouble(),X=in.nextDouble();
		double r=2.0;
		double ans=X/r;
		while(r*C+F*C-F*X<0){
			ans+=(r*C+F*C-F*X)/(r*(r+F));
			r+=F;
		}
		System.out.format("Case #%d: %.10f\n",t,ans);
	}
}
}
		
