package methodEmbedding.Standing_Ovation.S.LYD853;


import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        while (scn.hasNext()) {
            int times = scn.nextInt();
            for (int time = 1; time <= times; time++) {
                int len = scn.nextInt();
                String a = scn.next();

                int ans = 0;
                int latest = 0;
                for (int i = 0; i <= len; i++) {
                        if(latest<i){
                        ans++;
                        latest++;
                        }
                        latest+=Integer.parseInt(String.valueOf(a.charAt(i)));
                }
                System.out.printf("Case #%d: %d\r\n",time,ans);
            }
        }
    }

}
