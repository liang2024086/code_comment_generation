package methodEmbedding.Revenge_of_the_Pancakes.S.LYD832;


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
        while(scanner.hasNext()){
            int noflips=0;
            casenumber=casenumber+1;
           String sampleString=scanner.next();
            char[] charArray= sampleString.toCharArray();
            int size=charArray.length;
            int i=0;
            Boolean allHappy=false;
            while(i<size&&(!allHappy)) {
                if (!sampleString.contains("-")) {
                    allHappy = true;
                } else if (!sampleString.contains("+")) {
                    noflips = noflips + 1;
                    allHappy = true;
                } else if (i==size-1) {
                    noflips = noflips + 1;
                    allHappy = true;
                } else if (sampleString.charAt(i) != sampleString.charAt(i + 1)) {
                    if ("+".equals(sampleString.charAt(i))) {
                        for (int j = 0; j <= i; j++) {
                            charArray[j] = "-".charAt(0);
                        }
                        noflips = noflips + 1;
                        sampleString = String.valueOf(charArray);
                    } else {
                        for (int j = 0; j <= i; j++) {
                            charArray[j] = "+".charAt(0);
                        }
                        noflips = noflips + 1;
                        sampleString = String.valueOf(charArray);
                    }
                }
                i = i + 1;
            }
            System.out.println("Case #"+casenumber+": "+noflips);
        }
    }
    }
