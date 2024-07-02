package br.com.arcasoftwares.programmingskills;

import java.text.DecimalFormat;

public class TimeConversion {

    public static void main(String[] args) {
        System.out.println(timeConversion("12:01:00AM"));
        System.out.println(timeConversion("02:01:00AM"));
        System.out.println(timeConversion("07:05:45PM"));
    }
    public static String timeConversion(String s) {
        // Write your code here
        String resultado = s;
        if(s.endsWith("AM")){
            if(s.startsWith("12")){
                resultado = s.replace("12", "00");
            }
            resultado = resultado.replace("AM", "");
        } else{
            if(!s.startsWith("12")){
                String start = resultado.substring(0,2);
                int i = Integer.parseInt(start) + 12;
                resultado = resultado.replaceFirst(start, new DecimalFormat("00").format(i));
            }
            resultado = resultado.replace("PM", "");
        }

        return resultado;
    }

}
