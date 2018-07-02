package methodEmbedding.Standing_Ovation.S.LYD776;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Sourav Kumar Paul on 4/11/2015.
 */
public class codeJam111 {
    public static void main(String[] args){
        try {
            File file = new File("Input.txt");
            File fileout = new File("Output.txt");
            int test, t, s;
            int output[];

            Scanner in = new Scanner(file);
            PrintWriter printer =new PrintWriter(fileout);


            while(in.hasNextLine()) {
                test = in.nextInt();
                output = new int[test];
                for (t = 0; t < test; t++) {
                    output[t] = 0;
                    int sum;
                    s = in.nextInt();
                    String str;
                    char[] strArray;
                    str = in.nextLine();
                    sum = 0;
                    for(int i=1; i<str.length(); i++)
                    {
                        
                       // printer.printf("%c %d\n",str.charAt(i), i);
                        if(str.charAt(i) != '0')
                        {
                            if(sum < (i-1))
                            {
                                output[t]+= (i-1) -sum;
                                sum += (i-1) -sum;
                                
                            }
                            sum += (int)str.charAt(i) - '0';

                        }
                    }
                

                    printer.printf("Case #%d: %d\n",t+1,output[t]);

                }
            }


            in.close();
            printer.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }


    }

}
