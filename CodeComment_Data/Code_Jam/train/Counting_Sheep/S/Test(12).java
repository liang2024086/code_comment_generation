package methodEmbedding.Counting_Sheep.S.LYD1357;


import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * @Author: Ehsan Sh
 * User: Ehsan Sh
 * Date: 04/03/2016
 * Time: 12:10 PM
 */
public class Test {
    public static void main(String[] args) {
        File file = new File("D:\\workspace\\VBank-v3\\commons\\src\\main\\java\\com\\rayanen\\ebank\\small.in");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            int numberOfCase = Integer.parseInt(br.readLine());

            for (int i = 1; i <= numberOfCase; i++) {


                String sample = br.readLine();
                if (!sample.equals("0")) {
                    Long number = Long.parseLong(sample,10);
                    Long res = new Long(number);
                    Set<Long> set = new HashSet();

                    while (true) {
                        for (int j = 0; j < sample.length(); j++) {
                            Long d = Long.parseLong(sample.charAt(j) + "",10);
                            set.add(d);
                        }

                        boolean flag = true;
                        for (long k = 0; k < 10; k++) {
                            if (!set.contains(k)) {
                                flag = false;
                                break;
                            }
                        }
                        if (flag) {
                            break;
                        } else {
                            res = number + res;
                            sample = res + "";
                        }
                    }


                    System.out.print("Case #" + i + ": " + sample);

                    System.out.println();
                } else {
                    System.out.print("Case #" + i + ": INSOMNIA");

                    System.out.println();
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
