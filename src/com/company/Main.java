package com.company;

import java.util.Scanner;

public class Main {

    public static boolean leapYearCheck(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            return true;
        else
            return false;
    }

    public static int dayOfTheWeek(int month, int day, int year) {
        int wy, m, weekDay, whichMonth, week;

        if (month < 3)
            year = year - 1;

        wy = (3 + year + (year / 4) - (year / 100) + (year / 400)) % 7;
        m = (month + 9) % 12;
        whichMonth = (int) (2.6 * m + .5) % 7;
        weekDay = (day - 1);
        week = (wy + whichMonth + weekDay) % 7;
        return week;
    }

    public static int dayInMonth(int month, int year) {

        int dayOfTheMonth = 0;
        switch (month) {
            case 1:
                dayOfTheMonth = 31;
                break;
            case 2:
                dayOfTheMonth = 28;
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                    dayOfTheMonth = 29;
                break;
            case 3:
                dayOfTheMonth = 31;
                break;
            case 4:
                dayOfTheMonth = 30;
                break;
            case 5:
                dayOfTheMonth = 31;
                break;
            case 6:
                dayOfTheMonth = 30;
                break;
            case 7:
                dayOfTheMonth = 31;
                break;
            case 8:
                dayOfTheMonth = 31;
                break;
            case 9:
                dayOfTheMonth = 31;
                break;
            case 10:
                dayOfTheMonth = 30;
                break;
            case 11:
                dayOfTheMonth = 31;
                break;
            case 12:
                dayOfTheMonth = 30;
                break;
        }
        return dayOfTheMonth;
    }

    public static int whichMonthCheck(int month) {

        switch (month) {
            case 1:
                System.out.println("Януари -->");
                System.out.println("");
                break;
            case 2:
                System.out.println("Февруари -->");
                System.out.println("");
                break;
            case 3:
                System.out.println("Март -->");
                System.out.println("");
                break;
            case 4:
                System.out.println("Април -->");
                System.out.println("");
                break;
            case 5:
                System.out.println("Май -->");
                System.out.println("");
                break;
            case 6:
                System.out.println("Юни -->");
                System.out.println("");
                break;
            case 7:
                System.out.println("Юли -->");
                System.out.println("");
                break;
            case 8:
                System.out.println("Август -->");
                System.out.println("");
                break;
            case 9:
                System.out.println("Септември -->");
                System.out.println("");
                break;
            case 10:
                System.out.println("Октомври -->");
                System.out.println("");
                break;
            case 11:
                System.out.println("Ноември -->");
                System.out.println("");
                break;
            case 12:
                System.out.println("Декември -->");
                System.out.println("");
                break;

        }
        return month;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int day = 0;
        System.out.println("Enter month and year!");
        int month = console.nextInt();
        int year = console.nextInt();

        if (month > 12) {
            System.out.println("Няма такъв месец. Oпитай пак като въведеш съществуващ!");
            System.out.println();
        }

        boolean leapYear = leapYearCheck(year);
        int whichMonth = whichMonthCheck(month);
        int dayInMonth = dayInMonth(month, year);
        day = dayOfTheWeek(month, day, year);
        if (leapYear == true && month == 2)
            dayInMonth = 29;
        int c = 0;
        if(month <= 12){
        System.out.println("П    В    С    Ч    П    С    Н");
        System.out.println("");
        }
        while (day >= 0) {
            System.out.print("");
            day--;
            c++;
        }
        int x = 1;
        int count = day;

        while (x <= dayInMonth) {
            System.out.printf("%-5d", x);
            x++;
            c++;
            if (c % 7 == 0)
                System.out.println();
        }
    }


}

