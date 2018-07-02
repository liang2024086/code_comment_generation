package methodEmbedding.Magic_Trick.S.LYD2065;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Roaa
 */
public class Magic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
        FileReader fr =new FileReader ("A-small-attempt0.in");
     BufferedReader in =new BufferedReader (fr);
FileWriter fw =new FileWriter ("out.txt");
     BufferedWriter out =new BufferedWriter (fw);
     String temp,sp[]; 
        int t=0,tt = 0;
        temp = in.readLine();
     //   System.out.println("Temp1 " + temp);
        tt = Integer.parseInt(temp);
        int row1[] = new int[4];
        int row2[] = new int[4];
        int f2,f1;
        while (t < tt){
        temp = in.readLine();
       // System.out.println("Temp2 " + temp);
        f1 = Integer.parseInt(temp);
        for (int i=0;i < 4;i++){
        temp = in.readLine();
         //       System.out.println("T " + temp);
        if (i == f1-1){
            sp = temp.split(" ");
            for (int j=0;j<sp.length;j++)
                row1[j] = Integer.parseInt(sp[j]);
        
        }
        }
        ///////////////////
        temp = in.readLine();
        f2 = Integer.parseInt(temp);
        for (int i=0;i<4;i++){
        temp = in.readLine();
        if (i == f2-1){
            sp = temp.split(" ");
            for (int j=0;j<sp.length;j++)
                row2[j] = Integer.parseInt(sp[j]);
        }
        }

        ////////////////////////////////
        /*for (int i=0 ;i<4;i++)
        {
            System.out.println(row1[i] + " " + row2[i]);
        }
        */
Vector<Integer> v=new Vector<Integer>();
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++)
            {
                if (row1[i] == row2[j])
                {
                 v.add(row1[i]);
                }
            }
        }
        if(v.size()==0)
        {
         out.append("Case #"+(t+1)+": " + "Volunteer cheated!");
        }
        if (v.size() == 1)
        {
         out.append("Case #"+(t+1)+": " + v.get(0));            
        }
        if(v.size()>1){
                 out.append("Case #"+(t+1)+": " + "Bad magician!");
        }
        out.newLine();
        t++;
        }
    in.close();
out.close();
    }
}
