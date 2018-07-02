package methodEmbedding.Magic_Trick.S.LYD121;

import java.util.*;
public class Magic_trick {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int runs = Integer.parseInt(sc.nextLine());
        main:
        for (int i = 0; i < runs; i++){
            int row = Integer.parseInt(sc.nextLine());
            for (int j = 0; j < row-1; j++)
                sc.nextLine();
            String[] row1 = sc.nextLine().split(" ");
            for (int j = row; j < 4; j++)
                sc.nextLine();
            row = Integer.parseInt(sc.nextLine());
            for (int j = 0; j < row-1; j++)
                sc.nextLine();
            String[] row2 = sc.nextLine().split(" ");
            for (int j = row; j < 4; j++)
                sc.nextLine();
            ArrayList<String> matches = new ArrayList<>();
            for (int j = 0; j < 4; j++)
                for (int k = 0; k < 4; k++)
                    if (row1[j].equals(row2[k]))
                        matches.add(row1[j]);
            System.out.print("Case #" + (i+1) + ": ");
            if (matches.size()>1)
                System.out.println("Bad magician!");
            else if (matches.size()<1)
                System.out.println("Volunteer cheated!");
            else
                System.out.println(matches.get(0));
        }
    }
}
