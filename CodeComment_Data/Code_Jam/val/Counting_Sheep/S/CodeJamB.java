package methodEmbedding.Counting_Sheep.S.LYD1116;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Nima
 */
public class CodeJamB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Scanner sc=new Scanner(new File("C:\\Users\\Nima\\Downloads\\A-small-attempt0.in"));
        FileWriter w=new FileWriter("D:\\out.out");
        int count=sc.nextInt();
        for (int i = 0; i < count; i++) {
            Set<Integer> set=new HashSet<>();
            int num=sc.nextInt();
            if(num==0){
                w.write("Case #"+(i+1)+": INSOMNIA\n");
                continue;
            }
            int j=0;
            while(set.size()!=10){
                j++;
                int temp=num*j;
                while(temp!=0){
                    set.add(temp%10);
                    temp/=10;
                    if(set.size()==10)break;
                }
                
            }
//            j--;
            
            w.write("Case #"+(i+1)+": "+(j*num)+"\n");
            
            
        }
        w.close();
    }
    
}
