package methodEmbedding.Counting_Sheep.S.LYD291;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Alaa
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt(); 
       
       int p=1;
       int i1=0;
       int i2=0;
       int i3=0;int i4=0;int i5=0;int i6=0;int i7=0;int i8=0;int i9=0;int i0=0;
       int m;
       int x;
       int f=1;
       
       while(t!=0){
           
       
       
        
            int n=in.nextInt();
            i0=0;i1=0;i2=0;i3=0;i4=0;i5=0;i6=0;i7=0;i8=0;i9=0;
            m=0;
            p=1;
            x=0;
            
        for(int i=0 ; i<200 ; i++){
            
            m=p*n;
            String h=String.valueOf(m);
            if(h.indexOf("0")!=-1){
                i0+=1; }
            if(h.indexOf("1")!=-1){
                i1+=1; }
            
             if(h.indexOf("2")!=-1)
                i2+=1;
            if(h.contains("3"))
                i3+=1;
            if(h.contains("4"))
                i4+=1;
            if(h.contains("5"))
                i5+=1;
            if(h.contains("6"))
                i6+=1;
            if(h.contains("7"))
                i7+=1;
            if(h.indexOf("8")!=-1)
                i8+=1;
            if(h.contains("9"))
                i9+=1;
            if((i0!=0)&&(i1!=0)&&(i2!=0)&&(i3!=0)&&(i4!=0)&&(i5!=0)&&(i6!=0)&&(i7 !=0)&&(i6!=0)&&(i7!=0)&&(i8!=0)&&(i9!=0)){
                System.out.println("\t\t"+"Case #"+f+":"+m);
                x=1;
     
                
            break;
            
            }
            
            p+=1;
            
            
            
        
        }
        if(x==0)
            System.out.println("\t\t"+"Case #"+f+":"+"INSOMINA");
        t=t-1;
        ++f;
       }
            
            
       
      
        // TODO code application logic here
    }
    
}
