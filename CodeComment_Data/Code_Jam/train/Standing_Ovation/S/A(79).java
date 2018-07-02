package methodEmbedding.Standing_Ovation.S.LYD104;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;

/**
 * Created by Sumedh on 11-04-2015.
 */
public class A {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("E:/codejam/A-small-attempt0.in");			//
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw =new FileWriter("E:/codejam/out.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            int T = Integer.parseInt(br.readLine());
            for(int x=0;x<T;x++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int smax = Integer.parseInt(st.nextToken());
                String str = st.nextToken();
                char[] s = str.toCharArray();
                int count=0,k=0;
                int standing = 0;
                for(char c:s){
                    int shy_count = (int)c - 48;
                    if(standing>=k) {
                        standing += shy_count;
                    }
                    else{
                        int required = k-standing;
                        standing+=required+shy_count;
                        count+=required;
                    }
                    k++;
                }
                String ans="Case #"+(x+1)+": "+count;
                bw.write(ans);
                bw.newLine();
            }
            bw.flush();
            bw.close();
        }catch(Exception e){e.printStackTrace();}
    }
}
