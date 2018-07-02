package methodEmbedding.Standing_Ovation.S.LYD1044;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author BEST
 */
public class StandingOvation {
    int invitations = 0;
    int standPersons = 0;
    int index = 0;
    String string;
    int smax;
    
    public StandingOvation(){
        Formatter format = new Formatter("C:\\Users\\BEST\\Downloads\\A-small-attempt0.in", "C:\\Users\\BEST\\Downloads\\A-small-attempt0.out");
        int cas = format.getNombreCas();
        List<String> liste = format.getListe();
        int current;
        for (int j = 1; j <= cas; j++){
            string = liste.get(j - 1);
            int len = string.length();
            standPersons = Integer.parseInt(string.substring(0, 1));
            for (int i = 1; i < len; i++){
                current = Integer.parseInt(string.substring(i, i+1));
                if (i > standPersons){
                    if (current > 0){
                        invitations += i - standPersons;
                        standPersons += invitations;
                    }
                }
                standPersons += current;
            }
            //System.out.println("Case #" + j + ": " + invitations);
            format.writeFile("Case #" + j + ": " + invitations);
            invitations = 0;
        }
        format.closeFormatter();
    }
    
    public static void main(String[] args) {
        new StandingOvation();
    }
}
