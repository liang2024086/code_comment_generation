package methodEmbedding.Standing_Ovation.S.LYD286;

/**
 * Created by samdhani on 4/11/2015.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;
public class StandingOvation {

    public static void main(String args[]){
        Scanner myScanner;
        final Formatter x;
        try{
            myScanner = new Scanner(new File("C:\\Users\\samdhani\\IdeaProjects\\CJ Standing Ovation\\src\\A-small-attempt1.in"));
            x = new Formatter("myout.out");
            int n = Integer.parseInt(myScanner.next());
            for (int k=0; k<n; k++) {
                int f = 0, c = 0;
                int Smax = Integer.parseInt(myScanner.next());
                String sCount = myScanner.next();
                int s[] = new int[sCount.length()];
                for(int i=0; i<sCount.length();i++){
                    String temp = ""+sCount.charAt(i);
                    s[i] = Integer.parseInt(temp);
                }
                if(s[0]==0)
                    f=1;
                else
                    c=s[0];
                for(int i=1;i<=Smax;i++){
                    if(i > c+f)
                        f = f+i-c-f;
                    c = c+s[i];
                }
                try {
                    x.out().append("Case #"+(k+1)+": "+f+"\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            myScanner.close();
            x.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }

}
