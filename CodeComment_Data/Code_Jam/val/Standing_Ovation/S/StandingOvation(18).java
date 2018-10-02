package methodEmbedding.Standing_Ovation.S.LYD403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandingOvation {
    public static void main(String args[])throws IOException
    {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    String s[];
    int max_shyness;
    int required;
    int standing=0;
    int temp=0;
    for(int i=0;i<T;i++)
    {
        s=br.readLine().split(" ");
        max_shyness=Integer.parseInt(s[0]);
        required=0;
        temp=0;
        standing=s[1].charAt(0)-48;
        for(int j=1;j<=max_shyness;j++)
        {
            
            if ((s[1].charAt(j) - 48) > 0) {
                if (standing >= j) {
                    standing += s[1].charAt(j) - 48;
                } else {
                    temp=j - standing;
                    required = required + temp;
                    standing = standing+(s[1].charAt(j) - 48)+temp;

                }
            }
        }
        System.out.println("Case #"+(i+1)+": "+required);
    }
    }
}
