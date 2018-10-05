package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1341;


import java.util.ArrayList;
import java.util.Scanner;

public class cd2 {
	public static ArrayList<Double> s= new ArrayList<Double>();
	public static void main(String[] args) {
		
		Scanner inp= new Scanner(System.in);
		int b= inp.nextInt();
		for(int p=0;p<b;p++){
			double c=0,f, x,l=0,e=0;
			double y,n,j=0,z;
			int m=1;
		
		c= inp.nextDouble();
		
		f=inp.nextDouble();
		
		x=inp.nextDouble();
		double a=x/2;
		do{
	       l=a;
		   y=0;
		   n=2;
		   e=0;
		   for(int i=0;i<m;i++){
			   j=c/n;
			   e+=j;
			   n=n+f;
		   }
		   m++;
		   
		   z=x/n;
		  
		   y=e+z;
		   
		   a=y;
		}while(a<l);
		s.add(l);
	}
     for(int r=0;r<s.size();r++){
    	 double t=s.get(r);
    	 System.out.println("Case #"+(r+1) +": "+t);
     }
	}		
}
