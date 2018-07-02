package methodEmbedding.Counting_Sheep.S.LYD213;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.*;

public class prueba1 {

	public static void main(String[] args) throws FileNotFoundException {
		//String archivo = "C:\\small.in";
//		String cadena="";
//		FileReader f = new FileReader(archivo);
//        BufferedReader b = new BufferedReader(f);
		Scanner in = new Scanner(System.in);
		
		int casos = in.nextInt();
		for (int i = 0; i < casos; i++) 
		{
			int n = in.nextInt();
			boolean [] numeros = new boolean[10];
			int aux = 1;
			int result = 0;
			if (n==0) {
		
				System.out.println("Case #"+(i+1)+": INSOMNIA");
			}
			else
			{
				while (true)
				{
					 result = n*aux;
					String cadena = result+"";
					
					for (int j = 0; j < cadena.length(); j++) 
					{
						if (cadena.charAt(j)=='0') 
						{
							numeros[0]=true;
						}
						else if (cadena.charAt(j)=='1') 
						{
							numeros[1]=true;
						}
						else if (cadena.charAt(j)=='2') 
						{
							numeros[2]=true;
						}
						else if (cadena.charAt(j)=='3') 
						{
							numeros[3]=true;
						}
						else if (cadena.charAt(j)=='4') 
						{
							numeros[4]=true;
						}
						else if (cadena.charAt(j)=='5') 
						{
							numeros[5]=true;
						}
						else if (cadena.charAt(j)=='6') 
						{
							numeros[6]=true;
						}
						else if (cadena.charAt(j)=='7') 
						{
							numeros[7]=true;
						}
						else if (cadena.charAt(j)=='8') 
						{	numeros[8]=true;
							
						}
						else if (cadena.charAt(j)=='9') 
						{
							numeros[9]=true;
						}
					}
					aux++;
					if (numeros[0]==true && numeros[1]==true && numeros[2]==true && numeros[3]==true && numeros[4]==true && numeros[5]==true && numeros[6]==true && numeros[7]==true && numeros[8]==true && numeros[9]==true ) {
						break;
					}
				}
				System.out.println("Case #"+(i+1)+": "+result);
			}
		
			
			
		}
		
	}

}
