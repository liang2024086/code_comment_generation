package methodEmbedding.Magic_Trick.S.LYD132;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class A {
	
	public static void main(String args[]) {
        try{
            // Abrimos el archivo
            FileInputStream fstream = new FileInputStream("A-small-attempt0.in");
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fstream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
          
          //++++  
            int n=0; // cantidad de escenarios
            strLinea = buffer.readLine();
            n=Integer.valueOf(strLinea);
          //-----
            
			int m=0;
            while (m<n){
			
				int r1, r2;
				strLinea = buffer.readLine();
				r1=Integer.valueOf(strLinea);  //++ R1
				for(int j= 1;j<r1;j++){
					buffer.readLine();
				}
				strLinea = buffer.readLine();
				String[] row1=strLinea.split(" ");  //++ ROW1
	
				for(int j= r1+1;j<5;j++){  //++ CONSUMO
					buffer.readLine();
				}
				//+++ R2
				strLinea = buffer.readLine();
				r2=Integer.valueOf(strLinea);  //++ R2
				for(int j= 1;j<r2;j++){
					buffer.readLine();
				}
				strLinea = buffer.readLine();
				String[] row2=strLinea.split(" ");  //++ ROW2
	
				for(int j= r2+1;j<5;j++){  //++ CONSUMO
					buffer.readLine();
				}
				
				//PRUEBO
				int hits=0;
				int res=0;
				for(int j=0;j<4;j++){
					for (int x=0; x<4;x++){
						if (Integer.valueOf(row1[j])==Integer.valueOf(row2[x])){
							res= Integer.valueOf(row1[j]);
							hits++;
						}
					}
				}
				
				if(hits==0)
					System.out.println("Case #"+(m+1)+": Volunteer cheated!");
				else if(hits==1)
					System.out.println("Case #"+(m+1)+": "+res);
				else
					System.out.println("Case #"+(m+1)+": Bad magician!");
				
				m++;
			}
		
            // Cerramos el archivo
            entrada.close();
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }

	}
	
}
