package methodEmbedding.Cookie_Clicker_Alpha.S.LYD419;

import files.EasyFile;

import java.io.*;

public class Test {
	public static void main(String args[]){
		EasyFile archivo = new EasyFile("Input.txt");
		Cookie galleta;
		String salida=new String();
		int veces=0,i,linea=1;
		try{
			veces=Integer.parseInt(archivo.read(linea));
			linea++;
		}catch(IOException e){
			System.out.println("Error");
		}
		for(i=0;i<veces;i++,linea++){
			try{
				galleta=new Cookie(archivo.read(linea));
				salida+="Case #"+(i+1)+": "+galleta.resuelve()+"\n";
			}catch(IOException e){
				System.out.println("Error");
			}
		}
		System.out.print(salida);
		try{
			archivo.write("Output.txt", salida);
		}catch(IOException e){	
			System.out.println("Error");
		}
	}
}
