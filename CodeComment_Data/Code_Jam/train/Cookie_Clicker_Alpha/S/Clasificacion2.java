package methodEmbedding.Cookie_Clicker_Alpha.S.LYD472;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Clasificacion2 
{
	public static void main(String[] args) 
	{
		FileReader fr = null;	
		FileWriter fw = null;		
		BufferedReader br = null;
		BufferedWriter bw = null;
		try 
		{																										
			//fr = new FileReader("C:\\WORKSPACES\\Codejam2013\\CodeJam2014\\src\\es\\dosmilcatorce\\clasificacion\\dos\\prueba.txt");
			fr = new FileReader("C:\\WORKSPACES\\Codejam2013\\CodeJam2014\\src\\es\\dosmilcatorce\\clasificacion\\dos\\small.txt");
			//fr = new FileReader("C:\\WORKSPACES\\Codejam2013\\CodeJam2014\\src\\es\\dosmilcatorce\\clasificacion\\dos\\large.txt");	
			//fw = new FileWriter("C:\\WORKSPACES\\Codejam2013\\CodeJam2014\\src\\es\\dosmilcatorce\\clasificacion\\dos\\prueba_out.txt");
			fw = new FileWriter("C:\\WORKSPACES\\Codejam2013\\CodeJam2014\\src\\es\\dosmilcatorce\\clasificacion\\dos\\small_out.txt");
			//fw = new FileWriter("C:\\WORKSPACES\\Codejam2013\\CodeJam2014\\src\\es\\dosmilcatorce\\clasificacion\\dos\\large_out.txt");			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
						
			int cantidad = Integer.parseInt(br.readLine());
			for(int i=0; i<cantidad; i++)
			{												
				String[] datos = br.readLine().split(" ");	
				Double velocidad = 2D;
				Double C = Double.parseDouble(datos[0]);
				Double F = Double.parseDouble(datos[1]);
				Double X = Double.parseDouble(datos[2]);
				Double resultado = 0D;
				
				// el objetivo es mas barato que la granja
				if(X.compareTo(C) < 0)
				{
					resultado = X / velocidad;
				}
				else
				{
					Double coste_objetivo = X / velocidad;
					Double acumulado_anterior = 0D;
					Double acumulado_actual = 0D;
					acumulado_anterior = coste_objetivo;
					acumulado_actual = C / velocidad;
					velocidad = velocidad + F;					
					acumulado_actual = acumulado_actual + (X / velocidad);
					while(acumulado_anterior > acumulado_actual)
					{						
						acumulado_anterior = acumulado_actual;						
						acumulado_actual = (acumulado_actual - (X / (velocidad))) + (C / velocidad);
						velocidad = velocidad + F;
						acumulado_actual = acumulado_actual + (X / velocidad);
					}					
					resultado = acumulado_anterior;
				}	
				bw.write("Case #" + (i+1) + ": " + resultado);
				bw.newLine();
			}												
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				bw.flush();
				fw.flush();
				bw.close();
				fw.close();
				br.close();
				fr.close();				
			} 
			catch (Exception e2) 
			{
				System.out.println("Error al cerrar los descriptores de los ficheros");
				e2.printStackTrace();
			}
		}		
	}

}
