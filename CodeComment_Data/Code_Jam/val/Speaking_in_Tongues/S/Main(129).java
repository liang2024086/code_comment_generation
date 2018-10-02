package methodEmbedding.Speaking_in_Tongues.S.LYD516;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author harit
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        /*
         * e-o
         * j-u
         * p-r
         * m-l
         * y-a
         * s-n
         * l-g
         * c-e
         * k-i
         * d-s
         * x-m
         * v-p
         * 
         * 
         *
         * a-y
         * b-h
         * c-e
         * d-s
         * e-o
         * f-c
         * g-v
         * h-x
         * i-d
         * j-u
         * k-i
         * l-g
         * m-l
         * n-b
         * o-k
         * p-r
         * 
         * q-z
         * r-t
         * s-n
         * t-w
         * u-j
         * v-p
         * w-f
         * x-m
         * y-a
         * z-q
         */
        char c[]= {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};

        int i=0;

        int t=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        t=Integer.parseInt(br.readLine());
        int t1=1;
        for(;t1<=t;t1++){
            String s=br.readLine();
            String s2="";
            char d='a';
            for(i=0;i<s.length();i++){
                d=s.charAt(i);
                if(d==' ') s2+=d;
                else
                    s2+=c[s.charAt(i)-'a'];
            }
            //Case #1:
            System.out.println("Case #"+t1+": "+s2);
        }
  
    }

}
