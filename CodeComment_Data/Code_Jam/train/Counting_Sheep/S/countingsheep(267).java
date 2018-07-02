package methodEmbedding.Counting_Sheep.S.LYD1145;


import java.math.BigInteger;
import java.util.Scanner;

public class countingsheep {
public static void main(String [] args){
	Scanner scan= new Scanner(System.in);
	int x=scan.nextInt();
	
	
for(int i=0;i<x;i++){
		
	boolean g=false;
	boolean[]check = new boolean[10]; 
	
	for(int j=0;j<10;j++){
		check[j]=false;
	}
	
	
	int in=scan.nextInt();
	
	BigInteger bi1,bi2 = null,bi3;
	bi1=new BigInteger(in+"");
	for(int k=1;k<100;k++){
		
		bi3=new BigInteger(k+"");
		bi2=bi1.multiply(bi3);
		
		String y=bi2+"";
		
		for(int l=0;l<y.length();l++){
			char z=y.charAt(l);
			switch (z){
			case '1': check[1]=true;
			break;
			case '2': check[2]=true;
			break;
			case '3': check[3]=true;
			break;
			case '4': check[4]=true;
			break;
			case '5': check[5]=true;
			break;
			case '6': check[6]=true;
			break;
			case '7': check[7]=true;
			break;
			case '8': check[8]=true;
			break;
			case '9': check[9]=true;
			break;
			case '0': check[0]=true;
			break;
			
			}
		}
		
	
		boolean aaa=true;
		for(int m=0;m<10;m++){
			if (!(check[m])){
				aaa=false;
				break;
			}
		}

	if (aaa){
		g=true;
		break;
	}
		
	}
	
	if (g){
	String y=bi2+"";
	System.out.println("Case #"+(i+1)+": "+y);
	}
	else{
		
	
	System.out.println("Case #"+(i+1)+": INSOMNIA");
	
	
	
	
	}
	}
}
}
