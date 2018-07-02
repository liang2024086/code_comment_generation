package methodEmbedding.Cookie_Clicker_Alpha.S.LYD615;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class MainB {

	public static void main(String[] args) {
		try{
            FileInputStream fstream = new FileInputStream("c:\\AAACodigo\\tmp\\Quali\\B\\B-small-attempt0.in");
            DataInputStream entrada = new DataInputStream(fstream);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
            
            strLinea = buffer.readLine();
            int casos = Integer.parseInt(strLinea);
            
            for (int cont=1;cont<=casos;cont++){
            	strLinea = buffer.readLine();
                String[] param = strLinea.split(" ");
                double C = Double.parseDouble(param[0]);
                double F = Double.parseDouble(param[1]);
                double X = Double.parseDouble(param[2]);
                
                //System.out.println("C: "+ C +" F: "+F+" X: "+X);
                double produccion = 2.0;
                double minimo = X/produccion;
                //System.out.println("\tminimo: "+ minimo);
                boolean seguir = true;
                double acumulado = 0;
                do{
                	seguir = false;
                	acumulado += C/produccion;
                	produccion += F;
                	double candidato = acumulado+X/produccion;
                	if (candidato<minimo){
                		minimo = candidato;
                		seguir = true;
                	}
                }while(seguir);
                //System.out.println("Solucion: "+ minimo+"\n");
                System.out.println("Case #"+cont+": "+minimo);
                
            }
            entrada.close();
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }

	}

}
