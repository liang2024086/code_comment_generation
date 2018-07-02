package methodEmbedding.Magic_Trick.S.LYD920;

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
 * @author Kakashi
 */
public class Jam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String file = "A-small-attempt0";
        String dir = "c:/jam/";
        String newLine = System.getProperty("line.separator");
        try{
            //out
            FileWriter fw = new FileWriter(dir+file+".out");
            BufferedWriter bw = new BufferedWriter(fw);
            //in
            Scanner sc = new Scanner(new File(dir+file+".in"));
            int cases = Integer.parseInt(sc.nextLine());
            //System.out.println(cases);
            for(int i = 1 ; i<=cases;i++){
                int f1,f2;
                int[][] s = new int[2][4];
                f1 = Integer.parseInt(sc.nextLine())-1;
                for(int r = 0;r<4;r++){
                    String[] row = sc.nextLine().split(" ");
                    if(f1 == r)
                        for(int c = 0; c<4;c++)
                            s[0][c] = Integer.parseInt(row[c]);
                }
                f2 = Integer.parseInt(sc.nextLine())-1;
                for(int r = 0;r<4;r++){
                    String[] row = sc.nextLine().split(" ");
                    if(f2 == r)
                        for(int c = 0; c<4;c++)
                            s[1][c] = Integer.parseInt(row[c]);
                }
                int m = 0;
                int cr = 0;
                for (int r = 0 ; r<4 ; r++)
                    for (int r1 = 0 ; r1<4 ; r1++)
                        if(s[0][r]==s[1][r1]){
                            m++;
                            cr = r;
                        }
                String result = "";
                if(m == 1 )
                    result += s[0][cr];
                else if(m == 0)
                    result = "Volunteer cheated!";
                else 
                    result = "Bad magician!";
                bw.write("Case #"+i+": "+result);
                bw.write(newLine);
            }
            bw.close();
        }catch(IOException e){
            e.getMessage();
        }
    }
    
}
