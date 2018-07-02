package methodEmbedding.Standing_Ovation.S.LYD319;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.*;
import java.util.List;
import java.util.Scanner;
import java.lang.String;
import java.util.StringTokenizer;

/**
 *
 * @author Zeinab
 */
public class CodeJam2 {

    public static int T_No = 0;

    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new FileReader("D:\\Zeee\\input_file.in"));
                BufferedReader br = new BufferedReader(new FileReader("D:\\Zeee\\A-small-attempt0.in"));

//        FileWriter bw = new FileWriter("D:\\Zeee\\output_file.out");
        BufferedWriter bw =  new BufferedWriter(new FileWriter("D:\\Zeee\\A-small-attempt0.out",false)); 

        String sCurrentLine;
        String firstLine;
        String tok1, tok2;
        int line_no = 0;



        firstLine = br.readLine();
        T_No = Integer.parseInt(firstLine);
        InputData data[] = new InputData[T_No];
        //System.out.println(data.length);
        int counter = 0;

        int sum = 0;
        int additional = 0;


        while ((sCurrentLine = br.readLine()) != null) {
            line_no = line_no + 1;
            StringTokenizer tokenizer = new StringTokenizer(sCurrentLine, " ");
            tok1 = tokenizer.nextToken();
            tok2 = tokenizer.nextToken();
//                               System.out.println(tok1);
//                               System.out.println(tok2);

            data[counter] = new InputData(line_no, Integer.parseInt(tok1), tok2);
            data[counter].s_max = Integer.parseInt(tok1);


            System.out.println(data[counter].text_case_no);
            System.out.println(data[counter].s_max);
            System.out.println(data[counter].s_i);
            for (int j = 0; j < data[counter].s_i_int.length; j++) {
                System.out.print(data[counter].s_i_int[j] + " ");
            }


//                               int  s_i_int[] = new int [data[counter].s_max];
//                               for(int k=0;k<data[counter].s_max;k++)
//                                   s_i_int[k] = (int)data[counter].s_i[k];


            sum = data[counter].s_i_int[0];
            for (int mm = 1; mm <= data[counter].s_max; mm++) {


                if (sum + additional < mm && mm != 0) {
                    additional += (mm - (sum + additional));
                }
                sum = sum + data[counter].s_i_int[mm];
            }

            System.out.println("\nCase #" + data[counter].text_case_no + ": " + additional);

            String res = "Case #" + data[counter].text_case_no + ": " + additional + "\n";
            System.out.println(res);
            bw.write(res);
            sum = 0;
            additional = 0;


        }

bw.close();
br.close();

    }
}
