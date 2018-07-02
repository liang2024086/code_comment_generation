package method_new_test.Dijkstra.S.LYD40;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


 
public class a {
 

        public static void main(String[] args) throws IOException {
             //   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                 BufferedReader in = new BufferedReader(new FileReader(
                 "C-small-attempt1.in"));
// 
//                StringBuilder qq = new StringBuilder();
//                PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
                 PrintWriter out = new PrintWriter(new FileWriter("out.txt"));
             
                int k[][] = new int[128][128];
                k[1][1] = 1;
                k[1]['i'] = 'i';
                k[1]['j'] = 'j';
                k[1]['k'] = 'k';
                // ...............
 
                k['i'][1] = 'i';
                k['i']['i'] = -1;
                k['i']['j'] = 'k';
                k['i']['k'] = -1 * 'j';
                // ...............
                k['j'][1] = 'j';
                k['j']['i'] = -'k';
                k['j']['j'] = -1;
                k['j']['k'] = 'i';
                // ...............
                k['k'][1] = 'k';
                k['k']['i'] = 'j';
                k['k']['j'] = -'i';
                k['k']['k'] = -1;
 
                int tc = Integer.parseInt(in.readLine());
                for (int i = 0; i < tc; i++) {
 
                        String y[] = in.readLine().split(" ");
                        int n = Integer.parseInt(y[0]);
                        long m = Long.parseLong(y[1]);
 
                        String a = in.readLine();
                        out.print("Case #" + (i + 1) + ": ");
                        if (n * m < 3) {
                                out.println("NO");
                                continue;
                        }
                        int pre = 1;
                        int presign = 0;
                        for (int j = 0; j < n; j++) {
                                pre = k[pre][a.charAt(j)];
                                if (pre < 0) {
                                        presign ^= 1;
                                        pre *= -1;
                                }
                        }
                        int ans = 1;
                        int sign = 0;
                        int res = 0;
                        int r = 0;
                        int j;
 
                        for (j = 0; j < m; j++) {
                                for (int j2 = 0; j2 < n; j2++) {
                                        ans = k[ans][a.charAt(j2)];
                                        if (ans < 0) {
                                                sign ^= 1;
                                                ans = Math.abs(ans);
                                        }
                                        if (res == 0) {
                                                if (ans == 'i') {
                                                        res++;
                                                        ans = 1;
                                                        r = 0;
                                                }
                                        } else if (res == 1) {
                                                if (ans == 'j') {
                                                        res++;
                                                        ans = 1;
                                                        r = 0;
                                                }
                                        } else if (res == 2) {
                                                if (ans == 'k') {
                                                        res++;
                                                        ans = 1;
                                                        r = 0;
                                                }
                                        }
                                }
                                r++;
                                if (r >= 2) {
                                        j++;
                                        break;
                                }
                        }
 
                        if (res == 3) {
                                long mod = ((long) m - (long) j) % 4;
                                int answer = 1;
                                int ansSign = 0;
                                if (mod == 1) {
                                        answer = pre;
                                        ansSign = presign;
                                }else if (mod == 2) {
                					answer = k[pre][pre];
                					if (answer < 0)
                						ansSign = 1;
                					answer=Math.abs(answer);
                				} else if (mod == 3) {
                                        ansSign = presign;
                                        answer = k[pre][pre];
                                        if (answer < 0)
                                                ansSign ^= 1;
                                        answer = Math.abs(answer);
                                        answer = k[answer][pre];
                                        if (answer < 0)
                                                ansSign ^= 1;
                                        answer = Math.abs(answer);
                                }
                                if (sign == 1)
                                        ansSign ^= 1;
                                answer = k[ans][answer];
                                if (answer < 0)
                                        ansSign ^= 1;
                                answer = Math.abs(answer);
                               
                                if(ansSign==0&&answer==1){
                                        out.println("YES");
                                }
                                else
                                        out.println("NO");
 
                        } else {
                                out.println("NO");
                        }
 
                }
 
                out.close();
 
        }
}
