package methodEmbedding.Standing_Ovation.S.LYD1815;

import java.util.*;
import java.io.*;
public class Cj1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Scanner in=new Scanner(new BufferedReader(new FileReader("test.txt")));
        //PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("out.txt")));
        Scanner m=new Scanner(System.in);
        //System.out.println("inserisci il numero di cicli");
        int test=m.nextInt();
        int invitati;
        int cont=0;
        do{
            cont++;
            invitati=0;
            //System.out.println("inserisci il max s level");
            int a=m.nextInt();
            int v[]=new int[a+1];
            //System.out.println("inserisci la stringa");
            String s=m.next();
            for(int i=0;i<v.length;i++){
                v[i]=((int)s.charAt(i))-48;
            }
            //for(int i=0;i<v.length;i++){
                //System.out.print(v[i]+" ");
            //}
            int personeApplaudenti=v[0];
            for(int i=1;i<v.length;i++){
                if(v[i]!=0){
                    if(personeApplaudenti<i){
                        int app=(i-personeApplaudenti);
                        invitati=invitati+app;
                        personeApplaudenti=personeApplaudenti+app+v[i];
                    }else{
                        personeApplaudenti=personeApplaudenti+v[i];
                    }
                }
            }
            System.out.println("Case #"+cont+": "+invitati);
            test--;
        }while(test!=0);
    }
    
}
