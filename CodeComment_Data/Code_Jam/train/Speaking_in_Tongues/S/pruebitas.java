package methodEmbedding.Speaking_in_Tongues.S.LYD504;

import java.util.*;
import java.io.*;
public class pruebitas{
    public static void main(String argv[]){
        try{
            PrintWriter fi = new PrintWriter(new File("output.txt"));
            FileReader sc = new FileReader("A-small-attempt4.txt");
            BufferedReader br = new BufferedReader (sc);
            int numlin= Integer.parseInt(br.readLine());
            int i=1;         
            while(i<=numlin){
                fi.print("Case #"+i+": ");
                String lineas="";
                lineas=br.readLine();
                for(int j=0;j<lineas.length();j++){
                    char chare = lineas.charAt(j);
                    if(chare==' ')fi.print(" ");if(chare=='y')fi.print("a");if(chare=='n')fi.print("b");
                    if(chare=='f')fi.print("c");if(chare=='i')fi.print("d");if(chare=='c')fi.print("e");
                    if(chare=='w')fi.print("f");if(chare=='l')fi.print("g");if(chare=='b')fi.print("h");
                    if(chare=='k')fi.print("i");if(chare=='u')fi.print("j");if(chare=='o')fi.print("k");
                    if(chare=='m')fi.print("l");if(chare=='x')fi.print("m");if(chare=='s')fi.print("n");
                    if(chare=='e')fi.print("o");if(chare=='v')fi.print("p");if(chare=='z')fi.print("q");
                    if(chare=='p')fi.print("r");if(chare=='d')fi.print("s");if(chare=='r')fi.print("t");
                    if(chare=='j')fi.print("u");if(chare=='g')fi.print("v");if(chare=='t')fi.print("w");
                    if(chare=='h')fi.print("x");if(chare=='q')fi.print("z");if(chare=='a')fi.print("y");
                }   
                if(i!=numlin)fi.println();
                i++;
            }
            fi.close();
            sc.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
