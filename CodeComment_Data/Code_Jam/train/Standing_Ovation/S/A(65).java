package methodEmbedding.Standing_Ovation.S.LYD607;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ajantha on 4/8/15.
 */
public class A {


    public static  void  main(String [] args){


            Scanner scan = new Scanner(System.in);
            int T = scan.nextInt();
            for (int j=0;j<T;j++){
                int n=scan.nextInt();
                char [] str = scan.next().toCharArray();
                int [] ct = new int[str.length];
                int sppl = 0,count = 0;
                if(str.length == 1 && str[0] == 1)System.out.println("Case #" + j + ": " + 0);
                else if(str.length == 1 && str[0] == 0)System.out.println("Case #" + j + ": " + 1);
                else {
                    for (int i = 0; i < str.length; i++)ct[i] = Character.getNumericValue(str[i]);

                    for (int i = 0; i < ct.length-1; i++) {
                        if(ct[i] != 0 && ct[i+1] == 0){}
                        else if(ct[i] == 0 && ct[i+1] != 0) {
                            if (sppl < i+1) {
                                int p = i + 1 - sppl;
                                sppl += p;
                                count += p;
                            }

                        }
                        sppl += ct[i];
                    }
                    System.out.println("Case #" + j + ": " + count);
                }
            }






    }





}
