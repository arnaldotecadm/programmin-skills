package br.com.arcasoftwares.programmingskills;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,-1,-2,-3,0,0);
        plusMinus(lista);
    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float negative = 0;
        float positive = 0;
        float zero = 0;

        for (Integer integer : arr) {
            if (integer == 0) {
                zero++;
            }
            if (integer > 0) {
                positive++;
            }
            if (integer < 0) {
                negative++;
            }
        }
        DecimalFormat formatter = new DecimalFormat("0.00000");
        System.out.println(formatter.format(positive / arr.size()));
        System.out.println(formatter.format(negative / arr.size()));
        System.out.println(formatter.format(zero / arr.size()));
    }
}
