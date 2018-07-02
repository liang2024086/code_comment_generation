package methodEmbedding.Counting_Sheep.S.LYD230;

/*
 * Copyright 2016 Norbert Potocki <norbert.potocki@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.Scanner;

/**
 * @author <a href="mailto:norbert.potocki@gmail.com">Norbert Potocki</a>
 */
public class ProblemA {

  public static void main(String[] args) throws Exception {

    int t;
    long n;

    Scanner in = new Scanner(System.in);

    t = in.nextInt();

    for (int t_ = 0; t_ < t; t_++) {

      n = in.nextLong();
      String prefix = "Case #" + (t_ + 1) + ": ";

      if (n == 0) {
        System.out.println(prefix + "INSOMNIA");
      } else {
        boolean hit[] = new boolean[10];
        int remaining = 10;
        long last = 0;

        while(remaining != 0) {
          last += n;

          long tmp = last;
          while(tmp > 0) {
            if(!hit[(int) (tmp % 10)]) {
              remaining--;
              hit[(int) (tmp % 10)] = true;
            }

            tmp /= 10;
          }
        }

        System.out.println(prefix + last);
      }
    }
  }
}
