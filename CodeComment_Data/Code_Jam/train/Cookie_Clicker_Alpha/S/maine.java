package methodEmbedding.Cookie_Clicker_Alpha.S.LYD256;

import java.util.Scanner;


public class maine {
	static double f;
	static double total;
	static double t1;
	static double t2;
	static double y;
	static double s;
	static double tone;
	static double time=0;
	static double frame;
public static void main (String []args){
	double c;
	double x,t;
	int i;
	Scanner man=new Scanner(System.in);
	t=man.nextInt();
	for ( i = 1; i <t+1; i++) {
		c= man.nextFloat();
		f=man.nextFloat();
		x=man.nextFloat();
		s=2;
		frame=s;
		 t1=x/s;
		 t2=(c/s)+(x/(f+s));
		total=f+s;
		if (t2>t1){
			y=t1;
		}
		else{
			
			while(t1>t2){
				total =total+f;
				t1=t2;
				frame=s;
				time=0;
			for (int j = 0; j <(total-s)/f; j++) {
				 
				tone =c/frame;
				time= time +tone;
				frame=frame +f;
				
			}
		
			t2= time +	x/(total );
				
			}
			y=t1;
		}
		 
		System.out.print("Case " + "#"+i+": "+y+     "\n");
	}
}
}
