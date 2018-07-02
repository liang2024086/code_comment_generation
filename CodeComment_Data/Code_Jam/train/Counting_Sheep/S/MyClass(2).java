package methodEmbedding.Counting_Sheep.S.LYD370;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class MyClass {
    public static void main(String[] args) {

        // The name of the file to open.
       // String fileName = "temp.txt";
        String fileName = "C:\\Users\\prani\\Documents\\PsthOfLeastResistance\\lib\\src\\main\\java\\com\\example\\temp.txt";
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int N=scanner.nextInt();
        int casenumber=0;
        while(scanner.hasNextInt()){
            casenumber=casenumber+1;
           int i=scanner.nextInt();
            Boolean zero=false,one=false,two=false,three=false,four=false,five=false,six=false,seven=false,eight=false,nine=false,all=false;
            int k=1;
            while(!all &&k<100)
            {
                int number=k*i; // = some int
                k=k+1;
                while (number > 0) {

                    switch(number % 10){
                        case 1 :one=true;
                            break;
                        case 2 :two=true;
                            break;
                        case 3 :three=true;
                            break;
                        case 4 :four=true;
                            break;
                        case 5 :five=true;
                            break;
                        case 6 :six=true;
                            break;
                        case 7 :seven=true;
                            break;
                        case 8 :eight=true;
                            break;
                        case 9 :nine=true;
                            break;
                        case 0 :zero=true;
                            break;
                        default :
                    }
                    number = number / 10;
                    if(zero&&one&&two&&three&&four&&five&&six&&seven&&eight&&nine)
                        all=true;
                }
            }
            if(all)
                System.out.println("Case #"+casenumber+": "+(k-1)*i);
            else
                System.out.println("Case #"+casenumber+": "+"INSOMNIA");
        }
    }
    }
