package com.epam.less.task1;

import java.util.Scanner;

public class TestedTask{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Задайте желаемую длину массива:\n>");
        String input;
        int arrLength = 0;
        while (!isNatural(arrLength)) {
            input = scan.next();
            if (isNumber(input)) {
                arrLength = Integer.parseInt(input);
                System.out.print(!isNatural(arrLength) ? "Ошибка! Длина массива для этой задачи должна быть больше 0. Попробуйте снова.\n>":"");
            } else {
                System.out.print("Ошибка! Вы не ввели целое число. Попробуйте снова.\n>");
            }
        }
        int[] arr = new int[arrLength];
        System.out.print("Введите желаемые значения элементов массива.\n>");
        for (int i = 0; i < arrLength; i++) {
            while (!isNatural(arr[i])) {
                input = scan.next();
                if (isNumber(input)) {
                    arr[i] = Integer.parseInt(input);
                    System.out.print(!isNatural(arr[i]) ? "Ошибка! Элементы массива для этой задачи должны быть натуральным числом. Попробуйте снова.\n>":"\n>");
                } else {
                    System.out.print("Ошибка! Вы не ввели целое число. Попробуйте снова.\n>");
                }
            }
        }
        System.out.print("Введите делитель: \n>");
        int divider = 0;
        while (!isDivider(divider)) {
            input = scan.next();
            if (isNumber(input)) {
                divider = Integer.parseInt(input);
                System.out.print(!isNatural(divider) ? "Ошибка! Делить на 0 нельзя. Попробуйте снова.\n>":"");
            } else {
                System.out.print("Ошибка! Вы не ввели целое число. Попробуйте снова.\n>");
            }
        }
        int sum = 0;
        for (int num : arr){
            sum += dividingMethod(num, divider);
            System.out.println(sum);
        }
        System.out.println("Сумма элементов массива кратных " + divider + " равна "+sum);
    }

    public static boolean isNumber(String s) {
        boolean b;
        try {
            Integer.parseInt(s);
            b = true;;
        } catch  (NumberFormatException e) {
            b = false;
        }
        return b;
    }
    public static boolean isNatural(int num) {
        return num > 0;
    }
    public static boolean isDivider(int num) {
        return num !=0;
    }
    public static int dividingMethod(int num, int div) {
        return num%div == 0 ? num : 0;
    }
}
