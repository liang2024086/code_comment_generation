package methodEmbedding.Speaking_in_Tongues.S.LYD120;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

class SpeakingTongues{
    public static void main(String[] args)
    throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        HashMap<String, String> map = new HashMap<String, String>();
        String[] in = {"ejp mysljylc kd kxveddknmc re jsicpdrysi",
                        "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
                        "de kr kd eoya kw aej tysr re ujdr lkgc jv"};
        String[] out = {"our language is impossible to understand",
                        "there are twenty six factorial possibilities",
                        "so it is okay if you want to just give up"};
        for(int i=0;i<3;i++){
            int l = in[i].length();
            for(int j=0;j<l;j++){
                map.put(""+in[i].charAt(j), out[i].charAt(j)+"");
            }
        }
        map.put("q", "z");
        map.put("z", "q");

        for(int i=0; i<T; i++){
            String input = br.readLine();
            String output = "Case #"+(i+1)+": ";
            int len = input.length();
            for(int j=0;j<len;j++){
                output += map.get(""+input.charAt(j));
            }
            bw.write(output+"\n");
        }
        
        bw.close();
    }
}
