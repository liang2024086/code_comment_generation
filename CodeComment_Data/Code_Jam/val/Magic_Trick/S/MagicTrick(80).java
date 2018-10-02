package methodEmbedding.Magic_Trick.S.LYD740;


import java.io.*;
import java.util.Arrays;

public class MagicTrick {
    public static void main(String[] args) {
        try {
            FileInputStream fstream = new FileInputStream("123.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            int tests = Integer.decode(br.readLine());
            String line = null;

            for (int i = 0; i < tests; i++) {
                int row = Integer.decode(br.readLine());
                int a[] = new int[4];
                for (int j = 0; j < 4; j++) {
                    line = br.readLine();
                    if (j == (row-1)) {
                        String arr[] = line.trim().split(" ");
                        for (int p = 0; p < arr.length; p++) {
                            a[p] = Integer.decode(arr[p]);
                        }
                    }
                }

                row = Integer.decode(br.readLine());
                int b[] = new int[4];
                for (int j = 0; j < 4; j++) {
                    line = br.readLine();
                    if (j == (row-1)) {
                        String arr[] = line.trim().split(" ");
                        for (int p = 0; p < arr.length; p++) {
                            b[p] = Integer.decode(arr[p]);
                        }
                    }
                }

                Arrays.sort(a);
                Arrays.sort(b);

                int k = 0;
                int l = 0;
                int count = 0;
                int val = 0;
                while(k < 4 && l < 4)
                {
                    if(a[k] < b[l])
                        ++k;
                    else if(b[l] < a[k])
                        ++l;
                    else
                    {
                        val = b[l];
                        ++k;
                        ++l;
                        ++count;
                    }
                }

                if (count == 1) {
                    System.out.println("Case #" + (i+1) + ": " + val);
                } else if (count > 1) {
                    System.out.println("Case #" + (i+1) + ": Bad magician!");
                } else {
                    System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
                }
            }
            br.close();
            in.close();
            fstream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
