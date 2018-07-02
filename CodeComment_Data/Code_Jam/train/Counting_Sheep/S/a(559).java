package methodEmbedding.Counting_Sheep.S.LYD974;

/*
 * @author Anand  Undavia
 */
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;

class CodeJam {

    public static void main(String[] args) throws Exception {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int I=1;I<=t;I++){
            int n = Integer.parseInt(br.readLine());
            if(n == 0){
                bw.write("Case #"+I+": INSOMNIA\n");
                continue;
            }
            boolean freq[] = new boolean[10],allDone;
            int k;int p=n;
            for(k=0;;){
                char c[] = Integer.toString(p).toCharArray();
                for(int i=0;i<c.length;i++){
                    freq[c[i]-'0'] = true;
                }
                allDone = freq[0]&&freq[1]&&freq[2]&&freq[3]&&freq[4]&&freq[5]&&freq[6]&&freq[7]&&freq[8]&&freq[9];
                if(allDone){break;}
                p = ++k*n;
            }
            bw.write("Case #"+I+": "+p+"\n");
        }
        bw.close();
    }

}
