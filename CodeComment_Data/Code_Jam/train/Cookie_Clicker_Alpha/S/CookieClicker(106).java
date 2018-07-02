package methodEmbedding.Cookie_Clicker_Alpha.S.LYD14;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;


public class CookieClicker {
  public static void main(String[] args) throws FileNotFoundException {
    Locale.setDefault(Locale.ENGLISH);
    Scanner in = new Scanner(new File("entrada.in"));
    System.setOut(new PrintStream(new File("salida.out")));
    double C,F,X,production,time,total,new_machine,tempo_time,total_new_machine;
    int T = in.nextInt();
    int i;
    for (i=1;i<=T;i++){
      production = 2;
      time = 0;
      total = 0;
      C = in.nextDouble();
      F = in.nextDouble();
      X = in.nextDouble();
      while (true){
        time = X/production;
        new_machine = C/production;
        tempo_time = X/(production + F);
        total_new_machine = new_machine + tempo_time;
        if (time<=total_new_machine){
          total += time;        
          break;
        }
        else{
          total += new_machine;
          production += F;
        }
      }
      System.out.println("Case #"+i+": "+String.format("%.7f", total));     
    }
  }
}
