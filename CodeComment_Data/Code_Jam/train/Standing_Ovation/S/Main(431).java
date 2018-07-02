package methodEmbedding.Standing_Ovation.S.LYD1028;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File input = new File("A-small-attempt0.in");
        Scanner sc = new Scanner(input);
        //Scanner sc = new Scanner(System.io);
        File output = new File("output.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(output));
        int nTest = sc.nextInt();
        for(int i=0;i<nTest;i++){
            int nLevel = sc.nextInt();
            String andience = sc.next();
            int cur = 0;
            int invite = 0;
            for(int j=0;j<=nLevel;j++){
                int num = Integer.parseInt(andience.substring(j,j+1));
                if(num==0) continue;
                if(cur>=j){
                    cur += num;
                }else{
                    int temp = j-cur;
                    invite += temp;
                    cur += (temp+num);
                }
            }
            System.out.println("Case #" + (i+1) + ": " + invite);
            bw.write("Case #" + (i+1) + ": " + invite + "\n");
        }
        bw.close();
    }
}
