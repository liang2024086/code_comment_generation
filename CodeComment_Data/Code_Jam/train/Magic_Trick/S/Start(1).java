package methodEmbedding.Magic_Trick.S.LYD788;

import java.io.*;

public class Start{
    
    
    public static void main(String[] args) throws IOException{
        
      BufferedReader s = new BufferedReader(new FileReader("all.txt"));
        FileWriter ss = new FileWriter("sma.txt");
        int test = Integer.parseInt(s.readLine());
        for(int k=0;k<test;k++){
            int ans1 = Integer.parseInt(s.readLine());
            int[][] arr = new int[4][4];
            int[][] ar = new int[4][4];
            for(int i=0;i<4;i++){
                String[] str = s.readLine().split(" ");
                for(int j=0;j<4;j++){
                    arr[i][j] = Integer.parseInt(str[j]);
                }
            }
            int ans2 = Integer.parseInt(s.readLine());
            for(int i=0;i<4;i++){
                String[] str = s.readLine().split(" ");
                for(int j=0;j<4;j++){
                    ar[i][j] = Integer.parseInt(str[j]);
                }
            }
            
            int[] res = new int[4]; int[] re = new int[4];
            for(int i=0;i<4;i++){
                int key = arr[ans1-1][i]; int cc=0;
                for(int j=0;j<4;j++){
                    if(key == ar[ans2-1][j])
                        cc++;
                }
                res[i] = cc;
                if(cc!=0) re[i] = key;
            } int mm=0; int qq = 0;
            
            for(int i=0;i<4;i++){
                if(res[i]!=0){
                    mm++; qq = i;
                }
            }
            if(mm == 1)
                ss.write("Case #"+(k+1)+": "+re[qq]+"\n");
            else if( mm > 1)
               ss.write("Case #"+(k+1)+": Bad magician!"+"\n");
            else if( mm == 0)
                ss.write("Case #"+(k+1)+": Volunteer cheated!"+"\n");
        }
            ss.flush();
        
    }
}
