package methodEmbedding.Standing_Ovation.S.LYD1177;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author chicken
 */
public class GoogleQualification2015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("A-small-attempt0.in");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        int cases = Integer.parseInt(br.readLine());
        List<String> results = new LinkedList<>();
        for(int c = 0; c < cases; c++) {
            String[] line = br.readLine().split(" ");
            int total = 0;
            int friends = 0;
            
            for(int character = 0; character <  line[1].length(); character++) {
                int k = Integer.parseInt(""+line[1].charAt(character));
                if(k != 0) {
                    int newFriends = (character-total)<0?0:character-total;
                    friends += newFriends;
                    total += k + newFriends;
                }
            }
            System.out.println("Case #" + (c+1) +": " + friends);
            results.add("Case #" + (c+1) +": " + friends);
        }
        PrintWriter out = new PrintWriter("result");
        for(String r : results) {
            out.println(r);
        }
        out.close();
    }
}
