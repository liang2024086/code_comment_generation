package methodEmbedding.Standing_Ovation.S.LYD1449;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillermo M. Robles Mart??nez (gmo) <gwmifero@gmail.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("A-small-attempt0.in"));
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        int people[] ;
        int smax;
        int alreadyStanding;
        int peopleMissing;
        int call;
        String line[];
        String audience;
        
        for (int i = 0; i < T; i++) {
            line     = bf.readLine().split(" ");
            smax     = Integer.parseInt(line[0]);
            audience = line[1];
            people   = new int[smax+1];
            
            for (int j = 0; j < audience.length(); j++) {
                people[j] = audience.charAt(j) - '0';
            }
            
            alreadyStanding = people[0];
            peopleMissing   = 0;
            
            for (int j = 1; j < people.length; j++) {
                if(people[j] == 0){
                    continue;
                }
                if(j > alreadyStanding){
                    call            = j - alreadyStanding;
                    peopleMissing  += call;
                    alreadyStanding+= call;
                }
                alreadyStanding += people[j];
            }
            System.out.printf("Case #%d: %d\n", i + 1, peopleMissing);
        }
    }
    
}
