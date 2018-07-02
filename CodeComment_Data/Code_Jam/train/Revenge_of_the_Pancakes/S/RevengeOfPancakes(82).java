package methodEmbedding.Revenge_of_the_Pancakes.S.LYD189;

import java.io.*;

/**
 * Created by sardesh.
 * Date: 10/4/16, 12:13 AM
 * Purpose :*
 *
 * @author : sardesh
 * @version : 1.0.0
 * @project: oca
 * @since :1.0.0-SNAPSHOT
 */
public class RevengeOfPancakes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("C_large.in")));
        PrintWriter out = new PrintWriter("Output2_2_small.txt", "UTF-8");
        String line = br.readLine();
        long t = Long.parseLong(line);
        for (long test = 0; test < t; test++) {
            int count = 0;
            line = br.readLine();
            char A[] = line.toCharArray();
            if (line.indexOf('+') == -1) {
                count = 1;
            } else {
                for (int p = 0; p < A.length; p++) {
                    if (A.length >= 3) {
                        if (A[p] == '+' && p + 1 < A.length && A[p + 1] == '-' && (p + 2) < A.length && A[p + 2] == '+') {
                            if (p == 0) {
                                A[p] = '-';
                                A[p] = '+';
                                A[p + 1] = '+';
                                count = count + 2;
                            } else {
                                for (int index = 0; index <= p; index++) {
                                    A[index] = '-';
                                }
                                for (int index = 0; index <= p + 1; index++) {
                                    A[index] = '+';
                                }
                                count = count + 2;
                            }
                        } else if (A[p] == '-') {
                            if (p == 0) {
                                int index2 = 0;
                                if (p + 1 < A.length && A[p + 1] == '-') {
                                    while (A[index2] == '-') {
                                        index2++;
                                    }
                                    for (int k = 0; k < index2; k++)
                                        A[k] = '+';
                                } else {
                                    A[p] = '+';
                                }
                                count = count + 1;
                            } else {
                                for (int index2 = 0; index2 <= p; index2++) {
                                    A[p] = '-';
                                }
                                count = count + 1;
                                for (int index2 = 0; index2 <= p; index2++) {
                                    A[p] = '+';
                                }
                                count = count + 1;
                            }
                        } else if (A[p] == '+' && p + 1 < A.length && A[p + 1] == '-' && (p + 2) < A.length && A[p + 2] == '-') {
                            int index = p + 2;
                            if (p + 3 < A.length && A[p + 3] == '-') {
                                index = p + 3;
                                if (index != A.length - 1)
                                    while (index < A.length && A[index] == '-') {
                                        index++;
                                    }
                            }
                            if (index >= A.length)
                                index = A.length - 1;

                            for (int j = 0; j <= index; j++) {
                                A[j] = '-';
                            }
                            count = count + 1;
                            for (int j = 0; j <= index; j++) {
                                A[j] = '+';
                            }
                            count = count + 1;
                        }
                    } else if (A.length == 1) {
                        if (A[0] == '-')
                            count = 1;
                        else if (A[0] == '+') {
                            count = 0;
                        }
                    } else if (A.length == 2) {
                        if (A[0] == '-' && A[1] == '-') {
                            count = 1;
                        } else if (A[0] == '-' && A[1] == '+') {
                            count = 1;
                        } else if (A[0] == '+' && A[1] == '-') {
                            count = 2;
                        } else if (A[0] == '+' && A[1] == '+') {
                            count = 0;
                        }
                    }
                }
            }
            out.println("Case #" + (test + 1) + ": " + count);
        }
        br.close();
        out.close();
    }
}
