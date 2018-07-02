package methodEmbedding.Magic_Trick.S.LYD415;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maou Sama
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int[][] arr = new int[4][4];
        int row;
        int cases;
        BufferedReader in = null;
        try {
            String path="A-small-attempt0.in";
            
            in = new BufferedReader(new FileReader(path));
            Scanner scan = new Scanner(in);
            cases = scan.nextInt();
            
            String pathout = "output.txt";
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pathout)));
                    
                
            
            for (int i = 0; i < cases; i++) {
                row = scan.nextInt();
                //System.out.println(""+row);
                for (int j = 0; j < arr.length; j++) {
                    
                    for (int k = 0; k < arr.length; k++) {
                        arr[j][k]= scan.nextInt();  
                        
                    }
                    
                }
                
                int temp[] = new int[4];
                for (int j = 0; j < 4; j++) {
                    temp[j] = arr[row-1][j];
                }
                //////////////
                row = scan.nextInt();

                for (int j = 0; j < arr.length; j++) {

                    for (int k = 0; k < arr.length; k++) {
                        arr[j][k]= scan.nextInt();

                    }

                }
                int temp2[] = new int[4];
                for (int j = 0; j < 4; j++) {
                    temp2[j] = arr[row-1][j];
                }
                int tempnum ;
                int count = 0;
                int answer = 0;
                for (int j = 0; j < 4; j++) {
                    tempnum = temp[j];
                    for (int k = 0; k < 4; k++) {
                        if (tempnum == temp2[k])
                        {
                            count++;
                            answer = tempnum ;
                        }
                    }
                }
                
                String output;
                if (count==0)
                {
                    output="Volunteer cheated!";
                }
                else if(count==1)
                {
                    output=""+answer;
                }
                else
                {
                    output="Bad magician!";
                }
                //////////
                out.append("Case #"+(i+1)+": "+output);
                out.newLine();
            }
            out.close();
            
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(JavaApplication12.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(JavaApplication12.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
