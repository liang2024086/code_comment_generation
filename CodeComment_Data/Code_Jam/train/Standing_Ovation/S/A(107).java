package methodEmbedding.Standing_Ovation.S.LYD1540;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int z = 1; z<= tc; z++){
			sc.nextInt();
			long d = 0;
			long counter = 0;
			String cur = sc.next();
			for(int i = 0; i < cur.length(); i++){
				if(counter < i){
					d++;
					counter++;
				} 
				counter+=cur.charAt(i)-'0';
			}
			System.out.printf("Case #%d: %d\n", z, d);
		}
	}
}
