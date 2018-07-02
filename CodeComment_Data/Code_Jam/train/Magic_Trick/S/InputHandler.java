package methodEmbedding.Magic_Trick.S.LYD710;

import java.io.*;
import java.util.*;

public class InputHandler {
  public static void main(String[] args) {
    try {
      BufferedReader br = 
        new BufferedReader(new InputStreamReader(System.in));
 	String line;
 
        int caseCount = 1;
        br.readLine();

        while((line = br.readLine()) != null) {
         

          String[] tokens = line.split(" ");
          int row1 = Integer.parseInt(tokens[0]);
          //get row 1 tokens
          int i = 0;
          for(i = 0; i < row1; ++i) {
            line = br.readLine(); 
          }
          tokens = line.split(" ");

          Set<Integer> set1 = new HashSet<Integer>();
          for(String token: tokens) {
             set1.add(Integer.parseInt(token));
          }


          //flush rest of arrangement 1
          for(;i < 4; ++i) {
             br.readLine();

          }
          line = br.readLine();
          tokens = line.split(" ");
          int row2 = Integer.parseInt(tokens[0]);

          for(i = 0; i < row2; ++i) {
            line = br.readLine(); 
          }
          tokens = line.split(" ");

          int answer = -1;
          String caseAnswer = "";
          for(String token : tokens) {
            int n = Integer.parseInt(token);
            if(set1.contains(n)) {
              if(answer > 0) {
                caseAnswer = "Bad magician!";
              } else {
                answer = n;
              }

            } 
          }

          if(caseAnswer.equals("")) {

              if(answer > 0) {
                caseAnswer = "" + answer;
              } else {
                caseAnswer = "Volunteer cheated!";
              }
          }

          System.out.println("Case #" + caseCount + ": " + caseAnswer);
          caseCount++;
          //flush rest of arrangement 1
          for(;i < 4; ++i) {
             br.readLine();

          }

        }
 
	} catch (IOException io) {
          io.printStackTrace();
	}	

  }

}
