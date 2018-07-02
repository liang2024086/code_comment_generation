package methodEmbedding.Standing_Ovation.S.LYD1635;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Friends {

  public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub
    int cases = 0;
    int alreadyStanding = 0;
    int added = 0;
    
    FileReader fr = new FileReader("A-small-attempt0.in");
    BufferedReader br = new BufferedReader(fr);
    
    String str= br.readLine();
    
    cases = Integer.parseInt(str);
    
    System.out.println(cases);
    
    for (int i = 1; i < cases+1; i++)
    {
      String [] strs= br.readLine().split(" ");
      int maxS = Integer.parseInt(strs[0]);
      
      for(int j = 0; j < maxS+1; j++)
      {
        if ( j <= alreadyStanding )
          alreadyStanding += Character.getNumericValue((strs[1].charAt(j)));   
        else {
          while(j > alreadyStanding)
          {
            alreadyStanding += Character.getNumericValue((strs[1].charAt(j)));   
            alreadyStanding++;
            added++;
          }
        }
                
      }
      
      System.out.println("Case #" + i + ": " + added);
      alreadyStanding = 0;
      added = 0;

    }
  }

}
