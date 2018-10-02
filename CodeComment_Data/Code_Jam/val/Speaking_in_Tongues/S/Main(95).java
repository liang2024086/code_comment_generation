package methodEmbedding.Speaking_in_Tongues.S.LYD882;


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        String Lista1="abcdefghijklmnopqrstuvwxyz";
        String Lista2="yhesocvxduiglbkrztnwjpfmaq";
        char[] SourceList=Lista1.toCharArray();
        Arrays.sort(SourceList);
        
        File f = new File( "e:/Input/A-small-attempt3.in" );
        BufferedReader entrada;
        entrada = new BufferedReader( new FileReader( f ) );
        int T = Integer.parseInt(entrada.readLine());

        for(int i=0;i<T;i++){
            char[] cars = entrada.readLine().toCharArray();
            String Cad="";
            for(int j=0;j<cars.length;j++){
                int pos=Arrays.binarySearch(SourceList, cars[j]);
                if(pos<0)
                    Cad+=" ";
                else
                    Cad+=Lista2.substring(pos,pos+1);
            }
            System.out.println("Case #"+(i+1)+": "+Cad);
        }
    }

}
