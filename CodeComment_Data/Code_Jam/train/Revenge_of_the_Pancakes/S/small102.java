package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1160;

import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class small102 {
	public static void main(String[] args){
		Scanner in;
		int i=0;
		int j=0;
		int k=0;
		char mas='+';
		char menos ='-';
		char cara;
		char eleccion;
		String str;
		boolean happy;
		in = new Scanner(System.in);
		int T = in.nextInt();
		in.nextLine();
		while(k<=T)
		{
			happy=false;
			j=0;
			k++;
			str = in.nextLine();
			StringBuilder s = new StringBuilder(str);
			StringBuilder x = new StringBuilder();
			while(!happy)
			{
				boolean cambio=false;
				i=0;
				cara=s.charAt(0);
				if (cara==mas){eleccion=menos;}
				else {eleccion=mas;}
				do 
				{	
					i++;
					if (s.charAt(i-1)!=cara){cambio=true;}
				} while (!cambio && i <s.length());
				if (!cambio)
				{
					if (s.charAt(0)=='-'){j++;}
					happy=true;
				}
				else
				{
					x.setLength(0);
					for (int l=0;l<i-1;l++){x.append(mas);}
					s.append(x);
					s.delete(0, i-1);
					j++;
				}
			}
			System.out.format("Case #%d: %d\n", k, j);
		}
	}
}

