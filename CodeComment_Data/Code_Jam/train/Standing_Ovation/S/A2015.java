package methodEmbedding.Standing_Ovation.S.LYD1861;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class A2015 {
  public static void main(String[] args) throws FileNotFoundException {
    // TODO Auto-generated method stub
    String filePrefix = "A2015";
    String pathPrefix = "";
    Scanner scanner = new Scanner(new File(pathPrefix+filePrefix+".in"));
    PrintWriter writer = new PrintWriter(pathPrefix+filePrefix+".txt");
    int times = scanner.nextInt();
    int ans=0,sum=0;
    String a = scanner.nextLine();
    
    for (int t = 1; t <= times; t++) {
      int n = scanner.nextInt();
      String s = scanner.nextLine();
      s=s.trim();
      ans=0;
      sum=0;
      sum+=Integer.parseInt(s.substring(0,1));
      for(int i=1;i<s.length();i++){
        if(sum<i && Integer.parseInt(s.substring(i, i+1))>0){
          ans+=i-sum;
          sum+=(ans+Integer.parseInt(s.substring(i, i+1)));
        }else{
          sum+=Integer.parseInt(s.substring(i, i+1));
        }
      }
      System.out.println("Case #" + t + ": " + ans);
      writer.println("Case #" + t + ": " + ans);
    }
    writer.close();
  }
}
