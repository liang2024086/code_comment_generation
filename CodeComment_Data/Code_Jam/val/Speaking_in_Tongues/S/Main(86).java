package methodEmbedding.Speaking_in_Tongues.S.LYD1264;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Main {


    public static void main(String[] args) throws IOException {
         BufferedReader b = new BufferedReader(new FileReader("A-small-attempt3.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("out.out")));
       
        int x = Integer.parseInt(b.readLine());
        String input ;
        int count=1;
        for (int i = 0; i < x; i++) {
            
            input = b.readLine();
            out.print("Case #"+count+": ");
            count++;
            for (int j = 0; j < input.length(); j++) {
                if(input.charAt(j)==' ')  out.print(" ");
                else if(input.charAt(j)=='y')  out.print("a");
                else if(input.charAt(j)=='n')  out.print("b");
                else if(input.charAt(j)=='f')  out.print("c");
                else if(input.charAt(j)=='i')  out.print("d");
                else if(input.charAt(j)=='c')  out.print("e");
                else if(input.charAt(j)=='w')  out.print("f");
                else if(input.charAt(j)=='l')  out.print("g");
                else if(input.charAt(j)=='b')  out.print("h");
                else if(input.charAt(j)=='k')  out.print("i");
                else if(input.charAt(j)=='u')  out.print("j");
                else if(input.charAt(j)=='o')  out.print("k");
                else if(input.charAt(j)=='m')  out.print("l");
                else if(input.charAt(j)=='x')  out.print("m");
                else if(input.charAt(j)=='s')  out.print("n");
                else if(input.charAt(j)=='e')  out.print("o");
                else if(input.charAt(j)=='v')  out.print("p");
                else if(input.charAt(j)=='z')  out.print("q");
                else if(input.charAt(j)=='p')  out.print("r");
                else if(input.charAt(j)=='d')  out.print("s");
                else if(input.charAt(j)=='r')  out.print("t");
                else if(input.charAt(j)=='j')  out.print("u");
                else if(input.charAt(j)=='g')  out.print("v");
                else if(input.charAt(j)=='t')  out.print("w");
                else if(input.charAt(j)=='h')  out.print("x");
                else if(input.charAt(j)=='a')  out.print("y");
                else if(input.charAt(j)=='q')  out.print("z");
            }
            out.println("");
        }
 out.close();
System.exit(0);

    }

}
