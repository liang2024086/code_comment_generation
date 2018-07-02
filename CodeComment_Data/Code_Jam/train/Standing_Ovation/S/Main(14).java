package methodEmbedding.Standing_Ovation.S.LYD781;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numTestCases = Integer.parseInt(in.nextLine());
        for(int i=0;i<numTestCases;i++)
        {
            String newTest = in.nextLine();
            String[] test = newTest.split(" ");
            int Smax = Integer.parseInt(test[0]);
            int friendCount = 0;
            String people = test[1];
            int[] peopleWithShyness = new int[Smax+1];
            int shyness = 0;
            while(shyness < people.length())
            {
                peopleWithShyness[shyness] = people.charAt(shyness)-'0';
                shyness++;
            }
            for(int j=1;j<=Smax;j++)
            {
                peopleWithShyness[j]=peopleWithShyness[j-1]+peopleWithShyness[j];
            }
            for(int j=1;j<=Smax;j++) {
                if(j>(peopleWithShyness[j-1]+friendCount))
                    friendCount+=1;
            }
            System.out.println("Case #"+(i+1)+": "+friendCount);
        }
    }
    }
