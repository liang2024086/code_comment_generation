package methodEmbedding.Standing_Ovation.S.LYD615;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
/**
 *
 * @author Amal
 */
public class CodeJam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int friends = 0;
        int test = 0;
        int Sm=0;
        int S=0;
        int So=0;
        String aud="";

        Scanner input = new Scanner(System.in);
        test=input.nextInt();
        System.out.println(test);
        for(int i=0;i<test;i++){
        Sm=input.nextInt();
        aud=input.next();

        for(int j=0;j<=Sm;j++){
        So+=S;   
        S=aud.charAt(j)-48;
        if(So<j && S!=0){
            friends+=(j-So);
            So+=(j-So);
        }
}
        System.out.println("Case #"+(i+1)+": "+friends );
        friends=0;
        So=0;
        S=0;
        }
        }
    }
    
    

