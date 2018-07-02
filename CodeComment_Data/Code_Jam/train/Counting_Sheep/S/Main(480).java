package methodEmbedding.Counting_Sheep.S.LYD692;

import java.util.Scanner;
import java.util.*;
public class Main
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int casos = Integer.parseInt(sc.next());
        for(int i=0;i<casos;i++){
                    int n = Integer.parseInt(sc.next());
            if(n==0){
                System.out.println("Case #"+(i+1)+": INSOMNIA");
            }else{
                TreeSet <Integer> arbol = new TreeSet<Integer>();
               int aux = 1;
        
               int auxiliar2=0;
                while(arbol.size()<10){
                    int auxiliar = n*aux;
                     auxiliar2 = n*aux;
                 while(auxiliar>0){
                    arbol.add(auxiliar%10);
                    auxiliar=auxiliar/10;
                    }   
                    aux++;
                }
                System.out.println("Case #"+(i+1)+": "+auxiliar2);
            }
        }
    }
}
