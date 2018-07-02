package methodEmbedding.Magic_Trick.S.LYD1032;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Magic_Trick {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
        FileWriter out=new FileWriter("out.out");
        //BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 1; i <= t; i++) {
            int r = Integer.parseInt(br.readLine())-1;
            int a[][] = new int[4][4];
            int b[] = new int[4];
            for (int j = 0; j < 4; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < 4; k++) {
                    a[j][k] = Integer.parseInt(st.nextToken());
                    if(r==j){
                        b[k]=a[j][k];
                    }
                }
             }
            
            
            r = Integer.parseInt(br.readLine())-1;
            int n = 0,no=0;
            for (int j = 0; j < 4; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < 4; k++) {                    
                        a[j][k] = Integer.parseInt(st.nextToken());
                       
                        if (j == r) {
                        for (int l = 0; l < 4; l++) {
                            if (a[j][k] == b[l]) {
                                n++;
                                no=a[j][k];
                            }
                        }
                    }
                }

            }
            
            out.append("Case #"+i+": ");
            if(n==1){
                out.append(no+"\n");                
            }else if(n>1){
                out.append("Bad magician!\n");
            }else if(n==0){
                out.append("Volunteer cheated!\n");
            }
        }
        out.close();
    }
}
