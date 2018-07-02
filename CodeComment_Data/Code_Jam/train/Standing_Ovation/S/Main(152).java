package methodEmbedding.Standing_Ovation.S.LYD1829;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt(),i,s,j,cuenta,faltan;
        String aux;
        char valores[];
        for(i=1;i<=casos;i++){
            s = sc.nextInt();
            aux = sc.next();
            valores = aux.toCharArray();
            cuenta = faltan = 0;
            for(j=0;j<valores.length-1;j++){
                cuenta += (valores[j]-48);
                if(j+1>cuenta){
                    faltan += j+1-cuenta;
                    cuenta = j+1;
                }
            }
            System.out.println("Case #"+i+": "+faltan);
            
        }
    }
    
}
