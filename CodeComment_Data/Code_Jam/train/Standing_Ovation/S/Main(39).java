package methodEmbedding.Standing_Ovation.S.LYD1072;

import java.io.*;

/**
 * Created by armaDio on 11/04/2015.
 */
public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
            PrintWriter out = new PrintWriter("output.out");

            int ntests = Integer.parseInt(in.readLine());

            System.out.println(ntests);

            for(int i = 0; i<ntests;i++){
                String line = in.readLine();
                String[] parts = line.split(" ");

                String answer = "Case #"+(i+1)+": ";

                int Smax = Integer.parseInt(parts[0]);
                int S = 0;
                boolean p = false;
                int t = 0;
                for(int j = 0;j<=Smax;j++){
                    int number = Integer.parseInt(""+parts[1].toCharArray()[j]);
                    if(p && number != 0){
                        if(t<j){
                            int f1 = j-t;
                            S+=f1;
                            t+=f1;
                        }
                    }
                    if(number==0){
                        p=true;
                    }else{
                        p=false;
                    }
                    t+=number;
                }
                //System.out.println(S);
                answer+= ""+S;
                out.println(answer);
            }

            out.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

}
