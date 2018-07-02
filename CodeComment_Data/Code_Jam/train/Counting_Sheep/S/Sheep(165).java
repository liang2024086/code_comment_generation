package methodEmbedding.Counting_Sheep.S.LYD703;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author malgia
 */
public class Sheep {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Integer value=0, j=1, size, k=0, number=0, total=0,newValue;
        String strValue = "";
        String allDigits;
        try{
        BufferedReader fin=new BufferedReader(new InputStreamReader(new FileInputStream(new File("A-small-attempt0.in"))));
        PrintWriter fout = new PrintWriter (new BufferedWriter (new FileWriter ("A-small-attempt0.out")));
        total=Integer.parseInt(fin.readLine());
        for (int i=0;i<total;i++){
            allDigits = "0123456789";
            k=0;
            j=1;
            value=Integer.parseInt(fin.readLine());
            while(allDigits.compareTo("")!=0){
                size = allDigits.length();
                newValue = value*j;
                strValue = (newValue).toString();
                for(int l=0;l<strValue.length();l++){
                    allDigits = allDigits.replaceAll(Character.toString(strValue.charAt(l)),"");
                }
                j++;
                if(size==allDigits.length()){
                    k++;
                }
                if(k>100){
                    k=0;
                    strValue = "INSOMNIA";
                    break;
                }
            }
            number=i+1;
            fout.println("Case #"+number+": "+strValue);
        }
        fin.close();
        fout.close();
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
