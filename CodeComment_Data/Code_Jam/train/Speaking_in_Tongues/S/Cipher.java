package methodEmbedding.Speaking_in_Tongues.S.LYD1431;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author GreatGod
 */
public class Cipher {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
		//int[][] Matrix = new int[1000][1000];
	int N = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=N;i++){
            String line = sc.nextLine();
            char[] arr = line.toCharArray();
            System.out.print("Case #" + i+": ");
            for(int j=0;j<arr.length;j++){
                if(arr[j]=='a') {System.out.print('y');continue;}
                if(arr[j]=='b'){ System.out.print('h');continue;}
                if(arr[j]=='c') {System.out.print('e');continue;}
                if(arr[j]=='d') {System.out.print('s');continue;}
                if(arr[j]=='e') {System.out.print('o');continue;}
                if(arr[j]=='f') {System.out.print('c');continue;}
                if(arr[j]=='g') {System.out.print('v');continue;}
                if(arr[j]=='h') {System.out.print('x');continue;}
                if(arr[j]=='i') {System.out.print('d');continue;}
                if(arr[j]=='j') {System.out.print('u');continue;}
                if(arr[j]=='k') {System.out.print('i');continue;}
                if(arr[j]=='l') {System.out.print('g');continue;}
                if(arr[j]=='m') {System.out.print('l');continue;}
                if(arr[j]=='n') {System.out.print('b');continue;}
                if(arr[j]=='o') {System.out.print('k');continue;}
                if(arr[j]=='p') {System.out.print('r');continue;}
                if(arr[j]=='q') {System.out.print('z');continue;}
                if(arr[j]=='r'){ System.out.print('t');continue;}
                if(arr[j]=='s'){ System.out.print('n');continue;}
                if(arr[j]=='t') {System.out.print('w');continue;}
                if(arr[j]=='u') {System.out.print('j');continue;}
                if(arr[j]=='v') {System.out.print('p');continue;}
                if(arr[j]=='w') {System.out.print('f');continue;}
                if(arr[j]=='x') {System.out.print('m');continue;}
                if(arr[j]=='y') {System.out.print('a');continue;}
                if(arr[j]=='z') {System.out.print('q');continue;}
                System.out.print(arr[j]);
            }
            System.out.println();
        }
    }
}
