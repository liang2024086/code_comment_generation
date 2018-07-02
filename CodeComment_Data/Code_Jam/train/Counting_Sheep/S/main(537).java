package methodEmbedding.Counting_Sheep.S.LYD430;

import java.util.*;
import java.io.*;

public class main {

    public static void main(String[] args) throws FileNotFoundException {
        
    //ENTREGAR
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        //EJERCICIO
        int T = Integer.parseInt(in.nextLine());
        int N = 0;
        int Nx = 0;
        int cont;
        String[] listNum = new String[10];       
        String[] numero;
        String num;
        boolean sw = false;
        
        if (T >= 0 && T <= 100) {
            for (int i = 1; i <= T; ++i) {
                N = Integer.parseInt(in.nextLine());
                Nx = N;
                for(int x = 0; x < 10; x++){
                    listNum[x] = "0";
                }
                numero = null;
                cont = 1;
                sw = false;
                   
                if (N != 0){
                    while (!sw){
                        Nx = N*cont;
                        if(Integer.toString(Nx).length() > 1){
                            numero = Integer.toString(Nx).split("");

                            for (int d = 1; d < (numero.length); d++) {
                               listNum[Integer.parseInt(numero[d])] = "1";
                            }
                        }else{
                            listNum[Nx] = "1";
                        }
                        for (int f = 0; f < 10; f++) {
                            if(listNum[f].equals("0")){
                                break;
                            }else
                            if( f == 9){
                                sw = true;
                                System.out.println("Case #"+i+": "+Nx);
                            }
                        }
                        cont += 1 ;
                    }
                }else{
                     System.out.println("Case #"+i+": "+"INSOMNIA");
                }
            }
        }
    }
}
