package methodEmbedding.Standing_Ovation.S.LYD1808;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Omar
 */
public class StandingOvation {
    public static void main(String[] args) throws URISyntaxException, FileNotFoundException, IOException{
        URI uri = new URI("A-small-attempt0.in");
        File input = new File(uri.getPath());
        File file = new File("result.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        try {

        Scanner sc = new Scanner(input);
        int inputSize = sc.nextInt(), maxLevel, currentLevel, sum, difference;;
        String tmp ;
        
            for(int i = 1; i <= inputSize;i++){
                maxLevel = sc.nextInt();
                tmp = sc.next();
                sum = difference = 0;
                for(int j= 0; j <= maxLevel; j++){
                    currentLevel = Character.getNumericValue(tmp.charAt(j));           
                    if(j> sum && currentLevel!=0){
                        difference += j - sum;
                        sum += j- sum;
                    }
                    sum += currentLevel;
                    }
                    bWriter.append("Case #"+i+": "+difference);
                    bWriter.newLine();
                }         
                bWriter.flush();
                sc.close();
            } 
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }  
        //String[] inputString = readDoc(input).split("\\r?\\n");
    }
    
   /*public static String readDoc(File f) {
        String text = "";
        int read, N = 1024 * 1024;
        char[] buffer = new char[N];

        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            while (true) {
                read = br.read(buffer, 0, N);
                text += new String(buffer, 0, read);

                if (read < N) {
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return text;
    }}*/
 

