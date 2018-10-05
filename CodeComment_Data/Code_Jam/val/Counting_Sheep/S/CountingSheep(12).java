package methodEmbedding.Counting_Sheep.S.LYD1679;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ABDULRAHUMAN
 */
public class CountingSheep {
    
    public static void main(String args[]) throws FileNotFoundException, IOException{
        
        Scanner in=new Scanner(new FileReader("E:\\a.in"));
        PrintWriter out=new PrintWriter(new FileWriter("E:\\a.out"));
        int t=in.nextInt();
        for(int z=1;z<=t;z++){
            boolean array[]=new boolean[10];
            for(int i=0;i<10;i++)
                array[i]=false;
            long n=1;
            long value1=0;
            boolean state=false;
            long value=in.nextLong();
            if(value==0){
                System.out.println("Case #"+z+": INSOMNIA");
                out.println("Case #"+z+": INSOMNIA");
                continue;
            }
            long temp;
            while(!state){
                temp=value*n;
                
                value1=temp;
                n++;
                while(temp!=0){
                    array[(int)temp%10]=true;
                    temp=temp/10;
                    
                }
                for(int i=0;i<10;i++){
                    if(array[i]==false)
                        break;
                    else if(i==9&&array[i]==true)
                        state=true;
                    else{}
                }
            }
            System.out.println("Case #"+z+": "+String.valueOf(value1));
            out.println("Case #"+z+": "+String.valueOf(value1));
            
            
        }
        out.close();
        
    }
    
}
