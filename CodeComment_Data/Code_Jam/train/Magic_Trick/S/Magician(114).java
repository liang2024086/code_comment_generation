package methodEmbedding.Magic_Trick.S.LYD1015;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Magician 
{

	public Magician()
	{
		
	}
	
	public static void main(String [] args)
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			int cantidad = Integer.parseInt(bf.readLine());
			for (int i = 0; i< cantidad; i++)
			{
				String linea = bf.readLine();
				int line = Integer.parseInt(linea);
				String [] zahlen1 = bf.readLine().split(" ");
				String [] zahlen2 = bf.readLine().split(" ");
				String [] zahlen3 = bf.readLine().split(" ");
				String [] zahlen4 = bf.readLine().split(" ");
				
				int num1;
				int num2;
				int num3;
				int num4;
				
				if(line == 1)
				{
					 num1 = Integer.parseInt(zahlen1[0]);
					 num2 = Integer.parseInt(zahlen1[1]);
					 num3 = Integer.parseInt(zahlen1[2]);
					 num4 = Integer.parseInt(zahlen1[3]);
				}
				else if(line == 2)
				{
					 num1 = Integer.parseInt(zahlen2[0]);
					 num2 = Integer.parseInt(zahlen2[1]);
					 num3 = Integer.parseInt(zahlen2[2]);
					 num4 = Integer.parseInt(zahlen2[3]);
				}
				
				else if(line == 3)
				{
					 num1 = Integer.parseInt(zahlen3[0]);
					 num2 = Integer.parseInt(zahlen3[1]);
					 num3 = Integer.parseInt(zahlen3[2]);
					 num4 = Integer.parseInt(zahlen3[3]);
				}
				else if (line == 4)
				{
					 num1 = Integer.parseInt(zahlen4[0]);
					 num2 = Integer.parseInt(zahlen4[1]);
					 num3 = Integer.parseInt(zahlen4[2]);
					 num4 = Integer.parseInt(zahlen4[3]);
				}
				else
				{
					num1 = -1;
					num2 = -1;
					num3 = -1;
					num4 = -1;
				}
				
				// second part of the testcase
				
				line = Integer.parseInt(bf.readLine());
				zahlen1 = bf.readLine().split(" ");
				zahlen2 = bf.readLine().split(" ");
				zahlen3 = bf.readLine().split(" ");
				zahlen4 = bf.readLine().split(" ");
				int number1;
				int number2;
				int number3;
				int number4;

				if(line == 1)
				{
					 number1 = Integer.parseInt(zahlen1[0]);
					 number2 = Integer.parseInt(zahlen1[1]);
					 number3 = Integer.parseInt(zahlen1[2]);
					 number4 = Integer.parseInt(zahlen1[3]);
				}
				else if(line == 2)
				{
					 number1 = Integer.parseInt(zahlen2[0]);
					 number2 = Integer.parseInt(zahlen2[1]);
					 number3 = Integer.parseInt(zahlen2[2]);
					 number4 = Integer.parseInt(zahlen2[3]);
				}
				
				else if(line == 3)
				{
					 number1 = Integer.parseInt(zahlen3[0]);
					 number2 = Integer.parseInt(zahlen3[1]);
					 number3 = Integer.parseInt(zahlen3[2]);
					 number4 = Integer.parseInt(zahlen3[3]);
				}
				else if (line == 4)
				{
					 number1 = Integer.parseInt(zahlen4[0]);
					 number2 = Integer.parseInt(zahlen4[1]);
					 number3 = Integer.parseInt(zahlen4[2]);
					 number4 = Integer.parseInt(zahlen4[3]);
				}
				else
				{
					number1 = -1;
					number2 = -1;
					number3 = -1;
					number4 = -1;
				}
				//Looking for the answer...
			
				int cont = 0;
				int res = -1;
				if(num1 == number1 || num1 == number2 || num1 == number3 || num1 == number4)
				{
					cont ++;
					res = num1;
				}
				if(num2 == number1 || num2 == number2 || num2 == number3 || num2 == number4)
				{
					cont++;
					res = num2;
				}
				if (num3 == number1 || num3 == number2 || num3 == number3 || num3 == number4)
				{
					cont++;
					res = num3;
				}
				if(num4 == number1 || num4 == number2 || num4 == number3 || num4 == number4)
				{
					cont++;
					res = num4;
				}
				// now the answer
				int k = i+1;
				String answer = "Case #"+k+": ";
				if(cont == 1)
				{
					System.out.println(answer+res);
				}
				else if (cont > 1)
				{
					System.out.println(answer + "Bad magician!");
				}
				else if (cont == 0)
				{
					System.out.println(answer + "Volunteer cheated!");
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
