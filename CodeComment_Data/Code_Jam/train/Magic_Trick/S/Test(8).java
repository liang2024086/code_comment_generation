package methodEmbedding.Magic_Trick.S.LYD2018;

import files.EasyFile;
import java.io.*;

public class Test {
	public static void main(String args[]){
		EasyFile archivo = new EasyFile("Input.txt");
		Magia magia;
		String salida=new String();
		int veces=0,i,linea=1;
		try{
			veces=Integer.parseInt(archivo.read(linea));
			linea++;
		}catch(IOException e){
			System.out.println("Error");
		}
		for(i=0;i<veces;i++){
			try{
				magia=new Magia(archivo.read(linea,linea+10));
				salida+="Case #"+(i+1)+": "+magia.resolver()+"\n";
			}catch(IOException e){
				System.out.println("Error");
			}
			linea+=10;
		}
		//System.out.print(salida);
		try{
			archivo.write("attemp.txt", salida);
		}catch(IOException e){	
			System.out.println("Error");
		}
	}
}
