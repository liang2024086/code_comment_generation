package methodEmbedding.Counting_Sheep.S.LYD1433;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.HashSet;
public class PA_CountingSheep {
    
    public static void main(String[] args) throws FileNotFoundException{
        File inf = new File("D:\\NetBeansProjects\\GoogleCodeJam\\src\\GCJ2016QR\\PA0.in");
        File outf = new File("D:\\NetBeansProjects\\GoogleCodeJam\\src\\GCJ2016QR\\PA0.out");
        Scanner sc = new Scanner(inf);
        PrintWriter out = new PrintWriter(outf);
        //PrintWriter out = new PrintWriter(System.out);
        HashSet<Integer> ss = new HashSet();
        int t = sc.nextInt();
        long n, m, tmp;
        boolean f = false;
        for(int cs = 1; cs<=t;cs++){
            n = sc.nextLong();
            if(n==0){
                out.printf("Case #%d: INSOMNIA%n",cs);
                continue;
            }
            ss.clear();
            f = false;
            m = n;
            tmp = 0;
            while(tmp<m*m){
                tmp = n;
                //System.out.println(tmp);
                while(tmp>=1){
                    ss.add((int)(tmp%10));
                    tmp/=10;
                }
                f = ss.size()==10;
                if(f)break;
                n += m;
            }
            //System.out.println(ss.toString());
            out.printf("Case #%d: %d%n",cs,n);
        }
        out.close();
    }
    
}

