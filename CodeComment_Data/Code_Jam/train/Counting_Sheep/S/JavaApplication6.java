package methodEmbedding.Counting_Sheep.S.LYD129;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author damer
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        if (t >= 1 && 100 >= t) {
            int N;
            int inttmp;
            String strtmp="";
            for (int i = 1; i <= t; ++i) {
                //System.out.println("entra for 1 : i="+i);
                N = in.nextInt();
                inttmp=N;
                int c = 1;
                boolean slept = false;
                boolean n1 = false;
                boolean n2 = false;
                boolean n3 = false;
                boolean n4 = false;
                boolean n5 = false;
                boolean n6 = false;
                boolean n7 = false;
                boolean n8 = false;
                boolean n9 = false;
                boolean n0 = false;
                if (N >= 0 && 200 >= N) {
                    //System.out.println("entra if N 2 : i="+i);
                    if (N == 0) {
                        System.out.println("Case #" + i + ": INSOMNIA");
                    } else {
                        //System.out.println("entra <> INSOMNIA 3 : i="+i);
                        
                        while (!slept) {
                            //System.out.println("entra a contar  : i="+i+" N="+inttmp+" c="+c);
                            inttmp = N * c;
                            c++;
                            //este es el numero a mostrar en caso de slept true
                            //se recorre el numero caracter a caracter buscando coincidencia con algun boolean
                            strtmp = Integer.toString(inttmp);
                            for (int j = 1; j < (strtmp.length()+1); j++) {
                                //System.out.println("entra a recorer numero  : i="+i+" N="+inttmp+" c="+c+" j="+j+" caracter="+strtmp.substring(j-1, j));
                                switch (Integer.valueOf(strtmp.substring(j-1, j))) {
                                    case 1:
                                        n1 = true;
                                        break;
                                    case 2:
                                        n2 = true;
                                        break;
                                    case 3:
                                        n3 = true;
                                        break;
                                    case 4:
                                        n4 = true;
                                        break;
                                    case 5:
                                        n5 = true;
                                        break;
                                    case 6:
                                        n6 = true;
                                        break;
                                    case 7:
                                        n7 = true;
                                        break;
                                    case 8:
                                        n8 = true;
                                        break;
                                    case 9:
                                        n9 = true;
                                        break;
                                    case 0:
                                        n0 = true;
                                        break;
                                }
                            }
                            if (n0 && n1 && n2 && n3 && n4 && n5 && n6 && n7 && n8 && n9) {
                                slept = true;
                            }

                        }
                    }

                }
                if (slept) {
                    System.out.println("Case #" + i + ": " + strtmp);

                } 

            }

        }

    }

}
