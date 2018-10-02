package methodEmbedding.Magic_Trick.S.LYD753;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.IOException;

public class MagicTrick {
    public static void main(String[] args) {
        String line, values[];
        int testCases, i, j, firstArrangement[][], firstChoice, secondArrangement[][], secondChoice;
        int possibilities[], numPossibilities, k;

        if(args.length < 1) {
            System.out.println("Indique o arquivo");
            return;
        }

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));

            if((line = br.readLine()) != null) {
                testCases = Integer.parseInt(line);

                firstArrangement = new int[4][4];
                secondArrangement = new int[4][4];

                for(i = 0; i < testCases; ++i) {
                    firstChoice = -1;
                    secondChoice = -1;

                    if((line = br.readLine()) != null) {
                        firstChoice = Integer.parseInt(line);
                    }

                    for(j = 0; j < 4; ++j) {
                        if((line = br.readLine()) != null) {
                            if(j == firstChoice - 1) {
                                values = line.split(" ");

                                firstArrangement[j][0] = Integer.parseInt(values[0]);
                                firstArrangement[j][1] = Integer.parseInt(values[1]);
                                firstArrangement[j][2] = Integer.parseInt(values[2]);
                                firstArrangement[j][3] = Integer.parseInt(values[3]);
                            }
                        }
                    }

                    if((line = br.readLine()) != null) {
                        secondChoice = Integer.parseInt(line);
                    }

                    for(j = 0; j < 4; ++j) {
                        if((line = br.readLine()) != null) {
                            if(j == secondChoice - 1) {
                                values = line.split(" ");

                                secondArrangement[j][0] = Integer.parseInt(values[0]);
                                secondArrangement[j][1] = Integer.parseInt(values[1]);
                                secondArrangement[j][2] = Integer.parseInt(values[2]);
                                secondArrangement[j][3] = Integer.parseInt(values[3]);
                            }
                        }
                    }

                    possibilities = new int[4];
                    numPossibilities = 0;

                    for(j = 0; j < 4; ++j) {
                        for(k = 0; k < 4; ++k) {
                            if(firstArrangement[firstChoice - 1][j] == secondArrangement[secondChoice - 1][k]) {
                                possibilities[numPossibilities++] = firstArrangement[firstChoice - 1][j];
                            }
                        }
                    }

                    System.out.print("Case #" + (i + 1) + ": ");

                    switch(numPossibilities) {
                        case 1:
                            System.out.println(possibilities[0]);
                            break;
                        case 0:
                            System.out.println("Volunteer cheated!");
                            break;
                        default:
                            System.out.println("Bad magician!");
                            break;
                    }
                }
            }

            br.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
