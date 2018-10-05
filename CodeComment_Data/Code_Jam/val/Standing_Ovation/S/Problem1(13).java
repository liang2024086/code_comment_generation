package methodEmbedding.Standing_Ovation.S.LYD811;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Jatin
 */
public class Problem1 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("e:\\input.in"));
        FileWriter fw = new FileWriter("e:\\out.txt");
        
        int nCases = Integer.parseInt(br.readLine());
        for(int i=1;i<=nCases;++i){
            String[] data = br.readLine().split(" ");
            int smax = Integer.parseInt(data[0]);
            String spectators = data[1];
            
            long moreFriends = 0;
            long currentNumberOfPeople=Byte.parseByte(spectators.charAt(0)+"");
//            System.out.println("currentNumberOfPeople = "+currentNumberOfPeople);
            for(int shyness=2;shyness<=smax+1;++shyness){
//                System.out.println("currentNumberOfPeople = "+currentNumberOfPeople);
                byte shyNumberOfPeople = Byte.parseByte(spectators.charAt(shyness-1)+"");
                int requiresPeople = shyness-1;
                if(requiresPeople<=currentNumberOfPeople){
//                    System.out.println("shyness = "+shyness+" shyNumberOfPeople = "+shyNumberOfPeople);
                    currentNumberOfPeople += shyNumberOfPeople;
                }else{
                    long diff = requiresPeople-currentNumberOfPeople;
                    System.out.println("Shyness = "+shyness+" requiresPeople = "+requiresPeople+" currentNumberOfPeople = "+currentNumberOfPeople+" diff = "+(-currentNumberOfPeople+requiresPeople));
                    System.out.println("Case #"+i+" Adding "+moreFriends+" to the number");
                    moreFriends += (diff);
                    System.out.println("MoreFriends = "+moreFriends);
                    System.out.println("shyness = "+shyness+" diff = "+diff+" shyNumberOfPeople = "+shyNumberOfPeople);
                    currentNumberOfPeople += diff+shyNumberOfPeople;
                } 
            }
            fw.write("Case #"+i+": "+moreFriends+"\n");
//            System.out.println("Case #"+i+": "+moreFriends+"\n");
        }
        fw.close();
    }
}
