package methodEmbedding.Counting_Sheep.S.LYD1526;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.lang.*;
import java.io.*;
/**
 *
 * @author pharo
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
 	 for(int i = 1; i <= Integer.parseInt(args[0]); i++) {
			
                if(Integer.parseInt(args[i]) == 0)
                {System.out.println("Case #"+ i +"INSOMNIA" );}
                else{
                        int x= 1;
                        int one = 0;
                        int two = 0;
                        int three = 0;
                        int four = 0;
                        int five = 0;
                        int six = 0;
                        int seven = 0;
                        int eight = 0;
                        int nine = 0;
                        int zero = 0;
			int compme = 0;
                        int count = 1;
                        int N = Integer.parseInt(args[i]);
                        int mN = N;
                        int F = 0;
                        
			while (x == 1)
			{
				
				do{
                                    //System.out.println("mN:"+mN+"  N:"+N);
                                   // System.out.println(one +" " + two +" " +three+ " "+ four +" " + five +" " +six+ " " + seven +" " +eight+" " +nine+" " +zero);
                                    //System.out.println(" \n      ");
                                    
                                compme = (N % 10);
				if(compme == 1)
				{one = 1;}
                                else if (compme == 2)
                                {two = 1;}
                                else if (compme == 3)
                                {three = 1;}
                                else if (compme == 4)
                                {four = 1;}
                                else if (compme == 5)
                                {five = 1;}
                                else if (compme == 6)
                                {six = 1;}
                                else if (compme == 7)
                                {seven = 1;}
                                else if (compme == 8)
                                {eight = 1;}
                                else if (compme == 9)
                                {nine = 1;}
                                else if (compme == 0)
                                {zero = 1;}
    			N /= 10;
			} while  (N > 0);
                                if(one == 1 && two == 1 && three ==1 && four == 1 && five == 1 && six == 1 && seven ==1 && eight == 1 && nine == 1 && zero == 1)
                                {
                                    System.out.println("Case #"+ i +":" + F);
                                    x = 0;
                                }else{
                                   // System.out.println(count +" is count");
                                         F = (mN*count);
                                        N = (mN*count);
                                        count++;
                                }
			}
            
        }
         }
    }
    
}
