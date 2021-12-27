package kyu6;

public class VasyaClerk {
    //6 https://www.codewars.com/kata/555615a77ebc7c2c8a0000b8/train/java
    /*The new "Avengers" movie has just been released! There are a lot of people at the cinema box office standing in a huge line. Each of them has a single 100, 50 or 25 dollar bill. An "Avengers" ticket costs 25 dollars.

Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.

Can Vasya sell a ticket to every person and give change if he initially has no money and sells the tickets strictly in the order people queue?

Return YES, if Vasya can sell a ticket to every person and give change with the bills he has at hand at that moment. Otherwise return NO.*/
    public static void main(String[] args) {
        System.out.println(Tickets(new int[]{25, 25, 50})); // YES
        System.out.println(Tickets(new int[]{25, 100})); // NO
    }

    public static String Tickets(int[] peopleInLine) {
        if (peopleInLine == null || peopleInLine.length == 0) return "YES";

        int sum25 = 0;
        int sum50 = 0;
        int sum100 = 0;

        for (int i = 0; i < peopleInLine.length; i++) {
            if (peopleInLine[i] == 25) {
                sum25++;
            }
            if (peopleInLine[i] == 50) {
                if (sum25 >= 1) {
                    sum25--;
                    sum50++;
                } else {
                    return "NO";
                }
            }
            if (peopleInLine[i] == 100) {
                if ((sum25 >= 1 && sum50 >= 1)) {
                    sum25--;
                    sum50--;
                    sum100++;
                } else if ((sum25 >= 3)) {
                    sum25 -= 3;
                    sum100++;
                } else {
                    return "NO";
                }
            }
        }
        return "YES";
    }
}