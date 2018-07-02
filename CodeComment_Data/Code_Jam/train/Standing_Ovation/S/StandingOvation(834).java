package methodEmbedding.Standing_Ovation.S.LYD1668;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author MithunKumar
 */
public class StandingOvation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;  
        String[] arr; 
        String ip ; 
        int ss, newGuestsCount = 0, noOfTC = 0;
        noOfTC = Integer.parseInt(sc.nextLine());
        int[] output = new int[noOfTC];
        
        for(int j = 0; j <noOfTC; j++) {
            line = sc.nextLine();
            arr = line.split(" ");
            ip = arr[1];
            ss = Integer.parseInt(ip.substring(0,1));
            newGuestsCount = 0;
            for(int i = 1; i < ip.length(); i++) {
                if(ss < i && Integer.parseInt(ip.substring(i,i+1)) > 0) {
                    newGuestsCount += (i - ss);
                    ss = i;
                }
                ss += Integer.parseInt(ip.substring(i,i+1));
            }
            output[j] = newGuestsCount;
        }
        for(int j = 0; j < noOfTC; j++) 
            System.out.println("Case #"+ (j+1) +": " + output[j]);
    }
}
