package br.com.arcasoftwares.programmingskills;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args) {
        List<Integer> firstLine =  Arrays.asList(1,2,3);
        List<Integer> secondLine = Arrays.asList(4,5,6);
        List<Integer> thirdLine = Arrays.asList(9,8,9);
        List<List<Integer>> lista = new ArrayList<>();
        lista.add(firstLine);
        lista.add(secondLine);
        lista.add(thirdLine);
        int i = diagonalDifference(lista);
        System.out.println(i);
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int firstDiagonal = 0;
        int secondDiagonal = 0;
        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.size(); j++) {
                if(i == j){
                    firstDiagonal += (arr.get(i).get(j));
                }
                if((i + j) == arr.size() -1){
                    secondDiagonal += (arr.get(i).get(j));
                }
            }
        }
        int differnce =  (firstDiagonal - secondDiagonal);
        return differnce > 0 ? differnce : (differnce * -1);
    }
}
