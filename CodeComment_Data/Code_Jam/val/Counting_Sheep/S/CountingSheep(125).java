package methodEmbedding.Counting_Sheep.S.LYD91;

//**********************************************************************
// Copyright (c) 2016 Telefonaktiebolaget LM Ericsson, Sweden.
// All rights reserved.
// The Copyright to the computer program(s) herein is the property of
// Telefonaktiebolaget LM Ericsson, Sweden.
// The program(s) may be used and/or copied with the written permission
// from Telefonaktiebolaget LM Ericsson or in accordance with the terms
// and conditions stipulated in the agreement/contract under which the
// program(s) have been supplied.
// **********************************************************************

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;

public class CountingSheep
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader input =
                Files.newBufferedReader(FileSystems.getDefault().getPath("resources", "countingSheep.txt"), Charset.defaultCharset());
        long T = Integer.valueOf(input.readLine()), N = 0, counter = 1;
        String line = null, result = "INSOMNIA";
        String nums = "0123456789", allX = "XXXXXXXXXX";
        for (int i = 1; i <= T; i++)
        {
            line = input.readLine();
            N = Long.valueOf(line);
            counter = 1;
            nums = "0123456789";
            while ((counter * N) > 0L)
            {
                for (int j = 0; j <= 9; j++)
                {
                    if (String.valueOf(counter * N).contains(String.valueOf(j)))
                    {
                        nums = nums.replace(String.valueOf(j), "X");
                    }
                }
                if (nums.equals(allX))
                {
                    result = String.valueOf(counter * N);
                    break;
                }
                counter++;
            }
            System.out.println("Case #" + i + ": " + result);
        }
    }
}
