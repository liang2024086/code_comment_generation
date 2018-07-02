package methodEmbedding.Cookie_Clicker_Alpha.S.LYD826;



import java.io.*;
import java.util.ArrayList;

public class Cookies {
  private static String currentDirectory = new File("").getAbsolutePath();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(currentDirectory + "\\src\\magician\\input.txt"));
    int caseCount = Integer.parseInt(br.readLine());
    String[] inputs;
    for(int i = 0; i < caseCount ; i++) {
     inputs = br.readLine().split(" ");
     //inputs[0]
     double C = Double.parseDouble(inputs[0]);
     double F = Double.parseDouble(inputs[1]);
     double X = Double.parseDouble(inputs[2]);
     int farmCount = (int) Math.round( ((((X-C)*F) / C) - 2) / F);
     if (farmCount < 0) {farmCount = 0;}
     double seconds = 0;
     int farms = 0;
     double speed = 2;
     while (X / speed > (C / speed + X/(speed + F))) {
       seconds += (C / (speed));
       speed += F;
     }
     seconds += (X / speed);
     System.out.println("Case #" + (i + 1) + ": " + seconds);
    }
  }
}
