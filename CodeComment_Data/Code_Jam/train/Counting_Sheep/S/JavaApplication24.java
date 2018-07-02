package methodEmbedding.Counting_Sheep.S.LYD1545;

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
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("input.txt"));
            FileWriter write = new FileWriter("output.txt");
            int test = in.nextInt();
            int count=0;
            while(test-- >0){
                count++;
                int[] number = new int[10];
                int value = in.nextInt();
                
                boolean flag = false;
                int counter = 1;
                for(int i=0;i<number.length;i++)
                    number[i] = i;
                while(!flag){
                    int temp = counter*value;
                    int t;
                    while (temp>0){
                        t= temp%10;
                        temp = temp /10;
                        for(int i = 0 ;i<number.length;i++){
                            if(t==number[i]){
                                number[i]= -1;
                            }
                        }
                    }
                    flag = true;
                    for(int i=0;i<number.length;i++){
                            if(number[i]!=-1){
                                flag = false;
                            }
                        }
                        if(flag)
                            write.write("Case #"+count+": "+counter*value+"\r\n");
                        if(counter > 100){
                            write.write("Case #"+count+": "+"INSOMNIA"+"\r\n");
                            break;
                        }
                        counter ++;
                }
                write.flush();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaApplication24.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication24.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
