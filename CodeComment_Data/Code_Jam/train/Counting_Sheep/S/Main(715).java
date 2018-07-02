package methodEmbedding.Counting_Sheep.S.LYD462;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author topik
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for( int i=1; i <= testCases; i++ ) {
            int n = scanner.nextInt();
            System.out.println("Case #" + i + ": " + new CountingSheep().count(n));
        }
    }
}
