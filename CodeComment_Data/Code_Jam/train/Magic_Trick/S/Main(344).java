package methodEmbedding.Magic_Trick.S.LYD131;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String badMagician = "Bad magician!";
        String volunteerCheated = "Volunteer cheated!";
        String[] allNumbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" };
        int gameNumber = 1;
        int numberOfGames = 0;
        try {

            File f = new File("C:/IntelliJ/codejam2014/in.txt");
            BufferedReader fileReader;

            FileInputStream inputStream = new FileInputStream(f);
            DataInputStream dataInputStream = new DataInputStream(inputStream);

            fileReader = new BufferedReader(new InputStreamReader(dataInputStream));
            String line;
            String answer = badMagician;
            while ((line = fileReader.readLine()) != null) {
                if (numberOfGames == 0) {
                    numberOfGames = Integer.parseInt(line);
                } else {
                    ArrayList<String> aliveNumbers = new ArrayList<String>();
                    aliveNumbers.addAll(Arrays.asList(allNumbers));
                    //read guess
                    int guess1 = Integer.parseInt(line);
                    //read board
                    int row = 1;
                    if (row++ != guess1) {
                        String boardrow = fileReader.readLine();
                        String[] rowNumbers = boardrow.split(" ");
                        if (aliveNumbers.containsAll(Arrays.asList(rowNumbers))) {
                            aliveNumbers.removeAll(Arrays.asList(rowNumbers));
                        } else {
                            answer = volunteerCheated;
                        }

                    } else {
                        fileReader.readLine();
                    }
                    if (row++ != guess1) {
                        String boardrow = fileReader.readLine();
                        String[] rowNumbers = boardrow.split(" ");
                        if (aliveNumbers.containsAll(Arrays.asList(rowNumbers))) {
                            aliveNumbers.removeAll(Arrays.asList(rowNumbers));
                        } else {
                            answer = volunteerCheated;
                        }
                    } else {
                        fileReader.readLine();
                    }
                    if (row++ != guess1) {
                        String boardrow = fileReader.readLine();
                        String[] rowNumbers = boardrow.split(" ");
                        if (aliveNumbers.containsAll(Arrays.asList(rowNumbers))) {
                            aliveNumbers.removeAll(Arrays.asList(rowNumbers));
                        } else {
                            answer = volunteerCheated;
                        }
                    } else {
                        fileReader.readLine();
                    }
                    if (row++ != guess1) {
                        String boardrow = fileReader.readLine();
                        String[] rowNumbers = boardrow.split(" ");
                        if (aliveNumbers.containsAll(Arrays.asList(rowNumbers))) {
                            aliveNumbers.removeAll(Arrays.asList(rowNumbers));
                        } else {
                            answer = volunteerCheated;
                        }
                    } else {
                        fileReader.readLine();
                    }

                    //read guess
                    int guess2 = Integer.parseInt(fileReader.readLine());
                    //read board
                    row = 1;
                    {
                        String boardrow = fileReader.readLine();
                        String[] rowNumbers = boardrow.split(" ");
                        if (row++ != guess2) {
                            aliveNumbers.removeAll(Arrays.asList(rowNumbers));
                        } else {
                            if (aliveNumbers.containsAll(Arrays.asList(rowNumbers))) {
                                answer = volunteerCheated;
                            }

                        }
                    }
                    {
                        String boardrow = fileReader.readLine();
                        String[] rowNumbers = boardrow.split(" ");
                        if (row++ != guess2) {
                            aliveNumbers.removeAll(Arrays.asList(rowNumbers));
                        } else {
                            if (aliveNumbers.containsAll(Arrays.asList(rowNumbers))) {
                                answer = volunteerCheated;
                            }

                        }
                    }
                    {
                        String boardrow = fileReader.readLine();
                        String[] rowNumbers = boardrow.split(" ");
                        if (row++ != guess2) {
                            aliveNumbers.removeAll(Arrays.asList(rowNumbers));
                        } else {
                            if (aliveNumbers.containsAll(Arrays.asList(rowNumbers))) {
                                answer = volunteerCheated;
                            }

                        }
                    }
                    {
                        String boardrow = fileReader.readLine();
                        String[] rowNumbers = boardrow.split(" ");
                        if (row++ != guess2) {
                            aliveNumbers.removeAll(Arrays.asList(rowNumbers));
                        } else {
                            if (aliveNumbers.containsAll(Arrays.asList(rowNumbers))) {
                                answer = volunteerCheated;
                            }

                        }
                    }
                    if (aliveNumbers.size() == 1) {
                        answer = aliveNumbers.get(0);
                    }
                    if (aliveNumbers.size() > 1) {
                        answer = badMagician;
                    }
                    if (aliveNumbers.size() == 0) {
                        answer = volunteerCheated;
                    }

                    System.out.println("Case #" + gameNumber++ + ": " + answer);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
