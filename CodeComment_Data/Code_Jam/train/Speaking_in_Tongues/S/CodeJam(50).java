package methodEmbedding.Speaking_in_Tongues.S.LYD348;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.io.File;

/**
 *
 * @author subodh
 */
public class CodeJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuffer goo=new StringBuffer("ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv");
        StringBuffer eng=new StringBuffer("our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up");
        char []googlerease=new char[26];
        char []english=new char[26];
        int counter=1;
        int count=1;
        int flag=0;
        googlerease[0]='e';
        english[0]='o';
        for(int i=0;i<goo.length();i++){
            if(eng.charAt(i)!=' '){
            for(int j=0;j<count;j++){
                if(english[j]==eng.charAt(i)){
                    flag=1;
                    break;
                    
                }
                }
                if(flag==0){
                    english[counter]=eng.charAt(i);
                    googlerease[counter]=goo.charAt(i);
                    counter++;
                    
                }
            flag=0;
            count=counter;
        }
        }
        googlerease[24]='q';
        english[24]='z';
        googlerease[25]='z';
        english[25]='q';
        
        Scanner sc=null;//new Scanner(new File("D:/codeJam2012/sample.txt"));
        int testCase=0;
        String input[]=null;
        count=0;
        try {
            sc=new Scanner(new File("D:/codeJam2012/sample.txt"));
              testCase=Integer.parseInt(sc.nextLine());
              input=new String[testCase];
            while(sc.hasNextLine()){
               // System.out.println(sc.nextLine());
              input[count]=sc.nextLine();
              count++;
                
            }
        } catch (Exception e) {
            System.out.println("Exception"+e);
        }
        
        String output[]=new String[testCase];
        
        for(int p=0;p<testCase;p++){
            StringBuffer sb=new StringBuffer(input[p]);
            StringBuffer out=new StringBuffer("");
            for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)==' '){
                     out.append(sb.charAt(i));
                 }
                 else{
                      for(int j=0;j<googlerease.length;j++){
                 if(googlerease[j]==sb.charAt(i)){
                     out.append(english[j]);
                     break;
                 }
                 
             }
                 }
            }
            output[p]=out.toString();
            
        }
        
        
        
        
        
        
        
        
        for(int i=1;i<=testCase;i++){
        System.out.println("Case #"+i+": "+output[i-1]);
        }
    }
}
