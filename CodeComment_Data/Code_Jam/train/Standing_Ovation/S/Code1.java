package methodEmbedding.Standing_Ovation.S.LYD2190;

import java.util.Scanner;

public class CodeJam {  
    public static void main(String[] args) {
        int t,smax,snow,total=0,invitados=0;
        String aux;
        String[] aux2;
        Scanner teclado=new Scanner(System.in);
        t=Integer.parseInt(teclado.nextLine());
        for(int i=0;i<t;i++){
            total=0;invitados=0;
            aux=teclado.nextLine();
            aux2=aux.split(" ");
            smax=Integer.parseInt(aux2[0]);
            total=Integer.parseInt(Character.toString(aux2[1].charAt(0)));
            for(int j=1;j<=smax;j++){
                if(j>(total+invitados)){
                    invitados++;
                }
                total+=Integer.parseInt(Character.toString(aux2[1].charAt(j)));
            }
            System.out.println("Case #"+(i+1)+": "+invitados);
        }
    }
}
