package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1299;


import java.io.*;
import java.util.*;

public class Cookie_Clicker_Alpha{
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("C:\\eclipse\\workspace\\java_test\\src\\Cookie_Clicker_Alpha\\B-small-attempt0.in"));  
		FileWriter out = new FileWriter("C:\\eclipse\\workspace\\java_test\\src\\Cookie_Clicker_Alpha\\B-small-attempt0.out");  
/*
C=30.0 F=2.0 X=100.0
sumF=2 //sumF+=F      1st:sumF+=2
sumT=0 //sumT+=C/sumF 1st:sumT=0
sumR=0 //sumR=sumT+X/sumF

if(sumRO>sumR){
  sumRO=sumR
  sumR=0
}else{
  break;
}

sumRO

          F=2   100/2=50s
30/2=15s  F=4.0 100/4=25s =>40s
30/4=7.5s F=6.0 100/6=16.666666666??? ???>24.166666???+15
30/6=5    F=8   100/8=12.626262 =>40.1
 */
		int T = in.nextInt();

		for(int round=1;round<=T;round++){
			//System.out.println("===round:"+round);
			double C = in.nextDouble();
			double F = in.nextFloat();
			double X = in.nextFloat();
			//System.out.println("C:"+C+";F:"+F+";X:"+X);
			
			double sumF=0; //sumF+=F      1st:sumF=2
			double sumT=0; //sumT+=C/sumF 1st:sumT=0
			double sumRO=0;//old
			double sumR=0; //sumR=sumT+X/sumF
			
			int i=0;
			do{
				sumRO=sumR;

				if(i==0){
					sumT=0;
					sumF=2;
					sumR=sumT+X/sumF;
					sumRO=sumR;
				}else{
					//System.out.println("sumF:"+sumF);
					sumT+=C/sumF;
					sumF+=F;
					//System.out.println("sumT:"+sumT);
					sumR=sumT+X/sumF;
					//System.out.println("sumR:"+sumR);
				}

				//System.out.println("i:"+i+"sumRO:"+sumRO+";sumR:"+sumR);
				i++;
			}while(sumRO>=sumR);
				//System.out.println("Case #"+round+": "+sumRO+"\n");
				out.write("Case #"+round+": "+sumRO+"\n");

		}
		in.close();
        out.flush();
        out.close();
	}
}
