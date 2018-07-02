package methodEmbedding.Revenge_of_the_Pancakes.S.LYD443;

import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Program2{
  public static void main(String[] args)throws FileNotFoundException, IOException {
    BufferedReader br = new BufferedReader(new FileReader(new File("B-small-attempt0.in")));
    PrintWriter writer = new PrintWriter("output.txt", "UTF-8");


    int numTestCases = Integer.parseInt(br.readLine());

    for(int i = 0; i < numTestCases; i++){
      int caseNumber = i + 1;
      String[] arr = br.readLine().split("");
      int counter = 0;
      int last = arr.length - 1;
      while(last > -1){
        if(counter % 2 == 0){
          if(arr[last].equals("-")){
            counter++;
          }
        }else{
          if(arr[last].equals("+")){
            counter++;
          }
        }
        last--;
      }

      writer.println("Case #" + caseNumber + ": " + counter);
    }

    writer.close();
  }
}
