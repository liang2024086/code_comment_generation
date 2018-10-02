package methodEmbedding.Counting_Sheep.S.LYD1047;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Bhavesh
 */
public class CountingSheep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("A-small-attempt0.in"));
        int T = Integer.parseInt(in.nextLine());
        for(int i=1; i<=T; i++) {
            int N = Integer.parseInt(in.nextLine());
            boolean[] numTrack= {false,false,false,false,false,false,false,false,false,false};
            //System.out.println("N: "+N);
            int inc =1;
            boolean checkPass = true;
            int bleatrixNum = N;
            if(N!=0) {
                do{
                    checkPass = true;
                    int NumCrack = inc*N;
                    bleatrixNum=NumCrack;
                    inc++;
                    while(NumCrack!=0) {
                        //System.out.println("NumCrack% "+NumCrack%10);
                        if(!numTrack[NumCrack%10]) {
                            numTrack[NumCrack%10]=true;
                        }
                        NumCrack/=10;
                    }
                    for(int j=0; j<10; j++) {
                       //System.out.println(j+": "+numTrack[j]);
                        if(!numTrack[j]) {
                            checkPass = false;
                        }
                    }
                }while(!checkPass);
                System.out.println("Case #"+i+": "+bleatrixNum);
            }
            else {
                System.out.println("Case #"+i+": INSOMNIA");
            }
        }
    }
}
