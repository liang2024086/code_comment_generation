package methodEmbedding.Magic_Trick.S.LYD1110;


import java.util.Scanner;

public class MagicTrick {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr1=null, arr2=null;
        String aux="", arr3;
        int c = sc.nextInt();
        int posicion, cont=0;
        for (int k = 1; k <= c; k++) {
            cont=0;
            posicion = sc.nextInt();

            for (int i = -1; i < 4; i++) {
                arr3 = sc.nextLine();
                if(i == posicion-1){
                    arr1 = arr3.split(" ");
                }

            }

            int posicion2 = sc.nextInt();

            for (int i = -1; i < 4; i++) {
                arr3 = sc.nextLine();
                if(i == posicion2-1){
                    arr2 = arr3.split(" ");
                }

            }

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if(arr1[i].equals(arr2[j])){
                        cont++;
                        aux = arr1[i];
                    }
                }
            }

            if(cont>1){
                System.out.println("Case #" + k + ": Bad magician!");
            }
            else if(cont == 0){
                System.out.println("Case #" + k + ": Volunteer cheated!");
            }
            else{
                System.out.println("Case #" + k + ": " + aux);
            }    
        } 
    }
}
