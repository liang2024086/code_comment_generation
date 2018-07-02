package methodEmbedding.Magic_Trick.S.LYD944;

import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[][] cartas1 = new int[5][5];
		int[][] cartas2 = new int[5][5];
		int t;
		int row1, row2, cont,valor;
		Scanner buffer = new Scanner(System.in);
		t = buffer.nextInt();
		
		valor = 0;
		for(int i=1; i<=t; i++)
		{
			cont = 0;
			row1= buffer.nextInt();
			for(int ii=1; ii<5; ii++)
				for(int jj=1; jj<5; jj++)
					cartas1[ii][jj]=buffer.nextInt();
			
			row2 = buffer.nextInt();
			for(int ii=1; ii<5; ii++)
				for(int jj=1; jj<5; jj++)
					cartas2[ii][jj]=buffer.nextInt();
			
			for(int ii = 1; ii<5; ii++)
				for(int jj=1; jj<5; jj++)
					if(cartas1[row1][ii]==cartas2[row2][jj])
					{cont++;valor=cartas1[row1][ii];}
			
			if(cont ==1)
				System.out.println("Case #"+i +": "+valor);
			else if(cont == 0)
				System.out.println("Case #"+i +": Volunteer cheated!");
			else 
				System.out.println("Case #"+i +": Bad magician!");
		}
		
		
		
	}
}
