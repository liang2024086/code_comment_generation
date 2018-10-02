package methodEmbedding.Cookie_Clicker_Alpha.S.LYD426;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chrishan
 */
public class Euler_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ans=101; //5
        int x=5;
            int add=6;
            int fuck=25;
        for (int i = 0; i < 600; i++) {
            
            ans=ans+fuck*4+add*10;
            fuck=fuck+add*4;
            add+=2;
            x+=2;
            
            if (x==1001) {
                break;
            }
        }
        System.out.println(ans);
    }
}
