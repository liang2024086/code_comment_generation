package methodEmbedding.Counting_Sheep.S.LYD1094;


import java.util.LinkedList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rahul
 */
public class a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        LinkedList res = new LinkedList();
        for (int j = 0; j < t; j++) {
            long n = sc.nextLong();
            LinkedList l1 = new LinkedList();
            LinkedList l2 = new LinkedList();
            for (Integer i = 0; i <= 9; i++) {
                l1.add(i.toString());
            }
            int c = 1;
            long temp = n;
            while (!l1.isEmpty()) {
                temp = n * c;
                long y;
                Integer z;
                while ((y = (temp / 10)) != 0) {
                    z = (int) temp % 10;
                    if (l1.contains(z.toString())) {
                        l1.remove(z.toString());
                    }
                    temp = temp / 10;
                }
                Integer k = (int) temp % 10;
                if (l1.contains(k.toString())) {
                    l1.remove(k.toString());
                }

                if (l2.contains((Object)(n*c))) {
                    res.add("INSOMNIA");
                    c = 0;
                    break;
                }
                l2.add((Object)(n*c));
                c++;
            }
            if (c != 0) {
                res.add((n * (c - 1)));
            }
        }

        int p = 1;
        for (Object o : res) {
            System.out.println("Case #" + p + ": " + o);
            p++;
        }
    }
}
