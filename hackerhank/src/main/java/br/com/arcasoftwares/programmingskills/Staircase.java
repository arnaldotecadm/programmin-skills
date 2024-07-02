package br.com.arcasoftwares.programmingskills;

public class Staircase {

    public static void main(String[] args) {
        staircase(6);
    }

    public static void staircase(int n) {
        // Write your code here
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if((j + i) >= n -1){
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
