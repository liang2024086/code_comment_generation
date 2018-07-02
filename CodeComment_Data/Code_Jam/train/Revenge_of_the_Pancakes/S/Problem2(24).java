package methodEmbedding.Revenge_of_the_Pancakes.S.LYD80;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by pritamroy on 4/8/16.
 */
public class Problem2 {

    public static void main(String args[]) throws FileNotFoundException, UnsupportedEncodingException {

        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int numOfInputs=Integer.parseInt(n);

        PrintWriter writer = new PrintWriter("answer2.txt", "UTF-8");

        for(int i=0;i<numOfInputs;i++){

            String input=sc.nextLine().trim();

            Stack<Character> inputStack=new Stack<>();
            Stack<Character> tempStack=new Stack<>();

            char curr=input.charAt(0);
            //Initialize the stacks with input values
            for (int stack_counter=input.length()-1;stack_counter>=0;stack_counter--) {
                inputStack.add(input.charAt(stack_counter));

            }

            int answer=0;

            while (true) {

                tempStack.addAll(inputStack);

                boolean ansFound=true;

                for(int c1=0;c1<tempStack.size();c1++){
                    if(tempStack.get(c1)!='+'){
                        ansFound=false;
                        break;
                    }
                }

                if(ansFound){
                   // System.out.println(answer);
                    writer.println("Case #"+(i+1)+": "+answer);
                    break;
                }
                else{

                  //  System.out.println(inputStack);

                    tempStack.clear();
                    curr=inputStack.peek();
                    //If top is + flip the entire stack
                    if(curr=='+'){
                     //   System.out.println(inputStack.peek());
                       // tempStack.clear();
                        int tc=0;

                        for(int c2=0;c2<inputStack.size();c2++){
                            if(inputStack.peek()=='+'){
                                tempStack.add(inputStack.pop());

                                c2--;
                            }
                            else{

                                break;
                            }

                        }
                       // System.out.println(tempStack);

                        tempStack.addAll(inputStack);
                        inputStack.clear();
                        inputStack.addAll(tempStack);



                        answer++;

                    }

                    else{


                        for(int c3=0;c3<inputStack.size();c3++){
                            if(inputStack.peek()=='-'){
                                tempStack.add(inputStack.pop());
                                c3--;
                            }
                            else{
                                break;
                            }
                        }
                        for(int c3=0;c3<tempStack.size();c3++){
                            inputStack.add('+');
                        }



                        answer++;

                    }
                    tempStack.clear();

                }


            }

        }
        writer.close();
    }
}
