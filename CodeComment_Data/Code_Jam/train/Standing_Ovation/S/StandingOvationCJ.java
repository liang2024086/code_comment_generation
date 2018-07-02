package methodEmbedding.Standing_Ovation.S.LYD762;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARISH
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
public class StandingOvationCJ {
    public static void main(String[] args) throws IOException{
        
     //   BufferedReader kb = new BufferedReader( new InputStreamReader(System.in) );
         BufferedReader kb = new BufferedReader( new FileReader("A-small-attempt0.in") );
        PrintWriter out = new PrintWriter( new File("StanfingOvation.txt") ) ;
        int tt = Integer.parseInt( kb.readLine() ),peopleAdded,totalPeoplePresent,i,k=0;
        String ip[];
        
        while(tt-- > 0){
            k++;
            ip = kb.readLine().split(" ");
            peopleAdded = totalPeoplePresent = 0;
            for(i = 0; i < ip[1].length() && totalPeoplePresent < ip[1].length()-1;i++){
                if(totalPeoplePresent - i < 0){
                    peopleAdded+=(i-totalPeoplePresent);
                    totalPeoplePresent=(i-totalPeoplePresent)+totalPeoplePresent;
                    
                }
                totalPeoplePresent+=Character.getNumericValue(ip[1].charAt(i));
            }
         //   System.out.println(peopleAdded);
            out.print("Case #"+k+": ");
            out.println(peopleAdded);
        }
        out.close();
        
        
    }
}
