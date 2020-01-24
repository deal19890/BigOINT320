/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigo;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Student
 */
public class test {

    

    public static void main(String[] args) {
        for (int i = 1; i <= 100000; i*=10) {
            System.out.println("num = " + i) ;
            testsort(i);
            teamsort(i);
            System.out.println("-------");
        }
    }

    public static void testsort(int num) {
        int[] test = new int[num];
        for (int i = 0; i < test.length; i++) {
            test[i] = new Random().nextInt(num);

        }
        long begin = System.currentTimeMillis();

        Arrays.sort(test);

        System.out.println(" Array sort:" +"num = "+num+ " \n Duration " + (System.currentTimeMillis() - begin) + " milliseconds" );

    }

    public static void teamsort(int num) {
        int[] test = new int[num];

        int temp;
        for (int i = 0; i < test.length; i++) {
            test[i] = new Random().nextInt(num);

        }

        long begin = System.currentTimeMillis();

        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (test[i] > test[j]) {
                    temp = test[i];
                    test[i] = test[j];
                    test[j] = temp;
                }
            }
        }
        System.out.println(" My sort:" +"num = "+num+ " \n Duration "+ (System.currentTimeMillis() - begin) + " milliseconds" );
//https://www.sanfoundry.com/java-program-sort-array-ascending-order/
    }

   
}