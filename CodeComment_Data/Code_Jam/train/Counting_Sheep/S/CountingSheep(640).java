package methodEmbedding.Counting_Sheep.S.LYD1697;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jos??Lu??s
 */
public class CountingSheep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

//        Scanner s=new Scanner(new File("C:\\Users\\Jos??Lu??s\\Dropbox\\Treino Maratona\\Google Code Jam 2016\\Qualification Round\\couting_sheep\\src\\A-small-attempt0.in"));
        Scanner s=new Scanner(System.in);
//        PrintStream saida=new PrintStream("A-small-attempt0.out");
        PrintStream saida=System.out;
        int t=s.nextInt();
        int caso;
        for (caso=1; caso<=t; caso++) {
            BigInteger n;
            n=s.nextBigInteger();
            if (n.equals(BigInteger.ZERO)) {
                saida.printf("Case #%d: INSOMNIA\n", caso);
            }
            else {
                int vis[];
                vis=new int[10];
                int i;
                for (i=0; i<=9; i++) {
                    vis[i]=0;
                }
                BigInteger aux=n;
                BigInteger temp=new BigInteger("2");
                while (true) {
                    String str=aux.toString();
                    for (i=0; i<str.length(); i++) {
                        vis[str.charAt(i)-'0']=1;
                    }
                    int terminou=1;
                    for (i=0; i<=9; i++) {
                        if (vis[i]==0) {
                            terminou=0;
                        }
                    }
                    if (terminou==1) {
                        break;
                    }
                    aux=n.multiply(temp); 
                    temp=temp.add(BigInteger.ONE);
//                    System.out.println(aux);
                }
                saida.printf("Case #%d: ", caso);
                saida.println(aux);
            }
        }
    } 
}
















