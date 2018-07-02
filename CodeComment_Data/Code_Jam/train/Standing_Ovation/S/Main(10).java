package methodEmbedding.Standing_Ovation.S.LYD248;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmad
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner input=new Scanner(new File("input.in"));
        int tc =input.nextInt();
        int max;
        
        String arr="";
        for (int i = 0; i < tc; i++) {
            max =input.nextInt();
            arr=input.next();
            int sum=Integer.parseInt(arr.charAt(0)+"");
            int need=0;
            for (int j = 1; j < arr.length(); j++) {
                if(arr.charAt(j)=='0'){
                    //not thing
                }else{
                    if(sum<j){
                        need+=(j-sum);
                        sum+=(j-sum)+Integer.parseInt(arr.charAt(j)+"");
                    }else{
                        sum+=Integer.parseInt(arr.charAt(j)+"");
                    }
                }
            }
            System.out.printf("Case #%d: %d\n",(i+1),need);
        }
    }
    
}
