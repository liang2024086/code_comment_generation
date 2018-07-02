package methodEmbedding.Standing_Ovation.S.LYD964;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Rohit
 */
public class Chumma1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        String out="";
        String temp=sc.nextLine();
        for(int k=1;k<=T;k++)
        {
        
        String input=sc.nextLine();
        
        int no_aud=input.charAt(0)-47;
        int num;
        int stood_up=0;
        int no_per_needed=0;
        
        
        for(int i=0;i<no_aud;i++)
        {
            num=input.charAt(i+2)-48;
            
            if(stood_up>=i){
            stood_up=stood_up+num;
            }
            else{
                no_per_needed=no_per_needed+i-stood_up;
                stood_up+=no_per_needed;
            }
        }
        //System.out.println(no_per_needed);
        out=out+"\n"+"Case #"+k+": "+no_per_needed;
        }
        System.out.println(out);
    }
}
