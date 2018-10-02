package methodEmbedding.Standing_Ovation.S.LYD2197;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.util.Scanner;

/**
 *
 * @author junaid ahmed
 */
public class practice2 {
    public static void main(String []args) throws IOException
    {
        File fs = new File("A-small-attempt0.in");
        Scanner ip = new Scanner(fs);
        FileWriter f = new FileWriter ("out.txt");
        BufferedWriter out= new BufferedWriter (f);
            
        int tt = ip.nextInt();
        int Smax = 0;
        int friends = 0;
        for(int i = 0; i<tt; i++)
        {
            friends = 0;
            Smax = ip.nextInt();
            char []arr = new char[Smax+1];
            int []arr1 = new int[Smax+1];
            arr = ip.nextLine().trim().toCharArray();
            for(int j = 0; j<=Smax; j++)
            {
                arr1[j]= (int)arr[j]-48;
            }
            
            for(int k = 1; k<Smax+1;k++)
            {
                if(arr1[k-1]>=k)
                {
                    arr1[k] += arr1[k-1]; 
                }
                else
                {
                    arr1[k]+= (k-arr1[k-1]) + arr1[k-1];
                    friends += k-arr1[k-1];
                }
            }
            
            
            out.write("Case #"+ (i+1) +": "+friends);
            out.newLine();
            
            
        }
        
        ip.close();
        out.close();
    }
    
}
