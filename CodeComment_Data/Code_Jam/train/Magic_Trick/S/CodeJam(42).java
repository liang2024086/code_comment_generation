package methodEmbedding.Magic_Trick.S.LYD18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CodeJam {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("in.txt")));
        FileWriter fw=new FileWriter("out.txt");
        StringBuffer sb=new StringBuffer();
        int cases=Integer.parseInt(br.readLine());
        for(int i=0;i<cases;i++){
            int row1=Integer.parseInt(br.readLine());
            int[][]set1=new int[4][4];
            int []selected1=new int[4];
            for(int j=0;j<4;j++){
                StringTokenizer st=new StringTokenizer(br.readLine());
                for(int z=0;z<4;z++){
                    set1[j][z]=Integer.parseInt(st.nextToken());
                    if(j==row1-1){
                        selected1[z]=set1[j][z];
                    }
                }
            }
            int[][]set2=new int[4][4];
            int row2=Integer.parseInt(br.readLine());
            int []selected2=new int[4];
            for(int j=0;j<4;j++){
                StringTokenizer st=new StringTokenizer(br.readLine());
                for(int z=0;z<4;z++){
                    set2[j][z]=Integer.parseInt(st.nextToken());
                    if(j==row2-1){
                        selected2[z]=set2[j][z];
                    }
                }
            }
            int counter=0;
            int ans=0;
            for(int j=0;j<4;j++){
                for(int z=0;z<4;z++){
                    if(selected1[j]==selected2[z]){
                        counter++;
                        ans=selected1[j];
                    }
                }
            }
            sb.append("Case #").append(i+1).append(": ");
            if(counter==0){
                sb.append("Volunteer cheated!");
            }
            else if(counter==1){
                sb.append(ans);
            }else{
                sb.append("Bad magician!");
            }
            sb.append('\n');
        }
        fw.append(sb);
        fw.close();
    }
}
