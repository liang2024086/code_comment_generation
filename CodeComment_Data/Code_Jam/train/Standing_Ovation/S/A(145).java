package methodEmbedding.Standing_Ovation.S.LYD976;

import java.io.*;
import java.util.*;

public class A {
    public static void main (String [] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        System.out.println("");
        for(int i = 1; i<=t; i++){
            String[] line = in.nextLine().split(" ");
            int max = Integer.parseInt(line[0]);
            int people = 0;
            int total = 0;
            for(int j = 0; j<(max+1); j++){
                int a = Integer.parseInt(line[1].substring(j, j+1));
                if(total>=j){
                    total+=a;
                }
                else{
                    if(a>0){
                        people+=(j-total);
                        total+=people;
                        total+=a;
                    }
                }
            }
            System.out.println("Case #"+i+": "+people);
        }
    }
}
