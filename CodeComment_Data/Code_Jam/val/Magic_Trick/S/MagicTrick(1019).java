package methodEmbedding.Magic_Trick.S.LYD80;


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class MagicTrick {
    private static Scanner entrada;
    
    public static void main(String[] args) {
        try {
            entrada = new Scanner(new File("D:\\Pedro\\GoogleCodeJam\\src\\MagicTrick\\A-small-attempt0.in"));
        }
        catch(FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        
        int numeroCasos;
        int filaInicial;
        int filaFinal;
        int posibilidades[] = new int[4];
        int valorComparar;
        int contadorCoincidencias;
        int cartaSeleccionada = 0;
        
        numeroCasos = entrada.nextInt();
        
        for (int caso = 1; caso <= numeroCasos; caso++) {
            contadorCoincidencias = 0;
            filaInicial = entrada.nextInt();
            
            for (int fila = 1; fila <= 4; fila++) {
                if (filaInicial == fila) {
                    for (int columna = 0; columna < 4; columna++)
                        posibilidades[columna] = entrada.nextInt();
                }
                else
                    for (int columna = 0; columna < 4; columna++)
                        entrada.nextInt();
                
            }
            
            filaFinal = entrada.nextInt();
            
            for (int fila = 1; fila <= 4; fila++) {
                if (filaFinal == fila) {
                    for (int columna = 0; columna < 4; columna++) {
                        valorComparar = entrada.nextInt();
                        
                        for (int posibilidad = 0; posibilidad < 4; posibilidad++) {
                            if (posibilidades[posibilidad] == valorComparar) {
                                contadorCoincidencias++;
                                cartaSeleccionada = valorComparar;
                            }
                        }
                    }
                }
                else
                    for (int columna = 0; columna < 4; columna++)
                        entrada.nextInt();
            }
            
            if (caso != 1)
                System.out.println();
            
            if (contadorCoincidencias == 1)
                System.out.printf("Case #%d: %d", caso, cartaSeleccionada);
            else if (contadorCoincidencias == 0)
                System.out.printf("Case #%d: Volunteer cheated!", caso);
            else
                System.out.printf("Case #%d: Bad magician!", caso);
        }
        
        entrada.close();
    }
}
