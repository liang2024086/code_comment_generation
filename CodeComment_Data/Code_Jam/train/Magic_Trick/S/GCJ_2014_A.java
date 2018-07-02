package methodEmbedding.Magic_Trick.S.LYD1467;


import lib.collections.CollectionUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lisen
 * Date: 4/13/14
 * Time: 12:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class GCJ_2014_A {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("/Users/lisen/Downloads/A-small-attempt0.in");
        OutputStream outputStream =  new FileOutputStream("/Users/lisen/Downloads/A-small-attempt0.output");;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        int caseNumber = in.nextInt();
        for (int ii = 1 ; ii <= caseNumber; ++ii){
            int firstIndex = in.nextInt();
            Integer[][] matrix = new Integer[4][4];
            for (int i = 0; i < 4; ++i){
                for (int j = 0; j < 4; ++j){
                    matrix[i][j] = in.nextInt();
                }
            }
            int secondIndex = in.nextInt();
            Integer[][] newMatrix = new Integer[4][4];
            for (int i = 0; i < 4; ++i){
                for (int j = 0; j < 4; ++j){
                    newMatrix[i][j] = in.nextInt();
                }
            }

            List<Integer> firstList = Arrays.asList(matrix[--firstIndex]);
            List<Integer> secondList = Arrays.asList(newMatrix[--secondIndex]);
            System.err.println(firstList.toString());
            System.err.println(secondList.toString());
            List<Integer> res = new ArrayList<Integer>();
            for (int i = 0; i < firstList.size(); ++i){
                if (secondList.contains(firstList.get(i))){
                   res.add(firstList.get(i));
                }
            }
            if (res.size() == 0){
                out.write("Case #" + ii + ": Volunteer cheated!\n");
            }else if (res.size() == 1){
                out.write("Case #" + ii + ": " + res.get(0) + "\n");
            }else{
                out.write("Case #" + ii + ": Bad magician!\n");
            }
            out.flush();

        }
        out.close();

    }
}
