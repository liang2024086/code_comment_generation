package methodEmbedding.Magic_Trick.S.LYD1400;

import java.util.*;
import java.io.*;
public class mago{
    public static void main(String[] args){
        try{
            File f = new File("A-small-attempt0.in");
            Scanner t = new Scanner(f);
            PrintWriter w = new PrintWriter("salida.txt"); 
            int casos = t.nextInt();
            int cuenta = 1;
            while(cuenta <=casos){
                int fila = t.nextInt(); t.nextLine();
                for(int i =1; i<fila;i++){
                    t.nextLine();
                }
                int[] fil1=new int[4];
                fil1[0]=t.nextInt();
                fil1[1]=t.nextInt();
                fil1[2]=t.nextInt();
                fil1[3]=t.nextInt();t.nextLine();
                for(int i = fila; i<4; i++){
                    t.nextLine();
                }
                fila=t.nextInt(); t.nextLine();
                for(int i =1; i<fila;i++){
                    t.nextLine();
                }
                int[]fil2 = new int[4];
                fil2[0]=t.nextInt();
                fil2[1]=t.nextInt();
                fil2[2]=t.nextInt();
                fil2[3]=t.nextInt();t.nextLine();
                for(int i = fila; i<4; i++){
                    t.nextLine();
                }
                boolean solo1=false;boolean mas=false;
                int valor=0;
                for(int i = 0;i< fil1.length;i++){
                    for(int j = 0;j<fil2.length;j++){
                        if(fil1[i]==fil2[j]){
                            if(!solo1) {solo1=true; valor = fil1[i];}
                            else mas = true;
                        }
                    }
                }
                if(solo1 && mas) w.println("Case #"+cuenta+": Bad magician!");
                else if(!solo1)w.println("Case #"+cuenta+": Volunteer cheated!");
                else w.println("Case #"+cuenta+": "+valor);
                cuenta++;

            }
            t.close();
            w.close();
        }catch(Exception e){}
        

    }

}
