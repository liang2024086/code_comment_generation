package methodEmbedding.Counting_Sheep.S.LYD46;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Rahul
 */
public class CountingSheep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        Scanner in = new Scanner(new FileInputStream("C:\\Users\\Rahul\\Downloads\\A-small-attempt0.in"));
        //Scanner in = new Scanner(System.in);A-large-practice
        StringBuilder output = new StringBuilder("");
        int T = in.nextInt();
        in.nextLine();
        for(int t = 1;t <= T;t++){
            String N = in.nextLine();
            //System.out.println(N.length());
            if(Integer.valueOf(N)== 0){
                output.append("Case #" + t + ": " +"INSOMNIA" + "\n");
            }else{
                int[] find = new int[10];
                int check = 0;
                int i=1;
                while(check != 10){
                    int j = N.length()-1;
                    int carry = 0;
                    while(j >= 0){
                        int temp = (N.charAt(j) - '0')*i + carry;
                        carry = temp / 10;
                        if(find[temp % 10] == 0){
                            check++;
                            find[temp % 10] = 1;
                        }
                        j--;
                    }
                    if(carry != 0 && find[carry] == 0){
                            check++;
                            find[carry] = 1;
                        }
                    i++;
                }
                output.append("Case #" + t + ": " +Integer.valueOf(N)*(i-1) + "\n");
            }
            
            //System.out.println(Integer.valueOf(N)*(i-1));
        }



        FileOutputStream outS = new FileOutputStream("C:\\Users\\Rahul\\Downloads\\A-small-attempt0-output.in");
        BufferedOutputStream outBs = new BufferedOutputStream(outS);
        outBs.write(output.toString().getBytes());
        outBs.flush();
    }

}
