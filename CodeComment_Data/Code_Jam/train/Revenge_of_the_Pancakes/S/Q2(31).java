package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1208;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rahim
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("input.txt"));
            FileWriter write = new FileWriter("output.txt");
            int test = in.nextInt();
            int count=0;
            int counter=0;
            int i=0;
            int check=0;
            while(test-- >0){
                count=0;
                check ++;
                boolean flag = true;
                String pancake_sides = in.next();
                
                char[] sides = pancake_sides.toCharArray();
                for(int j=0;j<sides.length;j++){
                    if(sides[j]=='-'){
                        flag = false;
                    }
                }
                System.out.println("\n\n "+check);
                System.out.println(pancake_sides);
                while(!flag)
                {
                    count++;
                    char find = sides[0];
                    for(i = 0 ;i<sides.length ; i++){
                        if(sides[i] == find){
                            counter =i;
                        }
                        else
                            break;
                    }
                    int k=0;
                    char tempe;
                    for(int j=counter; j>=counter/2; j--){
                        tempe=sides[k];
                        sides[k]=sides[j];
                        sides[j]=tempe;
                        k++;
                    }
                    for(int j = 0 ;j<=counter ; j++){
                        if(sides[j]=='-'){
                            sides[j]='+';
                        }else{
                            sides[j] = '-';
                        }
                    }
                    flag = true;
                    for(int j=0;j<sides.length;j++){
                        if(sides[j]=='-'){
                            flag = false;
                        }
                    }
                    for(int j=0;j<sides.length;j++){
                        System.out.print(sides[j]);
                    }
                System.out.println("     "+counter);
                }
                
                for(int j=0;j<sides.length;j++){
                        System.out.print(sides[j]);
                    }
                System.out.println("   ");
                write.write("Case #"+check+": "+count+"\r\n");
            }
            write.flush();
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
    }
    
}
