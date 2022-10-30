package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String zum Umkehren: ");
        String str = scanner.next();
        System.out.println(str + " umgekehrt " + invertString(str));

        int[] arr = {6, 2, 8, 3, 9, 6};
        System.out.println("Sortierte Zahlenreihe {6, 2, 8, 3, 9, 6}: " + Arrays.toString(sortArray(arr)));


        String[] strings = splitString("a, b, cd, rf");
        System.out.println("Gesplitterter String \"a, b, cd, rf\" " + Arrays.toString(strings));

        System.out.print("Gib bitte eine Zahl bis 100 ein: ");
        int number = scanner.nextInt();
        System.out.println(number + " entspricht der Römischen Zahl \"" + invertNumberToRomanNumerals(number) + "\"");
    }

    static String invertString(String str){
        char[] strchar = str.toCharArray();
        String invert = "";
        for(int i = str.length() -1; i >= 0; i--){
            invert += strchar[i];
        }
        return invert;
    }

    static int[] sortArray(int[] arr){
        int a;
        for(int i = arr.length -1; i > 0; i--)
        {
            for (int j = 0; j < i; j++) {
                if (arr[j + 1] < arr[j]) {
                    a = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = a;
                }
            }
        }
        return arr;
    }

    static String[] splitString(String str){
        String[] result = {};
        if(str.contains(",")) {
            result = str.replaceAll(" ","").split(",");
        }
        return result;
    }

    static int checksum(int number){
        char[] arr = Integer.toString(number).toCharArray();
        int result = 0;
        for(int i = 0; i < arr.length; i++){
            result += Character.getNumericValue(arr[i]);
        }
        return result;
    }

    static String invertNumberToRomanNumerals(int number){
        String romnum = "";
        int length = Integer.toString(number).length();
        switch (length){
            case 2: {
                int a = number/10;
                romnum += romNumTo100(a) + romNumTo10(number-a*10);
                break;
            }
            case 1: {
                romnum += romNumTo10(number);
            }
        }
        return romnum;
    }

    static String romNumTo10(int number){
        String strNum = "";
        switch(number){
            case 1: {
                strNum += "I";
                break;
            }
            case 2: {
                strNum += "II";
                break;
            }
            case 3: {
                strNum += "III";
                break;
            }
            case 4: {
                strNum += "IV";
                break;
            }
            case 5: {
                strNum += "V";
                break;
            }
            case 6: {
                strNum += "VI";
                break;
            }
            case 7: {
                strNum += "VII";
                break;
            }
            case 8: {
                strNum += "VIII";
                break;
            }
            case 9: {
                strNum += "IX";
            }
        }
        return strNum;
    }

    static String romNumTo100(int number){
        String strNum = "";
        switch(number){
            case 1: {
                strNum += "X";
                break;
            }
            case 2: {
                strNum += "XX";
                break;
            }
            case 3: {
                strNum += "XXX";
                break;
            }
            case 4: {
                strNum += "XL";
                break;
            }
            case 5: {
                strNum += "L";
                break;
            }
            case 6: {
                strNum += "LX";
                break;
            }
            case 7: {
                strNum += "LXX";
                break;
            }
            case 8: {
                strNum += "LXXX";
                break;
            }
            case 9: {
                strNum += "XC";
            }
        }
        return strNum;
    }



}