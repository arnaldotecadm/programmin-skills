package br.com.arcasoftwares.programmingskills;

import java.util.Arrays;
import java.util.List;

public class MinMaxSum {

    public static void main(String[] args) {
        miniMaxSum(Arrays.asList(1,2,3,4,5));
    }
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        if(arr.size() == 0) return;
        long min = arr.get(0);
        long max = arr.get(0);
        long sum = 0;
        for(int i = 0; i<arr.size(); i++){
            sum += arr.get(i);
            if(arr.get(i) < min){
                min = arr.get(i);
            }
            if(arr.get(i) > max){
                max = arr.get(i);
            }
        }
        System.out.printf("%d %d", (sum - max), (sum -min));
    }

}
