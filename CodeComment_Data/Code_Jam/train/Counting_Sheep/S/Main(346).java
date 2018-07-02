package methodEmbedding.Counting_Sheep.S.LYD1139;

/**
 * Created on  : 12/04/2014
 * Author      : M. en C. Javier Silva P??rez - [javier]
 * Description :
 */

import com.keysd.googlecodejam.qualification.CountingSheep;

import java.io.IOException;


/**
 * Main tester class for the Google Code Jam 2016 problems, in this class the
 * user could select which problem to solve indicating the input file and the
 * problem key as parameters
 *
 * @author M. en C. Javier Silva P??rez - [javier]
 * @version 2.0
 * @since 09/04/2016
 */
public class Main {

    public static final int COUNTING_SHEEP = 0;

    /**
     * @param args
     */
    public static void main(String[] args) {
        Integer problemKey = COUNTING_SHEEP;

        String inputFileName = "A-small-attempt0.in";
        String outputFileName = inputFileName.replace(".in", ".out");

        Problem problem;
        switch (problemKey) {
            case COUNTING_SHEEP:
                problem = new CountingSheep();
                break;
            default:
                problem = new CountingSheep();
                break;
        }

        try {
            problem.execute(inputFileName, outputFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
