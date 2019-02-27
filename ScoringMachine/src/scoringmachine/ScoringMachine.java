/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoringmachine;

import java.util.Arrays;

/**
 *
 * @author 213061
 */
public class ScoringMachine {

    int[] daddy;

    public ScoringMachine(int[] scores) {
        daddy = scores;
    }

    public static double getAverage(int[] scores) {
        double average = 0;
        double sum = 0;
        for (double x : scores) {
            sum = sum + x;
        }
        average = sum / scores.length;
        return average;
    }

    public static double getMedian(int[] scores) {

        Arrays.sort(scores);
        double temp = 0;
        if (scores.length % 2 == 0) {

            temp = ((double) scores[scores.length / 2] + (double) scores[scores.length / 2 - 1]) / 2;

        } else {

            temp = (double) scores[scores.length / 2];

        }

        return temp;
    }

    public static int getMax(int[] scores) {

        int maxValue = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > maxValue) {
                maxValue = scores[i];
            }
        }
        return maxValue;
    }

    public static int getMin(int[] scores) {

        int minValue = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < minValue) {
                minValue = scores[i];

            }
        }

        return minValue;

    }

    public static void main(String[] args) {

        int[] scores = new int[5];
        scores[0] = -10;
        scores[1] = -20;
        scores[2] = -30;
        scores[3] = -40;
        scores[4] = -50;
//        scores[5] = 25;
//        scores[6] = 22;
//        scores[7] = 21;
//        scores[8] = 21;
//        scores[9] = 21;
//        scores[10] = 21;
//        scores[11] = 23;
//        scores[12] = 24;
//        scores[13] = 25;
//        scores[14] = 29;
//        scores[15] = 48;
//        scores[16] = 58;
//        scores[17] = 65;
//        scores[18] = 75;
//        scores[19] = 82;

        ScoringMachine adam = new ScoringMachine(scores);

        System.out.println("Length: " + scores.length);
        System.out.println("Average: " + getAverage(scores));
        System.out.println("Median: " + getMedian(scores));
        System.out.println("Max: " + getMax(scores));
        System.out.println("Min: " + getMin(scores));
    }

}
