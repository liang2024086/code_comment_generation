package methodEmbedding.Cookie_Clicker_Alpha.S.LYD335;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author cllfst
 */
public class contest2 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner s=new Scanner(new File("entry (copy)"));
        System.setOut(new PrintStream(new File("output")));
        int cas=s.nextInt();
        double c;
        double f;
        double x;
        double t1;
        double t2;
        double nbC=2;
        double time=0;
        //System.out.println(cas);
        for(int i=1;i<=cas;i++){
            c=s.nextDouble();
            f=s.nextDouble();
            x=s.nextDouble();
            nbC=2;
            t1=x/nbC;
            t2=c/nbC +x/(nbC+f);
            nbC+=f;
            while(t1>t2){
                t1=t2;
                t2-=x/nbC;
                t2+=c/nbC;
                nbC+=f;
                t2+=x/nbC;
            }
            System.out.println("Case #"+i+": "+t1);
            
        }
        
    }
}
