package methodEmbedding.Revenge_of_the_Pancakes.S.LYD960;


import java.io.*;
import java.io.DataInputStream;

public class Main {

    public static void main(String args[]){
        try{
            FileInputStream fstream = new FileInputStream("B-small-attempt0.in");
            DataInputStream dis = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(dis));

            FileWriter writer = new FileWriter("result.txt");

            StringWriter sw = new StringWriter();
            BufferedWriter bw = new BufferedWriter(sw);
            String pattern = "Case #%d: %s\n";
            String patString;

            int flips,j;
            int N = Integer.parseInt(br.readLine());
            String read;
            char [] pancakeLine;
            int flipFlag;

            for (int i = 0; i<N; i++){

                read = br.readLine();
                pancakeLine = read.toCharArray();
                flips = 0;
                for (;;) {

                    j = 0;
                    flipFlag = 0;

                    while (pancakeLine[j] == '+' && j < read.length()) {
                        pancakeLine[j] = '-';
                        if (j == 0)
                            flips++;
                        if (j == read.length() - 1)
                            flipFlag = 1; //all were right
                        j++;
                        if(j == read.length())
                            break;
                    }

                    if (flipFlag == 1){
                        flips--;
                        break;
                    }

                    j = 0;
                    while (pancakeLine[j] == '-') {
                        pancakeLine[j] = '+';
                        if (j == 0)
                            flips++;
                        j++;
                        if(j == read.length())
                            break;
                    }

                }

                patString = String.format(pattern,i+1,flips);
                writer.write(patString);
            }
            writer.close();
            dis.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
