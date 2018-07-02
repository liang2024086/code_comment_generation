package methodEmbedding.Counting_Sheep.S.LYD1405;


import java.util.*;
import java.io.*;
public class Googlesheep {	
	public static void main(String[] args){	
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	    int t = in.nextInt();  
	    
	
	int sol=0,c=0;
int rem=0,ans=0;
	int i=0,g=0;
	int a[]={11,11,11,11,11,11,11,11,11,11};
	
	for (int e = 1; e <=t ; ++e) {
	      int n = in.nextInt();
	      
	if(n==0){	
		
		 System.out.println("Case #" + e + ": " + "INSOMNIA");
	
	}
	else{
	do{
		sol=n*(1+i);
		ans=sol;
		while (sol > 0) {	
		    rem= sol % 10;	   
		    sol= sol / 10;
			if(a[0]==rem||a[1]==rem||a[2]==rem||a[3]==rem||a[4]==rem||a[5]==rem||a[6]==rem||a[7]==rem||a[8]==rem||a[9]==rem){	
		}
		else{
		a[g]=rem;	
		g++;
		}
		}
	c=a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8]+a[9];
		i++;
	}while(c!=45);
	System.out.println("Case #" + e + ": " + ans);	
	}	
rem=0;
	g=0;
	a[0]=11;
	a[1]=11;
	a[2]=11;a[3]=11;a[4]=11;a[5]=11;a[6]=11;a[7]=11;a[8]=11;a[9]=11;
c=0;
	i=0;
	}
	}	
}
