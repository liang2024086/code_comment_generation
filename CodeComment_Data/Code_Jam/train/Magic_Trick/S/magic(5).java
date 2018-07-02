package methodEmbedding.Magic_Trick.S.LYD318;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class magic{
    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        Scanner in = new Scanner(file);
        int cases = in.nextInt();
        int[] one = new int[16];
        int[] two = new int[16];
        ArrayList<Integer> match = new ArrayList<Integer>();
        int r1;
        int r2;
        int count = 0;
        int num = 0;
        for(int i = 0; i < cases; i++){
            r1 = in.nextInt();
            for(int j = 0; j < 16; j++) {
                one[j] = in.nextInt();
            }
            for(int j = (4*r1)-4; j < 4*r1; j++) {
                match.add(one[j]);
            }
            r2 = in.nextInt();
            for(int j = 0; j < 16; j++) {
                two[j] = in.nextInt();
            }
            for(int j = (4*r2) - 4; j < 4*r2; j++){
                match.add(two[j]);
            }
            Collections.sort(match);
            for(int j = 0; j < match.size() - 1; j++) {
                if(match.get(j) == match.get(j+1)) {
                    num = match.get(j);
                    count++;
                }
            }
            if(count == 0) {
                System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
            } else if(count > 1){
                System.out.println("Case #" + (i+1) + ": Bad magician!");
            } else {
                System.out.println("Case #" + (i+1) + ": " + num);
            }
            match.clear();
            count = 0;
        }
    }
}
