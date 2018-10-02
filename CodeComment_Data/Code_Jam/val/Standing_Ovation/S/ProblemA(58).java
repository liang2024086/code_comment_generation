package methodEmbedding.Standing_Ovation.S.LYD65;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ismael
 */
public class ProblemA {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader f= new FileReader("C:\\Users\\Ismael\\Desktop\\input.txt");
        PrintWriter out =new PrintWriter("C:\\Users\\Ismael\\Desktop\\output.txt");
        Scanner in = new Scanner(f);
        int cant= in.nextInt();
        in.nextLine();
        for (int i = 0; i < cant; i++) {
            String linea=in.nextLine();
            String [] datos=linea.split(" ");
            int suma=0;
            int res=0;
            for (int j = 0; j < datos[1].length(); j++) {
                int valor= Integer.parseInt(datos[1].charAt(j)+"");
                
                if(suma<j){
                    res++;
                    suma=j;
                }
                suma=suma+valor;
            }
            
            out.println("Case #"+(i+1)+": "+res);
            
        }
        in.close();
        out.close();
    }
}
