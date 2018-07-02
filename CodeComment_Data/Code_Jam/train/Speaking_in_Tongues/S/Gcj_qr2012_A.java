package methodEmbedding.Speaking_in_Tongues.S.LYD519;


import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author Fidel
 */
public class Gcj_qr2012_A {
    public static void main(String[] args) throws FileNotFoundException{
        File f = new File("input.txt");
        java.util.Scanner sc = new java.util.Scanner(f);
        int T = sc.nextInt();
        sc.nextLine();
        String pole[] = new String[T];
        String a[] = {" ","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String b[] = {" ","y","n","f","i","c","w","l","b","k","u","o","m","x","s","e","v","z","p","d","r","j","g","t","h","a","q"};
        
        for (int i = 0; i < T; i++) {
            pole[i] = sc.nextLine();
            String temp = "";
            for (int j = 0; j < pole[i].length(); j++) {
                char letter = pole[i].charAt(j);
                int k = 0;
                while(!b[k].matches(String.valueOf(letter))){
                    k++;
                }
                letter = a[k].charAt(0);
                temp += letter;
            }
            pole[i] = temp;
            System.out.println("Case #" + (i+1) + ": " + pole[i]);
        }
    }
}
