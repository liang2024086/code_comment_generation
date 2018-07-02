package methodEmbedding.Counting_Sheep.S.LYD1412;


import java.util.*;
import java.io.*;
public class Sheep {	
	public static void main(String[] args){	
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	    int t = in.nextInt();  
	    
	
	int soluu=0,c=0;
int rema=0,answ=0;
	int i=0,g=0;
	int a[]={11,11,11,11,11,11,11,11,11,11};
	
	for (int e = 1; e <=t ; ++e) {
	      int n = in.nextInt();
	      
	if(n==0){	
		
		 System.out.println("Case #" + e + ": " + "INSOMNIA");
	
	}
	else{
	do{
		soluu=n*(1+i);
		answ=soluu;
		while (soluu > 0) {	
		    rema= soluu % 10;	   
		    soluu= soluu / 10;
			if(a[0]==rema||a[1]==rema||a[2]==rema||a[3]==rema||a[4]==rema||a[5]==rema||a[6]==rema||a[7]==rema||a[8]==rema||a[9]==rema){	
		}
		else{
		a[g]=rema;	
		g++;
		}
		}
	c=a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8]+a[9];
		i++;
	}while(c!=45);
	System.out.println("Case #" + e + ": " + answ);	
	}	
rema=0;
	g=0;
	a[0]=11;
	a[1]=11;
	a[2]=11;a[3]=11;a[4]=11;a[5]=11;a[6]=11;a[7]=11;a[8]=11;a[9]=11;
c=0;
	i=0;
	}
	}	
}
