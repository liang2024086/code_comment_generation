package methodEmbedding.Speaking_in_Tongues.S.LYD1331;


import java.util.Scanner;

public class GoogleA {

    public static void main (String[] args) {
        
        char letmap[] = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
        char[] temp = new char[100];
        
        String[] liners = new String[30];
        Scanner scan = new Scanner(System.in);
        Scanner line = new Scanner(System.in);
        int cases = scan.nextInt();
        
        for (int a=0; a < cases; a++)
            liners[a] = line.nextLine();
        
        for (int a=0; a<cases; a++) {
            temp = liners[a].toCharArray();
            System.out.print("Case #"+(a+1)+": ");
            for (int b=0; b < temp.length; b++) {
                if (temp[b] == ' ' || temp[b] == '\n')
                    System.out.print(' ');
                else {
                    int c = (int) temp[b] - 97;
                    System.out.print(letmap[c]);
                }
            }
            System.out.printf("\n");
        }
        
    }
    
}
