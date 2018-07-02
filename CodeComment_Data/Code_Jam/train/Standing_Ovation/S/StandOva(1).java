package methodEmbedding.Standing_Ovation.S.LYD2067;

import java.io.*;
import java.util.*;
public class StandOva {
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(new File("../../../input.txt"));
        PrintStream out = new PrintStream(new FileOutputStream("../../../dashboard.out"));
        int T = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<T;i++){
            String line=sc.nextLine();
            String temp[]=line.split(" ");
            int K=Integer.parseInt(temp[0]);
            int S[]=new int[K+1];
            for(int j=0;j<=K;j++)
                S[j]=temp[1].charAt(j)-48;
            int count=0;
            for(int j=1;j<=K;j++){
              if(S[j]!=0){
                int s=0;
                for(int l=j-1;l>=0;l--)
                    s=s+S[l];
                if(j>(s+count))
                  count=count+(j-(s+count));
              }
            }
            out.println("Case #"+(i+1)+": "+count);
        }
    }

}
