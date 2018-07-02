package methodEmbedding.Standing_Ovation.S.LYD761;

import java.util.*;
import java.io.*;
public class Asmall{
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(new File("1.in"));
		PrintWriter out = new PrintWriter( new File( "1.txt" ) );
		int T=input.nextInt();
		int counter=1;
		int Smax;
		int shy;
		int remain;
		int friends;
		int before;
		while(counter<=T){
			Smax=input.nextInt();
			shy=input.nextInt();
			friends=0;
			int array[]= new int[Smax+1];
			for (int i=0;i<Smax+1; i++){
				remain=shy%10;
				array[Smax-i]=remain;
				shy=shy/10;
			}
			if(array[0]==0){
					friends+=1;
					array[0]=1;
			}
			before=array[0];
			for(int k=1;k<array.length;k++){
				while (k>before){
					friends+=1;
					before+=1;
				}
				before+=array[k];
			}
			out.println("Case #"+ counter+ ": "+ friends);
			counter++;	
		}
		out.close();
	}
}
