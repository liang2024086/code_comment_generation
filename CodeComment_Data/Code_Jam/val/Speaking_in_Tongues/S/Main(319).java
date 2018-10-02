package methodEmbedding.Speaking_in_Tongues.S.LYD596;

import java.io.FileInputStream;
import java.util.*;
import java.math.*;

public class Main {
    
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        //Scanner scan  = new Scanner(new FileInputStream("C:\\Users\\wd\\Desktop\\"));
        char[] map = "yhesocvxduiglbkrztnwjpfmaq".toCharArray();
        int taskCount = scan.nextInt();
        scan.nextLine();
        for (int taskIndex = 1; taskIndex <= taskCount; taskIndex++) {
            char[] pre = scan.nextLine().toCharArray();
            for (int i = 0; i < pre.length; i++) {
                if (pre[i] == ' ') {
                    continue;
                }
                pre[i] = map[pre[i] - 'a'];
            }
            System.out.println("Case #" + taskIndex + ": " + new String(pre));
        }
    }
}
