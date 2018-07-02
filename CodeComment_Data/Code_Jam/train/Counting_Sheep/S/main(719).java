package methodEmbedding.Counting_Sheep.S.LYD139;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by TylerMatthews on 4/8/16.
 */
public class main {



    public static void main(String[] args){
        int n, count=0;
        boolean all=false;
        File file = new File("data.txt");
        ArrayList<String> answers = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();


        try {
            Scanner scan = new Scanner(file);
            String output="";





            System.out.println("How many cases?");
            n = scan.nextInt();



            for(int i=0; i<10; i++){
                a.add(i,0);
            }

            for(int i=0; i<n; i++){
                all = false;
                int x = scan.nextInt();
                if(x==0){
                    output = "INSOMNIA";
                }else{
                    count=0;
                    while(all==false){
                        count++;
                        int b=x*count;

                        while(b!=0 && all==false){
                            if(a.get(b%10)==0){
                                a.set(b%10,1);
                                for(int j =0; j<10; j++){
                                    if(a.get(j)==0){
                                        break;
                                    }else if(j==9){
                                        output = Integer.toString(count*x);
                                        all=true;
                                        break;
                                    }
                                }
                            }
                            b/=10;
                        }
                    }


                }
                for(int t=0; t<10; t++){
                    a.set(t,0);
                }

                answers.add(i,"Case #"+(i+1)+": "+output);
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }




        for(int i=0; i<answers.size(); i++){
            System.out.println(answers.get(i));
        }

    }

}
