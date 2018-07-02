package methodEmbedding.Counting_Sheep.S.LYD873;


import java.io.*;

public class CountSheep {
    public static void main(String args[]){
        String useCase, chars, no;
        int flag = 0, num = 0, multiplier, testCase = -1;

        try {
            //PrintWriter writer = new PrintWriter(CountSheep.class.getClassLoader().getResource("CodeJam/log.txt").getPath().replaceAll("%20", " ").replace("CodeJam/log.txt", "CodeJam/out.txt"), "UTF-8");
            //FileReader file = new FileReader(CountSheep.class.getClassLoader().getResource("CodeJam/A-small-attempt0.in").getPath().replaceAll("%20", " "));
            FileReader file = new FileReader(args[0]);
            BufferedReader br = new BufferedReader(file);
            while ((useCase = br.readLine()) != null) { //The outer loop to read through the file
                testCase++ ;
                no = useCase;
                multiplier = 2;
                num = Integer.parseInt(useCase);
                chars = "0123456789";
                if(flag > 0) { //Make sure we skip first line
                    //Process each test case
                    while(true) {
                        for (int i = 0, n = useCase.length(); i < n; i++) {
                            if(chars.indexOf(useCase.charAt(i)) != -1) {
                                chars = chars.replaceAll(Character.toString(useCase.charAt(i)),"");
                            }
                        }
                        if(!chars.equals("")) {
                            num = Integer.parseInt(no) * multiplier;
                            useCase = Integer.toString(num);
                            if (multiplier == 101) {
                                System.out.println("Case #" + testCase + ": " + "Insomnia");
                                break;
                            }
                            multiplier++;
                            flag++;
                        } else {
                            System.out.println("Case #" + testCase + ": " + num);
                            break;
                        }
                    }
                    //writer.println(useCase);
                } else {
                    flag++;
                }
            }
            //writer.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
