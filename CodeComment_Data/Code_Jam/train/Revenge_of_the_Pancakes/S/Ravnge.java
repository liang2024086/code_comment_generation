package methodEmbedding.Revenge_of_the_Pancakes.S.LYD421;

import java.util.Scanner;

public class Ravnge {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int c=0;
        String n="";
        try{
            c = Integer.parseInt(leer.nextLine());
        }catch(NumberFormatException e){};

        for(int d=0;d<c;d++){
            try{
                n = leer.nextLine();
            }catch(NumberFormatException e){};
            String caso = "Case #"+(d+1)+": ";
            String[] arr = n.split("");
            int pasos =0;
            String negativo = "-", positivo ="+";
            if(arr[0].compareTo("-") == 0){
                negativo = "+";
                positivo ="-";
               }else{
                negativo = "-";
                positivo ="+";
               }
            
            Boolean pos = false;
            for(int i =0;i<arr.length;i++){
                for(int k=0;k<arr.length;k++){
                    pos = true;
                    if(arr[k].compareTo("-") == 0){
                        pos = false;
                        k=arr.length;
                        pasos++;
                    }
                }
                if(pos){
                    i = arr.length;
                }else{
                    if(negativo.compareTo("-") == 0){
                        negativo = "+";
                        positivo ="-";
                       }else{
                        negativo = "-";
                        positivo ="+";
                       }
                    for(int k=0;k<arr.length;k++){
                        if(arr[k].compareTo(negativo) == 0){
                            arr[k] = positivo;
                        }else{
                            k=arr.length;
                        }
                    }
                }
            }
            caso += pasos;
            System.out.println(caso);
        }
    }
}
