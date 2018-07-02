package methodEmbedding.Magic_Trick.S.LYD739;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Clasificacion1 
{
	public static void main(String[] args) 
	{
		FileReader fr = null;	
		FileWriter fw = null;		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try 
		{	
			//fr = new FileReader("C:\\WORKSPACES\\Codejam2013\\CodeJam3013_ok\\src\\es\\dosmilcatorce\\clasificacion\\prueba.txt");
			fr = new FileReader("C:\\WORKSPACES\\Codejam2013\\CodeJam3013_ok\\src\\es\\dosmilcatorce\\clasificacion\\small.txt");
			//fr = new FileReader("C:\\WORKSPACES\\Codejam2013\\CodeJam3013_ok\\src\\es\\dosmilcatorce\\clasificacion\\large.txt");			
			//fw = new FileWriter("C:\\WORKSPACES\\Codejam2013\\CodeJam3013_ok\\src\\es\\dosmilcatorce\\clasificacion\\prueba_out.txt");
			fw = new FileWriter("C:\\WORKSPACES\\Codejam2013\\CodeJam3013_ok\\src\\es\\dosmilcatorce\\clasificacion\\small_out.txt");
			//fw = new FileWriter("C:\\WORKSPACES\\Codejam2013\\CodeJam3013_ok\\src\\es\\dosmilcatorce\\clasificacion\\large_out.txt");			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
									 		
			int cantidad = Integer.parseInt(br.readLine());
			for(int i=0; i<cantidad; i++)
			{			
				List<Integer> posible = new ArrayList<Integer>(4);
				
				//primera lectura
				Integer linea = Integer.parseInt(br.readLine());
				for(int j=0; j<(linea-1); j++)
					br.readLine();
				String[] datos = br.readLine().split(" ");
				posible.add(Integer.parseInt(datos[0]));
				posible.add(Integer.parseInt(datos[1]));
				posible.add(Integer.parseInt(datos[2]));
				posible.add(Integer.parseInt(datos[3]));
				for(int j=0; j<(4-linea); j++)
					br.readLine();
				
				//segunda lectura
				linea = Integer.parseInt(br.readLine());
				for(int j=0; j<(linea-1); j++)
					br.readLine();
				datos = br.readLine().split(" ");
				for(int j=0; j<(4-linea); j++)
					br.readLine();
				
				Integer resultado = null;
				boolean masdeuna = false;
				for(int j=0; j<4; j++)
				{
					if(posible.contains(Integer.parseInt(datos[j])))
					{
						if(resultado != null)
							masdeuna = true;
						else
							resultado = Integer.parseInt(datos[j]);
					}
				}
				
				if(masdeuna)
					bw.write("Case #" + (i+1) + ": Bad magician!");
				else if(resultado == null)
					bw.write("Case #" + (i+1) + ": Volunteer cheated!");
				else
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
