package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1080;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Brijesh on 09-Apr-2016.
 */
public class RevengeOfThePancakes {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C://Users/Brijesh/Downloads/B-small-attempt0.in"));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t=Integer.parseInt(br.readLine());
        for (int i=1;i<=t;i++){
            int count=0;
            String s=br.readLine();
            for(int j=1;j<s.length();j++){
                if(s.charAt(j)!=s.charAt(j-1))
                    count++;
            }
            if(s.charAt(s.length()-1)=='-')
                count++;
            System.out.print("Case #"+i+": ");
            System.out.println(count);
        }
    }
}
