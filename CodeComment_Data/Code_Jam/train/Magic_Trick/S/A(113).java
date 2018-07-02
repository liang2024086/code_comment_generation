package methodEmbedding.Magic_Trick.S.LYD1589;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// AV Drift King
class MagicTrick {
    public static void main(String[] args) {
        try{
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
            int tc=Integer.parseInt(in.readLine());
            for (int t = 0; t < tc; t++) {
                int ans1=Integer.parseInt(in.readLine());ans1--;
                int ar[][]=new int[4][4];
                for (int i = 0; i < 4; i++) {
                    String inprow[]=(in.readLine()).split(" ");
                    for (int j = 0; j < 4; j++) {
                        ar[i][j]=Integer.parseInt(inprow[j]);
                    }
                }
                int ans2=Integer.parseInt(in.readLine());ans2--;
                int ar2[][]=new int[4][4];
                for (int i = 0; i < 4; i++) {
                    String inprow[]=(in.readLine()).split(" ");
                    for (int j = 0; j < 4; j++) {
                        ar2[i][j]=Integer.parseInt(inprow[j]);
                    }
                }
                int common=0;
                int val=-1;
                for (int i = 0; i < 4; i++) {
                    int elef=ar[ans1][i];
                    for (int j = 0; j < 4; j++) {
                        if(ar2[ans2][j]==elef){
                            common++;
                            val=elef;
                        }
                    }
                }
                if(common==1){
                    System.out.println("Case #"+(t+1)+": "+val);
                }
                else if(common==0){
                    System.out.println("Case #"+(t+1)+": Volunteer cheated!");
                }
                else{
                    System.out.println("Case #"+(t+1)+": Bad magician!");
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
