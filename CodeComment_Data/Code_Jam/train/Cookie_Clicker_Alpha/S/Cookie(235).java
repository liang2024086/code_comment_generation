package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1471;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cookie 
{

	
	public Cookie()
	{
		
	}
	
	public static void main(String [] args)
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try
		{			
			int cantidad = Integer.parseInt(bf.readLine());
			for (int i = 0; i< cantidad ; i++)
			{
				double income = 2;
				String[] valores = bf.readLine().split(" ");
				double respuesta = 0;
				double C = Double.parseDouble(valores[0]);
				double F = Double.parseDouble(valores[1]);
				double X = Double.parseDouble(valores[2]);
				// end of creating values
				
				
				boolean gefunde = false;
				while(gefunde == false)
				{
					double total = X/income; // tiempo que tarda ganar
					double compra = C/income; // tiempo que tarda comprar una finca
					double futIncome = income + F;
					double future = X/futIncome; // tiempo que tardar? ganar si compro la finca
					double Ftotal = compra + future;
					
					if(total > Ftotal)
					{
						income += F;
						respuesta += compra;
					}
					else
					{
						respuesta += total;
						gefunde = true;
					}
				}
				// imprimir la respuesta
				int caso = i+1;
				System.out.println("Case #"+caso+": "+respuesta);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
