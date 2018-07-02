package methodEmbedding.Speaking_in_Tongues.S.LYD713;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smith
 */
public class A {
    public static void main(String Args[]) throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(new File("input.in"));
        FileWriter fw = new FileWriter("ouput.out");
        String Dic = "yhesocvxduiglbkrztnwjpfmaq";
        int T = sc.nextInt();
        sc.nextLine();
        for (int i=0;i<T;i++){
            char palabra[] = sc.nextLine().toCharArray();
            fw.write("Case #"+(i+1)+": ");
        for (char c: palabra){
                if (c>='a' && c<='z'){
                    fw.write(Dic.charAt(c-'a'));
                }
                else{fw.write(c);
                }
            }
            fw.write('\n');
        }
        fw.close();
    }
}
