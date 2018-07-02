package methodEmbedding.Magic_Trick.S.LYD1224;


import java.util.Scanner;


public class Magic {

    static Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {
        int T;
        int r1,r2;
        int[][] a,b;
        a = new int[4][4];
        b = new int[4][4];
        
        T = inp.nextInt();
        for(int i=0; i<T ;i++){
            r1=inp.nextInt();
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    a[j][k] = inp.nextInt();
                }
            }
            r2=inp.nextInt();
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    b[j][k] = inp.nextInt();
                }
            }
            
            int m = 0, ans = 0;
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    if(a[r1-1][j]==b[r2-1][k]){
                        m++;
                        ans = a[r1-1][j];
                    }
                }
            }
             

            
            switch(m){
                case 0:
                    System.out.printf("Case #%d: Volunteer cheated!\n",i+1);
                    break;
                case 1:
                    System.out.printf("Case #%d: %d\n",i+1,ans);
                    break;
                default:
                    System.out.printf("Case #%d: Bad magician!\n",i+1);
                    break;
            }
           
        }
    }
    
}
