package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1396;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class ejercicio2sln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fi = new File ("C:\\Users\\SantiagoG\\Desktop\\B-small-attempt0.in");
		File fo = new File ("C:\\Users\\SantiagoG\\Desktop\\output2.txt");
		String linea ="";
		int numeroCasos;
		int contadorCasos = 1;
		double c = 0;
		double f = 0;
		double x = 0;
		double cookies = 0;
		double cookiesGastadas = 0;
		double time = 0;
		double timer = 0;
		double cookiesPerSecond = 2;
		try{
			BufferedReader input = new BufferedReader(new FileReader(fi));
			BufferedWriter output =  new BufferedWriter(new FileWriter(fo));
			numeroCasos = Integer.parseInt(input.readLine());
			String[] partes;
			while(contadorCasos <= numeroCasos && linea != null){
				linea = input.readLine();
				partes = linea.split(" ");
				c = Double.parseDouble(partes[0]);
				f = Double.parseDouble(partes[1]);
				x = Double.parseDouble(partes[2]);
				while(cookiesGastadas + c < x && time+(x/(cookiesPerSecond)) > (time+(c/cookiesPerSecond)+(x/(cookiesPerSecond+f)))){
					time += c/cookiesPerSecond;
					cookiesGastadas += c;
					cookiesPerSecond += f;					
				}

				DecimalFormat df =  new DecimalFormat("###.#######");
				//System.out.println(df.format(time+(x/cookiesPerSecond)));

				output.write("Case #"+contadorCasos+": "+(time+(x/cookiesPerSecond))+"\r"+"\n");
				//output.write("Case #"+contadorCasos+": "+df.format(time+(x/cookiesPerSecond))+"\r"+"\n");
				contadorCasos++;
				cookiesPerSecond = 2;
				time = 0;
				timer = 0;
				cookiesGastadas = 0;
			}
			input.close();
			output.close();
		}catch(IOException e){
			
		}
	}

}
