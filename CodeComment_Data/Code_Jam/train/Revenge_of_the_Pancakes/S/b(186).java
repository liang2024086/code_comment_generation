package methodEmbedding.Revenge_of_the_Pancakes.S.LYD685;


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
public class b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        LinkedList l1 = new LinkedList();

        for (int j = 0; j < t; j++) {
            String s = sc.next();
            char[] arr = s.toCharArray();
            int count = 0;
            if (arr.length > 1) {
                int i = 1;
                while (i < arr.length) {
                    if (arr[i] != arr[i - 1]) {
                        count++;
                        for (int x = 0; x < i; x++) {
                            arr[x] = arr[i];
                        }
                    }
                    i++;
                }
                }
            if (arr[arr.length-1] == '-') {
                    count++;               
            }
            l1.add(count);
        }
        int i = 1;
        for (Object o : l1) {
            System.out.println("Case #" + i + ": " + o);
            i++;
        }
    }
}
