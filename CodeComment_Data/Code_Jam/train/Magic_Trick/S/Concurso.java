package methodEmbedding.Magic_Trick.S.LYD334;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Concurso {

    public static void main(String[] args) throws IOException{
        BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
        int aux=Integer.parseInt(teclado.readLine());
        int cont=1,fila,i,band;
        String valor="";
        String[][] cadena=new String[2][];
        do{
            band=0;
            for(int x=0;x<2;x++){
                fila=Integer.parseInt(teclado.readLine());
                for(i=1;i<=4;i++)
                    if(i!=fila)
                        teclado.readLine();
                    else
                        cadena[x]=teclado.readLine().split(" ");
            }
            for(int y=0;y<4;y++)
                    for(int z=0;z<4;z++)
                        if(cadena[0][y].equals(cadena[1][z])){
                            band++;
                            valor=cadena[0][y];
                        }
            switch(band){
                case 0:System.out.println("Case #"+cont+": Volunteer cheated!");
                    break;
                case 1:System.out.println("Case #"+cont+": "+valor);
                    break;
                default:System.out.println("Case #"+cont+": Bad magician!");
                    break;
            }
        }while(cont++!=aux);
    }
}
