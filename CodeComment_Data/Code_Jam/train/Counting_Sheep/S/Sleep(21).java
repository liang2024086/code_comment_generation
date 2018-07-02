package methodEmbedding.Counting_Sheep.S.LYD293;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Balu
 */
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
import java.io.*;

public class Sleep 
{
    public static void main(String args[])
    {
        try
        {
        System.setIn(new FileInputStream("C:\\Users\\Balu\\Documents\\NetBeansProjects\\sample\\src\\MyPrograms\\in.txt"));
        FileOutputStream f = new FileOutputStream("C:\\Users\\Balu\\Documents\\NetBeansProjects\\sample\\src\\MyPrograms\\out.txt");
        System.setOut(new PrintStream(f));
        
        Scanner scan = new Scanner(System.in);
        int no,ino,i,t,j=1,digit,cp=0,k,test=0;
        int check[]= new int[10];
        
        t = scan.nextInt();
        for(i=0;i<t;i++)
        {
            no = scan.nextInt();
            if(no == 0)
            {
                System.out.println("Case #"+(i+1)+": INSOMNIA");
                continue;
            }
            while(no>0)
            {
                ino = no*j;
                cp = ino;
                int length = (int) Math.log10(ino) + 1;
                
                while(ino>0)
                {
                    digit = ino%10;
                    check[digit] = 1;
                    ino = ino/10;
                }
                j++;
                
                int  ex=1;
                for(k=0;k<10;k++)
                if(check[k]==0)
                    ex = 0;
                
                
                if(ex==1)
                    break;
            }
            System.out.println("Case #"+(i+1)+": "+cp);
            for(j=0;j<10;j++)
                check[j]=0;
            j=1;
        }
        
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
