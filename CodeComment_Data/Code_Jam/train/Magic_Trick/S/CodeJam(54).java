package methodEmbedding.Magic_Trick.S.LYD2074;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Stratos
 */
public class CodeJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("A-small-attempt0.in"));
        File file = new File("q1out.out");
        file.createNewFile();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            int times=scanner.nextInt();
            Q1 q1=new Q1();
            for (int i = 0; i < times; i++) {
                q1.go(scanner,writer);
            }
        }
    }
    
}
