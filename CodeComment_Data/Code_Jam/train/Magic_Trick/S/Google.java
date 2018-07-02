package methodEmbedding.Magic_Trick.S.LYD1365;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author nick
 */
public class Google {

    public static void main(String[] args)throws Exception {
        File file=new File("test.txt");
        Scanner sc = new Scanner(file);
        int numTestCases=sc.nextInt();
        
        for(int i=1;i<=numTestCases;i++){
            
            int firstRow=sc.nextInt();
            sc.nextLine();
            int[]firstRowContents=new int[4];
            for(int c=0;c<4;c++){
                if(c==firstRow-1){
                    for(int j=0;j<4;j++){
                        firstRowContents[j]=sc.nextInt();
                    }
                    sc.nextLine();
                }else{
                    sc.nextLine();
                }
            }
            
            int secondRow=sc.nextInt();
            sc.nextLine();
            
            int[]secondRowContents=new int[4];
            for(int c=0;c<4;c++){
                if(c==secondRow-1){
                    for(int j=0;j<4;j++){
                        secondRowContents[j]=sc.nextInt();
                    }
                    sc.nextLine();
                }else{
                    sc.nextLine();
                }
            }
            
            int counter=0;
            int val=-1;
            for(int c=0;c<secondRowContents.length;c++){
                for(int j=0;j<firstRowContents.length;j++){
                    if(secondRowContents[c]==firstRowContents[j]){
                        counter++;
                        val=secondRowContents[c];
                    }
                }
            }
            
            if(counter==0)System.out.println("Case #"+i+": Volunteer cheated!");
            if(counter==1)System.out.println("Case #"+i+": "+val);
            if(counter>1)System.out.println("Case #"+i+": Bad magician!");
        }
    }

}
