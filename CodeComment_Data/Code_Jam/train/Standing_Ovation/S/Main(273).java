package methodEmbedding.Standing_Ovation.S.LYD617;


import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = null;
        PrintWriter out = null;
        try {
            in = new Scanner(new FileReader("input.txt"));
            out = new PrintWriter("output.txt");

            int cases = in.nextInt();
            for(int index=1; index<=cases; index++){

                int s_max = in.nextInt();
                String audience = in.next();
                int standing = 0;
                int invited = 0;

                for(int s = 0; s<=s_max; s++){
                    int num_s = Integer.parseInt(audience.substring(s, s + 1));
                    if( num_s != 0 && standing < s){
                        invited += s - standing;
                        standing += s - standing + num_s;
                    }else{
                        standing += num_s;
                    }
                }//end for

                out.printf("Case #%d: %d\n",index,invited);
                out.flush();



            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null)
                in.close();
            if (out != null)
                out.close();
        }
    }
}
