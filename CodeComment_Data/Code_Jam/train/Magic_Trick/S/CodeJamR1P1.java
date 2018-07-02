package methodEmbedding.Magic_Trick.S.LYD1819;


import java.io.*;

import java.util.*;


public class CodeJamR1P1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner in = new Scanner ( new FileReader("C:\\Users\\Ismael\\Desktop\\Entrada.in"));
        PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\Ismael\\Desktop\\Salida.txt"));
        int casos = in.nextInt();
        
        for (int i = 0; i < casos; i++) {
            int res1=in.nextInt();
            ArrayList<Integer> lista= new ArrayList<Integer>();
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    int num=in.nextInt();
                    if(j==(res1-1)){
                        lista.add(num);
                    }
                }
            }
            int res2=in.nextInt();
            boolean hayUno=false;
            boolean hayVarios= false;
            int cand=0;
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    int num=in.nextInt();
                    if(j==(res2-1)){
                        if(lista.contains(num)){
                            if(hayUno){
                                hayVarios=true;
                            }
                            hayUno=true;
                            cand=num;
                        }
                            
                    }
                }
            }
            
            if(!hayUno){
                out.println("Case #"+(i+1)+": Volunteer cheated!");
            }else{
                if(!hayVarios){
                    out.println("Case #"+(i+1)+": "+cand);
                }else{
                    out.println("Case #"+(i+1)+": Bad magician!");
                }
            }
            
        }
        
        
        out.close();
        
        
    }
}
