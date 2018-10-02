package methodEmbedding.Standing_Ovation.S.LYD1392;

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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lenovo
 */
public class StandingOvation {

    /**
     * @param args the command line arguments
     */
    private static OvationParsing ovationParser;
    
    public static void main(String[] args) {
        ovationParser = new OvationParsing();
        int counter = 1;
        try {
            File file = new File("A-small-attempt2.in");
            File newTextFile = new File("output.txt");
            FileWriter fw = new FileWriter(newTextFile);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            ovationParser.testCases = Integer.parseInt(line);
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(" ");
                int extraChairs = ovationParser.getExtraInvitesAudience(Integer.parseInt(data[0]), data[1]);
                fw.write("Case #" + counter + ": " + extraChairs + "\n");
                counter++;
            }
            fileReader.close();
            fw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StandingOvation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StandingOvation.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

}
