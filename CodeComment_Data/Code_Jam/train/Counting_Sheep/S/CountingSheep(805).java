package methodEmbedding.Counting_Sheep.S.LYD1295;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jbossman
 */
public class CountingSheep {
    public static void main(String[] args) throws FileNotFoundException, IOException{
       File inputfile = new File("//home//jbossman//Downloads//A-small-attempt0.in");
        File outputfile = new File("//home//jbossman//Desktop//output_A_small.txt");
        FileReader fr = new FileReader(inputfile);
        FileWriter fw = new FileWriter(outputfile.getAbsoluteFile());
        
	BufferedWriter bw = new BufferedWriter(fw);
        Scanner sc = new Scanner(fr);
        int N = Integer.valueOf(sc.nextLine());
        int k=0; //while loop counter
        
        int SENTINNEL = 200000;
        //char[] sheepCounted;
         while (k < N) {
            ArrayList al = new ArrayList();
            long sheep = 0, temp=0;
            int i = 1;
            sheep = Long.valueOf(sc.nextLine());
            char[] sheepCounted;
            while (i < SENTINNEL) {
                temp = (i * sheep);
                sheepCounted = String.valueOf(temp).toCharArray();
                for (int j = 0; j < sheepCounted.length; j++) {
                    if (!al.contains(sheepCounted[j])) {
                        al.add(sheepCounted[j]);
                    }
                }
                if(i == 200 && al.size() ==1){
                    System.out.println("Case #" + (k + 1+": ")+"INSOMNIA");
                    break;
                }
                if (al.size() == 10) {
                    //System.out.println(temp);
                     System.out.println("Case #" + (k + 1+": ")+temp);
                    break;
                }
                i++;
            }
            k++;
        }
    }
}
