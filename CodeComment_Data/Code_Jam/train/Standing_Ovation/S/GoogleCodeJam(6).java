package methodEmbedding.Standing_Ovation.S.LYD1262;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Carlton Johnson
 */
public class GoogleCodeJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int T = reader.nextInt();
        
        for(int i=0; i<T; i++){
            int sum=0;
            int added=0;
            int SL = reader.nextInt();
            String str = reader.nextLine();
            for(int f=0; f<str.length()-1; f++){
                if(Integer.parseInt(""+str.trim().charAt(f))>0 && sum<f){
                    added+=f-sum;
                    sum+=added;
                    sum+=Integer.parseInt(""+str.trim().charAt(f));
                }else{
                    sum+=Integer.parseInt(""+str.trim().charAt(f));
                }
                
            }
            
            System.out.println("Case #"+(i+1)+": "+added);
            
            
            
            
        }
        
    }
    
}
