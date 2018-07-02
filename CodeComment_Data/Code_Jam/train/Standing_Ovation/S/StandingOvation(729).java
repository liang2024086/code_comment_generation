package methodEmbedding.Standing_Ovation.S.LYD1448;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;

/**
 *
 * @author myrto
 */
public class StandingOvation {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Solver s = new Solver("A-small-attempt0.in");
        s.computeSolutions();
        s.printSolutions();
    }
    
}
