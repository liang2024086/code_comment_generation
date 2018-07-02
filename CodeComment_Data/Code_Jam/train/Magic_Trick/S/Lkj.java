package methodEmbedding.Magic_Trick.S.LYD302;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *
 * @author abhilash
 */
class Lkj {

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;
        int T = Integer.parseInt(buf.readLine());
        for (int i = 1; i <= T; i++) {
            int ans1, ans2, arr1[] = new int[4], arr2[] = new int[4];
            ans1 = Integer.parseInt(buf.readLine());
            for (int j = 1; j <= 4; j++) {
                String str=buf.readLine();
                if (j == ans1) {
                    token = new StringTokenizer(str, " ");
                    int k = 0;
                    while (token.hasMoreTokens()) {
                        arr1[k] = Integer.parseInt(token.nextToken());k++;
                    }
                }
            }
            
            ans2 = Integer.parseInt(buf.readLine());
            for (int j = 1; j <= 4; j++) {
                String str=buf.readLine();
                if (j == ans2) {
                    token = new StringTokenizer(str, " ");
                    int k = 0;
                    while (token.hasMoreTokens()) {
                        arr2[k] = Integer.parseInt(token.nextToken());k++;
                    }
                }
            }
            
            Arrays.sort(arr1);
            Arrays.sort(arr2);
           
            int l=0,m=0,ans=0,val=0;
            for(l=0;l<4&&m<4;){
                if(arr1[l]==arr2[m]){
                    val=arr1[l];
                    l++;m++;
                    ans++;
                }
                else if(arr1[l]<arr2[m])
                    l++;
                else if(arr1[l]>arr2[m])
                    m++;
            }
            if(ans==1)
            System.out.println("Case #"+i+": "+val);
            else if(ans==0)
            System.out.println("Case #"+i+": "+"Volunteer cheated!");
            else
            System.out.println("Case #"+i+": "+"Bad magician!");
        }
    }
}
