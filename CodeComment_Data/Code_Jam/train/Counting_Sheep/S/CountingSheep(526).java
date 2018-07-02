package methodEmbedding.Counting_Sheep.S.LYD36;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author azeez
 */
public class CountingSheep {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        HashSet<Integer> a = new HashSet<>();
        ArrayList<Integer> numberTracker=new ArrayList<>();
        PrintWriter writer = new PrintWriter("counting_sheep_small", "UTF-8");

        FileReader reader = new FileReader("/home/azeez/Downloads/A-small-attempt2.in");
        BufferedReader br = new BufferedReader(reader);
        //Scanner sc=new Scanner(System.in);
        
        int testCaseNo=Integer.parseInt(br.readLine());
        for(int i=0;i<testCaseNo;++i){
            int chosenNo=Integer.parseInt(br.readLine());
           // numberTracker.add(chosenNo);
                if(chosenNo==0){
                    writer.println("Case #"+(i+1)+": INSOMNIA");
                }else{
                    int multiplier=1;
                    while(true){
                        String[] x=Integer.toString(chosenNo*multiplier).split("");
                        for(String xx:x){
                            a.add(Integer.parseInt(xx));
                         
                        }
                        numberTracker.add(chosenNo*multiplier);
                        ++multiplier;
                        if(a.size()==10){
                            System.out.println("tracker: "+numberTracker);
                            System.out.println("hashset: "+a);
                            writer.println("Case #"+(i+1)+": "+numberTracker.get(numberTracker.size()-1));
                            break;
                        }
                    }
                    a.clear();
                    numberTracker.clear();
                }
        }
        writer.close();
    }
}
