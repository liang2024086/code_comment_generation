package methodEmbedding.Standing_Ovation.S.LYD1997;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String challange = "4\n" +
                "4 11111\n" +
                "1 09\n" +
                "5 110011\n" +
                "0 1";

        Scanner in = new Scanner(System.in);

        //challange = in.next();

        /*lines = challange.split("\\r?\\n");

        String line = lines[0];*/

        int number_of_test_cases = Integer.valueOf(in.next());

        int current = 1;

        while(current <= number_of_test_cases) {

            if(!in.hasNext()) {

                break;

            }

            String lines = in.nextLine();

            if(lines.equals("")) {

                continue;

            }

            if(current != 0) {

                String data = lines;

                data = data.substring(2);

                int total = 0;

                int Si = 0;

                int i = 0;

                //people = new ArrayList<Integer>();

                for(char c : data.toCharArray()) {

                    int person = Character.getNumericValue(c);

                    if(i == 0) {

                        if(person == 0) {

                            Si++;

                        }

                    } else {

                        if (total + Si  < i) {

                            Si++;

                        }

                    }

                    total += person;

                    //people.add(i, person);

                    i++;

                }

                System.out.println("Case #" + current + ": " + Si);

            }

            current++;

        }

        /*String data = "230000004";

        //List<Integer> people;

        int total = 0;

        int Si = 0;

        int i = 0;

        //people = new ArrayList<Integer>();

        for(char c : data.toCharArray()) {

            int person = Character.getNumericValue(c);

            if(i == 0) {

                if(person == 0) {

                    Si++;

                }

            } else {

                if (total + Si  < i) {

                        Si++;

                }

            }

            total += person;

            //people.add(i, person);

            i++;

        }

        System.out.print(Si);*/

    }
}
