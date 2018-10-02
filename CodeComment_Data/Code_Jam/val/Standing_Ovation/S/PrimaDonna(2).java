package methodEmbedding.Standing_Ovation.S.LYD623;

/** 
 * Ancalagon, the black. 
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrimaDonna {

    public static void main(String[] args)throws IOException {
        File file = new File("small.in");
        File outFile = new File("small.out");
        BufferedReader buff = new BufferedReader(new FileReader(file));
        BufferedWriter wuff = new BufferedWriter(new FileWriter(outFile));
        //BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Enter a number");
        int total_cases= Integer.parseInt(buff.readLine());
        int answers[]=new int[total_cases];
        System.out.println("Output") ;
        for(int inc_a=0; inc_a<total_cases; inc_a++)
        {
            String test_case = buff.readLine();
            String[] cases = test_case.split(" ") ;
            
            int max_shyness = Integer.parseInt(cases[0]) ;
            int list_of_people = Integer.parseInt(cases[1]) ;
            int list_copy = list_of_people ;
            
            int total_people[] = new int[max_shyness+1] ;
            
            int i = max_shyness ;
            while( list_copy > 0 ){
                total_people[i] = list_copy % 10 ;
                list_copy = list_copy / 10 ;
                i-- ; 
            }
            
            int standing = 0, invite_friends = 0 ;
            for(int x = 0; x <= max_shyness; x++){
                if(standing >= x){
                    standing = standing + total_people[x] ;
                }
                else{
                    invite_friends = invite_friends + (x - standing) ;
                    standing = standing + total_people[x] + (x - standing) ;
                }
            }
            System.out.println("Case #" + (inc_a+1) + " " + invite_friends ) ;
            wuff.write("Case #" + (inc_a+1) + ": " + invite_friends + "\n");
        }
        buff.close() ;
        wuff.close() ;
    }
}

/**
 * File file = new File("F:\\A-small-practice.in");
    File outFile = new File("F:\\A-small-practice.out");
    BufferedReader br = new BufferedReader(new FileReader(file));
    BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
    int testCases = Integer.parseInt(br.readLine());
    for(int t=1;t<=testCases;t++){
     

        bw.write("Case #" + t +": Yes I did it\n");
    }
    br.close();
    bw.close();
 */
