package methodEmbedding.Standing_Ovation.S.LYD1940;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
/**
 *
 * @author Sourav
 */
public class CodeJamzz{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws Exception{
        // TODO code application logic here
        // TODO code application logic here
//        List<String> ls = new LinkedList<String>();
//        List<Integer> in = new LinkedList<Integer>();
//        for(int f=0;f<26;f++){
//          in.add(0);
//        }
        
        Integer charcode;
        File fo = new File("D:/Google/o.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fo));
        
        File fin = new File("D:/Google/A-small-attempt0.in");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fin)));
        
        String st = br.readLine();
        System.out.println(st);
        int numTest = Integer.parseInt(st);
            for(int i=0; i<numTest ; i++){
              
                st = br.readLine();
                int simax = Integer.parseInt(st.substring(0, 1));
                int friend=0,totFriends=0;
                int totalStanding = 0;
                st = st.substring(2);
                char[] cha = st.toCharArray();
                totalStanding = Integer.parseInt(String.valueOf(cha[0]));
                int ithshy = totalStanding;
                for(int k = 1;k <= simax;k++){
                    ithshy = Integer.parseInt(String.valueOf(cha[k]));
                    if(k > totalStanding)
                    {
                        friend = k-totalStanding;
                    }
                    totalStanding+= friend+ithshy;
                    totFriends+=friend;
                    friend=0;
                }
                
                System.out.println(totFriends);
                System.out.println("---------------------->  "+totFriends);
                bw.write("Case #"+ (i+1) +": "+totFriends+"\r\n");
                
            }
            bw.close();
    }
    
}
