package methodEmbedding.Revenge_of_the_Pancakes.S.LYD879;

import java.util.Scanner;
import java.util.*;
public class Main
{
      public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int casos = Integer.parseInt(sc.next());
        for(int n=0;n<casos;n++){
                    String a = sc.next();
            if(!a.contains("-")){
                System.out.println("Case #"+(n+1)+": 0");
            }else{
               char [] arreglo = a.toCharArray();
               boolean b = true;
               int i = arreglo.length-1;
               int cambios =0;
               while(b){
                  if(arreglo[i]=='-'){
                    for(int j=i;j>=0;j-- ){
                        if(arreglo[j]=='+'){
                            arreglo[j]='-';
                        }else{
                            arreglo[j]='+';
                        }
                    }
                    cambios++;
                    i=arreglo.length-1;
                    }
                  i--;
                  if(i==-1){
                    b=false;
                    }
                }
               System.out.println("Case #"+(n+1)+": "+cambios);
            }
        }
    }
}
