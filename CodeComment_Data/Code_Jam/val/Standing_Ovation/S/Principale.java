package methodEmbedding.Standing_Ovation.S.LYD323;


import java.io.*;
import java.util.*;


public class Principale {
    public static void main(String[] args)throws IOException{

            int pubblico[],sMax,t,conta,personePrecedenti;
            String nPersone;

            Scanner sw=new Scanner(new BufferedReader(new FileReader("A-small-attempt4.in")));
            PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("A-small-attempt4")));

            t=sw.nextInt();

            for(int i=0;i<t;i++){
                conta=0;

                sMax=sw.nextInt();
                pubblico=new int[sMax+1];
                nPersone=sw.next();


                char c;
                for(int j=0;j<sMax+1;j++){
                    c=nPersone.charAt(j);
                    pubblico[j]=(int)nPersone.charAt(j)-48;
                    if(c==' '){
                        break;
                    }
                }

                for(int y=1;y<pubblico.length;y++){
                    personePrecedenti=0;

                    for(int x=0;x<y;x++){
                        if(pubblico[x]!=0){
                            personePrecedenti=personePrecedenti+pubblico[x];
                        }
                    }

                    if(((personePrecedenti+conta)<y)&&(pubblico[y]!=0)){
                         conta=conta+(y-personePrecedenti);
                     }
                }

                String st="Case #" + (i+1) +": "+conta;
                pw.println(st);

            }

                sw.close();
                pw.close();
    }

}
