package methodEmbedding.Magic_Trick.S.LYD1227;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Jatin
 */
public class magic {
    public static void main(String[] args) throws Exception{
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("d:\\A-small-attempt0.in"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\result.txt"));
        
        int ncases = Integer.parseInt(br.readLine());
        
        int index = 1;
        while(index<=ncases){
            int nrow1 = Integer.parseInt(br.readLine());
            
            int[][] row1 = new int[4][4];
            int[][] row2 = new int[4][4];
            
            Pattern p = Pattern.compile("-?\\d+");
            Matcher m = null;
            for(int i= 0;i<4;++i){
                m =  p.matcher(br.readLine());
                for(int j = 0;j<4;++j){
                    if(m.find())
                    row1[i][j] = Integer.parseInt(m.group());
                }
            }
            
            int nrow2 = Integer.parseInt(br.readLine());
            for(int i= 0;i<4;++i){
                m =  p.matcher(br.readLine());
                for(int j = 0;j<4;++j){
                    if(m.find())
                    row2[i][j] = Integer.parseInt(m.group());
                }
            }
            
            Vector<Integer> vec1 = new Vector<Integer>();
            Vector<Integer> vec2 = new Vector<Integer>();
            
            for(int i = 0;i<4;++i){
                vec1.add(row1[nrow1-1][i]);
            }
            for(int i = 0;i<4;++i){
                vec2.add(row2[nrow2-1][i]);
            }
            
            Vector<Integer> number = new Vector<Integer>();
            for(int i = 0;i<vec1.size();++i){
                for(int j = 0;j<vec2.size();++j){
                    if(vec1.elementAt(i)==vec2.elementAt(j)){
                        number.add(vec1.elementAt(i));
                    }
                }
            }
            if(number.size()==0){
                bw.write("Case #"+index+++": Volunteer cheated!");
                //System.out.println("Case #"+index+++": Volunteer cheated!");
            }
            if(number.size()==1){
                bw.write("Case #"+index+++": "+number.elementAt(0));
                //System.out.println("Case #"+index+++": "+number.elementAt(0));
            }
            if(number.size()>1){
                bw.write("Case #"+index+++": Bad magician!");
                //System.out.println("Case #"+index+++": Bad magician!");
            }
            bw.newLine();
            bw.flush();
        }
    }
}
