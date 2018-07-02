package methodEmbedding.Revenge_of_the_Pancakes.S.LYD5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by GUPTAAMI on 4/9/2016.
 */
public class A {

    public static void main(String[] args) throws Exception {
        //String abc = "-";
        //String abc = "-+";
        //String abc = "+-";
        //String abc = "+++";
        //String abc = "--+-";


       final String FILENAME = "C:\\Users\\guptaami\\Desktop\\ongoDb\\src\\B-small-attempt5";
       //final String FILENAME = "B-small-attempt5";
        final String IN = FILENAME + ".in";
        final String OUT = FILENAME + ".out";
        Scanner sc;
        BufferedWriter out;

        sc = new Scanner(new File(IN));
        out = new BufferedWriter(new FileWriter(OUT));
        int numCases = Integer.parseInt(sc.nextLine());

//        System.out.println("numcases = "+numCases);
        for (int n = 0; n < numCases; n++) {

            String abc = sc.nextLine();

            abc = abc.replaceAll("\\+", "a");

            abc = abc.replaceAll("-", "b");
            System.out.println("abc ===  "+abc);
            if (!(abc.contains("b"))) {
                out.write("Case #");
                out.write(String.valueOf(n + 1));
                out.write(": ");
                out.write(String.valueOf(0));
                out.newLine();
                System.out.println("in 12 ");

                System.out.println("final count is " + 0);

            } else if (!abc.contains("a")) {
                out.write("Case #");
                out.write(String.valueOf(n + 1));
                out.write(": ");
                out.write(String.valueOf(1));
                out.newLine();
                System.out.println("in 11 ");

               System.out.println("final count is " + 1);

            } else {


                ArrayList a1 = new ArrayList();
                int holder = 0;
                String middle="";
                System.out.println("length=" + abc.length());
                for (int i = 1; i < abc.length(); i++) {

                    System.out.println("i = " + i);



                        if (abc.charAt(i) == abc.charAt(i - 1)) {
                        System.out.println("inside continue");
                        middle = abc.substring(holder, i + 1);
                        continue;
                    } else if (a1.isEmpty()) {
                        if (i + 1 == abc.length()) {
                            if (abc.charAt(i) == abc.charAt(i - 1)) {
                                a1.add(abc.substring(holder, i + 1));
                        middle="";

                            } else {
                                a1.add(abc.substring(holder, i));
                                a1.add(abc.charAt(i));
                                middle="";
                            }

                        } else {

                            a1.add(abc.substring(0, i));
                           System.out.println("abc.substring(0, i+1)" + abc.substring(0, i));
                            holder = i;
                           System.out.println("abc.substring(0, i+1) holder == " + holder);
                            middle="";
                        }
                    } else {

                        if (i + 1 == abc.length()) {
                            if (abc.charAt(i) == abc.charAt(i - 1)) {
                                a1.add(abc.substring(holder, i + 1));
                                middle="";

                            } else {
                                a1.add(abc.substring(holder, i));
                                a1.add(abc.charAt(i));
                                middle="";
                            }

                        } else {
                            a1.add(abc.substring(holder, i));
                            middle="";

                        }


                       System.out.println("abc.substring(holder, i+1)== " + abc.substring(holder, i));
                        holder = i;
                        System.out.println("abc.substring(holder, i+1) holder " + holder);
                    }
                }

                if(middle.length()>0)
                    a1.add(middle);
                int count = 0;
                String str = new String();

                //+--+

                for (int i = 0; i < a1.size(); i++) {
                    System.out.println("len = " + a1.size());

                    //System.out.println(a1.get(i));
                    String temp = "" + a1.get(i);


                   //  String temp1 = (String)a1.get(i+1);


                  //  System.out.println("temp " + temp);
                    // System.out.println("temp1 "+temp1);

                    // --+-

                    if (temp.contains("a")) {
                        if (str.contains("a")) {
                            str = str + temp;
                            System.out.println("in 1 "+str);
                        }
                        else if (str.contains("b")) {
                            str=str.replace("b", "a");
                            count = count + 1;
                            str = str + temp;
                            System.out.println("in 2 "+str);
                        } else {
                            str = str + temp;
                            System.out.println("in 3 "+str);
                        }
                    }
                    //   aaa  bbb aa bb a b a b a b   str aaaaaaaa  3
                    //  +++  --- ++ -- + - + - + -
                    else if (temp.contains("b")) {
                        if (str.contains("a")) {
                            count = count + 1;
                            str=str.replace("a", "b");
                            str = str + temp;
                            System.out.println("in 4 "+str);
                        }

                       else if (str.contains("b")) {
                            count = count + 1;
                            str = str + temp;
                            str=str.replace("b", "a");
                            System.out.println("in 5 ");

                        } else {
                            temp = temp.replace("b", "a");
                            str = str + temp;
                            count = count + 1;
                    System.out.println("in 6 ");
                        }
                    }

              //      System.out.println("Amit = " + count + "  " + a1.get(i));



                }

                if(str.contains("b")) {
                    count=count+1;
                }

              out.write("Case #");
                out.write(String.valueOf(n + 1));
                out.write(": ");
                out.write(String.valueOf(count));
                out.newLine();

            }
        }
        out.flush();

    }
}
