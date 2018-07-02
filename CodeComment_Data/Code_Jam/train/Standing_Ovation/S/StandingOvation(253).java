package methodEmbedding.Standing_Ovation.S.LYD1806;

/*
** Module   : codejam
** Abstract : TODO 
**
** Copyright (c) 2013, Golden Code Development Corporation.
** ALL RIGHTS RESERVED. Use is subject to license terms.
**
**           Golden Code Development Corporation
**                      CONFIDENTIAL
**
** -#- -I- --Date-- ---------------------------------Description----------------------------------
** 001 EVK 20150411 Created initial version.
*/

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class StandingOvation {

    public static void main(String[] args) throws IOException {
        String fileNameToLoad = "/home/culvert/Downloads/A-small-attempt0.in";
        Path path = FileSystems.getDefault().getPath(fileNameToLoad);
        InputStream reader = Files.newInputStream(path);
        
        
        Scanner in = new Scanner(fileNameToLoad.isEmpty() ? System.in : reader);
        int T = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            sb.append("Case #").append(t + 1).append(": ");
            int Smax = in.nextInt();
            String str = in.next();
            int total = 0;
            int result = 0;
            for (int i = 0; i < str.length(); i++) {
                int people = str.charAt(i) - '0';
                if (people == 0) {
                    continue;
                }
                if (total >= i) {
                    total += people;
                } else {
                    int addedPeople = Math.abs(total - i) ;
                    result += addedPeople;
                    total += addedPeople + people;
                }
            }
            sb.append(result).append('\n');
        }
        System.out.println(sb.toString());
        Path path1 = FileSystems.getDefault().getPath("res1.txt");
        Files.write(path1, sb.toString().getBytes(), StandardOpenOption.CREATE);//create new, over
    }
}
