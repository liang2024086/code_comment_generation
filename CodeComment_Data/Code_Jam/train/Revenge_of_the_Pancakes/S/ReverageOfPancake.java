package methodEmbedding.Revenge_of_the_Pancakes.S.LYD382;


import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class ReverageOfPancake {

    private static final String FILE_SLOVE_A_IN=  "B-small-attempt1.in.txt";
    private static final String FILE_SLOVE_A_OUT = "B-small-attempt1.out.txt";
    public static void main(String [] args){
//                System.out.println("hello world ")


        BufferedReader br = null;

        try {
            FileOutputStream out = new FileOutputStream(FILE_SLOVE_A_OUT);
            String line;

            br = new BufferedReader(new FileReader(FILE_SLOVE_A_IN));
            int count = Integer.parseInt(br.readLine());
//            int i =1;
//            int counter=  0;
            for(int i = 0 ; i < count ; i ++  ) {
                int counter=  0;
                String pancake = br.readLine();
                char[] arPancake = pancake.toCharArray();
                boolean isComplete = false;
                char plus = '+';
//                char lastChar = '+';
                for (int j = 0; j < arPancake.length; j++) {

                    if(j== arPancake.length-1){
                        if(arPancake[j] == '-' ){
                            counter++;
                        }
                        break;
                    }
                    if(arPancake[j] != arPancake[j+1] ){
                        counter++;
                    }
                }



                if(counter>arPancake.length){
                    String s = "Case #"+  (i+1) +"error logic  \n";
                    System.out.print(s);
                    out.write(s.getBytes());

                }else{
                    String s = "Case #"+  (i+1) +": "+counter+"  \n";
                    System.out.print(s);
                    out.write(s.getBytes());
                }



            }

            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

//    private boolean isAllPlus(char r)

}
