package methodEmbedding.Revenge_of_the_Pancakes.S.LYD524;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class RevengePancakes {
    static FileWriter fw;
    static BufferedReader br;
    public static void main(String[] args) throws Exception{
        fw = new FileWriter("outputSmall.out");
        br = new BufferedReader(new FileReader("B-small-attempt0.in"));
        int perseritja = Integer.parseInt(br.readLine());
        for(int i = 0; i < perseritja; i++)
        {
            String result = br.readLine();
            int count = 0;
            for(int x=0; x < result.length()-1; x++)
            {
                if(result.charAt(x) != result.charAt(x+1))
                    count++;
            }
            if(result.charAt(result.length()-1) == '-')
                count++;
            System.out.println("Case #"+(i+1)+": "+count);
            fw.write("Case #"+(i+1)+": "+count+"\n");
            fw.flush();
        }
        fw.close();
        br.close();
    }
}
