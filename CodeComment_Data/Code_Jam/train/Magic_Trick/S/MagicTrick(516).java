package methodEmbedding.Magic_Trick.S.LYD1664;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: dreamadmin
 * Date: 4/12/14
 * Time: 7:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class MagicTrick {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("A-small-attempt0.in"));
        BufferedWriter wr = new BufferedWriter(new FileWriter("A-small.out"));
        int T = sc.nextInt();
        for(int i=0;i<T;i++)
        {
            List<Integer>  firstArrange = new ArrayList<Integer>();
            List<Integer>  secondArrange = new ArrayList<Integer>();
            List<Integer> possibleValues = new ArrayList<Integer>();
            int firstRow = sc.nextInt();
            int[] firstArrangement = new int[4];
            int[] secondArrangement = new int[4];
           int findex = 0;
            int sindex = 0;
            for (int k = 0; k < 16; k++) {
                int value = sc.nextInt();
                if ((k >= ((firstRow - 1)*4)) && (k <= (((firstRow - 1) * 4) +3))) {
                    firstArrangement[findex] = value;
                    findex++;
                }
                firstArrange.add(value);

            }
            int secondRow = sc.nextInt();
            for (int k = 0; k < 16; k++) {
                int value = sc.nextInt();
                if ((k >= ((secondRow - 1)*4)) && (k <= (((secondRow - 1) * 4) +3))) {
                    secondArrangement[sindex] = value;
                    sindex++;
                }
                secondArrange.add(value);

            }
                for (int l = 0; l < firstArrangement.length; l++) {
                   for (int m = 0; m < secondArrangement.length; m++) {
                       if (secondArrangement[m] == firstArrangement[l]) {
                           possibleValues.add(firstArrangement[l]);
                       }
                   }
                }
            if (possibleValues.isEmpty()) {
                wr.write("Case #"+(i+1)+": "+"Volunteer cheated!"+"\n");
            }else if (possibleValues.size() == 1) {
                wr.write("Case #"+(i+1)+": "+possibleValues.get(0)+"\n");
            }  else if (possibleValues.size() > 1) {
                wr.write("Case #"+(i+1)+": "+"Bad magician!"+"\n");
            }

        }
        wr.close();
    }
}

//int C = sc.nextInt();
//int I = sc.nextInt();
////Scanner it = new Scanner(sc.nextLine());
//int items[] = new int[I];
////System.out.println(it.nextLine());
//for(int j=0;j<I;j++){
//        items[j]=sc.nextInt();
//}
//        for(int k=0; k<I;k++){
//        for(int l=0;l<I;l++){
//        if(items[k]+items[l]==C){
//        if(k<l)
//        wr.write("Case #"+(i+1)+": "+(k+1)+" "+(l+1)+"\n");
//}
//        }
//        }
