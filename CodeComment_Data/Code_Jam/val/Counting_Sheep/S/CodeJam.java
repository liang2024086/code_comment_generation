package methodEmbedding.Counting_Sheep.S.LYD993;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aanchal
 */
public class CodeJam {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int t=0;t<T;t++){
        int N=s.nextInt();
        int temp=N, digit=0, count=0, j=1, tem=0, flags=0;
        int flag[]=new int[10];
        for(int i=0;i<10;i++){
            flag[i]=0;
        }
        if(N==0){
            System.out.println("Case #"+(t+1)+": "+"INSOMNIA");
        }
        try{
            while(flags!=1 && j<999999 && temp!=0){
            N=temp*j;
            tem=N;
        while(N>0){
            digit= N%10;
            if(flag[digit]!=1){
                flag[digit]=1;
                count++;
            }
            N=N/10;
        }
        if(count==10){
            System.out.println("Case #"+(t+1)+": "+tem);
            flags=1;
        }
        j++;
            } 
    }catch(Exception ex){
            System.out.println("INSOMNIA");
    }
        }
}
    }
