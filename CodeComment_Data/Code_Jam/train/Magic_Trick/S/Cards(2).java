package methodEmbedding.Magic_Trick.S.LYD1859;


import java.util.Scanner;

public class Cards {

    public static void main(String[] args) {
       int casos;
       int i; 
       Scanner sc = new Scanner(System.in);
       casos = sc.nextInt();
       for(i=1; i<=casos; i++)
       {
           int datos1[][] = new int[4][4];
           int datos2[][] = new int[4][4];
           int r1, r2;
           r1 = sc.nextInt();
           int  j, k;
           // LEER DATOS DE ENTRADA ARREGLO 1
           for(j=0; j<4; j++)
           {
               for(k=0; k<4; k++)
               {
                   datos1[j][k]=sc.nextInt();
               }
           }
           
           
           // LEER DATOS DE ENTRADA ARREGLO 2
           r2 = sc.nextInt();
           for(j=0; j<4; j++)
           {
               for(k=0; k<4; k++)
               {
                   datos2[j][k]=sc.nextInt();
               }
           }
           // BUSCAR CUANTAS VECES SE REPITE EL NUMERO
           int iguales=0;
           int datoigual=0;
           for(j=0; j<4; j++)
           {
               for(k=0; k<4; k++)
               {
                   if(datos1[r1-1][j]==datos2[r2-1][k])
                   {
                       iguales++;
                       datoigual=datos1[r1-1][j];
                   }
               }
           } 

           if (iguales==1)
           {
               System.out.println("Case #" + i + ": " + datoigual );
           }
           else if (iguales>1)
           {
               System.out.println("Case #" + i +": Bad magician!");
           }
           else if (iguales==0)
           {
               System.out.println("Case #" + i +": Volunteer cheated!");
           }
       }
    }
    
}
