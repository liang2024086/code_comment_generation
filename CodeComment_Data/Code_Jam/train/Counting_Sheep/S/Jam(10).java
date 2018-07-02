package methodEmbedding.Counting_Sheep.S.LYD1622;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sandi
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Jam {
    public static void main(String[]args) throws FileNotFoundException, IOException{
        FileReader fr = new FileReader(new File(args[0]));
        
        Scanner vhod = new Scanner(fr);
        int number = Integer.parseInt(vhod.nextLine());
        for(int k=1;k<=number;k++){
            int in =  Integer.parseInt(vhod.nextLine()),c=0,dol=in+"".length(),n=0;
            String out="";
            if(in==0){
                out="Case #"+k+": INSOMNIA";
                System.out.println(out);
                continue;
            }
            boolean[] tab= new boolean[10];
            for(int i=0;i<tab.length;i++)
                tab[i]=false;
            for(int i=1;i<=200;i++){
                n = in * i;
                while(n>0){
                    //System.out.println("n "+n);
                    //System.out.println(n%10+"<-- rez");
                    if(tab[n%10]==false){
                        tab[n%10]=true;
                        c+=1;
                    }
                    if(c==10){
                        out="Case #"+k+": "+in*i+"";
                        break; 
                    }
                    //System.out.println(n%10);
                    n/=10;
                }
                if(c==10)
                    break;
            }
            System.out.println(out);
        }
        fr.close();
    }
}
