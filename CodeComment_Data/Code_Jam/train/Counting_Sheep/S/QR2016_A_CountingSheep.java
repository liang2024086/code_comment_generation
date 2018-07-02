package methodEmbedding.Counting_Sheep.S.LYD416;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Lenovo on 2016/4/9.
 */
public class QR2016_A_CountingSheep {
    public static void main( String[] args )
    {
        BufferedReader in = null;
        FileWriter out = null;
        try {
            //File file = new File("f:/data/QR2016_A_CountingSheep", "in.in");
            File file = new File("f:/data/QR2016_A_CountingSheep", "A-small-attempt0.in");
            in = new BufferedReader(new FileReader(file));
            out = new FileWriter("f:/data/QR2016_A_CountingSheep/A-small-attempt0.out");
            Integer T = new Integer(in.readLine());
            for (int cases = 1; cases <= T; ++cases) {
                Integer input = new Integer(in.readLine());
                if(input.equals(0)) {
                    out.write("Case #" + cases + ": INSOMNIA" + "\n");
                } else {
                    HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
                    for(int i = 0; i <=9; ++i) {
                        hashMap.put(i,i);
                    }
                    boolean goon = true;
                    int j = 1;
                    Integer temp;
                    while (goon) {
                        temp = j*input;
                        for(int count =temp.toString().length(); count > 0; --count) {
                            Integer number = temp % 10;
                            if (hashMap.containsKey(number)) {
                                hashMap.remove(number);
                            } else {
                                //do nothing;
                            }
                            temp = temp/10;
                        }
                        if(hashMap.size() <=0) {
                            goon = false;
                            out.write("Case #" + cases + ": " + j*input + "\n");
                        } else {
                            ++j;
                        }
                    }

                }

            }
            in.close();
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                    out.flush();
                    out.close();
                } catch (IOException e1) {
                }
            }
        }
        /*for(int i =0; i <= T-1; ++i) {
            int[] digits = new int[10];
        }*/
    }
}
