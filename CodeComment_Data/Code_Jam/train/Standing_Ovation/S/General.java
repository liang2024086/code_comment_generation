package methodEmbedding.Standing_Ovation.S.LYD1637;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 *
 * @author ASUS
 */
public class General {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            FileInputStream file = new FileInputStream("A-small-attempt0.in");
            FileOutputStream fileO = new FileOutputStream("A-small-attempt0.out");
            InputStreamReader in = new InputStreamReader(file);
            OutputStreamWriter out = new OutputStreamWriter(fileO);
            BufferedReader bf = new BufferedReader(in);
            int n = Integer.parseInt(bf.readLine());
            int cont=0,rest=0,x=1;
            while(n!=0){
                StringTokenizer tok = new StringTokenizer(bf.readLine()," ");
                int s = Integer.parseInt(tok.nextToken());
                String sk = tok.nextToken();
                cont = 0;
                rest = 0;
                for(int i = 0;i<=s;i++){
                    if(i==0)
                        cont+=Integer.parseInt(""+sk.charAt(i));
                    else{
                        if(cont>=i && sk.charAt(i)!='0')
                            cont+=Integer.parseInt(""+sk.charAt(i));
                        else
                            if(sk.charAt(i)!='0'){
                                rest += (i - cont) ;
                                cont+=rest + Integer.parseInt(""+sk.charAt(i));
                            }
                    }
                }
                //System.out.println("Case #" + x + ": " + rest);
                out.write("Case #" + x + ": " + rest + "\n");
                n--;x++;
            }
            out.close();
            in.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
