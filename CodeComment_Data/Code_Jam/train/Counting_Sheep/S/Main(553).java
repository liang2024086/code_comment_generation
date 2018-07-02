package methodEmbedding.Counting_Sheep.S.LYD1135;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            FileReader fRead= new FileReader("problemA.in");
            FileWriter fWrite = new FileWriter("problemA.out");

            Scanner in = new Scanner(fRead);
            int T = in.nextInt();
            in.nextLine();
            for (int i = 0; i < T; i++) {
                String result = "INSOMNIA";
                if (in.hasNext()) {
                    int N = in.nextInt();
                    if(N > 0)
                    {
                        int[] digits = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                        int numDigit = 0, mul = 0;
                        while (numDigit < 10)
                        {
                            mul++;
                            long K = N*mul;
                            while (K > 0)
                            {
                                long X = K%10;
                                K = (long)Math.floor(K/10);

                                if(digits[(int)X] == -1)
                                {
                                    digits[(int)X] = 1;
                                    numDigit++;
                                    if(numDigit >= 10) break;
                                }
                            }
                        }
                        result = "" + N*mul;
                    }
                }
                fWrite.write("Case #" + (i+1) + ": " + result + "\n");
            }

            fRead.close();
            fWrite.close();
        } catch (Exception ex) {

        }
    }

}
