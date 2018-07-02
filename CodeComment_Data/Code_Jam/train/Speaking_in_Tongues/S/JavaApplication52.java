package methodEmbedding.Speaking_in_Tongues.S.LYD763;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Imran
 */


public class JavaApplication52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner stdin = new Scanner(System.in);
        int T=0,i=0;
        
        char [] match = new char[27];
        match[0]= 'y';
        match[1]= 'h';
        match[2]= 'e';
        match[3]= 's';
        match[4]= 'o';
        match[5]= 'c';
        match[6]= 'v';
        match[7]= 'x';
        match[8]= 'd';
        match[9]= 'u';
        match[10]= 'i';
        match[11]= 'g';
        match[12]= 'l';
        match[13]= 'b';
        match[14]= 'k';
        match[15]= 'r';
        match[16]= 'z';
        match[17]= 't';
        match[18]= 'n';
        match[19]= 'w';
        match[20]= 'j';
        match[21]= 'p';
        match[22]= 'f';
        match[23]= 'm';
        match[24]= 'a';
        match[25]= 'q';
        match[26]=' ';
        
        
        
        T = stdin.nextInt();
        
        String s2 = stdin.next();
        while(i<T){
            
            String s1 = stdin.nextLine();
            
            
            System.out.print("Case #"+(i+1)+":");
             if(i>0) {System.out.print(' ');}
            for(int j=0;j<s1.length();j++){
               
                if(s1.charAt(j)== ' ') { System.out.print(' '); continue;}
                if(s1.charAt(j)== 'a') { System.out.print('y'); continue;}
                if(s1.charAt(j)== 'b') { System.out.print('h'); continue;}
                if(s1.charAt(j)== 'c') { System.out.print('e'); continue;}
                if(s1.charAt(j)== 'd') { System.out.print('s'); continue;}
                if(s1.charAt(j)== 'e') { System.out.print('o'); continue;}
                 if(s1.charAt(j)== 'f') { System.out.print('c'); continue;}
                if(s1.charAt(j)== 'g') { System.out.print('v'); continue;}
                if(s1.charAt(j)== 'h') { System.out.print('x'); continue;}
                if(s1.charAt(j)== 'i') { System.out.print('d'); continue;}
                if(s1.charAt(j)== 'j') { System.out.print('u'); continue;}
                 if(s1.charAt(j)== 'k') { System.out.print('i'); continue;}
                if(s1.charAt(j)== 'l') { System.out.print('g'); continue;}
                if(s1.charAt(j)== 'm') { System.out.print('l'); continue;}
                if(s1.charAt(j)== 'n') { System.out.print('b'); continue;}
                if(s1.charAt(j)== 'o') { System.out.print('k'); continue;}
                 if(s1.charAt(j)== 'p') { System.out.print('r'); continue;}
                if(s1.charAt(j)== 'q') { System.out.print('z'); continue;}
                if(s1.charAt(j)== 'r') { System.out.print('t'); continue;}
                if(s1.charAt(j)== 's') { System.out.print('n'); continue;}
                if(s1.charAt(j)== 't') { System.out.print('w'); continue;}
                 if(s1.charAt(j)== 'u') { System.out.print('j'); continue;}
                if(s1.charAt(j)== 'v') { System.out.print('p'); continue;}
                if(s1.charAt(j)== 'w') { System.out.print('f'); continue;}
                if(s1.charAt(j)== 'x') { System.out.print('m'); continue;}
                if(s1.charAt(j)== 'y') { System.out.print('a'); continue;}
                if(s1.charAt(j)== 'z') { System.out.print('q'); continue;}
                
                
                    
                
                
            }
            System.out.println();
            i++;
        }
        
        
        
      
    }
}
