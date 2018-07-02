package methodEmbedding.Magic_Trick.S.LYD848;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;


public class A {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in=new Scanner(new File("A-small-attempt0.in"));
		PrintWriter  wr=new PrintWriter("A.out");
		int [][] arreglo=new int[4][4];
		int T=in.nextInt();
		int []res1;
		int counter;
		int respuesta;
		int cases=0;
		while(cases++<T){
			counter=0;
			respuesta=0;
			int row1=in.nextInt()-1;
			for(int i=0;i<4;i++)
				for(int j=0;j<4;j++)
					arreglo[i][j]=in.nextInt();
			res1=Arrays.copyOf(arreglo[row1], 4);
			int row2=in.nextInt()-1;
			for(int i=0;i<4;i++)
				for(int j=0;j<4;j++)
					arreglo[i][j]=in.nextInt();
			//System.out.println("Arreglo"+res1[0]+" "+res1[1]+" "+res1[2]+" "+res1[3]+" ");
			for(int i=0;i<4;i++)
				for(int j=0;j<4;j++)
					if(arreglo[row2][i]==res1[j]){
						respuesta=res1[j];
						counter++;
					}
			if(counter==1)
				wr.println("Case #"+(cases)+": "+respuesta);
			else if(counter>1)
				wr.println("Case #"+(cases)+": Bad magician!");
			else
				wr.println("Case #"+(cases)+": Volunteer cheated!");
		}
		wr.close();
	}

}
