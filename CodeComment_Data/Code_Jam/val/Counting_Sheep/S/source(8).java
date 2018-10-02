package methodEmbedding.Counting_Sheep.S.LYD1355;

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int c = 1;
		while(T-->0){
			int n = in.nextInt();
			if(n==0){
				System.out.println("Case #"+c+": INSOMNIA");
			}else{
				int check[] = new int[10];
				int total = 0;
				int iter = 1;
				int n2 = n;
				while(total!=10){
					n2 = n*iter;
					iter++;
					String aux = String.valueOf(n2);
					for(int i=0; i<aux.length(); i++){
						//System.out.println(aux.charAt(i)+" "+(((int)aux.charAt(i))-48));
						if(check[((int)aux.charAt(i))-48]==0){
							check[((int)aux.charAt(i))-48] = 1;
							total++;
						}
					}
					/*
					System.out.println(n2);
					for(int i=0; i<check.length; i++){
						System.out.print(check[i]);
					}System.out.println();
					*/
				}
				System.out.println("Case #"+c+": "+n2);
			}
			c++;
		}
	}
}
