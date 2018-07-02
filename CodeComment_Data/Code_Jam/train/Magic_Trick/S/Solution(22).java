package methodEmbedding.Magic_Trick.S.LYD1488;

import java.util.*;

public class Solution
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int casos = Integer.parseInt(teclado.nextLine());
        for(int i = 1; i<=casos; i++){
            int filaA = Integer.parseInt(teclado.nextLine());
            for(int j = 1; j < filaA; j++) teclado.nextLine();
            int arrayA[] = new int[4];
            arrayA[0] = teclado.nextInt();
            arrayA[1] = teclado.nextInt();
            arrayA[2] = teclado.nextInt();
            arrayA[3] = teclado.nextInt();
            teclado.nextLine();
            for(int j = filaA; j < 4; j++) teclado.nextLine();

            int filaB = Integer.parseInt(teclado.nextLine());
            for(int j = 1; j < filaB; j++) teclado.nextLine();
            int arrayB[] = new int[4];
            arrayB[0] = teclado.nextInt();
            arrayB[1] = teclado.nextInt();
            arrayB[2] = teclado.nextInt();
            arrayB[3] = teclado.nextInt();
            teclado.nextLine();
            for(int j = filaB; j < 4; j++) teclado.nextLine();

            System.out.print("Case #" + i + ": ");

            int primFind = 0;
            boolean found = false;
            boolean bad = false;
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 4; k++){
                    if(arrayA[j] == arrayB[k] && found == true){
                        System.out.println("Bad magician!");
                        j = 4;
                        k = 4;
                        bad = true;
                    }else if(arrayA[j] == arrayB[k]){
                        primFind = arrayA[j];
                        found = true;
                    }
                }
            }

            if(!bad){
                if(found){
                    System.out.println(primFind);
                }else{
                    System.out.println("Volunteer cheated!");
                }
            }
        }

    }
}
