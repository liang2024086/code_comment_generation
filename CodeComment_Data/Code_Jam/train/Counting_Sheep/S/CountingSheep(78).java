package methodEmbedding.Counting_Sheep.S.LYD1229;

import java.io.*;
import java.util.*;
import java.math.*;

public class CountingSheep {

       public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       int test = sc.nextInt();
       int i,n=0;
       int n_copy=0;
       int[] result = new int[test+1];

                  for(i=0; i<test; i++)
                    {
                        boolean[] arr_b = new boolean[10];
                        n = sc.nextInt();
                        n_copy = n;
                        int next=1;
                        for (int j=0; j<=9; j++)
                         { arr_b[j]=false;}

                        boolean condition = true;

                        if(n!=0)
                        {
                          while ( !( arr_b[0] && arr_b[1] && arr_b[2] && arr_b[3] && arr_b[4] && arr_b[5] && arr_b[6] && arr_b[7] && arr_b[8] && arr_b[9] ) )
                            {
                                  while (n_copy>0)
                                  {
                                    arr_b[n_copy%10]=true;
                                    n_copy = n_copy/10;
                                    //  System.out.println("chala");
                                  }
                                  n_copy = n*(next+1);
                                  next++;
                            //  for (int t=0;t<=9;t++){System.out.println(t+"  "+arr_b[t]);}
                            }
                            //for (int t=0;t<=9;t++){System.out.println(t+"  "+arr_b[t]);}
                           result[i] = n_copy - n;
                       }
                       else {
                          //System.out.println("zero found");
                          result[i] = -100;
                         // System.out.println(result[i]);
                            }
                   }

                  for (int t=0;t<=(test-1);t++)
                   {
                      if(result[t] == (-100))
                        { System.out.println("Case #" + (t+1) + ": INSOMNIA");}
                       else
                         System.out.println("Case #" + (t+1) + ": " + (result[t]));
                    }

                }

        }
