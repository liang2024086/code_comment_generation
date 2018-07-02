package methodEmbedding.Speaking_in_Tongues.S.LYD1452;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
/**
 *
 * @author christian
 */
public class Googlerese {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            FileInputStream fstream = new FileInputStream(args[0]);
            
            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            
        
            int testcases = Integer.parseInt(br.readLine());
            
            for (int i =0; i < testcases; i++) {
                String line = br.readLine();
                String newline = "";
                
                for (int j = 0; j < line.length(); j++) {
                    String g = line.substring(j,j+1);
                    //System.out.println(g);
                    if (g.equals("a")) newline = newline + "y";
                    if (g.equals("b")) newline = newline + "h";
                    if (g.equals("c")) newline = newline + "e";
                    if (g.equals("d")) newline = newline + "s";
                    if (g.equals("e")) newline = newline + "o";
                    if (g.equals("f")) newline = newline + "c";
                    if (g.equals("g")) newline = newline + "v";
                    if (g.equals("h")) newline = newline + "x";
                    if (g.equals("i")) newline = newline + "d";
                    if (g.equals("j")) newline = newline + "u";
                    if (g.equals("k")) newline = newline + "i";
                    if (g.equals("l")) newline = newline + "g";
                    if (g.equals("m")) newline = newline + "l";
                    if (g.equals("n")) newline = newline + "b";
                    if (g.equals("o")) newline = newline + "k";
                    if (g.equals("p")) newline = newline + "r";
                    if (g.equals("q")) newline = newline + "z";
                    if (g.equals("r")) newline = newline + "t";
                    if (g.equals("s")) newline = newline + "n";
                    if (g.equals("t")) newline = newline + "w";
                    if (g.equals("u")) newline = newline + "j";
                    if (g.equals("v")) newline = newline + "p";
                    if (g.equals("w")) newline = newline + "f";
                    if (g.equals("x")) newline = newline + "m";
                    if (g.equals("y")) newline = newline + "a";
                    if (g.equals("z")) newline = newline + "q";
                    if (g.equals(" ")) newline = newline + " ";
                    
                    }
                System.out.println( "Case #" + (i+1) + ": " + newline);

                }
                
                
                
                
                
                // save
                //bw.write("Case #" + "i" + ": " + recycledpairs);
                //bw.newLine();
                
               
            
            
            in.close();
            //out.close();
            
        } catch (Exception e) {
            
            //Catch exception if any
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
